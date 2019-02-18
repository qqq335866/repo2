package cn.itcast.springboot.cn.itcast.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zwb
 * @create 2019-02-15 21:58
 **/

@RestController
public class SpringBootController {


    @RequestMapping("/hello")
    public String helloSpring(){
        return "helloSpring";
    }
}
