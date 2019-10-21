// Copyright (C) 2019 Sebastian Lühnen
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
// Last Edited On: 19.10.2019
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.requests.authorization;

import io.github.schreddo.nerdy.clickup.api.enums.ResponsesType;
import io.github.schreddo.nerdy.clickup.api.models.base.Authorization;
import io.github.schreddo.nerdy.clickup.api.response.ClickUpResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class AccessTokenRequest {
	private String clientId;
	private String clientSecret;
	private String code;
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public AccessTokenRequest(String clientId, String clientSecret, String code) {
		setClientId(clientId);
		setClientSecret(clientSecret);
		setCode(code);
	}
	
	public ClickUpResponse<Authorization> execute() {		
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/oauth/token", RequestMethod.POST);
		httpRequest.addURLParamenter("client_id", getClientId());
		httpRequest.addURLParamenter("client_secret", getClientSecret());
		httpRequest.addURLParamenter("code", getCode());
		
		Response response = httpRequest.executeRequest();
		
		return new ClickUpResponse<Authorization>(Authorization.class, response.getResponseCode(), response.getResponse(), ResponsesType.OBJECT);
	}
}
