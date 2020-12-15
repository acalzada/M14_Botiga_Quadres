package com.M14WhiteCollar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.M14WhiteCollar.dao.FrameDAO;
import com.M14WhiteCollar.dao.StoreDAO;
import com.M14WhiteCollar.dto.Frame;
import com.M14WhiteCollar.dto.Store;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	StoreDAO storeDAO;
	
	@Autowired
	FrameDAO frameDAO;

	@Override
	public List<Store> getAllStores() {
		return storeDAO.getAllStoresNameAndCapacity();
	}
	
	@Override
	public Store addStore(Store store) {
		return storeDAO.save(store);
	}

	@Override
	public Frame addFrame(Long id, Frame frame) {
		//TO-DO create relationship between Frame and Store tables
		return frameDAO.save(frame);
	}

	public Store storeById(Long id) {
		return storeDAO.findById(id).get();
	}
	
	public void updateStore(Store store) {
		storeDAO.save(store);
	}
}