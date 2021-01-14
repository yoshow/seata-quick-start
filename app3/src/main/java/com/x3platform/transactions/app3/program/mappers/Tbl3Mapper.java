package com.x3platform.transactions.app3.program.mappers;

import com.x3platform.transactions.app3.program.models.Tbl3;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tbl3Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbl3 record);

    int insertSelective(Tbl3 record);

    Tbl3 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbl3 record);

    int updateByPrimaryKey(Tbl3 record);
}
