package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Asset")

public class Asset {
	
	@Id
	@Column(name = "ass_id")
	
	private int asset_id;
	
	@Column(name = "ass_name")
	private String asset_name;
	
	@Column(name = "ass_model")
	private String asset_model;
	
	@Column(name = "ass_type")
	private String asset_type;
	
	public String getAsset_model() {
		return asset_model;
	}
	public void setAsset_model(String asset_model) {
		this.asset_model = asset_model;
	}
	public String getAsset_type() {
		return asset_type;
	}
	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}
	public int getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(int asset_id) {
		this.asset_id = asset_id;
	}
	public String getAsset_name() {
		return asset_name;
	}
	public void setAsset_name(String asset_name) {
		this.asset_name = asset_name;
	}
	@Override
	public String toString() {
		return "Asset [asset_id=" + asset_id + ", asset_name=" + asset_name + ", asset_model=" + asset_model
				+ ", asset_type=" + asset_type + "]";
	}
	
	
	
}
