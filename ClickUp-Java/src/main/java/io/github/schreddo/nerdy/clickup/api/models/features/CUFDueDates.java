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
package io.github.schreddo.nerdy.clickup.api.models.features;

import com.google.gson.annotations.SerializedName;

import io.github.schreddo.nerdy.clickup.api.models.base.BaseCUFeatuer;

public class CUFDueDates extends BaseCUFeatuer {
	@SerializedName("start_date")
	private Boolean startDate;
	@SerializedName("remap_due_dates")
	private Boolean remapDueDates;
	@SerializedName("remap_closed_due_date")
	private Boolean remapClosedDueDate;
	
	public Boolean getStartDate() {
		return startDate;
	}
	public void setStartDate(Boolean startDate) {
		this.startDate = startDate;
	}
	public Boolean getRemapDueDates() {
		return remapDueDates;
	}
	public void setRemapDueDates(Boolean remapDueDates) {
		this.remapDueDates = remapDueDates;
	}
	public Boolean getRemapClosedDueDate() {
		return remapClosedDueDate;
	}
	public void setRemapClosedDueDate(Boolean remapClosedDueDate) {
		this.remapClosedDueDate = remapClosedDueDate;
	}
	
	public CUFDueDates() {
		
	}
}
