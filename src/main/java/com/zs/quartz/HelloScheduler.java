package com.zs.quartz;

import com.zs.quartz.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangshuai_sx
 * @date 2019/1/10 16:53
 */

public class HelloScheduler {


    public static void main(String[] args){

        //Job,封装业务逻辑
        JobDetail jobDetail = JobBuilder
                .newJob(HelloJob.class)
                .withIdentity("myjob", "group1")
                .build();
        //Trigger，触发器，封装运行规律
        Trigger trigger = TriggerBuilder
                .newTrigger()
                .withIdentity("helloTrigger")
                .startNow()
                .withSchedule(
                        SimpleScheduleBuilder
                                .simpleSchedule()
                                .withIntervalInSeconds(2)
                                .repeatForever())
                .build();
        //Scheduler，调度器，把Trigger和Job联系起来
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        try {
            Scheduler scheduler = schedulerFactory.getScheduler();
            scheduler.start();
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()));
            scheduler.scheduleJob(jobDetail,trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }



    }
}
