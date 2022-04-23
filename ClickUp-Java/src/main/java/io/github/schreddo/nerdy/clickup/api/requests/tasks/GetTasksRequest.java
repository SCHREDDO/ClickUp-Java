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
// Created On: 14.09.2019
// Last Edited On: 23.04.2022
// Language: Java
//
package io.github.schreddo.nerdy.clickup.api.requests.tasks;

import io.github.schreddo.nerdy.clickup.api.models.filter.CUTaskFilterOptions;
import io.github.schreddo.nerdy.clickup.api.requests.ClickUpRequest;
import io.github.schreddo.nerdy.clickup.api.response.CUTasksResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class GetTasksRequest extends ClickUpRequest {
	
	private Long listID;
	private Boolean archived;
	private CUTaskFilterOptions filterOptions;
	
	public Long getListID() {
		return listID;
	}
	public void setListID(Long listID) {
		this.listID = listID;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	public CUTaskFilterOptions getFilterOptions() {
		return filterOptions;
	}
	public void setFilterOptions(CUTaskFilterOptions filterOptions) {
		this.filterOptions = filterOptions;
	}

	public GetTasksRequest(String accessToken, Long listID) {
		super(accessToken);
		
		this.setListID(listID);
		this.setFilterOptions(null);
	}
	
	public GetTasksRequest(String accessToken, Long listID, CUTaskFilterOptions filterOptions) {
		super(accessToken);
		
		this.setListID(listID);
		this.setFilterOptions(filterOptions);
	}
	
	@Override
	public CUTasksResponse execute() {
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/list/" + getListID() + "/task", RequestMethod.GET);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		
		if (this.getFilterOptions() != null) {
			httpRequest = addFilterOptions(httpRequest);
		}
		
		Response response = httpRequest.executeRequest();
		
		return new CUTasksResponse(response.getResponseCode(), response.getResponse());
	}
	
	private HTTPRequest addFilterOptions(HTTPRequest httpRequest) {
		if (getFilterOptions().getArchived() != null)
			httpRequest.addURLParamenter("archived", getFilterOptions().getArchived().toString());
		if (getFilterOptions().getPage() != null)
			httpRequest.addURLParamenter("page", getFilterOptions().toString());
		if (getFilterOptions().getOrderBy() != null)
			httpRequest.addURLParamenter("order_by", getFilterOptions().getOrderBy());
		if (getFilterOptions().getReverse() != null)
			httpRequest.addURLParamenter("reverse", getFilterOptions().getReverse().toString());
		if (getFilterOptions().getSubtasks() != null)
			httpRequest.addURLParamenter("subtasks", getFilterOptions().getSubtasks().toString());
		if (getFilterOptions().getStatuses() != null) {
			for (int i = 0; i < getFilterOptions().getStatuses().size(); i++) {
				httpRequest.addURLParamenter("statuses[]", getFilterOptions().getStatuses().get(i).getStatus());	
			}
		}
		if (getFilterOptions().getIncludeClosed() != null)
			httpRequest.addURLParamenter("include_closed", getFilterOptions().getIncludeClosed().toString());
		if (getFilterOptions().getAssignees() != null) {
			for (int i = 0; i < getFilterOptions().getAssignees().size(); i++) {
				httpRequest.addURLParamenter("assignees[]", getFilterOptions().getAssignees().get(i).getID().toString());	
			}
		}
		if (getFilterOptions().getDueDateGT() != null)
			httpRequest.addURLParamenter("due_date_gt", getFilterOptions().getDueDateGT().toString());
		if (getFilterOptions().getDueDateLT() != null)
			httpRequest.addURLParamenter("due_date_lt", getFilterOptions().getDueDateLT().toString());
		if (getFilterOptions().getDateCreatedGT() != null)
			httpRequest.addURLParamenter("date_created_gt", getFilterOptions().getDateCreatedGT().toString());
		if (getFilterOptions().getDateCreatedLT() != null)
			httpRequest.addURLParamenter("date_created_lt", getFilterOptions().getDateCreatedLT().toString());
		if (getFilterOptions().getDateUpdatedGT() != null)
			httpRequest.addURLParamenter("date_updated_gt", getFilterOptions().getDateUpdatedGT().toString());
		if (getFilterOptions().getDateUpdatedLT() != null)
			httpRequest.addURLParamenter("date_updated_lt", getFilterOptions().getDateUpdatedLT().toString());
		if (getFilterOptions().getCustomFields() != null) {
			String customFieldsArray = "[";
			for (int i = 0; i < getFilterOptions().getCustomFields().size(); i++) {
				customFieldsArray += getFilterOptions().getCustomFields().get(i).toJsonString();
				if ((i + 1) < getFilterOptions().getCustomFields().size()) {
					customFieldsArray += ",";
				}
			}
			customFieldsArray += "]";
			
			httpRequest.addURLParamenter("custom_fields", customFieldsArray);
		}
		
		return httpRequest;
	}
}
