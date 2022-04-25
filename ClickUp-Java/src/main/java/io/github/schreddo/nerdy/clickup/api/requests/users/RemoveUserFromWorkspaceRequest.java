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

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUTeamResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class RemoveUserFromWorkspaceRequest extends ClickUpRequest {

	private String teamID;
	private Long userID;
	
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

	public RemoveUserFromWorkspaceRequest(String accessToken, String teamID, Long userID) {
		super(accessToken);
		
		setTeamID(teamID);
		setUserID(userID);
	}

	@Override
	public CUTeamResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/team/" + getTeamID() + "/user/" + getUserID(), RequestMethod.DELETE);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		Response response = httpRequest.executeRequest();
		
		return new CUTeamResponse(response.getResponseCode(), response.getResponse());
	}

}
