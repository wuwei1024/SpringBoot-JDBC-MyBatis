package com.wuwei.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 *
 * @author 吴维
 * @date 2017-8-26 9:59:19
 */
public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object o) throws Exception {
        System.out.println("拦截器：预处理...");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object o, ModelAndView mav) throws Exception {
        System.out.println("拦截器：后处理...");
    }

    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object o, Exception ex) throws Exception {
        System.out.println("拦截器：结束...");
    }
}
