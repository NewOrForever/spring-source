package com.zhouyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * ClassName:AService
 * Package:com.zhouyu.service
 * Description:
 *
 * @Date:2022/1/17 14:09
 * @Author:qs@1.com
 */
@Component
@Lazy
public class AService {
	@Autowired
	private BService bService;
}
