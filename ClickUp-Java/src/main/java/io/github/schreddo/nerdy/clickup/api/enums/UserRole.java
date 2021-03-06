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
package io.github.schreddo.nerdy.clickup.api.enums;

import java.util.HashMap;
import java.util.Map;

public enum UserRole {
	OWNER(1),
	ADMIN(2),
	MEMBER(3),
	GUEST(4),
	UNKNOWN(0);

	private Integer value;
	private static Map<Integer, UserRole> map = new HashMap<Integer, UserRole>();

	private UserRole(Integer value) {
		this.value = value;
	}

	static {
		for (UserRole role : UserRole.values()) {
			map.put(role.value, role);
		}
	}

	public static UserRole valueOf(Integer role) {
		return (UserRole) map.get(role);
	}

	public Integer value() {
		return value;
	}
}
