package com.M14WhiteCollar.service;

import java.util.List;

import com.M14WhiteCollar.dto.Frame;
import com.M14WhiteCollar.dto.Store;

public interface StoreService {
	public List<Store> getAllStores();
	
	public Store addStore(Store store);
	
	public Frame addFrame(Long id, Frame frame);
	
	public Store storeById(Long id);
	
	public void updateStore(Store store);
}
