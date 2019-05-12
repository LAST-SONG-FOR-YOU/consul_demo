package com.consul.controller;

import com.consul.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chy on 2019/5/5.
 */
@RestController
public class TestController {

	@Autowired
	private Config config;

	@GetMapping(value="/test")
	public String test(){
		return config.getTitle();
	}
}
