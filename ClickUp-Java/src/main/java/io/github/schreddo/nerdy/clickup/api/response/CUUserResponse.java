package io.github.schreddo.nerdy.clickup.api.response;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUUser;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUUserResponse extends ClickUpResponse {

	public CUUserResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public CUUser obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), BaseCollection.class).getUser();
	}

}
