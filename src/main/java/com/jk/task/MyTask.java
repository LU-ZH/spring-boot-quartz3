package com.jk.task;

import com.jk.job.HelloJob;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * Created by dell on 2017/5/29.
 */
@Service
public class MyTask extends BaseTask{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException{
        System.out.println("MyTask.execute() "+new Date());
    }

    @Override
    public String getCronExpression() {
        return "0/3 * * * * ?";//每3秒执行
    }

}
