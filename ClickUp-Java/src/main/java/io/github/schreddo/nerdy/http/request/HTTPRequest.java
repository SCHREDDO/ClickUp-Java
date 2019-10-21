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
package io.github.schreddo.nerdy.http.request;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import io.github.schreddo.nerdy.http.request.enums.RequestMethod;
import io.github.schreddo.nerdy.http.request.models.Paramenter;
import io.github.schreddo.nerdy.http.request.models.Request;
import io.github.schreddo.nerdy.http.request.models.Response;

public class HTTPRequest {
	
	private Request request;
	
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}

	public HTTPRequest() {
		this("", RequestMethod.GET);
	}
	
	public HTTPRequest(String url, RequestMethod requestMethod) {
		setRequest(new Request(url, requestMethod));
	}
	
	public HTTPRequest addURLParamenter(String paramenterName, String paramenterValue) {
		Paramenter paramenter = new Paramenter(paramenterName, paramenterValue);
		getRequest().getURLParamenter().add(paramenter);
		
		return this;
	}
	
	public HTTPRequest addURLParamenters() {
		return this;
	}
	
	public HTTPRequest removeURLParamenter() {
		return this;
	}
	
	public HTTPRequest addPayload(String payload) {
		getRequest().setPayload(payload);
		
		return this;
	}
	
	public HTTPRequest addHeaderProperty(String propertyName, String propertyValue) {
		Paramenter paramenter = new Paramenter(propertyName, propertyValue);
		getRequest().getHeaderProperty().add(paramenter);
				
		return this;
	}
	
	public HTTPRequest addHeaderPropertys() {
		return this;
	}
	
	public HTTPRequest removeHeaderProperty() {
		return this;
	}
	
	public Response executeRequest() {
		Response response = null;
		URL url = null;
		
		try {
			url = new URL(getRequest().buildURL());
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection = buildRequest(httpURLConnection);
			response = getResponseFromRequest(httpURLConnection);
		} catch (Exception e) {
			
		}
		
		return response;
	}
	
	private HttpURLConnection buildRequest(HttpURLConnection httpURLConnection) throws IOException {
		httpURLConnection = buildRequestSetMethod(httpURLConnection);
		httpURLConnection = buildRequestSetHeader(httpURLConnection);
		httpURLConnection = buildRequestSetURLParamenter(httpURLConnection);
		
		return httpURLConnection;
	}
	
	private HttpURLConnection buildRequestSetMethod(HttpURLConnection httpURLConnection) throws ProtocolException {
		httpURLConnection.setRequestMethod(getRequest().getRequestMethod().toString());
		
		return httpURLConnection;
	}
	
	private HttpURLConnection buildRequestSetHeader(HttpURLConnection httpURLConnection) {
		for (int i = 0; i < getRequest().getHeaderProperty().size(); i++) {
			httpURLConnection.setRequestProperty(getRequest().getHeaderProperty().get(i).getName(), getRequest().getHeaderProperty().get(i).getValue());
		}
		
		return httpURLConnection;
	}
	
	private HttpURLConnection buildRequestSetURLParamenter(HttpURLConnection httpURLConnection) throws IOException {
		/*if (getRequest().getRequestMethod().equals(RequestMethod.POST)) {
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod(RequestMethod.POST.toString());
			
			DataOutputStream wr = new DataOutputStream(httpURLConnection.getOutputStream());
			if (getRequest().getPayload() != null) {
				wr.writeBytes(getRequest().getPayload());
			}
			wr.flush();
			wr.close();
		}
		
		if (getRequest().getRequestMethod().equals(RequestMethod.PUT)) {
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setRequestMethod(RequestMethod.PUT.toString());
			
			DataOutputStream wr = new DataOutputStream(httpURLConnection.getOutputStream());
			if (getRequest().getPayload() != null) {
				wr.writeBytes(getRequest().getPayload());
			}
			wr.flush();
			wr.close();
		}*/
		httpURLConnection.setDoOutput(true);
		httpURLConnection.setRequestMethod(getRequest().getRequestMethod().toString());
		
		if (getRequest().getPayload() != null) {
			DataOutputStream wr = new DataOutputStream(httpURLConnection.getOutputStream());
			wr.writeBytes(getRequest().getPayload());
			
			wr.flush();
			wr.close();
		}
		
		return httpURLConnection;
	}
	
	private Response getResponseFromRequest(HttpURLConnection httpURLConnection) throws IOException {
		Response response = new Response();
		response.setResponseCode(getResponseCode(httpURLConnection));
		response.setResponse(readInputStream(httpURLConnection));
		
		return response;
	}
	
	private int getResponseCode(HttpURLConnection httpURLConnection) throws IOException {
		return httpURLConnection.getResponseCode();
	}
	
	private String readInputStream(HttpURLConnection httpURLConnection) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
		String line;
		StringBuffer response = new StringBuffer();

		while ((line = bufferedReader.readLine()) != null) {
			response.append(line);
		}
		bufferedReader.close();
		
		return response.toString();
	}
}
