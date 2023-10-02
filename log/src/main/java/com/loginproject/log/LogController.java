package com.loginproject.log;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(new Topic("spring", "Spring Framework",
                "Spring Framework description"),
                new Topic("john", "jogn Framework",
                        "john Framework description"),
                new Topic("yes", "es Framework",
                        "yes Framework description"));
    }

}
