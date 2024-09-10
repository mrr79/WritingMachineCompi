#ifndef DEF_H
#define DEF_H

#include <string>
#include <unordered_map>

enum class DataType { Numero, Logico };

struct Variable {
    DataType tipo;
    std::string valor;
};

class VariableManager {
private:
    std::unordered_map<std::string, Variable> variables;

public:
    void Def(const std::string& nombre_variable, const std::string& valor);
    bool existeVariable(const std::string& nombre_variable);
};

#endif
