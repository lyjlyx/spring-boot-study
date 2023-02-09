package com.mashibing;

import com.mashibing.listener.MyHttpSessionListener;
import com.mashibing.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author LYX
 * @description
 * @date 2022/6/28 21:46
 */
@ServletComponentScan
@SpringBootApplication
public class StudySpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudySpringBootApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean<MyServlet> getServletRegistrationBean() {
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet());
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean<MyHttpSessionListener> getListener() {
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean();
        bean.setListener(new MyHttpSessionListener());
        System.out.println("listener");
        return bean;
    }


}
