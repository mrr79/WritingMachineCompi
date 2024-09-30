package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class Color implements ASTNode {
	private ASTNode type;
	
	public Color(ASTNode type) {
		super();
		this.type = type; 
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		switch((int)this.type.execute(symbolTable)) {
		case 1:
			System.out.println("Seleccionando color 1");
			break;
		case 2:
			System.out.println("Seleccionando color 2");
			break;
		default:
			System.out.println("Error");
	}
	return null;
	}

}
