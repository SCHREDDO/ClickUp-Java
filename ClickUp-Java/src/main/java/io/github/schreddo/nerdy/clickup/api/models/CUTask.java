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

import io.github.schreddo.nerdy.clickup.api.models.base.CUPriority;

public class CUTask {
	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("status")
	private CUStatus status;
	@SerializedName("orderindex")
	private String orderIndex;
	@SerializedName("date_created")
	private String dateCreated;
	@SerializedName("date_updated")
	private String dateUpdated;
	@SerializedName("date_closed")
	private String dateClosed;
	@SerializedName("creator")
	private CUMember creator;
	@SerializedName("assignees")
	private ArrayList<CUMember> assignees;
	@SerializedName("checklists")
	private ArrayList<CUChecklist> checklists;
	@SerializedName("tags")
	private ArrayList<CUTag> tags;
	@SerializedName("parent")
	private String parent;
	@SerializedName("priority")
	private CUPriority priority;
	@SerializedName("due_date")
	private String dueDate;
	@SerializedName("start_date")
	private String startDate;
	@SerializedName("points")
	private Double points;
	@SerializedName("time_estimate")
	private Double timeEstimate;
	@SerializedName("time_spent")
	private Double timeSpent;
	@SerializedName("list")
	private CUList list;
	@SerializedName("project")
	private CUFolder project;
	@SerializedName("folder")
	private CUFolder folder;
	@SerializedName("space")
	private CUSpace space;
	@SerializedName("url")
	private String url;
	@SerializedName("team_id")
	private String teamID;
	@SerializedName("custom_fields")
	private ArrayList<CUCustomField> customFields;
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
	public CUStatus getStatus() {
		return status;
	}
	public void setStatus(CUStatus status) {
		this.status = status;
	}
	public String getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(String orderIndex) {
		this.orderIndex = orderIndex;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateUpdated() {
		return dateUpdated;
	}
	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}
	public String getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(String dateClosed) {
		this.dateClosed = dateClosed;
	}
	public CUMember getCreator() {
		return creator;
	}
	public void setCreator(CUMember creator) {
		this.creator = creator;
	}
	public ArrayList<CUMember> getAssignees() {
		return assignees;
	}
	public void setAssignees(ArrayList<CUMember> assignees) {
		this.assignees = assignees;
	}
	public ArrayList<CUChecklist> getChecklists() {
		return checklists;
	}
	public void setChecklists(ArrayList<CUChecklist> checklists) {
		this.checklists = checklists;
	}
	public ArrayList<CUTag> getTags() {
		return tags;
	}
	public void setTags(ArrayList<CUTag> tags) {
		this.tags = tags;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public CUPriority getPriority() {
		return priority;
	}
	public void setPriority(CUPriority priority) {
		this.priority = priority;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Double getPoints() {
		return points;
	}
	public void setPoints(Double points) {
		this.points = points;
	}
	public Double getTimeEstimate() {
		return timeEstimate;
	}
	public void setTimeEstimate(Double timeEstimate) {
		this.timeEstimate = timeEstimate;
	}
	public Double getTimeSpent() {
		return timeSpent;
	}
	public void setTimeSpent(Double timeSpent) {
		this.timeSpent = timeSpent;
	}
	public CUList getList() {
		return list;
	}
	public void setList(CUList list) {
		this.list = list;
	}
	public CUFolder getProject() {
		return project;
	}
	public void setProject(CUFolder project) {
		this.project = project;
	}
	public CUFolder getFolder() {
		return folder;
	}
	public void setFolder(CUFolder folder) {
		this.folder = folder;
	}
	public CUSpace getSpace() {
		return space;
	}
	public void setSpace(CUSpace space) {
		this.space = space;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	
	public CUTask() {
		
	}
}
