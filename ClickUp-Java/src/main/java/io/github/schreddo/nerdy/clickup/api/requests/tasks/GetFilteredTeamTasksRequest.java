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
package io.github.schreddo.nerdy.clickup.api.requests.tasks;

import io.github.schreddo.nerdy.clickup.api.models.CUTask;
import io.github.schreddo.nerdy.clickup.api.response.ClickUpResponse;

public class GetFilteredTeamTasksRequest {
	private String accessToken;
	private String teamID;
	private Integer page;
	private String orderBY;
	private Boolean reverse;
	private Boolean subtasks;
	private String[] spaceIDs;
	private String[] projectIDs;
	private String[] listIDs;
	private String[] statuses;
	private Boolean includeClosed;
	private String[] assignees;
	private String[] tags;
	private Integer dueDateGT;
	private Integer dueDateLT;
	private Integer dateCreatedGT;
	private Integer dateCreatedLT;
	private Integer dateUpdatedGT;
	private Integer dateUpdatedLT;
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getTeamID() {
		return teamID;
	}
	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getOrderBY() {
		return orderBY;
	}
	public void setOrderBY(String orderBY) {
		this.orderBY = orderBY;
	}
	public Boolean getReverse() {
		return reverse;
	}
	public void setReverse(Boolean reverse) {
		this.reverse = reverse;
	}
	public Boolean getSubtasks() {
		return subtasks;
	}
	public void setSubtasks(Boolean subtasks) {
		this.subtasks = subtasks;
	}
	public String[] getSpaceIDs() {
		return spaceIDs;
	}
	public void setSpaceIDs(String[] spaceIDs) {
		this.spaceIDs = spaceIDs;
	}
	public String[] getProjectIDs() {
		return projectIDs;
	}
	public void setProjectIDs(String[] projectIDs) {
		this.projectIDs = projectIDs;
	}
	public String[] getListIDs() {
		return listIDs;
	}
	public void setListIDs(String[] listIDs) {
		this.listIDs = listIDs;
	}
	public String[] getStatuses() {
		return statuses;
	}
	public void setStatuses(String[] statuses) {
		this.statuses = statuses;
	}
	public Boolean getIncludeClosed() {
		return includeClosed;
	}
	public void setIncludeClosed(Boolean includeClosed) {
		this.includeClosed = includeClosed;
	}
	public String[] getAssignees() {
		return assignees;
	}
	public void setAssignees(String[] assignees) {
		this.assignees = assignees;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public Integer getDueDateGT() {
		return dueDateGT;
	}
	public void setDueDateGT(Integer dueDateGT) {
		this.dueDateGT = dueDateGT;
	}
	public Integer getDueDateLT() {
		return dueDateLT;
	}
	public void setDueDateLT(Integer dueDateLT) {
		this.dueDateLT = dueDateLT;
	}
	public Integer getDateCreatedGT() {
		return dateCreatedGT;
	}
	public void setDateCreatedGT(Integer dateCreatedGT) {
		this.dateCreatedGT = dateCreatedGT;
	}
	public Integer getDateCreatedLT() {
		return dateCreatedLT;
	}
	public void setDateCreatedLT(Integer dateCreatedLT) {
		this.dateCreatedLT = dateCreatedLT;
	}
	public Integer getDateUpdatedGT() {
		return dateUpdatedGT;
	}
	public void setDateUpdatedGT(Integer dateUpdatedGT) {
		this.dateUpdatedGT = dateUpdatedGT;
	}
	public Integer getDateUpdatedLT() {
		return dateUpdatedLT;
	}
	public void setDateUpdatedLT(Integer dateUpdatedLT) {
		this.dateUpdatedLT = dateUpdatedLT;
	}
	
	public GetFilteredTeamTasksRequest(String accessToken, String teamID, int page) {
		setAccessToken(accessToken);
		setTeamID(teamID);
		setPage(page);
		setOrderBY(null);
		setReverse(null);
		setSubtasks(null);
		setSpaceIDs(null);
		setProjectIDs(null);
		setListIDs(null);
		setStatuses(null);
		setIncludeClosed(null);
		setAssignees(null);
		setTags(null);
		setDueDateGT(null);
		setDueDateLT(null);
		setDateCreatedGT(null);
		setDateCreatedLT(null);
		setDateUpdatedGT(null);
		setDateUpdatedLT(null);
	}
	
	public ClickUpResponse<CUTask[]> execute() {
		return null;
	}
}
