package com.farooq.risk.arisk.riskvalue.model;

import java.io.Serializable;

public class RiskValueKey implements Serializable {

    private String  positionId;
    private String ubsMeasureId;
    private String scenarioIdId;
    private String marketDataSegmentId1;
    private String marketDataSegmentId2;


    private RiskValueKey(RiskValueKeyBuilder keyBuilder){
        this.positionId = keyBuilder.positionId;
        this.ubsMeasureId = keyBuilder.ubsMeasureId;
        this.scenarioIdId = keyBuilder.scenarioIdId;
        this.marketDataSegmentId1 = keyBuilder.marketDataSegmentId1;
        this.marketDataSegmentId2 = keyBuilder.marketDataSegmentId2;
    }


    public static class RiskValueKeyBuilder{
        private String  positionId;
        private String ubsMeasureId;
        private String scenarioIdId;
        private String marketDataSegmentId1;
        private String marketDataSegmentId2;

        public RiskValueKeyBuilder(){}

        public RiskValueKey build(){
            return new RiskValueKey(this);
        }

       public  RiskValueKeyBuilder withPositionId(String positionId){
            this.positionId = positionId;
            return this;
        }

        public RiskValueKeyBuilder withUbsMeasureId(String ubsMeasureId){
            this.ubsMeasureId = ubsMeasureId;
            return this;
        }

        public RiskValueKeyBuilder withScenarioIdId(String scenarioIdId){
            this.scenarioIdId = scenarioIdId;
            return this;
        }

        public RiskValueKeyBuilder withMarketDataSegmentId1(String marketDataSegmentId1){
            this.marketDataSegmentId1 = marketDataSegmentId1;
            return this;
        }

        public RiskValueKeyBuilder withMarketDataSegmentId2(String marketDataSegmentId2){
            this.marketDataSegmentId2 = marketDataSegmentId2;
            return this;
        }


    }


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
}
