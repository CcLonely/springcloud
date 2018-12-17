package top.cg0509.service_item_center.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.cg0509.service_item_center.enums.ItemCategoryEnum;
import top.cg0509.service_item_center.exceptions.ItemCategoryException;
import top.cg0509.service_item_center.mapper.ItemCategoryMapper;
import top.cg0509.service_item_center.model.dto.ItemCategoryExecution;
import top.cg0509.service_item_center.model.entity.ItemCategory;
import top.cg0509.service_item_center.service.ItemCategoryService;

import javax.annotation.Resource;

/**
 * @author 陈赓
 * @version 2018/12/9/009
 */
@Service
@Transactional
public class ItemCategoryServiceImpl implements ItemCategoryService {

    @Resource
    private ItemCategoryMapper itemCategoryMapper;

    @Override
    public ItemCategoryExecution addItemCategoryInfo(ItemCategory itemCategory) {
        ItemCategoryExecution itemCategoryExecution = null;
        int result = 0;
        try{
            result = itemCategoryMapper.insert(itemCategory);
            if (result > 0 ){
                itemCategoryExecution = new ItemCategoryExecution(ItemCategoryEnum.SUCCESS);
            }else {
                itemCategoryExecution = new ItemCategoryExecution(ItemCategoryEnum.INNOR_ERROR);
 }
        }catch (ItemCategoryException e){
            throw new ItemCategoryException(e.getMessage().toString());
        }

        return itemCategoryExecution;
    }
}
