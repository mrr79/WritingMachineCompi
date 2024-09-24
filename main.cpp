#include <iostream>
#include <sstream>
#include <regex>
#include "Def.cpp"  // Incluye la implementación de Def aquí

int main() {
    std::string input;
    std::regex def_regex(R"(^\s*Def\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*(TRUE|FALSE|\d+)\s*\);\s*$)"); // Expresión regular para Def
    std::regex put_regex(R"(^\s*Put\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*(.+)\s*\);\s*$)"); // Expresión regular para Put
    std::regex add_regex_single(R"(^\s*Add\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*\);\s*$)"); // Expresión regular para Add(N1)
    std::regex add_regex_double(R"(^\s*Add\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+)\s*\);\s*$)"); // Expresión regular para Add(N1, N2)

    std::cout << "Introduce tus comandos (por ejemplo, Def(variable1, 5); o Put(variable1, 100); o Add(variable1);):\n";
    while (std::getline(std::cin, input)) {
        std::smatch match;
        if (std::regex_match(input, match, def_regex)) {
            std::string nombre_variable = match[1].str();
            std::string valor = match[2].str();
            manager.Def(nombre_variable, valor);
        } else if (std::regex_match(input, match, put_regex)) {
            std::string nombre_variable = match[1].str();
            std::string valor = match[2].str();
            manager.Put(nombre_variable, valor);
        } else if (std::regex_match(input, match, add_regex_single)) {
            std::string nombre_variable = match[1].str();
            manager.Add(nombre_variable);  // Llamar a Add(N1)
        } else if (std::regex_match(input, match, add_regex_double)) {
            std::string nombre_variable = match[1].str();
            std::string incremento = match[2].str();
            manager.Add(nombre_variable, incremento);  // Llamar a Add(N1, N2)
        } else {
            std::cout << "Comando no reconocido.\n";
        }
    }

    return 0;
}
