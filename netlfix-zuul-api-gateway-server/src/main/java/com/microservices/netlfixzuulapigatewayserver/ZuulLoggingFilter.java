package com.microservices.netlfixzuulapigatewayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class ZuulLoggingFilter extends ZuulFilter{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public boolean shouldFilter() {
		// want to enable filter-true
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// what should it run 
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		logger.info("Request --> {} Request URI --> {}", request, request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		// either pre or post or error
		return "pre";
	}

	@Override
	public int filterOrder() {
		// whats the order it should run
		return 1;
	}

}
