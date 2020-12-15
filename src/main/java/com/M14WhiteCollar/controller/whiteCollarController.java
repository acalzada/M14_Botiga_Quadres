package com.M14WhiteCollar.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.M14WhiteCollar.dto.Frame;
import com.M14WhiteCollar.dto.Store;
import com.M14WhiteCollar.service.StoreServiceImpl;

@RestController
@RequestMapping("/")
public class WhiteCollarController {
	
	@Autowired
	StoreServiceImpl storeServiceImpl;
	
	@GetMapping("/shops")
	public List<Store> listAllStores() {
		return storeServiceImpl.getAllStores();
	}
	
	@PostMapping("/shops")
	public Store addStore(@RequestBody Store store) {
		return storeServiceImpl.addStore(store);
	}
	
	@PostMapping("/shops/{id}/pictures")
	public List<Frame> addPicture(@PathVariable(name="id") Long id, @RequestBody Frame frame) {
		Store store = storeServiceImpl.storeById(id);
		frame.setStoreEntryDate(LocalDateTime.now());
		store.addPicture(frame);
		storeServiceImpl.updateStore(store);
		store = storeServiceImpl.storeById(id);
		return store.getPictures();
	}
	
	@GetMapping("/shops/{id}/pictures")
	public List<Frame> getShopPictures(@PathVariable(name="id") Long id) {
		Store store = storeServiceImpl.storeById(id);
		return store.getPictures();
	}
	
	@DeleteMapping("/shops/{id}/pictures")
	public Store purgeShopPictures(@PathVariable(name="id") Long id) {
		Store store = storeServiceImpl.storeById(id);
		store.purgePictures();
		storeServiceImpl.updateStore(store);
		return storeServiceImpl.storeById(id);
	}
	
	
}
