package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTVariable extends Expression {
	private String name;

	public ASTVariable(int id) {
		super(id);
	}

	public ASTVariable(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String evaluateAsString(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return variables.getValueAsString(name);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return variables.getValueAsBoolean(name);
	}

	public Double evaluateAsNumber(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return variables.getValueAsNumber(name);
	}
}
