package io.github.schreddo.nerdy.clickup.api.response;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUTeam;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUTeamResponse extends ClickUpResponse {

	public CUTeamResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public CUTeam obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), BaseCollection.class).getTeam();
	}

}
