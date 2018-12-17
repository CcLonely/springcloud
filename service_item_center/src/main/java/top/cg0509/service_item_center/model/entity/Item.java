package top.cg0509.service_item_center.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Item extends $Entity {
    private Long itemId;

    private String ad;

    private Integer addSource;

    private String afterService;

    private String attrSale;

    private String attributes;

    private Long brand;

    private Long cid;

    private Integer copied;

    private Date created;

    private Date delistingTime;

    private BigDecimal guidePrice;

    private Integer hasPrice;

    private Integer inventory;

    private String itemName;

    private Integer itemStatus;

    private String keywords;

    private Date listtingTime;

    private BigDecimal marketPrice;

    private BigDecimal marketPrice2;

    private Date modified;

    private Integer operator;

    private String origin;

    private String packingList;

    private Integer platLinkStatus;

    private Long platformId;

    private Long plstItemId;

    private Long productId;

    private Long sellerId;

    private Long shopCid;

    private Long shopFreightTemplateId;

    private Long shopId;

    private String statusChangeReason;

    private Date timingListing;

    private BigDecimal volume;

    private Long weight;

    private String weightUnit;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad == null ? null : ad.trim();
    }

    public Integer getAddSource() {
        return addSource;
    }

    public void setAddSource(Integer addSource) {
        this.addSource = addSource;
    }

    public String getAfterService() {
        return afterService;
    }

    public void setAfterService(String afterService) {
        this.afterService = afterService == null ? null : afterService.trim();
    }

    public String getAttrSale() {
        return attrSale;
    }

    public void setAttrSale(String attrSale) {
        this.attrSale = attrSale == null ? null : attrSale.trim();
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes == null ? null : attributes.trim();
    }

    public Long getBrand() {
        return brand;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getCopied() {
        return copied;
    }

    public void setCopied(Integer copied) {
        this.copied = copied;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getDelistingTime() {
        return delistingTime;
    }

    public void setDelistingTime(Date delistingTime) {
        this.delistingTime = delistingTime;
    }

    public BigDecimal getGuidePrice() {
        return guidePrice;
    }

    public void setGuidePrice(BigDecimal guidePrice) {
        this.guidePrice = guidePrice;
    }

    public Integer getHasPrice() {
        return hasPrice;
    }

    public void setHasPrice(Integer hasPrice) {
        this.hasPrice = hasPrice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public Date getListtingTime() {
        return listtingTime;
    }

    public void setListtingTime(Date listtingTime) {
        this.listtingTime = listtingTime;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public BigDecimal getMarketPrice2() {
        return marketPrice2;
    }

    public void setMarketPrice2(BigDecimal marketPrice2) {
        this.marketPrice2 = marketPrice2;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getPackingList() {
        return packingList;
    }

    public void setPackingList(String packingList) {
        this.packingList = packingList == null ? null : packingList.trim();
    }

    public Integer getPlatLinkStatus() {
        return platLinkStatus;
    }

    public void setPlatLinkStatus(Integer platLinkStatus) {
        this.platLinkStatus = platLinkStatus;
    }

    public Long getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public Long getPlstItemId() {
        return plstItemId;
    }

    public void setPlstItemId(Long plstItemId) {
        this.plstItemId = plstItemId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getShopCid() {
        return shopCid;
    }

    public void setShopCid(Long shopCid) {
        this.shopCid = shopCid;
    }

    public Long getShopFreightTemplateId() {
        return shopFreightTemplateId;
    }

    public void setShopFreightTemplateId(Long shopFreightTemplateId) {
        this.shopFreightTemplateId = shopFreightTemplateId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getStatusChangeReason() {
        return statusChangeReason;
    }

    public void setStatusChangeReason(String statusChangeReason) {
        this.statusChangeReason = statusChangeReason == null ? null : statusChangeReason.trim();
    }

    public Date getTimingListing() {
        return timingListing;
    }

    public void setTimingListing(Date timingListing) {
        this.timingListing = timingListing;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit == null ? null : weightUnit.trim();
    }
}