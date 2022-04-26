package io.github.schreddo.nerdy.clickup.api.response;

import java.util.ArrayList;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUTag;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUTagsResponse extends ClickUpResponse {

	public CUTagsResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public ArrayList<CUTag> obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), BaseCollection.class).getTags();
	}

}
