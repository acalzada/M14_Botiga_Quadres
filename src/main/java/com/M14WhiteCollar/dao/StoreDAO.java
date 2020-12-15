package com.M14WhiteCollar.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.M14WhiteCollar.dto.Store;

public interface StoreDAO  extends JpaRepository<Store, Long>  {
	@Query("select new Store(name, maxCapacity) from Store")
	public List<Store> getAllStoresNameAndCapacity();
}