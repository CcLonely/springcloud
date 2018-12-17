package top.cg0509.service_item_center.model.entity;

import java.util.Date;

public class ItemCategoryBrand extends $Entity {
    private Long categoryBrandId;

    private Long brandId;

    private Integer cbrandStatus;

    private Date created;

    private Date modified;

    private Long secondLevCid;

    private Integer sortNum;

    private Long thirdLevCid;

    public Long getCategoryBrandId() {
        return categoryBrandId;
    }

    public void setCategoryBrandId(Long categoryBrandId) {
        this.categoryBrandId = categoryBrandId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Integer getCbrandStatus() {
        return cbrandStatus;
    }

    public void setCbrandStatus(Integer cbrandStatus) {
        this.cbrandStatus = cbrandStatus;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Long getSecondLevCid() {
        return secondLevCid;
    }

    public void setSecondLevCid(Long secondLevCid) {
        this.secondLevCid = secondLevCid;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Long getThirdLevCid() {
        return thirdLevCid;
    }

    public void setThirdLevCid(Long thirdLevCid) {
        this.thirdLevCid = thirdLevCid;
    }
}