package top.cg0509.service_item_center.model.entity;

import java.util.Date;

public class ItemCategoryAttr extends $Entity {
    private Long id;

    private Long attrId;

    private Byte attrType;

    private Long cid;

    private Date created;

    private String features;

    private Date modified;

    private Byte optionType;

    private Byte selectType;

    private Long sortNumber;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Byte getAttrType() {
        return attrType;
    }

    public void setAttrType(Byte attrType) {
        this.attrType = attrType;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features == null ? null : features.trim();
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Byte getOptionType() {
        return optionType;
    }

    public void setOptionType(Byte optionType) {
        this.optionType = optionType;
    }

    public Byte getSelectType() {
        return selectType;
    }

    public void setSelectType(Byte selectType) {
        this.selectType = selectType;
    }

    public Long getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Long sortNumber) {
        this.sortNumber = sortNumber;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}