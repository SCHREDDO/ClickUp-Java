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

import io.github.schreddo.nerdy.clickup.api.models.base.CUFeatures;

public class CUSpace {
	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("private")
	private Boolean privateSpace;
	@SerializedName("statuses")
	private ArrayList<CUStatus> statuses;
	@SerializedName("multiple_assignees")
	private Boolean multipleAssignees;
	@SerializedName("features")
	private CUFeatures features;
	@SerializedName("access")
	private Boolean access;
	@SerializedName("archived")
	private Boolean archived;
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getPrivateSpace() {
		return privateSpace;
	}
	public void setPrivateSpace(Boolean privateSpace) {
		this.privateSpace = privateSpace;
	}
	public ArrayList<CUStatus> getStatuses() {
		return statuses;
	}
	public void setStatuses(ArrayList<CUStatus> statuses) {
		this.statuses = statuses;
	}
	public Boolean getMultipleAssignees() {
		return multipleAssignees;
	}
	public void setMultipleAssignees(Boolean multipleAssignees) {
		this.multipleAssignees = multipleAssignees;
	}
	public CUFeatures getFeatures() {
		return features;
	}
	public void setFeatures(CUFeatures features) {
		this.features = features;
	}	
	public Boolean getAccess() {
		return access;
	}
	public void setAccess(Boolean access) {
		this.access = access;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	
	public CUSpace() {
		
	}
}
