package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTBoolNotExpr extends BoolExpr {

	public ASTBoolNotExpr(int id) {
		super(id);
	}

	public ASTBoolNotExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		Expression exprLeft = (Expression) jjtGetChild(0);
		if (exprLeft.getExpressionType(variables, functions) == Boolean.class) {
			return !exprLeft.evaluateAsBoolean(variables, functions)
					.booleanValue();
		}
		throw new Exception("Expression of type boolean is expected");
	}

}
