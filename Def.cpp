#include <iostream>
#include <unordered_map>
#include <string>
#include <regex> // Necesario para usar expresiones regulares
#include "exprtk.hpp"

// Enum para definir los tipos de datos
enum class DataType { Numero, Logico };

// Estructura para representar una variable
struct Variable {
    DataType tipo;
    std::string valor;
};

// Clase para gestionar las variables
class VariableManager {
private:
    std::unordered_map<std::string, Variable> variables;
    int posX, posY, lapiz, color;

public:
    // Método para definir una variable
    void Def(const std::string& nombre_variable, const std::string& valor) {
        auto it = variables.find(nombre_variable);

        if (it != variables.end()) {
            // La variable ya existe, verificar si el tipo es consistente
            Variable& varExistente = it->second;
            if ((valor == "TRUE" || valor == "FALSE") && varExistente.tipo == DataType::Numero) {
                std::cerr << "Error semántico: No se puede asignar un valor lógico a una variable de tipo Número.\n";
                return;
            }
            if (isdigit(valor[0]) && varExistente.tipo == DataType::Logico) {
                std::cerr << "Error semántico: No se puede asignar un valor numérico a una variable de tipo Lógico.\n";
                return;
            }
            // Si el tipo es el mismo, permitir la reasignación
            varExistente.valor = valor;
            std::cout << "Variable " << nombre_variable << " redefinida correctamente con valor " << valor << ".\n";
            return;
        }

        // Crear nueva variable
        Variable var;

        // Verificar tipo de dato
        if (valor == "TRUE" || valor == "FALSE") {
            var.tipo = DataType::Logico;
            var.valor = valor;
        } else if (isdigit(valor[0])) {
            var.tipo = DataType::Numero;
            var.valor = valor;
        } else {
            std::cerr << "Error: Valor no asignado correctamente.\n";
            return;
        }

        // Añadir la nueva variable al mapa
        variables[nombre_variable] = var;
        std::cout << "Variable " << nombre_variable << " definida correctamente con valor " << valor << ".\n";
    }

    // Método para alterar el valor de una variable existente
    void Put(const std::string& nombre_variable, const std::string& valor) {
        auto it = variables.find(nombre_variable);
        if (it == variables.end()) {
            std::cerr << "Error: La variable no existe.\n";
            return;
        }

        Variable& var = it->second;
        std::regex operation_regex(R"(Substr\((\d+),\s*(\d+)\))"); // Expresión regular para la operación Substr
        std::smatch match;

        if (std::regex_match(valor, match, operation_regex)) {
            // Si la expresión coincide con una operación Substr, realiza la operación
            int op1 = std::stoi(match[1].str());
            int op2 = std::stoi(match[2].str());
            int resultado = op1 - op2;
            var.valor = std::to_string(resultado);
            std::cout << "Variable " << nombre_variable << " actualizada con el resultado de la operación: " << var.valor << ".\n";
            return;
        } else {
            // Si el valor es un número o un valor lógico permitido
            if ((isdigit(valor[0]) && var.tipo == DataType::Numero) ||
                ((valor == "TRUE" || valor == "FALSE") && var.tipo == DataType::Logico)) {
                var.valor = valor;
                std::cout << "Variable " << nombre_variable << " actualizada correctamente con valor " << valor << ".\n";
            } else {
                std::cerr << "Error semántico: No se puede cambiar el tipo de dato de la variable.\n";
            }
        }
    }

    // Método para incrementar el valor de una variable
    void Add(const std::string& nombre_variable, const std::string& incremento = "1") {
        auto it = variables.find(nombre_variable);
        if (it == variables.end()) {
            std::cerr << "Error: La variable " << nombre_variable << " no existe.\n";
            return;
        }

        Variable& var = it->second;

        if (var.tipo != DataType::Numero) {
            std::cerr << "Error semántico: Solo se pueden incrementar variables numéricas.\n";
            return;
        }

        int valor_actual = std::stoi(var.valor);
        int incremento_valor;

        // Verificar si el incremento es una variable o un número
        if (isdigit(incremento[0])) {
            incremento_valor = std::stoi(incremento);
        } else {
            auto it_incremento = variables.find(incremento);
            if (it_incremento == variables.end()) {
                std::cerr << "Error: La variable " << incremento << " no existe.\n";
                return;
            }
            Variable& var_incremento = it_incremento->second;
            if (var_incremento.tipo != DataType::Numero) {
                std::cerr << "Error semántico: El incremento debe ser un número o una variable numérica.\n";
                return;
            }
            incremento_valor = std::stoi(var_incremento.valor);
        }

        // Realizar el incremento
        valor_actual += incremento_valor;
        var.valor = std::to_string(valor_actual);
        std::cout << "Variable " << nombre_variable << " incrementada correctamente. Nuevo valor: " << var.valor << ".\n";
    }

    int evaluarExpresion(const std::string& expresion) {

        std::regex number_regex(R"(\d+)");
        std::regex variable_regex(R"([a-zA-Z_][a-zA-Z0-9_]*)");
        exprtk::expression<double> expr;
        exprtk::parser<double> parser;

        if (std::regex_match(expresion, number_regex)) {
            // Si es un número, conviértelo
            return std::stoi(expresion);
        } else if (std::regex_match(expresion, variable_regex)) {
            // Si es una variable, búscala en la tabla de variables
            auto it = variables.find(expresion);
            if (it != variables.end()) {
                const Variable& var = it->second; // Obtiene la variable
                if (var.tipo == DataType::Numero) {
                    return std::stoi(var.valor); // Devuelve el valor convertido a entero
                } else {
                    std::cerr << "Error: La variable " << expresion << " no es de tipo numérico." << std::endl;
                    return 0;
                }
            } else {
                std::cerr << "Error: Variable no encontrada: " << expresion << std::endl;
                return 0;
            }
        } else if (parser.compile(expresion, expr))
            {
                return expr.value();
                
        } else {
            // Aquí podrías agregar un parser más avanzado para operaciones
            std::cerr << "Error: Expresión inválida: " << expresion << std::endl;
            return 0;
        }
    }


    //Funcion para mover el lapiz hacia arriba
    void ContinueUp(int& posY, int& lapiz,const std::string& n) {
    // Evalúa el valor de n
    int value = evaluarExpresion(n);

    if (lapiz == 1) {
        for (int i = 0; i < value; i++) {
            //Validacion en caso de que se salga de la hoja
            if (posY == 1){
                std::cout << "Error: Se ha alcanzado el limite de la hoja" << std::endl;
                break;
            }
            posY--;
            std::cout << "Dibujando en la posición Y: " << posY << std::endl;
        }
    } else {
        //Validacion en caso de que se alcance el limite de la hoja
        if(value > posY || value == posY){
            std::cout << "Error: El valor ingresado excede el limite de la hoja" << std::endl;
        }else{
            posY -= value;
            std::cout << "Moviéndose a la posición Y: " << posY << std::endl;
        }
        
    }
}
    //Funcion para mover el lapiz hacia abajo
    void ContinueDown(int& posY, int& lapiz,const std::string& n) {
        // Evalúa el valor de n
        int value = evaluarExpresion(n);

        if (lapiz == 1) {
            for (int i = 0; i < value; i++) {
                //Validacion en caso de que se salga de la hoja
                if (posY == 100){
                    std::cout << "Error: Se ha alcanzado el limite de la hoja" << std::endl;
                    break;
                }
                posY++;
                std::cout << "Dibujando en la posición Y: " << posY << std::endl;
            }
        } else {
            if((posY + value) > 100){
            std::cout << "Error: El valor ingresado excede el limite de la hoja" << std::endl;
            }else{
                posY += value;
                std::cout << "Moviéndose a la posición Y: " << posY << std::endl;
            }
        }
    }

    //Funcion para mover el lapiz hacia la derecha
    void ContinueRight(int& posX, int& lapiz,const std::string& n) {
        // Evalúa el valor de n
        int value = evaluarExpresion(n);

        if (lapiz == 1) {
            for (int i = 0; i < value; i++) {
                //Validacion en caso de que se salga de la hoja
                if (posX == 100){
                    std::cout << "Error: Se ha alcanzado el limite de la hoja" << std::endl;
                    break;
                }
                posX++;
                std::cout << "Dibujando en la posición X: " << posX << std::endl;
            }
        } else {
            if((posX + value) > 100){
            std::cout << "Error: El valor ingresado excede el limite de la hoja"<< std::endl;
            }else{
                posX += value;
                std::cout << "Moviéndose a la posición X: " << posX << std::endl;
            }
        }
    }

    //Funcion para mover el lapiz hacia la izquierda
    void ContinueLeft(int& posX, int& lapiz,const std::string& n) {
        // Evalúa el valor de n
        int value = evaluarExpresion(n);

        if (lapiz == 1) {
            for (int i = 0; i < value; i++) {
                if (posX == 1){
                std::cout << "Error: Se ha alcanzado el limite de la hoja" << std::endl;
                break;
                }
                posX--;
                std::cout << "Dibujando en la posición X: " << posX << std::endl;
            }
        } else {
            //Validacion en caso de que se alcance el limite de la hoja
            if(value > posX || value == posX){
                std::cout << "Error: El valor ingresado excede el limite de la hoja" << std::endl;
            }else{
                posX -= value;
                std::cout << "Moviéndose a la posición X: " << posX << std::endl;
            }
        }
    }

    void Pos(int& posX, int& posY, const std::string& X, const std::string& Y){
            // Evaluar las expresiones de X y Y
        int valorX = evaluarExpresion(X);
        int valorY = evaluarExpresion(Y);

        if(valorX > 100 || valorX < 0){
            std::cout << "Error: La nueva posición X del lápiz excede los límites" << std::endl;
        } else if (valorY > 100 || valorY < 0)
        {
            std::cout << "Error: La nueva posición Y del lápiz excede los límites" << std::endl;
        }
        else{

            // Asignar los valores a las posiciones actuales
            posX = valorX;
            posY = valorY;

            // Mostrar el resultado (aquí puedes agregar lógica adicional según el estado del lápiz)
            std::cout << "Lapicero colocado en la posición X: " << posX << ", Y: " << posY << std::endl;
        }
    }

    void PosX(int& posX, const std::string& n){
        int valorX = evaluarExpresion(n);
        if(valorX > 100 || valorX < 0){
            std::cout << "Error: La nueva posición X del lápiz excede los límites" << std::endl;
        }
        else{
            posX = valorX;
            std::cout << "Lapicero colocado en la posición X: " << posX << std::endl;
        }
    }

    void PosY(int& posY, const std::string& n){
        int valorY = evaluarExpresion(n);
        if(valorY > 100 || valorY < 0){
            std::cout << "Error: La nueva posición Y del lápiz excede los límites: " << std::endl;
        }
        else{
            posY = valorY;
            std::cout << "Lapicero colocado en la posición Y: " << posY << std::endl;
        }
    }

    void UseColor(int& color,const std::string& valor){
            try {
            // Convertir el valor de string a entero
            int valorEntero = std::stoi(valor);

            // Verificar si el valor es 1 o 2
            if (valorEntero == 1 || valorEntero == 2){
                color = valorEntero;  // Asignar el color (asumo que 'color' es una variable global o de clase)
                std::cout << "Se ha asignado el valor de "<< color << " al color de lápiz" << std::endl;
            } else {
                std::cout << "Los únicos valores válidos son 1 (Negro) o 2 (Rojo)" << std::endl;
            }
        } catch (const std::invalid_argument& e) {
            std::cout << "Error: Los únicos valores válidos son 1 (Negro) o 2 (Rojo)" << std::endl;
        } catch (const std::out_of_range& e) {
            std::cout << "Error: Los únicos valores válidos son 1 (Negro) o 2 (Rojo)" << std::endl;
        }
    }

    void Down(int& lapiz){
        if (lapiz == 1){
            std::cout << "El lapiz ya esta pegado a la superficie" << std::endl;
        }
        else{
            lapiz = 1;
            std::cout << "El lapiz se ha pegado a la superficie" << std::endl;
        }
    }

    void Up(int& lapiz){
        if (lapiz == 0){
            std::cout << "El lapiz ya esta despegado de la superficie" << std::endl;
        }
        else{
            lapiz = 0;
            std::cout << "El lapiz se ha despegado de la superficie" << std::endl;
        }
    }

    void Beginning(int& posX, int& posY){
        if (posX == 1 && posY == 1){
            std::cout << "El lapiz ya se encuentra en la posicion inicial" << std::endl;
        }
        else{
            posX = 1;
            posY = 2;
            std::cout << "El lapiz se ha colocado en la posicion inicial" << std::endl;
        }
    }

    void Equal(const std::string& N1, const std::string& N2){
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        if(valor1==valor2){
            std::cout << "TRUE" << std::endl;
        }
        else{
            std::cout << "FALSE" << std::endl;
        }
    }

    void And(const std::string& N1, const std::string& N2){
        // Expresión regular que captura las comparaciones con <, >, ==, !=
        std::regex comparacion_regex(R"(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*(==|!=|>|<)\s*(\d+|\s*[a-zA-Z_][a-zA-Z0-9_]*)\s*)");
        std::smatch matchN1, matchN2;

        if (std::regex_match(N1, matchN1, comparacion_regex) && std::regex_match(N2, matchN2, comparacion_regex)) {

            //Para N1
            std::string v1N1 = matchN1[1].str();      // Parte izquierda (variable o expresión)
            std::string operadorN1 = matchN1[2].str(); // Operador de comparación (>, <, ==, !=)
            std::string v2N1 = matchN1[3].str();      // Parte derecha (número o variable)
            int valor1N1 = evaluarExpresion(v1N1);
            int valor2N1 = evaluarExpresion(v2N1);

            std::string numero_str1N1 = std::to_string(valor1N1); // Conversión a string
            std::string numero_str2N1 = std::to_string(valor2N1); // Conversión a string
            int resultadoN1 = evaluarExpresion(numero_str1N1 + operadorN1 + numero_str2N1);


            //Para N2
            std::string v1N2 = matchN2[1].str();      // Parte izquierda (variable o expresión)
            std::string operadorN2 = matchN2[2].str(); // Operador de comparación (>, <, ==, !=)
            std::string v2N2 = matchN2[3].str();      // Parte derecha (número o variable)
            int valor1N2 = evaluarExpresion(v1N2);
            int valor2N2 = evaluarExpresion(v2N2);

            std::string numero_str1N2 = std::to_string(valor1N2); // Conversión a string
            std::string numero_str2N2 = std::to_string(valor2N2); // Conversión a string
            int resultadoN2 = evaluarExpresion(numero_str1N2 + operadorN2 + numero_str2N2);

            if(resultadoN1==1 && resultadoN2==1){
                std::cout << "True" << std::endl;
            }
            else{
                std::cout << "False" << std::endl;
            }

            //std::cout << "Comparacion 1 : " << resultadoN1 << std::endl;
            //std::cout << "Comparacion 2 : " << resultadoN2 << std::endl;

        } else {
            int valor1 = evaluarExpresion(N1);
            int valor2 = evaluarExpresion(N2);
            
            if(valor1==1 && valor2==1){
                std::cout << "TRUE" << std::endl;
            }
            else{
                std::cout << "FALSE" << std::endl;
            }
        }
    }

    void Or(const std::string& N1, const std::string& N2){
        // Expresión regular que captura las comparaciones con <, >, ==, !=
        std::regex comparacion_regex(R"(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*(==|!=|>|<)\s*(\d+|\s*[a-zA-Z_][a-zA-Z0-9_]*)\s*)");
        std::smatch matchN1, matchN2;

        if (std::regex_match(N1, matchN1, comparacion_regex) && std::regex_match(N2, matchN2, comparacion_regex)) {

            //Para N1
            std::string v1N1 = matchN1[1].str();      // Parte izquierda (variable o expresión)
            std::string operadorN1 = matchN1[2].str(); // Operador de comparación (>, <, ==, !=)
            std::string v2N1 = matchN1[3].str();      // Parte derecha (número o variable)
            int valor1N1 = evaluarExpresion(v1N1);
            int valor2N1 = evaluarExpresion(v2N1);

            std::string numero_str1N1 = std::to_string(valor1N1); // Conversión a string
            std::string numero_str2N1 = std::to_string(valor2N1); // Conversión a string
            int resultadoN1 = evaluarExpresion(numero_str1N1 + operadorN1 + numero_str2N1);


            //Para N2
            std::string v1N2 = matchN2[1].str();      // Parte izquierda (variable o expresión)
            std::string operadorN2 = matchN2[2].str(); // Operador de comparación (>, <, ==, !=)
            std::string v2N2 = matchN2[3].str();      // Parte derecha (número o variable)
            int valor1N2 = evaluarExpresion(v1N2);
            int valor2N2 = evaluarExpresion(v2N2);

            std::string numero_str1N2 = std::to_string(valor1N2); // Conversión a string
            std::string numero_str2N2 = std::to_string(valor2N2); // Conversión a string
            int resultadoN2 = evaluarExpresion(numero_str1N2 + operadorN2 + numero_str2N2);

            if(resultadoN1==1 || resultadoN2==1){
                std::cout << "True" << std::endl;
            }
            else{
                std::cout << "False" << std::endl;
            }


            //std::cout << "Comparacion 1 : " << resultadoN1 << std::endl;
            //std::cout << "Comparacion 2 : " << resultadoN2 << std::endl;

        } else {
            int valor1 = evaluarExpresion(N1);
            int valor2 = evaluarExpresion(N2);
            
            if(valor1==1 || valor2==1){
                std::cout << "TRUE" << std::endl;
            }
            else{
                std::cout << "FALSE" << std::endl;
            }
        }
    }

    void Greater(const std::string& N1, const std::string& N2){

        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        if(valor1>valor2){
            std::cout << "TRUE" << std::endl;
        }
        else{
            std::cout << "FALSE" << std::endl;
        }
    }
    void Smaller(const std::string& N1, const std::string& N2){

        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        if(valor1<valor2){
            std::cout << "TRUE" << std::endl;
        }
        else{
            std::cout << "FALSE" << std::endl;
        }
    }

    void Substr(const std::string& N1, const std::string& N2){
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        if(valor1>=valor2){
            std::cout << "El resultado es: " << valor1-valor2 << std::endl;
        }
        else{
            std::cout << "Error: N1 debe ser mayor a N2" << std::endl;
        }
    }

    void Sum(const std::string& N1, const std::string& N2){
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        std::cout << "El resultado es: " << valor1+valor2 << std::endl;
    }

    void Random(const std::string& n){
        int valor1 = evaluarExpresion(n);

        // Inicializar la semilla con la hora actual
        std::srand(static_cast<unsigned int>(std::time(0)));

        // Generar un número aleatorio entre 0 y n
        int numero_random = std::rand() % (valor1 + 1); // % (n + 1) para incluir n

        // Imprimir el resultado
        std::cout << "Número aleatorio entre 0 y " << n << ": " << numero_random << std::endl;
    }

    void Mult(const std::string& N1, const std::string& N2){
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        std::cout << "El resultado es: " << valor1*valor2 << std::endl;
    }

    void Div(const std::string& N1, const std::string& N2){
        int valor1 = evaluarExpresion(N1);
        int valor2 = evaluarExpresion(N2);
        
        std::cout << "El resultado es: " << valor1/valor2 << std::endl;
    }


};

// Instancia global de VariableManager para que sea accesible desde el main
VariableManager manager;
