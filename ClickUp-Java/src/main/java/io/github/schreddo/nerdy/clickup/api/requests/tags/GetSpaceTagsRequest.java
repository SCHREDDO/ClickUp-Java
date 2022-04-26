package io.github.schreddo.nerdy.clickup.api.requests.tags;

import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUTagsResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class GetSpaceTagsRequest extends ClickUpRequest {

	public String spaceID;
	
	public String getSpaceID() {
		return spaceID;
	}
	public void setSpaceID(String spaceID) {
		this.spaceID = spaceID;
	}

	public GetSpaceTagsRequest(String accessToken, String spaceID) {
		super(accessToken);
		
		setSpaceID(spaceID);
	}

	@Override
	public CUTagsResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/space/" + getSpaceID() + "/tag", RequestMethod.GET);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		Response response = httpRequest.executeRequest();
		
		return new CUTagsResponse(response.getResponseCode(), response.getResponse());
	}

}
