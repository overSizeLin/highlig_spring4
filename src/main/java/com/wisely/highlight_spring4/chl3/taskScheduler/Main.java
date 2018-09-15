package com.wisely.highlight_spring4.chl3.taskScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskScheduleConfig.class);
        //SchedulerService schedulerService=context.getBean(SchedulerService.class);
    }
}
