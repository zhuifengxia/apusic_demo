package com.demo.controller;

import com.demo.api.ApusicTestApi;
import com.demo.model.ApusicTest;
import com.demo.service.ApusicTestService;
import com.demo.utils.result.GraceJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApusicTestController implements ApusicTestApi {

    @Autowired
    private ApusicTestService apusicTestService;

    @Override
    public GraceJSONResult getDataList() {
        List<ApusicTest> datalist = apusicTestService.queryDataList();
        return GraceJSONResult.ok(datalist);
    }
}
