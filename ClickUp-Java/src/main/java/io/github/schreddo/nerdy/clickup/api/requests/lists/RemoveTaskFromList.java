package io.github.schreddo.nerdy.clickup.api.requests.lists;

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUDeleteResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class RemoveTaskFromList extends ClickUpRequest {

	private String listID;
	private String taskID;
	
	public String getListID() {
		return listID;
	}
	public void setListID(String listID) {
		this.listID = listID;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	
	public RemoveTaskFromList(String accessToken, String listID, String taskID) {
		super(accessToken);
	}

	@Override
	public CUDeleteResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/list/" + getListID() + "/task/" + getTaskID(), RequestMethod.DELETE);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		Response response = httpRequest.executeRequest();
		
		return new CUDeleteResponse(response.getResponseCode(), response.getResponse());
	}

}
