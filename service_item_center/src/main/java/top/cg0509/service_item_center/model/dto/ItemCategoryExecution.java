package top.cg0509.service_item_center.model.dto;

import lombok.Data;
import top.cg0509.service_item_center.enums.ItemCategoryEnum;
import top.cg0509.service_item_center.model.entity.ItemCategory;

import java.util.List;

/**
 * @author 陈赓
 * @version 2018/12/9/009
 */
@Data
public class ItemCategoryExecution {

    private int state;
    private String stateInfo;

    private ItemCategory itemCategory;
    private List<ItemCategory> itemCategories;

    public ItemCategoryExecution(ItemCategoryEnum itemCategoryEnum){
        this.state = itemCategoryEnum.getState();
        this.stateInfo = itemCategoryEnum.getStateInfo();
    }

    public ItemCategoryExecution(ItemCategoryEnum itemCategoryEnum,ItemCategory itemCategory){
        this.state = itemCategoryEnum.getState();
        this.stateInfo = itemCategoryEnum.getStateInfo();
        this.itemCategory = itemCategory;
    }
    public ItemCategoryExecution(ItemCategoryEnum itemCategoryEnum,List<ItemCategory> itemCategories){
        this.state = itemCategoryEnum.getState();
        this.stateInfo = itemCategoryEnum.getStateInfo();
        this.itemCategories = itemCategories;
    }
}
