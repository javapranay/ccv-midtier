package com.pdn.ccvmidtier.helpertext.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Pranay N.
 *
 */
public class HelperTextDto implements Serializable {
	@JsonProperty("helpertextid")
	private Long helperTxtId;
	@JsonProperty("elementname")
	private String elmntName;
	@JsonProperty("description")
	private String elmntDescription;
	@JsonProperty("area")
	private String elmntArea;
	@JsonProperty("helpertext")
	private String helperTxt;
	@JsonProperty("createdbyuserid")
	private String createdByUserId;
	@JsonProperty("createddate")
	private String createdDate;
	@JsonProperty("lastupdatedbyuserid")
	private String lastUpdatedByUserId;
	@JsonProperty("lastupdateddate")
	private String lastUpdatedDate;
	
	public Long getHelperTxtId() {
		return helperTxtId;
	}
	public void setHelperTxtId(Long helperTxtId) {
		this.helperTxtId = helperTxtId;
	}
	public String getElmntName() {
		return elmntName;
	}
	public void setElmntName(String elmntName) {
		this.elmntName = elmntName;
	}
	public String getElmntDescription() {
		return elmntDescription;
	}
	public void setElmntDescription(String elmntDescription) {
		this.elmntDescription = elmntDescription;
	}
	public String getElmntArea() {
		return elmntArea;
	}
	public void setElmntArea(String elmntArea) {
		this.elmntArea = elmntArea;
	}
	public String getHelperTxt() {
		return helperTxt;
	}
	public void setHelperTxt(String helperTxt) {
		this.helperTxt = helperTxt;
	}
	public String getCreatedByUserId() {
		return createdByUserId;
	}
	public void setCreatedByUserId(String createdByUserId) {
		this.createdByUserId = createdByUserId;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getLastUpdatedByUserId() {
		return lastUpdatedByUserId;
	}
	public void setLastUpdatedByUserId(String lastUpdatedByUserId) {
		this.lastUpdatedByUserId = lastUpdatedByUserId;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}
