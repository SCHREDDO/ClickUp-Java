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
// Created On: 25.04.2022
// Last Edited On: 25.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.requests.users;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUUser;
import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUMemberResponse;
import io.github.schreddo.nerdy.clickup.api.response.CUTaskResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class EditUserOnWorkspaceRequest extends ClickUpRequest {
	
	private String teamID;
	private Long userID;
	private String username;
	private Boolean asAdmin;
	
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Boolean getAsAdmin() {
		return asAdmin;
	}
	public void setAsAdmin(Boolean asAdmin) {
		this.asAdmin = asAdmin;
	}
	
	public EditUserOnWorkspaceRequest(String accessToken, String teamID, Long userID, String username, Boolean asAdmin) {
		super(accessToken);

		setTeamID(accessToken);
		setUserID(userID);
		setUsername(username);
		setAsAdmin(asAdmin);
	}

	@Override
	public CUMemberResponse execute() {
		Gson gson = new Gson();
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/team/" + getTeamID() + "/user/" + getUserID(), RequestMethod.PUT);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		CUUser user = new CUUser();
		user.setUsername(getUsername());
		user.setAsAdmin(getAsAdmin());
		
		httpRequest.addPayload(gson.toJson(user));
		
		Response response = httpRequest.executeRequest();
		
		return new CUMemberResponse(response.getResponseCode(), response.getResponse());
	}

}
