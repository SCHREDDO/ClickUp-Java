package io.github.schreddo.nerdy.clickup.api.requests.lists;

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUEmptyResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class AddTaskToListRequest extends ClickUpRequest {

	private String listID;
	private String taskID;
	
	public String getListID() {
		return this.listID;
	}
	public void setListID(String listID) {
		this.listID = listID;
	}
	public String getTaskID() {
		return this.taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}

	public AddTaskToListRequest(String accessToken, String listID, String teamID) {
		super(accessToken);
		
		setListID(listID);
		setTaskID(teamID);
	}

	@Override
	public CUEmptyResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/list/" + getListID() + "/task/" + getTaskID(), RequestMethod.PUT);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		Response response = httpRequest.executeRequest();
		
		return new CUEmptyResponse(response.getResponseCode(), response.getResponse());
	}

}
