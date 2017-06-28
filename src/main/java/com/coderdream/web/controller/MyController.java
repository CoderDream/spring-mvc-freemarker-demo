package com.coderdream.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderdream.web.model.Course;
import com.coderdream.web.model.User;
import com.coderdream.web.service.mail.IMailService;

/**
 * 控制层代码
 * 
 * @author 591791
 * @date 2014年11月27日
 */
@Controller
public class MyController {

	@Autowired
	private IMailService mailService;

	@RequestMapping("login") // 用来处理前台的login请求
	private @ResponseBody String hello(
			@RequestParam(value = "username", required = false) String username,
			@RequestParam(value = "password", required = false) String password) {
		User user = new User();
		user.setName(username);
		user.setAddress(password);

		List<Course> courseList = new ArrayList<Course>();
		Course course1 = new Course();
		course1.setName("语文");
		course1.setScore(80);
		Course course2 = new Course();
		course2.setName("数学");
		course2.setScore(108);
		Course course3 = new Course();
		course3.setName("英语");
		course3.setScore(105);
		Course course4 = new Course();
		course4.setName("物理");
		course4.setScore(85);
		Course course5 = new Course();
		course5.setName("政治");
		course5.setScore(36);
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		courseList.add(course4);
		courseList.add(course5);
		user.setCourseList(courseList);

		mailService.sendEmail(user);

		// return "Hello " + username + ",Your password is: " + password;
		return "mail";
	}

}
