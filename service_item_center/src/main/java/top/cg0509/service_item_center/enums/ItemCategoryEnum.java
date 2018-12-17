package top.cg0509.service_item_center.enums;

/**
 * @author 陈赓
 * @version 2018/12/9/009
 */
public enum ItemCategoryEnum {

    SUCCESS(0,"操作成功"),
    INNOR_ERROR(-1,"操作失败");

    private int state;
    private String stateInfo;

    private ItemCategoryEnum(int state,String stateInfo){
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public static ItemCategoryEnum ofState(int index){
        for (ItemCategoryEnum state : values()){
            if (state.getState() == index){
                return state;
            }
        }
        return  null;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateInfo;
    }
}
