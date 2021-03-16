package com.packt.example.clientimplicit.service;

import com.packt.example.clientimplicit.vo.DemoVo;
import jdk.internal.instrumentation.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test/build")
public class TestServiceController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/test")
    public HashMap<String, Object> testBuild(){
        HashMap<String, Object> test  = new HashMap<>();

        DemoVo vo = DemoVo.builder()
                .name("mr")
                .msg1("test1")
                .build();

       /* DemoVo vo = new DemoVo();
        vo.setName("mr");
        vo.setMsg1("test1");*/

        test.put("test",vo);

        return test;
    }

    public void test(){
        String reqUrl = "/test/url/";

        Long test = 0L;

        String paramUrl = "?testparam=" + test;
        try {
            DemoVo map = restTemplate.getForObject(reqUrl + paramUrl,   DemoVo.class);

        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
