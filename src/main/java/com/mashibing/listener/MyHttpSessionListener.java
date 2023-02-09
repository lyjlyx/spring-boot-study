package com.mashibing.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author LYX
 * @description
 * @date 2022/6/28 22:40
 */
public class MyHttpSessionListener implements HttpSessionListener {

    static int online = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("you人");
        online ++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("销毁");
    }
}
