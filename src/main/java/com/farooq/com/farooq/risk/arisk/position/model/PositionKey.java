package com.farooq.risk.arisk.position.model;

public class PositionKey {

    private String id;

    private String parentPositionId;

    private String sourceSystemPositionIdDomain;

    private String sourceSystemPositionIdId;

    private String description;

    private String modificationDate;

    private String bookingSystem;

    private String tradeEvent;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentPositionId() {
        return parentPositionId;
    }

    public void setParentPositionId(String parentPositionId) {
        this.parentPositionId = parentPositionId;
    }

    public String getSourceSystemPositionIdDomain() {
        return sourceSystemPositionIdDomain;
    }

    public void setSourceSystemPositionIdDomain(String sourceSystemPositionIdDomain) {
        this.sourceSystemPositionIdDomain = sourceSystemPositionIdDomain;
    }

    public String getSourceSystemPositionIdId() {
        return sourceSystemPositionIdId;
    }

    public void setSourceSystemPositionIdId(String sourceSystemPositionIdId) {
        this.sourceSystemPositionIdId = sourceSystemPositionIdId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
    }

    public String getBookingSystem() {
        return bookingSystem;
    }

    public void setBookingSystem(String bookingSystem) {
        this.bookingSystem = bookingSystem;
    }

    public String getTradeEvent() {
        return tradeEvent;
    }

    public void setTradeEvent(String tradeEvent) {
        this.tradeEvent = tradeEvent;
    }
}
