package com.jyxk.feign;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric  implements  ServiceHello {

    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
