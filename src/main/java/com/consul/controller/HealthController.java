package com.consul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chy on 2019/5/6.
 */
@RestController
public class HealthController {

	@RequestMapping("/health")
	public String health(){
		return "health";
	}
}
