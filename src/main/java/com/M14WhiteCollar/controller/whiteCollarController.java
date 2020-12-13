package com.M14WhiteCollar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Frame addPicture(@PathVariable(name="id") Long id, @RequestBody Frame frame) {
		return storeServiceImpl.addFrame(id, frame);
	}
	
	
}
