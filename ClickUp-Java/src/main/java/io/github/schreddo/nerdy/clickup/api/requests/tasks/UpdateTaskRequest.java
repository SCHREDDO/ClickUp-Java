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
package io.github.schreddo.nerdy.clickup.api.requests.tasks;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUTask;
import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUTaskResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class UpdateTaskRequest extends ClickUpRequest {
	
	private String taskID;
	private CUTask task;
	private Boolean useCustomTaskIDs;
	private String teamID;
	
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public CUTask getTask() {
		return task;
	}
	public void setTask(CUTask task) {
		this.task = task;
	}
	public Boolean getUseCustomTaskIDs() {
		return useCustomTaskIDs;
	}
	public void setUseCustomTaskIDs(Boolean useCustomTaskIDs) {
		this.useCustomTaskIDs = useCustomTaskIDs;
	}
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public UpdateTaskRequest(String accessToken, CUTask task) {
		super(accessToken);
		
		setTaskID(task.getID());
		setTask(task);
	}
	
	public UpdateTaskRequest(String accessToken, String taskID, CUTask task) {
		super(accessToken);
		
		setTaskID(taskID);
		setTask(task);
	}
	
	@Override
	public CUTaskResponse execute() {
		Gson gson = new Gson();
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/task/" + getTaskID(), RequestMethod.PUT);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		if (getUseCustomTaskIDs()) httpRequest.addURLParamenter("custom_task_ids", "true");
		if (getTeamID() != null) httpRequest.addURLParamenter("team_id", getTeamID());
		
		httpRequest.addPayload(gson.toJson(getTask()));
		
		Response response = httpRequest.executeRequest();
		
		return new CUTaskResponse(response.getResponseCode(), response.getResponse());
	}
}
