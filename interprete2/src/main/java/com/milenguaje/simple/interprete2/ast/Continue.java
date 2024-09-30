package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class Continue implements ASTNode{
	private ASTNode data;
	private ASTNode type;
	
	public Continue(ASTNode data, ASTNode type) {
		super();
		this.data = data;
		this.type = type;
	}
	
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		switch((int)this.type.execute(symbolTable)) {
			case 1:
				System.out.println("Moviviendo lapiz hacia arriba " + data.execute(symbolTable) + " unidades");
				break;
			case 2:
				System.out.println("Moviviendo lapiz hacia abajo " + data.execute(symbolTable) + " unidades");
				break;
			case 3:
				System.out.println("Moviviendo lapiz hacia derecha " + data.execute(symbolTable) + " unidades");
				break;
			case 4:
				System.out.println("Moviviendo lapiz hacia izquierda " + data.execute(symbolTable) + " unidades");
				break;
			default:
				System.out.println("Error");
		}
		return null;
	}
}