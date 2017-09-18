package com.yuanwhy.demo;


import com.yuanwhy.runtime.Hello;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by hongyuan.wang on 18/09/2017.
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println(Hello.class);
        Hello hello = new Hello();


        ClassLoader cl = ClassLoader.getSystemClassLoader();
        URL[] urls = ((URLClassLoader)cl).getURLs();
        for(URL url: urls){
            System.out.println(url.getFile());
        }

    }
}
