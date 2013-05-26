package com.agungsetiawan.springremoteserver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Agung Setiawan
 */

public class App{
    public static void main( String[] args ){
        ApplicationContext context=new ClassPathXmlApplicationContext("server-context.xml");
    }
}
