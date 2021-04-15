package com.cg.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AssetDao;
import com.cg.entity.Asset;

@Service
public  class AssetServicesImpl implements AssetServices{

	@Autowired
	AssetDao assdao;
	
	AssetServicesImpl(){	
	}
	
	@Override
	public List<Asset> addAsset(Asset e) {
		System.out.println("inserting an Asset");
		assdao.saveAndFlush(e);
		return assdao.findAll();
	}

	@Override
	public List<Asset> updateAsset(Asset e) {
		System.out.println("updating an Asset");
		assdao.saveAndFlush(e);
		return assdao.findAll();
	}

	
	@Override
	public Asset getAssetById(Integer assid) {
		System.out.println("get Asset by id");
		Optional<Asset> e = assdao.findById(assid);
		return e.get();
	}

	@Override
	public List<Asset> deleteAsset(Integer assid) {
		System.out.println("delete the Asset by id");
		assdao.deleteById(assid);
		return assdao.findAll();
	}

	@Override
	public List<Asset> getAllAsset() {
		System.out.println("get all Asset");
		return assdao.findAll();
	}

}
