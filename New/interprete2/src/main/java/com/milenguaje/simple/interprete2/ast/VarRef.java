package com.milenguaje.simple.interprete2.ast;

import java.util.Map;

public class VarRef implements ASTNode {

	private String name;
	
	public VarRef(String name) {
		super();
		this.name = name;
	}
		
	@Override
	public Object execute(Map<String, Object> symbolTable) {
		return symbolTable.get(name);
	}

}
