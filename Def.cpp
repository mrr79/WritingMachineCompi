#include <iostream>
#include <unordered_map>
#include <string>

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


    //PUT:  Método para alterar el valor de una variable existente
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


};

// Instancia global de VariableManager para que sea accesible desde el main
VariableManager manager;