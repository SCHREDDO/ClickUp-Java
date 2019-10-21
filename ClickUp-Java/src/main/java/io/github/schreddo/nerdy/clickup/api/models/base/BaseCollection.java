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
package io.github.schreddo.nerdy.clickup.api.models.base;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

import io.github.schreddo.nerdy.clickup.api.models.CUAttachment;
import io.github.schreddo.nerdy.clickup.api.models.CUChecklist;
import io.github.schreddo.nerdy.clickup.api.models.CUComment;
import io.github.schreddo.nerdy.clickup.api.models.CUCustomField;
import io.github.schreddo.nerdy.clickup.api.models.CUFolder;
import io.github.schreddo.nerdy.clickup.api.models.CUGoal;
import io.github.schreddo.nerdy.clickup.api.models.CUList;
import io.github.schreddo.nerdy.clickup.api.models.CUMember;
import io.github.schreddo.nerdy.clickup.api.models.CUSpace;
import io.github.schreddo.nerdy.clickup.api.models.CUTag;
import io.github.schreddo.nerdy.clickup.api.models.CUTask;
import io.github.schreddo.nerdy.clickup.api.models.CUTeam;
import io.github.schreddo.nerdy.clickup.api.models.CUView;
import io.github.schreddo.nerdy.clickup.api.models.CUWebhook;

public class BaseCollection {
	@SerializedName("attachment")
	private CUAttachment attachment;
	@SerializedName("user")
	private CUMember user;
	@SerializedName("teams")
	private ArrayList<CUTeam> teams;
	@SerializedName("checklist")
	private CUChecklist checklist;
	@SerializedName("comments")
	private ArrayList<CUComment> comments;
	@SerializedName("fields")
	private ArrayList<CUCustomField> fields;
	@SerializedName("folders")
	private ArrayList<CUFolder> folders;
	@SerializedName("goal")
	private CUGoal goal;
	@SerializedName("goals")
	private ArrayList<CUGoal> goals;
	@SerializedName("key_result")
	private Object keyResult;
	@SerializedName("lists")
	private ArrayList<CUList> lists;
	@SerializedName("members")
	private ArrayList<CUMember> members;
	@SerializedName("shared")
	private Object shared;
	@SerializedName("spaces")
	private ArrayList<CUSpace> spaces;
	@SerializedName("tags")
	private ArrayList<CUTag> tags;
	@SerializedName("tag")
	private CUTag tag;
	@SerializedName("templates")
	private ArrayList<Object> templates;
	@SerializedName("data")
	private ArrayList<Object> data;
	private CUView view;
	@SerializedName("views")
	private ArrayList<CUView> views;
	@SerializedName("task")
	private CUTask task;
	@SerializedName("tasks")
	private ArrayList<CUTask> tasks;
	@SerializedName("webhooks")
	private ArrayList<CUWebhook> webhooks;
	
	public CUAttachment getAttachment() {
		return attachment;
	}
	public void setAttachment(CUAttachment attachment) {
		this.attachment = attachment;
	}
	public CUMember getUser() {
		return user;
	}
	public void setUser(CUMember user) {
		this.user = user;
	}
	public ArrayList<CUTeam> getTeams() {
		return teams;
	}
	public void setTeams(ArrayList<CUTeam> teams) {
		this.teams = teams;
	}
	public CUChecklist getChecklist() {
		return checklist;
	}
	public void setChecklist(CUChecklist checklist) {
		this.checklist = checklist;
	}
	public ArrayList<CUComment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<CUComment> comments) {
		this.comments = comments;
	}
	public ArrayList<CUCustomField> getFields() {
		return fields;
	}
	public void setFields(ArrayList<CUCustomField> fields) {
		this.fields = fields;
	}
	public ArrayList<CUFolder> getFolders() {
		return folders;
	}
	public void setFolders(ArrayList<CUFolder> folders) {
		this.folders = folders;
	}
	public CUGoal getGoal() {
		return goal;
	}
	public void setGoal(CUGoal goal) {
		this.goal = goal;
	}
	public ArrayList<CUGoal> getGoals() {
		return goals;
	}
	public void setGoals(ArrayList<CUGoal> goals) {
		this.goals = goals;
	}
	public Object getKeyResult() {
		return keyResult;
	}
	public void setKeyResult(Object keyResult) {
		this.keyResult = keyResult;
	}
	public ArrayList<CUList> getLists() {
		return lists;
	}
	public void setLists(ArrayList<CUList> lists) {
		this.lists = lists;
	}
	public ArrayList<CUMember> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<CUMember> members) {
		this.members = members;
	}
	public Object getShared() {
		return shared;
	}
	public void setShared(Object shared) {
		this.shared = shared;
	}
	public ArrayList<CUSpace> getSpaces() {
		return spaces;
	}
	public void setSpaces(ArrayList<CUSpace> spaces) {
		this.spaces = spaces;
	}
	public ArrayList<CUTag> getTags() {
		return tags;
	}
	public void setTags(ArrayList<CUTag> tags) {
		this.tags = tags;
	}
	public CUTag getTag() {
		return tag;
	}
	public void setTag(CUTag tag) {
		this.tag = tag;
	}
	public ArrayList<Object> getTemplates() {
		return templates;
	}
	public void setTemplates(ArrayList<Object> templates) {
		this.templates = templates;
	}
	public ArrayList<Object> getData() {
		return data;
	}
	public void setData(ArrayList<Object> data) {
		this.data = data;
	}
	public CUView getView() {
		return view;
	}
	public void setView(CUView view) {
		this.view = view;
	}
	public ArrayList<CUView> getViews() {
		return views;
	}
	public void setViews(ArrayList<CUView> views) {
		this.views = views;
	}
	public CUTask getTask() {
		return task;
	}
	public void setTask(CUTask task) {
		this.task = task;
	}
	public ArrayList<CUTask> getTasks() {
		return tasks;
	}
	public void setTasks(ArrayList<CUTask> tasks) {
		this.tasks = tasks;
	}
	public ArrayList<CUWebhook> getWebhooks() {
		return webhooks;
	}
	public void setWebhooks(ArrayList<CUWebhook> webhooks) {
		this.webhooks = webhooks;
	}
	
	public BaseCollection() {
		
	}
}
