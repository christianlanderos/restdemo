package com.landeros.restdemo.exposition.api.dto;

import java.io.Serializable;

/**
 * @author vn0ei0j
 *
 */
public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 3101391916512755537L;
	
	private String responseMessage;
	private int responseCode;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	
}
