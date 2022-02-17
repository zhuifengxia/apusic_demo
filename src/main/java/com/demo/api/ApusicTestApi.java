package com.demo.api;

import com.demo.utils.result.GraceJSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("apusic")
public interface ApusicTestApi {

    @GetMapping("/test")
    public GraceJSONResult getDataList();

    @GetMapping("/testname")
    public GraceJSONResult getDetail();
}
