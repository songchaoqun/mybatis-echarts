package com.lp.mapper;

import com.lp.model.Popu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MyMapper {

  @Select("select * from t_popu")
    public List<Popu> queryData();

}
