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
package io.github.schreddo.nerdy.clickup.api.models;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

public class CUWebhook {
	@SerializedName("id")
	private String id;
	@SerializedName("userid")
	private Integer userID;
	@SerializedName("team_id")
	private Integer teamID;
	@SerializedName("endpoint")
	private String endpoint;
	@SerializedName("events")
	private ArrayList<String> events;
	@SerializedName("task_id")
	private String taskID;
	@SerializedName("list_id")
	private String listID;
	@SerializedName("folder_id")
	private String folderID;
	@SerializedName("space_id")
	private String spaceID;
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public Integer getTeamID() {
		return teamID;
	}
	public void setTeamID(Integer teamID) {
		this.teamID = teamID;
	}
	public String getEndpoint() {
		return endpoint;
	}
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	public ArrayList<String> getEvents() {
		return events;
	}
	public void setEvents(ArrayList<String> events) {
		this.events = events;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public String getListID() {
		return listID;
	}
	public void setListID(String listID) {
		this.listID = listID;
	}
	public String getFolderID() {
		return folderID;
	}
	public void setFolderID(String folderID) {
		this.folderID = folderID;
	}
	public String getSpaceID() {
		return spaceID;
	}
	public void setSpaceID(String spaceID) {
		this.spaceID = spaceID;
	}
	
	public CUWebhook() {
		
	}
}
