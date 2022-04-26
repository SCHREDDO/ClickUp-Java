package io.github.schreddo.nerdy.clickup.api.requests.tags;

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUTagResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class EditSpaceTagRequest extends ClickUpRequest {

	private String spaceID;
	private String tagName;
	
	public String getSpaceID() {
		return spaceID;
	}
	public void setSpaceID(String spaceID) {
		this.spaceID = spaceID;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public EditSpaceTagRequest(String accessToken, String spaceID, String tagName) {
		super(accessToken);
		
		setSpaceID(spaceID);
		setTagName(tagName);
	}

	@Override
	public CUTagResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/space/" + getSpaceID() + "/tag/" + getTagName(), RequestMethod.PUT);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		Response response = httpRequest.executeRequest();
		
		return new CUTagResponse(response.getResponseCode(), response.getResponse());
	}

}
