package com.x3platform.transactions.app2.program.services;

import java.util.Random;

import com.x3platform.transactions.app2.program.mappers.Tbl2Mapper;
import com.x3platform.transactions.app2.program.models.Tbl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 */
@Service
public class Rm2Service {
	
	@Autowired
	Tbl2Mapper mapper;
	
	public String rm2() {
		Tbl2 o = new Tbl2();
		o.setId(2);
		o.setName("rm2");
		mapper.insertSelective(o);
		
		return "";
	}
	
	public String updateRm2() {
		Tbl2 o = mapper.selectByPrimaryKey(2);
		o.setName(o.getName()+new Random().nextInt(2));
		mapper.updateByPrimaryKeySelective(o);
		return "";
	}
}
