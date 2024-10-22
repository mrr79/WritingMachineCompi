#include <iostream>
#include <sstream>
#include <regex>
#include "Def.cpp"  // Incluye la implementación de Def aquí


int posX = 1;
int posY = 1;
int lapiz = 0;
int color = 1;


int main() {

    std::cout << "PosX: " << posX << ", PosY: " << posY << ", Lapiz: " << lapiz <<", Color: " << color << std::endl;


    std::string input;
    std::regex def_regex(R"(^\s*Def\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*(TRUE|FALSE|\d+)\s*\);\s*$)"); // Expresión regular para Def
    std::regex put_regex(R"(^\s*Put\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*(.+)\s*\);\s*$)"); // Expresión regular para Put
    std::regex add_regex_single(R"(^\s*Add\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*\);\s*$)"); // Expresión regular para Add(N1)
    std::regex add_regex_double(R"(^\s*Add\(\s*([a-zA-Z_][a-zA-Z0-9_]*)\s*,\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+)\s*\);\s*$)"); // Expresión regular para Add(N1, N2)

    std::regex continue_up_regex(R"(^\s*ContinueUp\(\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*\);\s*$)"); //Expresion regular para ContinueUp(n)
    std::regex continue_down_regex(R"(^\s*ContinueDown\(\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*\);\s*$)"); //Expresion regular para ContinueDown(n)
    std::regex continue_right_regex(R"(^\s*ContinueRight\(\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*\);\s*$)"); //Expresion regular para ContinueRight(n)
    std::regex continue_left_regex(R"(^\s*ContinueLeft\(\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*\);\s*$)"); //Expresion regular para ContinueLeft(n)

    std::regex pos_regex(R"(^\s*Pos\(\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*\s*,\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*\s*\)\s*;\s*$)");
    std::regex posx_regex(R"(^\s*PosX\s+([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*;\s*$)");//Expresion regular para Pos(X);
    std::regex posy_regex(R"(^\s*PosY\s+([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*;\s*$)");//Expresion regular para Pos(Y);
    std::regex usecolor_regex(R"(^\s*UseColor\s+(1|2)\s*;\s*$)");//Expresion regular para UseColor valor;
    std::regex down_regex(R"(^\s*Down\s*;\s*$)");//Expresion regular para Down;
    std::regex up_regex(R"(^\s*Up\s*;\s*$)"); //Expresion regular para Down;
    std::regex beginning_regex(R"(^\s*Beginning\s*;\s*$)"); //Expresion regular para Beginning;



    std::regex equal_regex(R"(^\s*Equal\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Equal
    std::regex and_regex(R"(^\s*And\(\s*(.+?)\s*,\s*(.+?)\s*\)\s*;\s*$)");//Expresion regular para And
    std::regex or_regex(R"(^\s*Or\(\s*(.+?)\s*,\s*(.+?)\s*\)\s*;\s*$)");//Expresion regular para Or
    std::regex greater_regex(R"(^\s*Greater\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Greater
    std::regex smaller_regex(R"(^\s*Smaller\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Smaller
    std::regex substr_regex(R"(^\s*Substr\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Smaller
    std::regex sum_regex(R"(^\s*Sum\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Smaller
    std::regex mult_regex(R"(^\s*Mult\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Smaller
    std::regex div_regex(R"(^\s*Div\(\s*(([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)\s*,\s*((([a-zA-Z_][a-zA-Z0-9_]*|\d+(\.\d+)?)(\s*[\+\-\*/]\s*(\d+(\.\d+)?|[a-zA-Z_][a-zA-Z0-9_]*))*)?)\s*\)\s*;\s*$)");//Expresion regular para Smaller
    std::regex random_regex(R"(^\s*Random\(\s*([a-zA-Z_][a-zA-Z0-9_]*|\d+(\s*[\+\-\*/]\s*\d+)*)\s*\);\s*$)"); //Expresion regular para Random(n)
    std::regex for_regex(R"(FOR\s+([a-zA-Z_][a-zA-Z0-9_]*)\((\d+)\s+to\s+(\d+)\)\s+LOOP\s*\[([^\]]*)\]\s*END\s+LOOP;)"); //Expresion regular para For




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
        }else if (std::regex_match(input, match, continue_up_regex)) {
            std::string n = match[1].str();
            manager.ContinueUp(posY, lapiz,n);  // Mover hacia arriba la cantidad especificada
        }else if (std::regex_match(input, match, continue_down_regex)) {
            std::string n = match[1].str();
            manager.ContinueDown(posY, lapiz,n);  // Mover hacia abajo la cantidad especificada
        }else if (std::regex_match(input, match, continue_right_regex)) {
            std::string n = match[1].str();
            manager.ContinueRight(posX, lapiz,n);  // Mover hacia la derecha la cantidad especificada
        }else if (std::regex_match(input, match, continue_left_regex)) {
            std::string n = match[1].str();
            manager.ContinueLeft(posX, lapiz,n);  // Mover hacia la izquierda la cantidad especificada
        }else if (std::regex_match(input, match, pos_regex)) {
            std::string X = match[1].str();
            std::string Y = match[6].str();

            manager.Pos(posX, posY, X, Y);  // Colocar en la posicion X y Y
        }
        else if (std::regex_match(input, match, posx_regex)) {
            std::string X = match[1].str();
            manager.PosX(posX, X);  // Colocar en la posicion X
        }else if (std::regex_match(input, match, posy_regex)) {
            std::string Y = match[1].str();
            manager.PosY(posY, Y);  // Colocar en la posicion Y
        }else if (std::regex_match(input, match, usecolor_regex)) {
            std::string valor = match[1].str();
            manager.UseColor(color, valor);  // Colocar en la posicion Y
        }
        else if (std::regex_match(input, match, down_regex)) {
            manager.Down(lapiz);  // Colocar en la posicion Y
        }
        else if (std::regex_match(input, match, up_regex)) {
            manager.Up(lapiz);  // Colocar en la posicion Y
        }
        else if (std::regex_match(input, match, beginning_regex)) {
            manager.Beginning(posX, posY);  // Colocar en la posicion Y
        }
        else if (std::regex_match(input, match, equal_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();

            manager.Equal(N1, N2);  
        }
        else if (std::regex_match(input, match, and_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[2].str();

            std::cout << "Primera comparacion "<< N1 << std::endl;
            std::cout << "Segunda comparacion "<< N2 << std::endl;
            
            manager.And(N1, N2);  
        }
        else if (std::regex_match(input, match, or_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[2].str();

            manager.Or(N1, N2);  
        }
        else if (std::regex_match(input, match, greater_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();
            manager.Greater(N1, N2);  
        }
        else if (std::regex_match(input, match, smaller_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();
            manager.Smaller(N1, N2);  
        }
        else if (std::regex_match(input, match, substr_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();
            manager.Substr(N1, N2);  
        }
        else if (std::regex_match(input, match, sum_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();
            manager.Sum(N1, N2);  
        }
        else if (std::regex_match(input, match, div_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();
            manager.Div(N1, N2);  
        }
        else if (std::regex_match(input, match, mult_regex)) {
            std::string N1 = match[1].str();
            std::string N2 = match[7].str();
            manager.Mult(N1, N2);  
        }
        else if (std::regex_match(input, match, random_regex)) {
            std::string n = match[1].str();
            manager.Random(n);  
        }
        else if (std::regex_match(input, match, for_regex)) {
            std::string variable = match[1].str();
            std::string min = match[2].str();
            std::string max = match[3].str();
            std::string sentencias = match[4].str();
            manager.Foor(variable, min, max, sentencias, posX, posY, lapiz);
             
        }
         else {
            std::cout << "Comando no reconocido.\n";
        }
    }

    return 0;
}
