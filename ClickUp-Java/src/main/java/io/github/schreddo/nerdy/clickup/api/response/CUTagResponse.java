package io.github.schreddo.nerdy.clickup.api.response;

import io.github.schreddo.nerdy.clickup.api.models.CUTag;

public class CUTagResponse extends ClickUpResponse {

	public CUTagResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public CUTag obj() {
		return null;
	}

}
