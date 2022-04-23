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
// Created On: 14.09.2019
// Last Edited On: 23.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.response;

public abstract class ClickUpResponse {
	
	protected int responseCode;
	protected String json;

	protected int getResponseCode() {
		return responseCode;
	}
	protected void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	protected String getJson() {
		return json;
	}
	protected void setJson(String json) {
		this.json = json;
	}

	public ClickUpResponse(int responseCode, String json) {
		setResponseCode(responseCode);
		setJson(json);
	}
	
	public int code() {
		return getResponseCode();
	}
	
	public String json() {
		return getJson();
	}
	
	public abstract Object obj();
}
