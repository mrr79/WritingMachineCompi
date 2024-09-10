#include <iostream>
#include <sstream>
#include <regex>
#include "Def.cpp"  // Incluye tu implementación de Def aquí

int main() {
    std::string input;
    std::regex def_regex(R"(^\s*Def\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*(TRUE|FALSE|\d+)\s*\);\s*$)"); // Expresión regular para capturar el comando Def

    std::cout << "Introduce tus comandos (por ejemplo, Def(variable1, 5);):\n";
    while (std::getline(std::cin, input)) {
        std::smatch match;
        if (std::regex_match(input, match, def_regex)) {
            std::string nombre_variable = match[1].str();
            std::string valor = match[2].str();
            
            manager.Def(nombre_variable, valor);
        } else {
            std::cout << "Comando no reconocido.\n";
        }
    }

    return 0;
}
