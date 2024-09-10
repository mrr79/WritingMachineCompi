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
};

// Instancia global de VariableManager para que sea accesible desde el main
VariableManager manager;
