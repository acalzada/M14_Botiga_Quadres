package com.M14WhiteCollar.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.M14WhiteCollar.dto.Store;

public interface StoreDAO  extends JpaRepository<Store, Long>  {

}