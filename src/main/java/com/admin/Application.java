package com.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Jonsy
 */
@SpringBootApplication(scanBasePackages = {"com.admin.**"},
                       exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
@EnableAdminServer
@MapperScan(basePackages = "com.jmallyun.jmall.common.model.*.mapper")
public class Application {

    public static void main(String[] arg) {
        SpringApplication.run(Application.class);
    }
}

