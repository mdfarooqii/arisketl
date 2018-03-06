package com.farooq.risk.arisk.mds;

public class MDSKey {

    private String id;
    private String marketDataSetName;
    private String name;
    private String marketDataSetType;
    private String marketDataSetContext;


    private String
            marketDataSetCreationDateTime;


    private String
            marketDataSetSourceIdDomain;


    private String marketDataSetSourceIdId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarketDataSetName() {
        return marketDataSetName;
    }

    public void setMarketDataSetName(String marketDataSetName) {
        this.marketDataSetName = marketDataSetName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketDataSetType() {
        return marketDataSetType;
    }

    public void setMarketDataSetType(String marketDataSetType) {
        this.marketDataSetType = marketDataSetType;
    }

    public String getMarketDataSetContext() {
        return marketDataSetContext;
    }

    public void setMarketDataSetContext(String marketDataSetContext) {
        this.marketDataSetContext = marketDataSetContext;
    }

    public String getMarketDataSetCreationDateTime() {
        return marketDataSetCreationDateTime;
    }

    public void setMarketDataSetCreationDateTime(String marketDataSetCreationDateTime) {
        this.marketDataSetCreationDateTime = marketDataSetCreationDateTime;
    }

    public String getMarketDataSetSourceIdDomain() {
        return marketDataSetSourceIdDomain;
    }

    public void setMarketDataSetSourceIdDomain(String marketDataSetSourceIdDomain) {
        this.marketDataSetSourceIdDomain = marketDataSetSourceIdDomain;
    }

    public String getMarketDataSetSourceIdId() {
        return marketDataSetSourceIdId;
    }

    public void setMarketDataSetSourceIdId(String marketDataSetSourceIdId) {
        this.marketDataSetSourceIdId = marketDataSetSourceIdId;
    }
}
