package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class Move implements ASTNode {
	private ASTNode type;
	
	public Move(ASTNode type) {
		super();
		this.type = type; 
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		switch((int)this.type.execute(symbolTable)) {
		case 1:
			System.out.println("Lapiz levantado");
			break;
		case 2:
			System.out.println("Lapiz bajado");
			break;
		default:
			System.out.println("Error");
	}
	return null;
	}
}
