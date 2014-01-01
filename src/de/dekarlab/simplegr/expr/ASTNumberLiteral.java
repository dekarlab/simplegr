package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTNumberLiteral extends NumberExpr {

	private Double value;

	public ASTNumberLiteral(int id) {
		super(id);
	}

	public ASTNumberLiteral(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Double evaluateAsNumber(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		return value;
	}

}
