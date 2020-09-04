package com.wyq.study.admin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangyongqian
 * @date 2020/9/5 5:45
 */
@Slf4j
@Controller
@RequestMapping("/")
@Configuration
public class IndexController {
    /**
     * 端口
     */
    @Value("${server.port}")
    private String port;
}
