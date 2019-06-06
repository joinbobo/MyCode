package com.yyoo.myssm;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 用Tomcat启动时需要
 *
 * @author 周忠友
 * @version 1.0
 * @date 2017/10/10
 * @see SpringBootServletInitializer
 *
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }

}
