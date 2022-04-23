// Copyright (C) 2019-2022 Sebastian Lühnen
//
//
// This file is part of ClickUp-Java.
// 
// ClickUp-Java is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// ClickUp-Java is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with ClickUp-Java. If not, see <http://www.gnu.org/licenses/>.
//
//
// Created By: Sebastian Lühnen
// Created On: 23.04.2022
// Last Edited On: 23.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.models.base;

import io.github.schreddo.nerdy.clickup.api.enums.Operator;

public class CustomField {
	
	private String fieldID;
	private String value;
	private Operator operator;
	
	public String getFieldID() {
		return fieldID;
	}
	public void setFieldID(String fieldID) {
		this.fieldID = fieldID;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Operator getOperator() {
		return operator;
	}
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public CustomField(String fieldID, String value, Operator operator) {
		this.setFieldID(fieldID);
		this.setValue(value);
		this.setOperator(operator);
	}
	
	public String toJsonString() {
		String operator = "";
		
		switch (this.getOperator()) {
			case EQUAL: operator = "=";
				break;
			case INEQUAL: operator = "!=";
				break;
			case GREATER_THAN: operator = ">";
				break;
			case GREATER_THAN_OR_EQUAL: operator = ">=";
				break;
			case LESSS_THAN: operator = "<";
				break;
			case LESSS_THAN_OR_EQUAL: operator = "<=";
				break;
		}
		
		if (getValue().matches("\\d+")) {
			return "{\"field_id\":\"" + getFieldID() + "\",\"operator\":\"" + operator + "\",\"value\":" + getValue() + "}";
		} else {
			return "{\"field_id\":\"" + getFieldID() + "\",\"operator\":\"" + operator + "\",\"value\":\"" + getValue() + "\"}";
		}
	}
}
