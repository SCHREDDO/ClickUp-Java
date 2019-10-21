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

public class CUFolder {
	@SerializedName("id")
	private String id;
	@SerializedName("archived")
	private Boolean archived;
	@SerializedName("name")
	private String name;
	@SerializedName("orderindex")
	private Long orderIndex;
	@SerializedName("override_statuses")
	private Boolean overridStatuses;
	@SerializedName("statuses")
	private ArrayList<CUStatus> statuses;
	@SerializedName("hidden")
	private Boolean hidden;
	@SerializedName("space")
	private CUSpace space;
	@SerializedName("task_count")
	private String taskCount;
	@SerializedName("lists")
	private ArrayList<CUList> lists;
	@SerializedName("access")
	private Boolean access;
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Long orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Boolean getOverridStatuses() {
		return overridStatuses;
	}
	public void setOverridStatuses(Boolean overridStatuses) {
		this.overridStatuses = overridStatuses;
	}
	public ArrayList<CUStatus> getStatuses() {
		return statuses;
	}
	public void setStatuses(ArrayList<CUStatus> statuses) {
		this.statuses = statuses;
	}
	public Boolean getHidden() {
		return hidden;
	}
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
	public CUSpace getSpace() {
		return space;
	}
	public void setSpace(CUSpace space) {
		this.space = space;
	}
	public String getTaskCount() {
		return taskCount;
	}
	public void setTaskCount(String taskCount) {
		this.taskCount = taskCount;
	}
	public ArrayList<CUList> getLists() {
		return lists;
	}
	public void setLists(ArrayList<CUList> lists) {
		this.lists = lists;
	}
	public Boolean getAccess() {
		return access;
	}
	public void setAccess(Boolean access) {
		this.access = access;
	}
	
	public CUFolder() {
		
	}
}
