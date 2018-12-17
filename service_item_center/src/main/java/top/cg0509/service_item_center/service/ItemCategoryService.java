package top.cg0509.service_item_center.service;

import top.cg0509.service_item_center.model.dto.ItemCategoryExecution;
import top.cg0509.service_item_center.model.entity.ItemCategory;

/**
 * @author 陈赓
 * @version 2018/12/9/009
 */
public interface ItemCategoryService {


    /**
     * 新增类目
     * @param itemCategory
     * @return
     */
    ItemCategoryExecution addItemCategoryInfo(ItemCategory itemCategory);
}
