package top.cg0509.service_item_center.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javafx.scene.chart.ValueAxis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.cg0509.common.common.vo.Result;
import top.cg0509.service_item_center.exceptions.ItemCategoryException;
import top.cg0509.service_item_center.model.dto.ItemCategoryExecution;
import top.cg0509.service_item_center.model.entity.ItemCategory;
import top.cg0509.service_item_center.service.ItemCategoryService;

import javax.annotation.Resource;

/**
 * @author 陈赓
 * @version 2018/12/9/009
 */
@Api(value = "类目操作")
@RestController
@Controller
@RequestMapping(value = "/category")
public class ItemCategoryController {

    @Resource
    private ItemCategoryService itemCategoryService;

    @ApiOperation(value = "新增类目",notes = "")
    @PostMapping(value = "/addItemCategoryInfo")
    public Result addItemCategoryInfo(ItemCategory itemCategory){
         Result result = null;
        ItemCategoryExecution itemCategoryExecution = null;
        try{
            itemCategoryExecution = itemCategoryService.addItemCategoryInfo(itemCategory);
            if (itemCategoryExecution.getState() == 0){
                result = Result.ok(itemCategoryExecution.getStateInfo());
            }else {
                result = Result.failure(itemCategoryExecution.getState(),itemCategoryExecution.getStateInfo());
            }
        }catch (ItemCategoryException e){
            result = Result.failure(-1,"运行时异常"+e.getMessage().toString());
        }catch (Exception e){
            result = Result.failure(-1,"程序异常"+e.getMessage().toString());
        }
            return result;
    }
}
