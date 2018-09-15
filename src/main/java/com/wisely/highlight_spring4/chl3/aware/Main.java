package com.wisely.highlight_spring4.chl3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    //psvm
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService=context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();
    }

}
