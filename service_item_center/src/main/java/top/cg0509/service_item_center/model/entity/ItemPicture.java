package top.cg0509.service_item_center.model.entity;

import java.util.Date;

public class ItemPicture extends $Entity {
    private Long pictureId;

    private Date created;

    private Long itemId;

    private Date modified;

    private Byte pictureStatus;

    private String pictureUrl;

    private Long sellerId;

    private Long shopId;

    private Byte sortNumber;

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Byte getPictureStatus() {
        return pictureStatus;
    }

    public void setPictureStatus(Byte pictureStatus) {
        this.pictureStatus = pictureStatus;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Byte getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Byte sortNumber) {
        this.sortNumber = sortNumber;
    }
}