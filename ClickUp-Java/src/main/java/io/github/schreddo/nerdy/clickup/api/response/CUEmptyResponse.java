package io.github.schreddo.nerdy.clickup.api.response;

public class CUEmptyResponse extends ClickUpResponse {

	public CUEmptyResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public Object obj() {
		return null;
	}

}
