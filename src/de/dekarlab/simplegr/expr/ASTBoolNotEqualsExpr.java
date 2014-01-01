package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

public class ASTBoolNotEqualsExpr extends BoolExpr {

	public ASTBoolNotEqualsExpr(int id) {
		super(id);
	}

	public ASTBoolNotEqualsExpr(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		Expression exprLeft = (Expression) jjtGetChild(0);
		Expression exprRight = (Expression) jjtGetChild(1);
		Class<?> exprLeftType = exprLeft
				.getExpressionType(variables, functions);
		Class<?> exprRightType = exprLeft.getExpressionType(variables,
				functions);

		if (exprLeftType == null && exprRightType == null) {
			return false;
		}

		if (exprLeftType == Boolean.class || exprRightType == Boolean.class) {
			return exprLeft.evaluateAsBoolean(variables, functions)
					.booleanValue() != exprRight.evaluateAsBoolean(variables,
					functions).booleanValue();
		}

		if (exprLeftType == Double.class || exprRightType == Double.class) {
			return exprLeft.evaluateAsNumber(variables, functions)
					.doubleValue() != exprRight.evaluateAsNumber(variables,
					functions).doubleValue();
		}

		if (exprLeftType == String.class || exprRightType == String.class) {
			return !exprLeft.evaluateAsString(variables, functions).equals(
					exprRight.evaluateAsString(variables, functions));
		}
		throw new Exception("Error in data type conversion!");
	}

}
