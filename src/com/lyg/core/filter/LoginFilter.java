package com.lyg.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {


	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) servletRequest;
		HttpServletResponse response=(HttpServletResponse) servletResponse;
		String uri=request.getRequestURI();
		//判断是否为登录请求
		if(!uri.contains("/login_")){
			//非登录请求
			if(request.getSession().getAttribute("admin")!=null){
				//已经登录
				chain.doFilter(request, response);
			}else{
				//没有登录，跳转到登录页面
				response.sendRedirect(request.getContextPath()+"/login_toLoginUI.action");
			}
		}else{
			//登录请求
			chain.doFilter(request, response);
		}
	}
	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
