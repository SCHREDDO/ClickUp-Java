package io.github.schreddo.nerdy.clickup.api.response;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.base.Authorization;

public class CUAccessTokenResponse extends ClickUpResponse {

	public CUAccessTokenResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public Authorization obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), Authorization.class);
	}

}
