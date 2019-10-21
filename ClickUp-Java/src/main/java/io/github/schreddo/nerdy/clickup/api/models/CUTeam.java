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

import io.github.schreddo.nerdy.clickup.api.models.base.BaseCollection;

public class CUTeam {
	@SerializedName("id")
	private String id;
	@SerializedName("name")
	private String name;
	@SerializedName("color")
	private String color;
	@SerializedName("avatar")
	private String avatar;
	@SerializedName("members")
	private ArrayList<BaseCollection> members;
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	private ArrayList<BaseCollection> getMembers() {
		return members;
	}
	private void setMembers(ArrayList<BaseCollection> members) {
		this.members = members;
	}
	
	public CUTeam() {
		
	}
	
	public CUMember getMember(int index) {
		return getMembers().get(index).getUser();
	}
	
	public void setMember(int index, CUMember members) {
		getMembers().get(index).setUser(members);;
	}
	
	public void addMember(CUMember members) {
		BaseCollection temp = new BaseCollection();
		temp.setUser(members);
		
		getMembers().add(temp);
	}
	
	public void removeMember(int index) {
		getMembers().remove(index);
	}
	
	public int getMemberCount() {
		return getMembers().size();
	}
}
