package com.mashibing.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author LYX
 * @description
 * @date 2022/6/28 22:34
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/filter")
public class MyFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("dofilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
