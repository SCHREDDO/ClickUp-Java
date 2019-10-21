// Copyright (C) 2019 Sebastian Lühnen
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
// Created On: 14.09.2019
// Last Edited On: 19.10.2019
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.response;

import java.util.Arrays;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.enums.ResponsesType;
import io.github.schreddo.nerdy.clickup.api.models.CUFolder;
import io.github.schreddo.nerdy.clickup.api.models.CUTask;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class ClickUpResponse<T> {
	
	private final Class<T> convertClass;
	private ResponsesType responsesType;
	private int responseCode;
	private String json;

	private Class<T> getConvertClass() {
		return convertClass;
	}
	private ResponsesType getResponsesType() {
		return responsesType;
	}
	private void setResponsesType(ResponsesType responsesType) {
		this.responsesType = responsesType;
	}
	private int getResponseCode() {
		return responseCode;
	}
	private void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	private String getJson() {
		return json;
	}
	private void setJson(String json) {
		this.json = json;
	}

	public ClickUpResponse(Class<T> convertClass, int responseCode, String json, ResponsesType responsesType) {
		this.convertClass = convertClass;
		setResponsesType(responsesType);
		setResponseCode(responseCode);
		setJson(json);
	}
	
	public int code() {
		return getResponseCode();
	}
	
	public String json() {
		return getJson();
	}
	
	public Object obj() {
		Gson gson = new Gson();
		
		switch (getResponsesType()) {
		case OBJECT:
			return gson.fromJson(getJson(), getConvertClass());
		case TASKAS_AL:
			return Arrays.asList((CUTask[])gson.fromJson(getJson(), getConvertClass()));
		case FOLDERS_AL:
			return Arrays.asList((CUFolder[])gson.fromJson(getJson(), getConvertClass()));
		case ATTACHMENT_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getAttachment();
		case CHECKLIST_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getChecklist();
		case COMMENTS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getComments();
		case DATA_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getData();
		case FIELDS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getFields();
		case FOLDERS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getFolders();
		case GOALS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getGoals();
		case GOAL_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getGoal();
		case KEY_RESULT_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getKeyResult();
		case LISTS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getLists();
		case MEMBERS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getMembers();
		case SHARED_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getShared();
		case SPACES_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getSpaces();
		case TAGS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getTags();
		case TAG_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getTag();
		case TASKS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getTasks();
		case TASK_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getTag();
		case TEAMS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getTeams();
		case TEMPLATES_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getTemplates();
		case USER_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getUser();
		case VIEWS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getViews();
		case VIEW_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getView();
		case WEBHOOKS_BC:
			return ((BaseCollection)gson.fromJson(getJson(), getConvertClass())).getWebhooks();
		default:
			return gson.fromJson(getJson(), getConvertClass());
		}
	}
}
