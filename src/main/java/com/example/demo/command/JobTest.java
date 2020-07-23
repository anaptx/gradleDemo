package com.example.demo.command;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

/**
 * @author fengqian07
 * @Description
 * @date 2020/7/23 9:27
 */
@Slf4j
@Controller
public class JobTest extends IJobHandler {

    @XxlJob(value = "demoJobHandler")
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        try {
            System.out.println("测试~~~");
            /*测试数据*/
            return SUCCESS;
        } catch (Exception e){
            e.printStackTrace();
            return FAIL;
        }
    }
}
