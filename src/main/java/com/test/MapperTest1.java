package com.test;


import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bean.Department;
import com.bean.Test123;
import com.bean.User;
import com.bean.UserExample;
import com.dao.DepartmentMapper;
import com.dao.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class MapperTest1 {
	
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	SqlSession sqlsession;
	
	@Autowired
	Test123 test123;
	
	@Test
	public void testCRUD(){
		/*ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		DepartmentMapper bean= ioc.getBean(DepartmentMapper.class);*/
		/*System.out.println(departmentMapper);*/
		
		System.out.println("departmentMapper:"+departmentMapper);
		System.out.println("test123:"+test123);
		
		/*ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		DepartmentMapper bean= ioc.getBean(DepartmentMapper.class);
		System.out.println(bean);*/
		
		/*departmentMapper.insertSelective(new Department(1,"开发部"));
		departmentMapper.insertSelective(new Department(2,"策划部"));*/
		/*userMapper.insertSelective(new User(null, "suguisen", "东莞", 2));*/
		/*for(){
			userMapper.insertSelective(new User(null, "sensen", "广州", 2));
		}*/
		
		/*UserMapper user_mapper=sqlsession.getMapper(UserMapper.class);//会为接口自动的创建一个代理对象
		for(int i = 0; i<10;i++){
			String uid=UUID.randomUUID().toString().substring(0,4)+i;	//随机数
			user_mapper.insertSelective(new User(null,uid, "广州"+uid, 1));
		}*/
		
		
		
	}
}
