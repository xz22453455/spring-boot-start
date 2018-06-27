package com.ysc.simplespringbootstarter.service;

import org.springframework.util.StringUtils;

/**
 * @Auther: wangcm
 * @Date: 2018\6\27 0027 10:26
 * @Description: 字符串根据传入的字符进行分割
 */
public class StarterService {
    private String  config;
    public StarterService(String config){
        this.config = config;
    }
    public  String[] split(String separatorChar){
        return StringUtils.split(this.config,separatorChar);
    }
}
