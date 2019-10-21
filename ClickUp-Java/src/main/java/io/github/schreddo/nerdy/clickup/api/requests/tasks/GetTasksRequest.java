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
package io.github.schreddo.nerdy.clickup.api.requests.tasks;

import io.github.schreddo.nerdy.clickup.api.enums.ResponsesType;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;
import io.github.schreddo.nerdy.clickup.api.response.ClickUpResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class GetTasksRequest {
	private String accessToken;
	private Long listID;
	private Boolean archived;
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Long getListID() {
		return listID;
	}
	public void setListID(Long listID) {
		this.listID = listID;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	
	public GetTasksRequest(String accessToken, Long listID, Boolean archived) {
		setAccessToken(accessToken);
		setListID(listID);
		setArchived(archived);
	}
	
	public ClickUpResponse<BaseCollection> execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/list/" + getListID() + "/task", RequestMethod.GET);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		httpRequest.addURLParamenter("archived", getArchived().toString());
		
		Response response = httpRequest.executeRequest();
		
		return new ClickUpResponse<BaseCollection>(BaseCollection.class, response.getResponseCode(), response.getResponse(), ResponsesType.TASKS_BC);
	}
}
