package demo.demoservice.impl;

import demo.demodao.ReposneMessage;
import demo.demoservice.DemoService;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

/**
 * @program: qm-crm
 * @description:
 * @author: Zqm
 * @create: 2021-08-04 09:34
 **/
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public ReposneMessage logOut() {
       ReposneMessage reposneMessage = new ReposneMessage();
        reposneMessage.setCode(200);
        reposneMessage.setMsg("数据正常");
        reposneMessage.setSuccess(true);
        int i = 5;
        CountDownLatch countDownLatch = new CountDownLatch(i);
        countDownLatch.getCount();
        return reposneMessage;
    }
}
