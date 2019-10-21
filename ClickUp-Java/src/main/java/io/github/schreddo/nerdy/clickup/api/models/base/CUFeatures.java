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

import com.google.gson.annotations.SerializedName;

import io.github.schreddo.nerdy.clickup.api.models.features.CUFChecklists;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFCustomFields;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFDependencyWarning;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFDueDates;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFPortfolios;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFPriorities;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFRemapDependencies;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFTags;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFTimeEstimates;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFTimeTracking;
import io.github.schreddo.nerdy.clickup.api.models.features.CUFCheckUnresolved;

public class CUFeatures {
	@SerializedName("due_dates")
	private CUFDueDates dueDates;
	@SerializedName("time_tracking")
	private CUFTimeTracking timeTracking;
	@SerializedName("tags")
	private CUFTags tags;
	@SerializedName("time_estimates")
	private CUFTimeEstimates timeEstimates;
	@SerializedName("checklists")
	private CUFChecklists checklists;
	@SerializedName("custom_fields")
	private CUFCustomFields customFields;
	@SerializedName("remap_dependencies")
	private CUFRemapDependencies remapDependencies;
	@SerializedName("dependency_warning")
	private CUFDependencyWarning dependencyWarning;
	@SerializedName("portfolios")
	private CUFPortfolios portfolios;
	@SerializedName("check_unresolved")
	private CUFCheckUnresolved checkUnresolved;
	@SerializedName("priorities")
	private CUFPriorities priorities;
	@SerializedName("archived")
	private Boolean archived;
	
	public CUFDueDates getDueDates() {
		return dueDates;
	}
	public void setDueDates(CUFDueDates dueDates) {
		this.dueDates = dueDates;
	}
	public CUFTimeTracking getTimeTracking() {
		return timeTracking;
	}
	public void setTimeTracking(CUFTimeTracking timeTracking) {
		this.timeTracking = timeTracking;
	}
	public CUFTags getTags() {
		return tags;
	}
	public void setTags(CUFTags tags) {
		this.tags = tags;
	}
	public CUFTimeEstimates getTimeEstimates() {
		return timeEstimates;
	}
	public void setTimeEstimates(CUFTimeEstimates timeEstimates) {
		this.timeEstimates = timeEstimates;
	}
	public CUFChecklists getChecklists() {
		return checklists;
	}
	public void setChecklists(CUFChecklists checklists) {
		this.checklists = checklists;
	}
	public CUFCustomFields getCustomFields() {
		return customFields;
	}
	public void setCustomFields(CUFCustomFields customFields) {
		this.customFields = customFields;
	}
	public CUFRemapDependencies getRemapDependencies() {
		return remapDependencies;
	}
	public void setRemapDependencies(CUFRemapDependencies remapDependencies) {
		this.remapDependencies = remapDependencies;
	}
	public CUFDependencyWarning getDependencyWarning() {
		return dependencyWarning;
	}
	public void setDependencyWarning(CUFDependencyWarning dependencyWarning) {
		this.dependencyWarning = dependencyWarning;
	}
	public CUFPortfolios getPortfolios() {
		return portfolios;
	}
	public void setPortfolios(CUFPortfolios portfolios) {
		this.portfolios = portfolios;
	}
	public CUFCheckUnresolved getCheckUnresolved() {
		return checkUnresolved;
	}
	public void setCheckUnresolved(CUFCheckUnresolved checkUnresolved) {
		this.checkUnresolved = checkUnresolved;
	}
	public Boolean getArchived() {
		return archived;
	}
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}
	
	public CUFeatures() {
		
	}
}
