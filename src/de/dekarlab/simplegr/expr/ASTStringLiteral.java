package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTStringLiteral extends StringExpr {

	private String value;

	public ASTStringLiteral(int id) {
		super(id);
	}

	public ASTStringLiteral(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public String evaluateAsString(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		value = value.substring(1);
		value = value.substring(0, value.length() - 1);//remove the start " and end "
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
