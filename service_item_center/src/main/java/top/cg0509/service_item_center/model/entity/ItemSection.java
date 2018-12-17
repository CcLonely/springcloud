package top.cg0509.service_item_center.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ItemSection extends $Entity {
    private Long id;

    private BigDecimal basePriceEnd;

    private BigDecimal basePriceStart;

    private String createBy;

    private Date createDate;

    private String intervalType;

    private Long itemid;

    private BigDecimal marketPriceEnd;

    private BigDecimal marketPriceStart;

    private BigDecimal quotedPriceEnd;

    private BigDecimal quotedPriceStart;

    private String updateBy;

    private Date updateDate;

    private BigDecimal volumeEnd;

    private BigDecimal volumeStart;

    private BigDecimal weightEnd;

    private BigDecimal weightStart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBasePriceEnd() {
        return basePriceEnd;
    }

    public void setBasePriceEnd(BigDecimal basePriceEnd) {
        this.basePriceEnd = basePriceEnd;
    }

    public BigDecimal getBasePriceStart() {
        return basePriceStart;
    }

    public void setBasePriceStart(BigDecimal basePriceStart) {
        this.basePriceStart = basePriceStart;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType == null ? null : intervalType.trim();
    }

    public Long getItemid() {
        return itemid;
    }

    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    public BigDecimal getMarketPriceEnd() {
        return marketPriceEnd;
    }

    public void setMarketPriceEnd(BigDecimal marketPriceEnd) {
        this.marketPriceEnd = marketPriceEnd;
    }

    public BigDecimal getMarketPriceStart() {
        return marketPriceStart;
    }

    public void setMarketPriceStart(BigDecimal marketPriceStart) {
        this.marketPriceStart = marketPriceStart;
    }

    public BigDecimal getQuotedPriceEnd() {
        return quotedPriceEnd;
    }

    public void setQuotedPriceEnd(BigDecimal quotedPriceEnd) {
        this.quotedPriceEnd = quotedPriceEnd;
    }

    public BigDecimal getQuotedPriceStart() {
        return quotedPriceStart;
    }

    public void setQuotedPriceStart(BigDecimal quotedPriceStart) {
        this.quotedPriceStart = quotedPriceStart;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public BigDecimal getVolumeEnd() {
        return volumeEnd;
    }

    public void setVolumeEnd(BigDecimal volumeEnd) {
        this.volumeEnd = volumeEnd;
    }

    public BigDecimal getVolumeStart() {
        return volumeStart;
    }

    public void setVolumeStart(BigDecimal volumeStart) {
        this.volumeStart = volumeStart;
    }

    public BigDecimal getWeightEnd() {
        return weightEnd;
    }

    public void setWeightEnd(BigDecimal weightEnd) {
        this.weightEnd = weightEnd;
    }

    public BigDecimal getWeightStart() {
        return weightStart;
    }

    public void setWeightStart(BigDecimal weightStart) {
        this.weightStart = weightStart;
    }
}