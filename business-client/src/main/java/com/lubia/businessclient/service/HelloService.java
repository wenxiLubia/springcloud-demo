/**
 * Copyright By 2019 SEABOXDATA
 * All right reserved.
 */
package com.lubia.businessclient.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * seaboxdata
 *
 * @author zhuwendong
 * @version 1.0
 * @category - 业务名称
 * @since 2019/10/23 9:45
 */
@Service
public class HelloService
{
	
	@Value("${company.name}")
	private String companyName;
	
	public String hello(String something)
	{
		return something + " by " + companyName;
	}
	
}
