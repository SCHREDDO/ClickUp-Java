// Copyright (C) 2019-2022 Sebastian Lühnen
//
//
// This file is part of ClickUp-Java.
// 
// ClickUp-Java is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// ClickUp-Java is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with ClickUp-Java. If not, see <http://www.gnu.org/licenses/>.
//
//
// Created By: Sebastian Lühnen
// Created On: 17.06.2021
// Last Edited On: 23.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.response;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.models.CUTask;

public class CUTaskResponse extends ClickUpResponse {

	public CUTaskResponse(int responseCode, String json) {
		super(responseCode, json);
	}

	@Override
	public CUTask obj() {
		Gson gson = new Gson();
		
		return gson.fromJson(getJson(), CUTask.class);
	}

}
