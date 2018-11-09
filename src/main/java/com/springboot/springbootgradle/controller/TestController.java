package com.springboot.springbootgradle.controller;

import com.springboot.springbootgradle.bean.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


	//@Resource
	//private FiberController fiberController;

	@RequestMapping("/a")
	public JsonResult test(int count, String a){
		System.out.println("aaa");
		log.info("fffff");
		return JsonResult.buildSuccessResult("success",null);
	}

}
