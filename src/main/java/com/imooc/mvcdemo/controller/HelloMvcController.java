package com.imooc.mvcdemo.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/hello")
public class HelloMvcController {
	/*@ResponseBody*/
	@RequestMapping(value="/mvc")
	//host:8080/hello/mvc		返回"home"
	public String helloMvc(){
		System.out.println("helloMvc");
		
		return "/home";
	}
	
	@RequestMapping(value="/aaa")
	//host:8080/hello/mvc		返回"home"
	public String helloMvc2(){
		System.out.println("helloMvc");
		
		return "/home";
	}
	
	
	@RequestMapping(value="/view")
	public ModelAndView viewAll(){	//模型数据 +视图
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/hello1");
		mv.addObject("msg", "开始viewAll");
		return mv;
	}
	
	//pass the parameters to front-end using ajax
    @RequestMapping("/getPerson")
    public void getPerson(String name1,String name2,PrintWriter pw){
/*        pw.write("hello1,"+name1+name2+"\n"); 
        pw.write("hello2,"+name1+name2+"\n"); */
    	pw.write("<name>"+name1+name2+"</name>"); 
    }
    /*@RequestMapping("/name")
    public String sayHello(){
        return "name";
    }*/
	
}
