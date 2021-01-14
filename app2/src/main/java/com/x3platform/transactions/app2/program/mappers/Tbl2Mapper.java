package com.x3platform.transactions.app2.program.mappers;

import com.x3platform.transactions.app2.program.models.Tbl2;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Tbl2Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbl2 record);

    int insertSelective(Tbl2 record);

    Tbl2 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbl2 record);

    int updateByPrimaryKey(Tbl2 record);
}
