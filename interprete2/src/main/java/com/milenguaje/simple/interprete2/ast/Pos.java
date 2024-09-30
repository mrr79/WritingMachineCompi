package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class Pos implements ASTNode {
	private ASTNode operand1;
	private ASTNode operand2;
	private ASTNode type;
	
	public Pos(ASTNode operand1, ASTNode operand2, ASTNode type) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.type = type; 
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		switch((int)this.type.execute(symbolTable)) {
		case 1:
			System.out.println("Colocando lapiz en coordenada " + operand1.execute(symbolTable) + " en x," + operand2.execute(symbolTable) + " en y");
			break;
		case 2:
			System.out.println("Colocando lapiz en coordenada " + operand1.execute(symbolTable) + " en x");
			break;
		case 3:
			System.out.println("Colocando lapiz en coordenada " + operand2.execute(symbolTable) + " en y");
			break;
		default:
			System.out.println("Error");
	}
	return null;
	}

}
