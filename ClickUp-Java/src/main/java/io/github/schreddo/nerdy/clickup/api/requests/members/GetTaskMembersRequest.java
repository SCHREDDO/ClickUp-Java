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
// Last Edited On: 26.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.requests.members;

import io.github.schreddo.nerdy.clickup.api.response.CUUsersResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class GetTaskMembersRequest {
	private String accessToken;
	private String taskID;
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	
	public GetTaskMembersRequest(String accessToken, String taskID) {
		setAccessToken(accessToken);
		setTaskID(taskID);
	}
	
	public CUUsersResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/task/" + getTaskID() + "/member", RequestMethod.GET);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		Response response = httpRequest.executeRequest();
		
		return new CUUsersResponse(response.getResponseCode(), response.getResponse());
	}
}
