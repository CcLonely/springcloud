package top.cg0509.service_item_center.model.entity;

import java.util.Date;

public class ItemAttribute extends $Entity {
    private Long attrId;

    private String attrName;

    private Date created;

    private Integer isSenior;

    private Date modified;

    private Integer status;

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getIsSenior() {
        return isSenior;
    }

    public void setIsSenior(Integer isSenior) {
        this.isSenior = isSenior;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}