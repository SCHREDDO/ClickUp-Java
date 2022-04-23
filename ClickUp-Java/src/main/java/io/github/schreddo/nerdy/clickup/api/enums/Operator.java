package io.github.schreddo.nerdy.clickup.api.enums;

import com.google.gson.annotations.SerializedName;

public enum Operator {
	@SerializedName("=")
	EQUAL,
	@SerializedName("!=")
	INEQUAL,
	@SerializedName(">")
	GREATER_THAN,
	@SerializedName(">=")
	GREATER_THAN_OR_EQUAL,
	@SerializedName("<")
	LESSS_THAN,
	@SerializedName("<=")
	LESSS_THAN_OR_EQUAL;
}
