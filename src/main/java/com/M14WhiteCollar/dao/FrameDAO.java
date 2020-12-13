package com.M14WhiteCollar.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.M14WhiteCollar.dto.Frame;

public interface FrameDAO extends JpaRepository<Frame, Long> {
	
}