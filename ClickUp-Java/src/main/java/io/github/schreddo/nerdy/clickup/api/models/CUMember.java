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

import io.github.schreddo.nerdy.clickup.api.enums.UserRole;
import io.github.schreddo.nerdy.clickup.api.enums.WeekStartDay;

public class CUMember {
	@SerializedName("id")
	private Long id;
	@SerializedName("username")
	private String username;
	@SerializedName("email")
	private String email;
	@SerializedName("color")
	private String color;
	@SerializedName("profilePicture")
	private String profilePicture;
	@SerializedName("initials")
	private String initials;
	@SerializedName("role")
	private Integer role;
	@SerializedName("week_start_day")
	private Integer weekStartDay;
	@SerializedName("global_font_support")
	private Boolean globalFontSupport;
	
	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getInitials() {
		return initials;
	}
	public void setInitials(String initials) {
		this.initials = initials;
	}
	public UserRole getRole() {
		return UserRole.valueOf(this.role);
	}
	public void setRole(UserRole role) {
		this.role = role.value();
	}
	public WeekStartDay getWeekStartDay() {
		return WeekStartDay.valueOf(this.weekStartDay);
	}
	public void setWeekStartDay(WeekStartDay weekStartDay) {
		this.weekStartDay = weekStartDay.value();
	}
	public Boolean getGlobalFontSupport() {
		return globalFontSupport;
	}
	public void setGlobalFontSupport(Boolean globalFontSupport) {
		this.globalFontSupport = globalFontSupport;
	}
	
	public CUMember() {
		
	}
}
