package io.github.schreddo.nerdy.clickup.api.response;

import java.util.ArrayList;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUTeam;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUTeamsResponse extends ClickUpResponse {

	public CUTeamsResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public ArrayList<CUTeam> obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), BaseCollection.class).getTeams();
	}

}
