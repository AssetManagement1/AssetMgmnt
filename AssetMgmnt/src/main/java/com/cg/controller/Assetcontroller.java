package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Asset;
import com.cg.Services.AssetServices;

@RestController

public class Assetcontroller {
	
	@Autowired
	AssetServices asset;
	@RequestMapping("/asset")
	@PostMapping("/addAsset")
	public List<Asset> addAsset(Asset e){
		System.out.println("in asset controller add Asset");
		return asset.addAsset(e);
	}
		
	
	@PostMapping("/updateAsset")
	public List<Asset> updateAsset(Asset e){
		System.out.println("in asset controller update Asset");
		return asset.updateAsset(e);
	}
	
	
	@GetMapping("/getAssetById/{Assid}")
	public Asset getAssetById(@PathVariable Integer assid) {
		System.out.println("in asset controller get Asset by id");
		return asset.getAssetById(assid);
	}
	
	
	@DeleteMapping("/deleteAsset/{assid}")
	public List<Asset> deleteAsset(@PathVariable Integer assid){
		System.out.println("in asset controller delete Asset");
		return asset.deleteAsset(assid);
	}
	
	
	@GetMapping("/findAll")
	public List<Asset> getAllAsset(){
		System.out.println("in asset controller get all Asset");
		return asset.getAllAsset();
	}	
}
