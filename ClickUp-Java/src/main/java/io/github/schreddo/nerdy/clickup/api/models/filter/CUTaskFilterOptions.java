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

import io.github.schreddo.nerdy.clickup.api.enums.Operator;
import io.github.schreddo.nerdy.clickup.api.models.CUMember;
import io.github.schreddo.nerdy.clickup.api.models.CUStatus;
import io.github.schreddo.nerdy.clickup.api.models.base.CustomField;

public class CUTaskFilterOptions {
	
	private Boolean archived;
	private Integer page;
	private String orderBy;
	private Boolean reverse;
	private Boolean subtasks;
	private ArrayList<CUStatus> statuses;
	private Boolean includeClosed;
	private ArrayList<CUMember> assignees;
	private Integer dueDateGT;
	private Integer dueDateLT;
	private Integer dateCreatedGT;
	private Integer dateCreatedLT;
	private Integer dateUpdatedGT;
	private Integer dateUpdatedLT;
	private ArrayList<CustomField> customFields;
	
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
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
	public ArrayList<CUStatus> getStatuses() {
		return statuses;
	}
	public void setStatuses(ArrayList<CUStatus> statuses) {
		this.statuses = statuses;
	}
	public Boolean getIncludeClosed() {
		return includeClosed;
	}
	public void setIncludeClosed(Boolean includeClosed) {
		this.includeClosed = includeClosed;
	}
	public ArrayList<CUMember> getAssignees() {
		return assignees;
	}
	public void setAssignees(ArrayList<CUMember> assignees) {
		this.assignees = assignees;
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
	public ArrayList<CustomField> getCustomFields() {
		return customFields;
	}
	public void setCustomFields(ArrayList<CustomField> customFields) {
		this.customFields = customFields;
	}
	
	public CUTaskFilterOptions() {
		
	}
	
	public void addStatuses(CUStatus status) {
		getStatuses().add(status);
	}
	
	public void addAssignees(CUMember member) {
		getAssignees().add(member);
	}
	
	public void addCustomFields(String fieldID, String value, Operator operator) {
		getCustomFields().add(new CustomField(fieldID, value, operator));
	}
}
