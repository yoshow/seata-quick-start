package com.x3platform.transactions.app1.program.mappers;

import com.x3platform.transactions.app1.program.models.Tbl1;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tbl1Mapper {
  int deleteByPrimaryKey(Integer id);
  
  int insert(Tbl1 record);
  
  int insertSelective(Tbl1 record);
  
  Tbl1 selectByPrimaryKey(Integer id);
  
  int updateByPrimaryKeySelective(Tbl1 record);
  
  int updateByPrimaryKey(Tbl1 record);
}
