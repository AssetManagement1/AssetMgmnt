package com.cg.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Asset;


public interface AssetServices {

	public List<Asset> addAsset(Asset e);
	public List<Asset> updateAsset(Asset e);
	//public Asset getAssetById(Integer Asset);
	public List<Asset> deleteAsset(Integer assid);
	public List<Asset> getAllAsset();
	public Asset getAssetById(Integer assid);
	
}
