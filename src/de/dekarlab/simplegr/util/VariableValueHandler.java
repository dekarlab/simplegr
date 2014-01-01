package de.dekarlab.simplegr.util;

public interface VariableValueHandler {

	public String getValueAsString(String name);

	public Boolean getValueAsBoolean(String name);

	public Double getValueAsNumber(String name);

	public Class<?> getType(String name);
}
