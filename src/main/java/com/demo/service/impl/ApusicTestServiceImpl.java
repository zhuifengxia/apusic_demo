package com.demo.service.impl;

import com.demo.mapper.ApusicTestMapper;
import com.demo.model.ApusicTest;
import com.demo.service.ApusicTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class ApusicTestServiceImpl implements ApusicTestService {

    @Autowired
    public ApusicTestMapper apusicTestMapper;

    @Override
    public List<ApusicTest> queryDataList() {
        Example adminExample = new Example(ApusicTest.class);
        adminExample.orderBy("id").desc();
        List<ApusicTest> datalist=apusicTestMapper.selectByExample(adminExample);
        return datalist;
    }
}
