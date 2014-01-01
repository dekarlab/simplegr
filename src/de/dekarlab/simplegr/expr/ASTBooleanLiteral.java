package de.dekarlab.simplegr.expr;


import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTBooleanLiteral extends BoolExpr {

	private Boolean value;
	public ASTBooleanLiteral(int id) {
		super(id);
	}

	public ASTBooleanLiteral(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public void setValue(Boolean value) {
		this.value = value;
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) {
		return value;
	}

}
