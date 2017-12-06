package com.imooc.test.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor {


	//prehandle方法有一个boolean的返回值，设置为false的时候可以在拦截到方法时立即停止方法的执行。
	//object参数指的是被拦截的请求对象实例。
	
	//在调用controller方法前 调用的方法		true：放行	false:不放行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行到了preHandle");
		
		return true;//是否终止请求
	}

	//posthandle方法可以通过modelandview参数改变方法的返回视图和返回数据。
	//在调用controller 方法后，并且在return modelAndView 之前调用
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行到了postHandle");
		
		modelAndView.addObject("msg", "修改之后");
		//modelAndView.setViewName("/home");
	} 

	//afterCompletion和posthandle的区别是在请求已经返回数据和视图以后执行，一般只会用于资源的释放操作，比较少会用到。
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("执行到了afterCompletion");
		
	}

}
