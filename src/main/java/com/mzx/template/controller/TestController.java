package com.mzx.template.controller;

import com.alibaba.fastjson.JSONObject;
import com.mzx.template.entity.VoterInfoEntity;
import com.mzx.template.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mazhenxing
 */
@RestController
public class TestController {


    @Autowired
    private TestService testService;

    @GetMapping("test")
    public String get(@Param("id") Long id){
        VoterInfoEntity byId = testService.findById(id);
        return JSONObject.toJSONString(byId);
    }


    @GetMapping("insert")
    public String insert(@Param("id") Long id, @Param("name") String name){
        VoterInfoEntity voterInfoEntity = new VoterInfoEntity();
        voterInfoEntity.setId(id);
        voterInfoEntity.setName(name);
        testService.insert(voterInfoEntity);
        return "OK";
    }
}
