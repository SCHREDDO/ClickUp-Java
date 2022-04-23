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
// Created On: 23.04.2022
// Last Edited On: 23.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.models.filter;

import java.util.ArrayList;

import io.github.schreddo.nerdy.clickup.api.models.CUList;
import io.github.schreddo.nerdy.clickup.api.models.CUSpace;
import io.github.schreddo.nerdy.clickup.api.models.CUTag;

public class CUTeamTaskFilterOptions extends CUTaskFilterOptions {
	
	private ArrayList<CUSpace> spaces;
	private ArrayList<CUSpace> projects;
	private ArrayList<CUList> lists;
	private ArrayList<CUTag> tags;
	private Boolean useCustomTaskIDs;
	private String teamID;
	
	public ArrayList<CUSpace> getSpaces() {
		return spaces;
	}
	public void setSpaces(ArrayList<CUSpace> spaces) {
		this.spaces = spaces;
	}
	public ArrayList<CUSpace> getProjects() {
		return projects;
	}
	public void setProjects(ArrayList<CUSpace> projects) {
		this.projects = projects;
	}
	public ArrayList<CUList> getLists() {
		return lists;
	}
	public void setLists(ArrayList<CUList> lists) {
		this.lists = lists;
	}
	public ArrayList<CUTag> getTags() {
		return tags;
	}
	public void setTags(ArrayList<CUTag> tags) {
		this.tags = tags;
	}
	public Boolean getUseCustomTaskIDs() {
		return useCustomTaskIDs;
	}
	public void setUseCustomTaskIDs(Boolean useCustomTaskIDs) {
		this.useCustomTaskIDs = useCustomTaskIDs;
	}
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}
	
	public CUTeamTaskFilterOptions() {
		super();
	}
}
