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

import com.google.gson.annotations.SerializedName;

import io.github.schreddo.nerdy.clickup.api.models.base.CUTypeConfig;

public class CUCustomField {
	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("type")
	private String type;
	@SerializedName("type_config")
	private CUTypeConfig typeConfig;
	@SerializedName("date_created")
	private String dateCreated;
	@SerializedName("hide_from_guests")
	private Boolean hideFromGuests;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CUTypeConfig getTypeConfig() {
		return typeConfig;
	}
	public void setTypeConfig(CUTypeConfig typeConfig) {
		this.typeConfig = typeConfig;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Boolean getHideFromGuests() {
		return hideFromGuests;
	}
	public void setHideFromGuests(Boolean hideFromGuests) {
		this.hideFromGuests = hideFromGuests;
	}
	
	public CUCustomField() {
		
	}
}
