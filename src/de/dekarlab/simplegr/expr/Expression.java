package de.dekarlab.simplegr.expr;

import de.dekarlab.simplegr.parser.SimpleGrParser;
import de.dekarlab.simplegr.parser.SimpleNode;
import de.dekarlab.simplegr.util.FunctionHandler;
import de.dekarlab.simplegr.util.VariableValueHandler;

/**
 * Main Expression.
 * 
 */
public class Expression extends SimpleNode {

	public Expression(int id) {
		super(id);
	}

	public Expression(SimpleGrParser parser, int id) {
		super(parser, id);
	}

	public String evaluateAsString(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		throw new Exception("Cannot be evaluated as String");
	}

	public Boolean evaluateAsBoolean(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		throw new Exception("Cannot be evaluated as Boolean");
	}

	public Double evaluateAsNumber(VariableValueHandler variables,
			FunctionHandler functions) throws Exception {
		throw new Exception("Cannot be evaluated as Number");
	}

	public Class<?> getExpressionType(VariableValueHandler variables,
			FunctionHandler functions) {
		if (this instanceof BoolExpr) {
			return Boolean.class;
		} else if (this instanceof NumberExpr) {
			return Double.class;
		} else if (this instanceof StringExpr) {
			return String.class;
		} else if (this instanceof ASTFuncExpr) {
			return functions.getReturnType(((ASTFuncExpr) this).getName());
		} else if (this instanceof ASTVariable) {
			return variables.getType(((ASTVariable) this).getName());
		}
		return null;
	}

}
