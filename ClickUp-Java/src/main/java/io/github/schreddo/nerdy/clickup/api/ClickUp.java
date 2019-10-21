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
package io.github.schreddo.nerdy.clickup.api;

import io.github.schreddo.nerdy.clickup.api.models.CUFolder;
import io.github.schreddo.nerdy.clickup.api.models.CUList;
import io.github.schreddo.nerdy.clickup.api.models.CUSpace;
import io.github.schreddo.nerdy.clickup.api.models.CUTask;
import io.github.schreddo.nerdy.clickup.api.models.base.Authorization;
import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;
import io.github.schreddo.nerdy.clickup.api.requests.authorization.AccessTokenRequest;
import io.github.schreddo.nerdy.clickup.api.requests.authorization.GetAuthorizedTeamsRequest;
import io.github.schreddo.nerdy.clickup.api.requests.authorization.GetAuthorizedUserRequest;
import io.github.schreddo.nerdy.clickup.api.requests.folders.CreateFolderRequest;
import io.github.schreddo.nerdy.clickup.api.requests.folders.DeleteFolderRequest;
import io.github.schreddo.nerdy.clickup.api.requests.folders.GetFolderRequest;
import io.github.schreddo.nerdy.clickup.api.requests.folders.GetFoldersRequest;
import io.github.schreddo.nerdy.clickup.api.requests.folders.UpdateFolderRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.CreateFolderlessListRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.CreateListRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.DeleteListRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.GetFolderlessListsRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.GetListRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.GetListsRequest;
import io.github.schreddo.nerdy.clickup.api.requests.lists.UpdateListRequest;
import io.github.schreddo.nerdy.clickup.api.requests.members.GetListMembersRequest;
import io.github.schreddo.nerdy.clickup.api.requests.members.GetTaskMembersRequest;
import io.github.schreddo.nerdy.clickup.api.requests.spaces.CreateSpaceRequest;
import io.github.schreddo.nerdy.clickup.api.requests.spaces.DeleteSpaceRequest;
import io.github.schreddo.nerdy.clickup.api.requests.spaces.GetSpaceRequest;
import io.github.schreddo.nerdy.clickup.api.requests.spaces.GetSpacesRequest;
import io.github.schreddo.nerdy.clickup.api.requests.spaces.UpdateSpaceRequest;
import io.github.schreddo.nerdy.clickup.api.requests.tasks.CreateTaskRequest;
import io.github.schreddo.nerdy.clickup.api.requests.tasks.DeleteTaskRequest;
import io.github.schreddo.nerdy.clickup.api.requests.tasks.GetTaskRequest;
import io.github.schreddo.nerdy.clickup.api.requests.tasks.GetTasksRequest;
import io.github.schreddo.nerdy.clickup.api.requests.tasks.UpdateTaskRequest;
import io.github.schreddo.nerdy.clickup.api.requests.teams.GetTeamsRequest;
import io.github.schreddo.nerdy.clickup.api.response.ClickUpResponse;

public class ClickUp {
	private String accessToken;
	
	private String getAccessToken() {
		return accessToken;
	}
	private void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	public ClickUp(String accessToken) {
		setAccessToken(accessToken);
	}
	
	public ClickUp(String clientId, String clientSecret, String code) {
		getAccessToken(clientId, clientSecret, code);
	}
	
	public Boolean getAccessToken(String clientId, String clientSecret, String code) {
		ClickUpResponse<Authorization> response = new AccessTokenRequest(clientId, clientSecret, code).execute();
		
		if (response.code() == 200) {
			setAccessToken(((Authorization) response.obj()).getAccessToken());
			
			return true;
		} else {
			return false;
		}
	}
	
	public ClickUpResponse<BaseCollection> getAuthorizedUser() {
		return new GetAuthorizedUserRequest(getAccessToken()).execute();
	}
	
	public ClickUpResponse<BaseCollection> getAuthorizedTeams() {
		return new GetAuthorizedTeamsRequest(getAccessToken()).execute();
	}
	
	public ClickUpResponse<BaseCollection> getTeams() {
		return new GetTeamsRequest(getAccessToken()).execute();
	}
	
	public ClickUpResponse<CUSpace> createSpace(Long teamID, CUSpace space) {
		return new CreateSpaceRequest(getAccessToken(), teamID, space).execute();
	}
	
	public ClickUpResponse<CUSpace> updateSpace(Long spaceID, CUSpace space) {
		return new UpdateSpaceRequest(getAccessToken(), spaceID, space).execute();
	}
	
	public Boolean deleteSpace(Long spaceID) {
		ClickUpResponse<Object> response = new DeleteSpaceRequest(getAccessToken(), spaceID).execute();
		
		if (response.code() == 200) {
			return true;
		} else {
			return false;
		}
	}
	
	public ClickUpResponse<BaseCollection> getSpaces(Long teamID, Boolean archived) {
		return new GetSpacesRequest(getAccessToken(), teamID, archived).execute();
	}
	
	public ClickUpResponse<CUSpace> getSpace(Long spaceID) {
		return new GetSpaceRequest(getAccessToken(), spaceID).execute();
	}
	
	public ClickUpResponse<CUFolder> createFolder(Long spaceID, CUFolder folder) {
		return new CreateFolderRequest(getAccessToken(), spaceID, folder).execute();
	}
	
	public ClickUpResponse<CUFolder> updateFolder(Long folderID, CUFolder folder) {
		return new UpdateFolderRequest(getAccessToken(), folderID, folder).execute();
	}
	
	public Boolean deleteFolder(Long folderID) {
		ClickUpResponse<Object> response = new DeleteFolderRequest(getAccessToken(), folderID).execute();
		
		if (response.code() == 200) {
			return true;
		} else {
			return false;
		}
	}
	
	public ClickUpResponse<BaseCollection> getFolders(Long spaceID, Boolean archived) {
		return new GetFoldersRequest(getAccessToken(), spaceID, archived).execute();
	}
	
	public ClickUpResponse<CUFolder> getFolder(Long folderID) {
		return new GetFolderRequest(getAccessToken(), folderID).execute();
	}
	
	public ClickUpResponse<CUList> createList(Long folderID, CUList list) {
		return new CreateListRequest(getAccessToken(), folderID, list).execute();
	}
	
	public ClickUpResponse<CUList> createFolderlessList(Long spaceID, CUList list) {
		return new CreateFolderlessListRequest(getAccessToken(), spaceID, list).execute();
	}
	
	public ClickUpResponse<CUList> updateList(String listID, CUList list) {
		return new UpdateListRequest(getAccessToken(), listID, list).execute();
	}
	
	public Boolean deleteList(Long listID) {
		ClickUpResponse<Object> response = new DeleteListRequest(getAccessToken(), listID).execute();
		
		if (response.code() == 200) {
			return true;
		} else {
			return false;
		}
	}
	
	public ClickUpResponse<BaseCollection> getLists(Long folderID, Boolean archived) {
		return new GetListsRequest(getAccessToken(), folderID, archived).execute();
	}
	
	public ClickUpResponse<BaseCollection> getFolderlessLists(Long spaceID, Boolean archived) {
		return new GetFolderlessListsRequest(getAccessToken(), spaceID, archived).execute();
	}
	
	public ClickUpResponse<CUList> getList(Long listID) {
		return new GetListRequest(getAccessToken(), listID).execute();
	}
	
	public ClickUpResponse<CUTask> createTask(Long listID, CUTask task) {
		return new CreateTaskRequest(getAccessToken(), listID, task).execute();
	}
	
	public ClickUpResponse<CUTask> updateTask(String taskID, CUTask task) {
		return new UpdateTaskRequest(getAccessToken(), taskID, task).execute();
	}
	
	public boolean deleteTask(String taskID) {
		ClickUpResponse<Object> response = new DeleteTaskRequest(getAccessToken(), taskID).execute();
		
		if (response.code() == 200) {
			return true;
		} else {
			return false;
		}
	}
	
	public ClickUpResponse<BaseCollection> getTasks(Long listID, Boolean archived) {
		return new GetTasksRequest(getAccessToken(), listID, archived).execute();
	}
	
	public ClickUpResponse<CUTask> getTask(String taskID) {
		return new GetTaskRequest(getAccessToken(), taskID).execute();
	}
	
	public ClickUpResponse<BaseCollection> getListMembers(Long listID) {
		return new GetListMembersRequest(getAccessToken(), listID).execute();
	}
	
	public ClickUpResponse<BaseCollection> getTaskMembers(String taskID) {
		return new GetTaskMembersRequest(getAccessToken(), taskID).execute();
	}
}
