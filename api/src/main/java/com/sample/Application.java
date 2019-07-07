package com.sample;

import com.sample.common.CommonClazz;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:2325690622@qq.com">邓超</a> at 2019/7/7
 */
@RestController
@RequestMapping
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping
    public CommonClazz test() {
        return new CommonClazz();
    }
}
