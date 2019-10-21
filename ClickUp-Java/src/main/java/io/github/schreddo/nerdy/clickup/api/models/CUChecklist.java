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

public class CUChecklist {
	@SerializedName("id")
	private String id;
	@SerializedName("task_id")
	private String taskID;
	@SerializedName("name")
	private String name;
	@SerializedName("orderindex")
	private Integer orderIndex;
	@SerializedName("resolved")
	private Integer resolved;
	@SerializedName("unresolved")
	private Integer unresolved;
	@SerializedName("items")
	private ArrayList<CUChecklistItem> items;
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getTaskID() {
		return taskID;
	}
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Integer getResolved() {
		return resolved;
	}
	public void setResolved(Integer resolved) {
		this.resolved = resolved;
	}
	public Integer getUnresolved() {
		return unresolved;
	}
	public void setUnresolved(Integer unresolved) {
		this.unresolved = unresolved;
	}
	public ArrayList<CUChecklistItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<CUChecklistItem> items) {
		this.items = items;
	}
	
	public CUChecklist() {
		
	}
}
