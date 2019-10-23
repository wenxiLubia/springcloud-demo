/**
 * Copyright By 2019 SEABOXDATA
 * All right reserved.
 */
package com.lubia.businessclient.controller;

import com.lubia.businessclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * seaboxdata
 *
 * @author zhuwendong
 * @version 1.0
 * @category - 业务名称
 * @since 2019/10/23 9:45
 */
@RestController
public class HelloController
{
	
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public String hello(@RequestParam String something)
	{
		if (StringUtils.isEmpty(something)) something = "Hello World";
		return helloService.hello(something);
	}
	
}
