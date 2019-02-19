package com.lp.service;

import com.lp.mapper.MyMapper;
import com.lp.model.Popu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PopuServiceImpl implements PopuService{
    @Autowired
    private MyMapper myMapper;
    public List<Popu> queryData(){
      return   myMapper.queryData();
    }


}
