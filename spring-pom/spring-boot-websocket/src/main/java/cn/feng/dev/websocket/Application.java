/*
 * File: Application.java
 * Created By: fengtao.xue@gausscode.com
 * Date: 2019-03-20
 */

package cn.feng.dev.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author fengtao.xue
 */
@SpringBootApplication
public class Application {
    static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
