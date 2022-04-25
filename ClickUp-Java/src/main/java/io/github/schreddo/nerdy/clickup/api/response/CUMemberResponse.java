package io.github.schreddo.nerdy.clickup.api.response;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUMember;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUMemberResponse extends ClickUpResponse {

	public CUMemberResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public CUMember obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), BaseCollection.class).getMember();
	}

}
