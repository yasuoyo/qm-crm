package demo.demoweb.controller;

import com.alibaba.fastjson.JSON;
import demo.demodao.ReposneMessage;
import demo.demoservice.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: qm-crm
 * @description:
 * @author: Zqm
 * @create: 2021-08-04 09:52
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/sysout", method = RequestMethod.GET)
    public ReposneMessage insertArea(){
        return demoService.logOut();
    }
}
