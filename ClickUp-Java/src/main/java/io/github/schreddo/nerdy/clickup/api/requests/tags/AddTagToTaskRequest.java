package io.github.schreddo.nerdy.clickup.api.requests.tags;

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUEmptyResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class AddTagToTaskRequest extends ClickUpRequest {

	private String taskID;
	private String tagName;
	private Boolean customTaskIDs;
	private String teamID;
	
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public Boolean getCustomTaskIDs() {
		return customTaskIDs;
	}
	public void setCustomTaskIDs(Boolean customTaskIDs) {
		this.customTaskIDs = customTaskIDs;
	}
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

	public AddTagToTaskRequest(String accessToken, String taskID, String tagName) {
		super(accessToken);
	}

	@Override
	public CUEmptyResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/task/" + getTaskID() + "/tag/" + getTagName(), RequestMethod.POST);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		if (getCustomTaskIDs()) httpRequest.addURLParamenter("custom_task_ids", "true");
		if (getTeamID() != null) httpRequest.addURLParamenter("team_id", getTeamID());
		
		Response response = httpRequest.executeRequest();
		
		return new CUEmptyResponse(response.getResponseCode(), response.getResponse());
	}

}
