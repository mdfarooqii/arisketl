package com.farooq.risk.arisk.riskvalue.model;

import com.farooq.risk.arisk.ARiskUtil;

import java.io.Serializable;

public class RiskValue implements Serializable {

    private String  positionId;
    private String ubsMeasureId;
    private String scenarioIdDomain;
    private String scenarioIdId;
    private String marketDataSegmentId1;
    private String marketDataSegmentId2;
    private double valueUSD;
    private String unitOfMeasure;
    private String valueUnitOfMeasure;
    private String expectedAssetFlowId;

    public String getLogicalKey() {
        return logicalKey;
    }

    public void setLogicalKey(String logicalKeyStr) {
        this.logicalKey = ARiskUtil.MD5(logicalKeyStr);
    }

    private String logicalKey;


    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getUbsMeasureId() {
        return ubsMeasureId;
    }

    public void setUbsMeasureId(String ubsMeasureId) {
        this.ubsMeasureId = ubsMeasureId;
    }

    public String getScenarioIdDomain() {
        return scenarioIdDomain;
    }

    public void setScenarioIdDomain(String scenarioIdDomain) {
        this.scenarioIdDomain = scenarioIdDomain;
    }

    public String getScenarioIdId() {
        return scenarioIdId;
    }

    public void setScenarioIdId(String scenarioIdId) {
        this.scenarioIdId = scenarioIdId;
    }

    public String getMarketDataSegmentId1() {
        return marketDataSegmentId1;
    }

    public void setMarketDataSegmentId1(String marketDataSegmentId1) {
        this.marketDataSegmentId1 = marketDataSegmentId1;
    }

    public String getMarketDataSegmentId2() {
        return marketDataSegmentId2;
    }

    public void setMarketDataSegmentId2(String marketDataSegmentId2) {
        this.marketDataSegmentId2 = marketDataSegmentId2;
    }

    public double getValueUSD() {
        return valueUSD;
    }

    public void setValueUSD(double valueUSD) {
        this.valueUSD = valueUSD;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getValueUnitOfMeasure() {
        return valueUnitOfMeasure;
    }

    public void setValueUnitOfMeasure(String valueUnitOfMeasure) {
        this.valueUnitOfMeasure = valueUnitOfMeasure;
    }

    public String getExpectedAssetFlowId() {
        return expectedAssetFlowId;
    }

    public void setExpectedAssetFlowId(String expectedAssetFlowId) {
        this.expectedAssetFlowId = expectedAssetFlowId;
    }
}
