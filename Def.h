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
    void Put(const std::string& nombre_variable, const std::string& valor); // Nueva declaración
    void Add(const std::string& nombre_variable, const std::string& incremento = "1"); 
    void ContinueUp(const std::string& n);
    void ContinueDown(const std::string& n);
    void ContinueRight(const std::string& n);
    void ContinueLeft(const std::string& n);
    void Pos(const std::string& X, const std::string& Y);
    void PosX(const std::string& n);
    void PosY(const std::string& n);
    void UseColor(const std::string& valor);
    void Down();
    void Up();
    void Beginning();
    
};

#endif
