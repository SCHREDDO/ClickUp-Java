package io.github.schreddo.nerdy.clickup.api.response;

import java.util.ArrayList;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUUser;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUUsersResponse extends ClickUpResponse {

	public CUUsersResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public ArrayList<CUUser> obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), BaseCollection.class).getUsers();
	}

}
