package com.example.zookser.demo.common;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器
 * 2020.11.3
 */
public class MyHandlerInterceptor extends HandlerInterceptorAdapter {
    public boolean  preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handle, ModelAndView modelAndView) throws Exception{

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handle, Exception ex) throws Exception{

    }
}
