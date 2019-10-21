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

public class CUList {
	@SerializedName("id")
	private String id;
	@SerializedName("archived")
	private Boolean archived;
	@SerializedName("name")
	private String name;
	@SerializedName("orderindex")
	private Integer orderIndex;
	@SerializedName("content")
	private String content;
	@SerializedName("override_statuses")
	private Boolean overrideStatuses;
	@SerializedName("status")
	private CUStatus status;
	@SerializedName("statuses")
	private ArrayList<CUStatus> statuses;
	@SerializedName("priority")
	private CUPriority priority;
	@SerializedName("assignee")
	private CUMember assignee;
	@SerializedName("task_count")
	private String taskCount;
	@SerializedName("due_date")
	private String dueDate;
	@SerializedName("due_date_time")
	private Boolean dueDateTime;
	@SerializedName("start_date")
	private String startDate;
	@SerializedName("start_date_time")
	private Boolean startDateTime;
	@SerializedName("folder")
	private CUFolder folder;
	@SerializedName("space")
	private CUSpace space;
	@SerializedName("inbound_address")
	private String inboundAddress;
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
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Boolean getOverrideStatuses() {
		return overrideStatuses;
	}
	public void setOverrideStatuses(Boolean overrideStatuses) {
		this.overrideStatuses = overrideStatuses;
	}
	public CUStatus getStatus() {
		return status;
	}
	public void setStatus(CUStatus status) {
		this.status = status;
	}
	public ArrayList<CUStatus> getStatuses() {
		return statuses;
	}
	public void setStatuses(ArrayList<CUStatus> statuses) {
		this.statuses = statuses;
	}
	public CUPriority getPriority() {
		return priority;
	}
	public void setPriority(CUPriority priority) {
		this.priority = priority;
	}
	public CUMember getAssignee() {
		return assignee;
	}
	public void setAssignee(CUMember assignee) {
		this.assignee = assignee;
	}
	public String getTaskCount() {
		return taskCount;
	}
	public void setTaskCount(String taskCount) {
		this.taskCount = taskCount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public Boolean getDueDateTime() {
		return dueDateTime;
	}
	public void setDueDateTime(Boolean dueDateTime) {
		this.dueDateTime = dueDateTime;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public Boolean getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Boolean startDateTime) {
		this.startDateTime = startDateTime;
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
	public String getInboundAddress() {
		return inboundAddress;
	}
	public void setInboundAddress(String inboundAddress) {
		this.inboundAddress = inboundAddress;
	}
	public Boolean getAccess() {
		return access;
	}
	public void setAccess(Boolean access) {
		this.access = access;
	}
	
	public CUList() {
		
	}
}
