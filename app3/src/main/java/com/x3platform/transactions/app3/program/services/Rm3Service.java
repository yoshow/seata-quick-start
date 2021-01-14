package com.x3platform.transactions.app3.program.services;

import com.x3platform.transactions.app3.program.mappers.Tbl3Mapper;
import com.x3platform.transactions.app3.program.models.Tbl3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Rm3Service {
 
	@Autowired
  Tbl3Mapper mapper;
	
	public String rm3() {
		
		Tbl3 o = new Tbl3();
		o.setId(3);
		o.setName("rm3");
		mapper.insertSelective(o);
		
		return "";
	}
}
