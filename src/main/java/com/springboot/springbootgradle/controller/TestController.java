package com.springboot.springbootgradle.controller;

import com.springboot.springbootgradle.bean.JsonResult;
import lombok.extern.slf4j.Slf4j;
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
		return JsonResult.buildSuccessResult("success",null);
	}

}
