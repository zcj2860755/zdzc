package com.zdzc.service.impl;

import com.zdzc.dao.TSysDicMapper;
import com.zdzc.model.TSysDic;
import com.zdzc.service.ITSysDicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by zcj on 2019/08/01.
 */
@Service
public class TSysDicServiceImpl implements ITSysDicService {
    @Resource
    private TSysDicMapper tSysDicMapper;

    @Override
    public String findTest() {
        return tSysDicMapper.selectAll().toString();
    }

    @Override
    public int add(TSysDic test) {
        return tSysDicMapper.insert(test);
    }
}
