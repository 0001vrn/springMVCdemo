package com.vrn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {

    @Value("${TEST_PROP}")
    private String TEST_PROP;

    @Value("${userBucket.path}")
    private String userBucketPath;

    @RequestMapping("/")
    public String showIndex(){
        System.out.println("TEST : " + TEST_PROP);
        return userBucketPath;
    }
}
