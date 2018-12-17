package top.cg0509.task.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author 陈赓
 * @version 2018/11/4/004
 */
@Api(value = "CommonController",description = "公共跳转类")
@Controller
public class CommonController {

    @ApiOperation(value = "定时任务管理页面" , notes = "")
    @GetMapping(value = "/jobmanager")
    public String jobmanager(){
        return "JobManager";
    }
}
