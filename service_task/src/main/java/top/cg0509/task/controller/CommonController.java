package top.cg0509.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 陈赓
 * @version 2018/11/4/004
 */
@Controller
public class CommonController {

    @GetMapping(value = "/jobmanager")
    public String jobmanager(){
        return "JobManager";
    }
}
