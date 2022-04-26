package io.github.schreddo.nerdy.clickup.api.requests.tags;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUTag;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;
import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUEmptyResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class CreateSpaceTagRequest extends ClickUpRequest {

	private String spaceID;
	private CUTag tag;
	
	public String getSpaceID() {
		return spaceID;
	}
	public void setSpaceID(String spaceID) {
		this.spaceID = spaceID;
	}
	public CUTag getTag() {
		return tag;
	}
	public void setTag(CUTag tag) {
		this.tag = tag;
	}

	public CreateSpaceTagRequest(String accessToken, String spaceID, CUTag tag) {
		super(accessToken);
		
		setSpaceID(spaceID);
		setTag(tag);
	}

	@Override
	public CUEmptyResponse execute() {
		Gson gson = new Gson();
		BaseCollection baseCollection = new BaseCollection();
		baseCollection.setTag(getTag());
		
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/space/" + getSpaceID() + "/tag", RequestMethod.POST);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		httpRequest.addPayload(gson.toJson(baseCollection));
		
		Response response = httpRequest.executeRequest();
		
		return new CUEmptyResponse(response.getResponseCode(), response.getResponse());
	}

}
