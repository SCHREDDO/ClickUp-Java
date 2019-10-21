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
package io.github.schreddo.nerdy.http.request.models;

import java.util.ArrayList;
import java.util.List;

import io.github.schreddo.nerdy.http.request.enums.RequestMethod;

public class Request {
	
	private String url;
	private RequestMethod requestMethod;
	private List<Paramenter> headerProperty;
	private List<Paramenter> urlParamenter;
	private String payload;

	public String getURL() {
		return url;
	}
	public void setuRL(String url) {
		this.url = url;
	}
	public RequestMethod getRequestMethod() {
		return requestMethod;
	}
	public void setRequestMethod(RequestMethod requestMethod) {
		this.requestMethod = requestMethod;
	}
	public List<Paramenter> getHeaderProperty() {
		return headerProperty;
	}
	public void setHeaderProperty(List<Paramenter> headerProperty) {
		this.headerProperty = headerProperty;
	}
	public List<Paramenter> getURLParamenter() {
		return urlParamenter;
	}
	public void setURLParamenter(List<Paramenter> urlParamenter) {
		this.urlParamenter = urlParamenter;
	}	
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
	public Request() {
		this("", RequestMethod.GET);
	}
	
	public Request(String url, RequestMethod requestMethod) {
		setuRL(url);
		setRequestMethod(requestMethod);
		setHeaderProperty(new ArrayList<Paramenter>());
		setURLParamenter(new ArrayList<Paramenter>());
		setPayload(null);
	}
	
	public String buildURL() {
		String url = getURL();
		
		if (getURLParamenter().size() > 0) {
			if (url.contains("?")) {
				url = url + "&" + getParamenterList();
			} else {
				url = url + "?" + getParamenterList();
			}
		}
		
		return url;
	}
	
	public String getParamenterList() {
		String paramenterList = "";
		String paramenter = "";
		
		for (int i = 0; i < getURLParamenter().size(); i++) {
			paramenter = getURLParamenter().get(i).getName() + "=" +getURLParamenter().get(i).getValue();
			
			if (paramenterList.equals("")) {
				paramenterList = paramenterList + "&" + paramenter;
			}
		}
		
		return paramenterList;
	}
}
