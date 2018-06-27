package com.ysc.simplespringbootstarter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: wangcm
 * @Date: 2018\6\27 0027 10:29
 * @Description:配置文件读取类
 */
@ConfigurationProperties("example.service")
public class StarterServiceProperties {
    private String config;

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
