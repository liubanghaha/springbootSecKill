//package com.lb.seckill.web;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
//
///**
// * @author lb
// * @create 2017-09-23
// **/
//@Configuration
//@EnableWebMvc
//public class MvcConfig extends WebMvcConfigurerAdapter{
//
//    @Bean
//    public FreeMarkerViewResolver freeMarkerViewResolver() {
//        System.out.println("MvcConfig.freeMarkerViewResolver()");
//        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
//        resolver.setPrefix("");
//        resolver.setSuffix(".ftl");
//        resolver.setContentType("text/html; charset=UTF-8");
//        resolver.setRequestContextAttribute("request");
//        return resolver;
//    }
//}
