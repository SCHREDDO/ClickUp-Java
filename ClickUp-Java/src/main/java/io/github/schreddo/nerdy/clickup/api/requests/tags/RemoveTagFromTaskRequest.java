package io.github.schreddo.nerdy.clickup.api.requests.tags;

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUDeleteResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class RemoveTagFromTaskRequest extends ClickUpRequest {

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
	
	public RemoveTagFromTaskRequest(String accessToken, String taskID, String tagName) {
		super(accessToken);
		
		setTaskID(taskID);
		setTagName(tagName);
	}

	@Override
	public CUDeleteResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/task/" + getTaskID() + "/tag/" + getTagName(), RequestMethod.DELETE);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		if (getCustomTaskIDs()) httpRequest.addURLParamenter("custom_task_ids", "true");
		if (getTeamID() != null) httpRequest.addURLParamenter("team_id", getTeamID());
		
		Response response = httpRequest.executeRequest();
		
		return new CUDeleteResponse(response.getResponseCode(), response.getResponse());
	}

}
