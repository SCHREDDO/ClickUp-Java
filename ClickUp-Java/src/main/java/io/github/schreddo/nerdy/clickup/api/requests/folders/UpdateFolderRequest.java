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
package io.github.schreddo.nerdy.clickup.api.requests.folders;

import com.google.gson.Gson;

import io.github.schreddo.nerdy.clickup.api.enums.ResponsesType;
import io.github.schreddo.nerdy.clickup.api.models.CUFolder;
import io.github.schreddo.nerdy.clickup.api.response.ClickUpResponse;
import io.github.schreddo.nerdy.http.request.HTTPRequest;
import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Response;

public class UpdateFolderRequest {
	private String accessToken;
	private Long folderID;
	private CUFolder folder;
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Long getFolderID() {
		return folderID;
	}
	public void setFolderID(Long folderID) {
		this.folderID = folderID;
	}
	public CUFolder getFolder() {
		return folder;
	}
	public void setFolder(CUFolder folder) {
		this.folder = folder;
	}
	
	public UpdateFolderRequest(String accessToken, Long folderID, CUFolder folder) {
		setAccessToken(accessToken);
		setFolderID(folderID);
		setFolder(folder);
	}
	
	public ClickUpResponse<CUFolder> execute() {
		Gson gson = new Gson();
		HTTPRequest httpRequest = new HTTPRequest("https://api.clickup.com/api/v2/folder/" + getFolderID(), RequestMethod.PUT);
		httpRequest.addHeaderProperty("Authorization", getAccessToken());
		httpRequest.addHeaderProperty("Content-Type", "application/json");
		httpRequest.addPayload(gson.toJson(getFolder()));
		
		Response response = httpRequest.executeRequest();
		
		return new ClickUpResponse<CUFolder>(CUFolder.class, response.getResponseCode(), response.getResponse(), ResponsesType.OBJECT);
	}
}
