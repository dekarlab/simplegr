package de.dekarlab.simplegr.util;

import de.dekarlab.simplegr.expr.Expression;

public interface FunctionHandler {
	public String getValueAsString(String name, Expression[] params,
			VariableValueHandler variables) throws Exception;

	public Boolean getValueAsBoolean(String name, Expression[] params,
			VariableValueHandler variables) throws Exception;

	public Double getValueAsNumber(String name, Expression[] params,
			VariableValueHandler variables) throws Exception;

	public Class<?> getReturnType(String name);

}
