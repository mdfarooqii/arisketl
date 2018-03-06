package com.farooq.risk.arisk.position.model;

import com.farooq.risk.arisk.ARiskUtil;

public class PositionValue {

    private String logicalKey;

    public String getLogicalKey() {
        return logicalKey;
    }

    public void setLogicalKey(String logicalKeyValueStr) {
        this.logicalKey = ARiskUtil.MD5(logicalKeyValueStr);
    }

    private String id;


    private String parentPositionId;


    private String sourceSystemPositionIdDomain;


    private String sourceSystemPositionIdId;


    private String description;


    private String modificationDate;


    private String bookingSystem;


    private String tradeEvent;


    private String tradeIdDomain;


    private String tradeIdId;


    private String tradeIdVersion;


    private String tradeIdLeg;


    private String alternateTradeIdDomain;


    private String alternateTradeIdId;


    private String alternateTradeIdVersion;


    private String alternateTradeIdLeg;


    private String clearedTradeIdDomain;


    private String clearedTradeIdId;


    private String relatedTradeIdDomain;


    private String relatedTradeIdId;


    private String relatedTradeIdVersion;


    private String relatedTradeIdLeg;


    private String contractIdDomain;


    private String contractIdId;


    private String contractIdVersion;


    private String
            valuationSystemPositionIdDomain;


    private String
            valuationSystemPositionIdId;


    private String lifecycleStatus;


    private String
            officialValuationModelIdDomain;


    private String
            officialValuationModelIdId;


    private String counterpartyType;


    private String counterpartyIdDomain;


    private String counterpartyIdId;


    private String
            initiatingCounterpartyIdDomain;


    private String
            initiatingCounterpartyIdId;


    private String groupType1;


    private String groupType2;


    private String groupIdDomain1;


    private String groupIdId1;


    private String groupIdDomain2;


    private String groupIdId2;


    private String groupDescription1;


    private String groupDescription2;


    private String tradeDate;


    private String effectiveDate;


    private String systemEntryDate;


    private String longShort;


    private String traderDomain;


    private String traderId;


    private String brokerDomain;


    private String brokerId;


    private String tradingBookIdDomain;


    private String tradingBookIdId;


    private String legacyRiskClass;


    private String
            otherSideTradingBookIdDomain;


    private String otherSideTradingBookIdId;


    private String
            riskHoldingEntityIdDomain;


    private String riskHoldingEntityIdId;


    private String
            contractingEntityIdDomain;


    private String contractingEntityIdId;


    private String subBook;


    private String family;


    private String legacyLegalEntity;


    private String strategy;


    private String amountCurrency;


    private String currentAmount;


    private String originalAmount;


    private String maturityDate;


    private String maturityDateType;


    private String tradingCurrency;


    private String isFundedCDS;


    private String isInDefault;


    private String ubsInstrumentIdDomain;


    private String ubsInstrumentIdId;


    private String ubsInstrumentIdVersion;


    private String ubsInstrumentIdLevel;


    private String
            alternateInstrumentIdDomain1;


    private String alternateInstrumentIdId1;


    private String
            alternateInstrumentIdDomain2;


    private String alternateInstrumentIdId2;


    private String
            underlierUbsInstrumentIdDomain;


    private String
            underlierUbsInstrumentIdId;


    private String
            underlierUbsInstrumentIdVersion;


    private String
            underlierAlternateInstrumentIdDomain;


    private String
            underlierAlternateInstrumentIdId;


    private String legacyProductType;


    private String legacyProductSubType;


    private String productIdDomain;


    private String productIdId;


    private String productIdVersion;


    private String parentProductIdDomain;


    private String parentProductIdId;


    private String parentProductIdVersion;


    private String isOTC;


    private String cashFlowType;


    private String cashFlowValue;


    private String cashFlowFrequency;


    private String nextResetDate;


    private String underlyingAssetType;


    private String callPutIndicator;


    private String buySell;


    private String strikeCurrency;


    private String strike;


    private String strikeUnitOfMeasure;


    private String index;


    private String tranche;


    private String currencyList;


    private String quoteType;


    private String quoteCurrency;


    private String quoteValue;


    private String quoteUnitOfMeasure;


    private String hasInflationRisk;


    private String collateralType;


    private String barrierEventType1;


    private String barrierEventDirection1;


    private String barrierLevel1;


    private String barrierEventStartDate1;


    private String barrierEventEndDate1;


    private String barrierRebateAmount1;


    private String
            barrierRebatePayoutStyle1;


    private String barrierEventType2;


    private String barrierEventDirection2;


    private String barrierLevel2;


    private String barrierEventStartDate2;


    private String barrierEventEndDate2;


    private String barrierRebateAmount2;


    private String
            barrierRebatePayoutStyle2;


    private String deliveryMethod;


    private String deliveryStartDate;


    private String deliveryEndDate;


    private String exerciseFrequency;


    private String eventStatus;


    private String includeInPnL;


    private String restructuringType;


    private String delay;


    private String optionStyle;


    private String calculatorType;


    private String cutZone;


    private String accrualMethod;


    private String dealType;


    private String legType;


    private String bidType;


    private String isChinese;


    private String isRealized;


    private String averagingStartDate;


    private String averagingEndDate;


    private String settlementDate;


    private String underlyingMaturityDate;


    private String isDigital;


    private String nextResetEffectiveDate;


    private String nextResetEndDate;


    private String nextCancellableDate;


    private String settlementMechanism;


    private String facilityIdDomain;


    private String facilityIdId;


    private String
            relatedPartnerPortfolioIdDomain;


    private String
            relatedPartnerPortfolioIdId;


    private String
            relatedPartnerAccountIdDomain;


    private String
            relatedPartnerAccountIdId;


    private String calculatedMaturityDate;


    private String customAttributeName1;


    private String customAttributeValue1;


    private String customAttributeName2;


    private String customAttributeValue2;


    private String customAttributeName3;


    private String customAttributeValue3;

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

    public String getTradeIdDomain() {
        return tradeIdDomain;
    }

    public void setTradeIdDomain(String tradeIdDomain) {
        this.tradeIdDomain = tradeIdDomain;
    }

    public String getTradeIdId() {
        return tradeIdId;
    }

    public void setTradeIdId(String tradeIdId) {
        this.tradeIdId = tradeIdId;
    }

    public String getTradeIdVersion() {
        return tradeIdVersion;
    }

    public void setTradeIdVersion(String tradeIdVersion) {
        this.tradeIdVersion = tradeIdVersion;
    }

    public String getTradeIdLeg() {
        return tradeIdLeg;
    }

    public void setTradeIdLeg(String tradeIdLeg) {
        this.tradeIdLeg = tradeIdLeg;
    }

    public String getAlternateTradeIdDomain() {
        return alternateTradeIdDomain;
    }

    public void setAlternateTradeIdDomain(String alternateTradeIdDomain) {
        this.alternateTradeIdDomain = alternateTradeIdDomain;
    }

    public String getAlternateTradeIdId() {
        return alternateTradeIdId;
    }

    public void setAlternateTradeIdId(String alternateTradeIdId) {
        this.alternateTradeIdId = alternateTradeIdId;
    }

    public String getAlternateTradeIdVersion() {
        return alternateTradeIdVersion;
    }

    public void setAlternateTradeIdVersion(String alternateTradeIdVersion) {
        this.alternateTradeIdVersion = alternateTradeIdVersion;
    }

    public String getAlternateTradeIdLeg() {
        return alternateTradeIdLeg;
    }

    public void setAlternateTradeIdLeg(String alternateTradeIdLeg) {
        this.alternateTradeIdLeg = alternateTradeIdLeg;
    }

    public String getClearedTradeIdDomain() {
        return clearedTradeIdDomain;
    }

    public void setClearedTradeIdDomain(String clearedTradeIdDomain) {
        this.clearedTradeIdDomain = clearedTradeIdDomain;
    }

    public String getClearedTradeIdId() {
        return clearedTradeIdId;
    }

    public void setClearedTradeIdId(String clearedTradeIdId) {
        this.clearedTradeIdId = clearedTradeIdId;
    }

    public String getRelatedTradeIdDomain() {
        return relatedTradeIdDomain;
    }

    public void setRelatedTradeIdDomain(String relatedTradeIdDomain) {
        this.relatedTradeIdDomain = relatedTradeIdDomain;
    }

    public String getRelatedTradeIdId() {
        return relatedTradeIdId;
    }

    public void setRelatedTradeIdId(String relatedTradeIdId) {
        this.relatedTradeIdId = relatedTradeIdId;
    }

    public String getRelatedTradeIdVersion() {
        return relatedTradeIdVersion;
    }

    public void setRelatedTradeIdVersion(String relatedTradeIdVersion) {
        this.relatedTradeIdVersion = relatedTradeIdVersion;
    }

    public String getRelatedTradeIdLeg() {
        return relatedTradeIdLeg;
    }

    public void setRelatedTradeIdLeg(String relatedTradeIdLeg) {
        this.relatedTradeIdLeg = relatedTradeIdLeg;
    }

    public String getContractIdDomain() {
        return contractIdDomain;
    }

    public void setContractIdDomain(String contractIdDomain) {
        this.contractIdDomain = contractIdDomain;
    }

    public String getContractIdId() {
        return contractIdId;
    }

    public void setContractIdId(String contractIdId) {
        this.contractIdId = contractIdId;
    }

    public String getContractIdVersion() {
        return contractIdVersion;
    }

    public void setContractIdVersion(String contractIdVersion) {
        this.contractIdVersion = contractIdVersion;
    }

    public String getValuationSystemPositionIdDomain() {
        return valuationSystemPositionIdDomain;
    }

    public void setValuationSystemPositionIdDomain(String valuationSystemPositionIdDomain) {
        this.valuationSystemPositionIdDomain = valuationSystemPositionIdDomain;
    }

    public String getValuationSystemPositionIdId() {
        return valuationSystemPositionIdId;
    }

    public void setValuationSystemPositionIdId(String valuationSystemPositionIdId) {
        this.valuationSystemPositionIdId = valuationSystemPositionIdId;
    }

    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus;
    }

    public String getOfficialValuationModelIdDomain() {
        return officialValuationModelIdDomain;
    }

    public void setOfficialValuationModelIdDomain(String officialValuationModelIdDomain) {
        this.officialValuationModelIdDomain = officialValuationModelIdDomain;
    }

    public String getOfficialValuationModelIdId() {
        return officialValuationModelIdId;
    }

    public void setOfficialValuationModelIdId(String officialValuationModelIdId) {
        this.officialValuationModelIdId = officialValuationModelIdId;
    }

    public String getCounterpartyType() {
        return counterpartyType;
    }

    public void setCounterpartyType(String counterpartyType) {
        this.counterpartyType = counterpartyType;
    }

    public String getCounterpartyIdDomain() {
        return counterpartyIdDomain;
    }

    public void setCounterpartyIdDomain(String counterpartyIdDomain) {
        this.counterpartyIdDomain = counterpartyIdDomain;
    }

    public String getCounterpartyIdId() {
        return counterpartyIdId;
    }

    public void setCounterpartyIdId(String counterpartyIdId) {
        this.counterpartyIdId = counterpartyIdId;
    }

    public String getInitiatingCounterpartyIdDomain() {
        return initiatingCounterpartyIdDomain;
    }

    public void setInitiatingCounterpartyIdDomain(String initiatingCounterpartyIdDomain) {
        this.initiatingCounterpartyIdDomain = initiatingCounterpartyIdDomain;
    }

    public String getInitiatingCounterpartyIdId() {
        return initiatingCounterpartyIdId;
    }

    public void setInitiatingCounterpartyIdId(String initiatingCounterpartyIdId) {
        this.initiatingCounterpartyIdId = initiatingCounterpartyIdId;
    }

    public String getGroupType1() {
        return groupType1;
    }

    public void setGroupType1(String groupType1) {
        this.groupType1 = groupType1;
    }

    public String getGroupType2() {
        return groupType2;
    }

    public void setGroupType2(String groupType2) {
        this.groupType2 = groupType2;
    }

    public String getGroupIdDomain1() {
        return groupIdDomain1;
    }

    public void setGroupIdDomain1(String groupIdDomain1) {
        this.groupIdDomain1 = groupIdDomain1;
    }

    public String getGroupIdId1() {
        return groupIdId1;
    }

    public void setGroupIdId1(String groupIdId1) {
        this.groupIdId1 = groupIdId1;
    }

    public String getGroupIdDomain2() {
        return groupIdDomain2;
    }

    public void setGroupIdDomain2(String groupIdDomain2) {
        this.groupIdDomain2 = groupIdDomain2;
    }

    public String getGroupIdId2() {
        return groupIdId2;
    }

    public void setGroupIdId2(String groupIdId2) {
        this.groupIdId2 = groupIdId2;
    }

    public String getGroupDescription1() {
        return groupDescription1;
    }

    public void setGroupDescription1(String groupDescription1) {
        this.groupDescription1 = groupDescription1;
    }

    public String getGroupDescription2() {
        return groupDescription2;
    }

    public void setGroupDescription2(String groupDescription2) {
        this.groupDescription2 = groupDescription2;
    }

    public String getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(String tradeDate) {
        this.tradeDate = tradeDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getSystemEntryDate() {
        return systemEntryDate;
    }

    public void setSystemEntryDate(String systemEntryDate) {
        this.systemEntryDate = systemEntryDate;
    }

    public String getLongShort() {
        return longShort;
    }

    public void setLongShort(String longShort) {
        this.longShort = longShort;
    }

    public String getTraderDomain() {
        return traderDomain;
    }

    public void setTraderDomain(String traderDomain) {
        this.traderDomain = traderDomain;
    }

    public String getTraderId() {
        return traderId;
    }

    public void setTraderId(String traderId) {
        this.traderId = traderId;
    }

    public String getBrokerDomain() {
        return brokerDomain;
    }

    public void setBrokerDomain(String brokerDomain) {
        this.brokerDomain = brokerDomain;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getTradingBookIdDomain() {
        return tradingBookIdDomain;
    }

    public void setTradingBookIdDomain(String tradingBookIdDomain) {
        this.tradingBookIdDomain = tradingBookIdDomain;
    }

    public String getTradingBookIdId() {
        return tradingBookIdId;
    }

    public void setTradingBookIdId(String tradingBookIdId) {
        this.tradingBookIdId = tradingBookIdId;
    }

    public String getLegacyRiskClass() {
        return legacyRiskClass;
    }

    public void setLegacyRiskClass(String legacyRiskClass) {
        this.legacyRiskClass = legacyRiskClass;
    }

    public String getOtherSideTradingBookIdDomain() {
        return otherSideTradingBookIdDomain;
    }

    public void setOtherSideTradingBookIdDomain(String otherSideTradingBookIdDomain) {
        this.otherSideTradingBookIdDomain = otherSideTradingBookIdDomain;
    }

    public String getOtherSideTradingBookIdId() {
        return otherSideTradingBookIdId;
    }

    public void setOtherSideTradingBookIdId(String otherSideTradingBookIdId) {
        this.otherSideTradingBookIdId = otherSideTradingBookIdId;
    }

    public String getRiskHoldingEntityIdDomain() {
        return riskHoldingEntityIdDomain;
    }

    public void setRiskHoldingEntityIdDomain(String riskHoldingEntityIdDomain) {
        this.riskHoldingEntityIdDomain = riskHoldingEntityIdDomain;
    }

    public String getRiskHoldingEntityIdId() {
        return riskHoldingEntityIdId;
    }

    public void setRiskHoldingEntityIdId(String riskHoldingEntityIdId) {
        this.riskHoldingEntityIdId = riskHoldingEntityIdId;
    }

    public String getContractingEntityIdDomain() {
        return contractingEntityIdDomain;
    }

    public void setContractingEntityIdDomain(String contractingEntityIdDomain) {
        this.contractingEntityIdDomain = contractingEntityIdDomain;
    }

    public String getContractingEntityIdId() {
        return contractingEntityIdId;
    }

    public void setContractingEntityIdId(String contractingEntityIdId) {
        this.contractingEntityIdId = contractingEntityIdId;
    }

    public String getSubBook() {
        return subBook;
    }

    public void setSubBook(String subBook) {
        this.subBook = subBook;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getLegacyLegalEntity() {
        return legacyLegalEntity;
    }

    public void setLegacyLegalEntity(String legacyLegalEntity) {
        this.legacyLegalEntity = legacyLegalEntity;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getAmountCurrency() {
        return amountCurrency;
    }

    public void setAmountCurrency(String amountCurrency) {
        this.amountCurrency = amountCurrency;
    }

    public String getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(String currentAmount) {
        this.currentAmount = currentAmount;
    }

    public String getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(String originalAmount) {
        this.originalAmount = originalAmount;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getMaturityDateType() {
        return maturityDateType;
    }

    public void setMaturityDateType(String maturityDateType) {
        this.maturityDateType = maturityDateType;
    }

    public String getTradingCurrency() {
        return tradingCurrency;
    }

    public void setTradingCurrency(String tradingCurrency) {
        this.tradingCurrency = tradingCurrency;
    }

    public String getIsFundedCDS() {
        return isFundedCDS;
    }

    public void setIsFundedCDS(String isFundedCDS) {
        this.isFundedCDS = isFundedCDS;
    }

    public String getIsInDefault() {
        return isInDefault;
    }

    public void setIsInDefault(String isInDefault) {
        this.isInDefault = isInDefault;
    }

    public String getUbsInstrumentIdDomain() {
        return ubsInstrumentIdDomain;
    }

    public void setUbsInstrumentIdDomain(String ubsInstrumentIdDomain) {
        this.ubsInstrumentIdDomain = ubsInstrumentIdDomain;
    }

    public String getUbsInstrumentIdId() {
        return ubsInstrumentIdId;
    }

    public void setUbsInstrumentIdId(String ubsInstrumentIdId) {
        this.ubsInstrumentIdId = ubsInstrumentIdId;
    }

    public String getUbsInstrumentIdVersion() {
        return ubsInstrumentIdVersion;
    }

    public void setUbsInstrumentIdVersion(String ubsInstrumentIdVersion) {
        this.ubsInstrumentIdVersion = ubsInstrumentIdVersion;
    }

    public String getUbsInstrumentIdLevel() {
        return ubsInstrumentIdLevel;
    }

    public void setUbsInstrumentIdLevel(String ubsInstrumentIdLevel) {
        this.ubsInstrumentIdLevel = ubsInstrumentIdLevel;
    }

    public String getAlternateInstrumentIdDomain1() {
        return alternateInstrumentIdDomain1;
    }

    public void setAlternateInstrumentIdDomain1(String alternateInstrumentIdDomain1) {
        this.alternateInstrumentIdDomain1 = alternateInstrumentIdDomain1;
    }

    public String getAlternateInstrumentIdId1() {
        return alternateInstrumentIdId1;
    }

    public void setAlternateInstrumentIdId1(String alternateInstrumentIdId1) {
        this.alternateInstrumentIdId1 = alternateInstrumentIdId1;
    }

    public String getAlternateInstrumentIdDomain2() {
        return alternateInstrumentIdDomain2;
    }

    public void setAlternateInstrumentIdDomain2(String alternateInstrumentIdDomain2) {
        this.alternateInstrumentIdDomain2 = alternateInstrumentIdDomain2;
    }

    public String getAlternateInstrumentIdId2() {
        return alternateInstrumentIdId2;
    }

    public void setAlternateInstrumentIdId2(String alternateInstrumentIdId2) {
        this.alternateInstrumentIdId2 = alternateInstrumentIdId2;
    }

    public String getUnderlierUbsInstrumentIdDomain() {
        return underlierUbsInstrumentIdDomain;
    }

    public void setUnderlierUbsInstrumentIdDomain(String underlierUbsInstrumentIdDomain) {
        this.underlierUbsInstrumentIdDomain = underlierUbsInstrumentIdDomain;
    }

    public String getUnderlierUbsInstrumentIdId() {
        return underlierUbsInstrumentIdId;
    }

    public void setUnderlierUbsInstrumentIdId(String underlierUbsInstrumentIdId) {
        this.underlierUbsInstrumentIdId = underlierUbsInstrumentIdId;
    }

    public String getUnderlierUbsInstrumentIdVersion() {
        return underlierUbsInstrumentIdVersion;
    }

    public void setUnderlierUbsInstrumentIdVersion(String underlierUbsInstrumentIdVersion) {
        this.underlierUbsInstrumentIdVersion = underlierUbsInstrumentIdVersion;
    }

    public String getUnderlierAlternateInstrumentIdDomain() {
        return underlierAlternateInstrumentIdDomain;
    }

    public void setUnderlierAlternateInstrumentIdDomain(String underlierAlternateInstrumentIdDomain) {
        this.underlierAlternateInstrumentIdDomain = underlierAlternateInstrumentIdDomain;
    }

    public String getUnderlierAlternateInstrumentIdId() {
        return underlierAlternateInstrumentIdId;
    }

    public void setUnderlierAlternateInstrumentIdId(String underlierAlternateInstrumentIdId) {
        this.underlierAlternateInstrumentIdId = underlierAlternateInstrumentIdId;
    }

    public String getLegacyProductType() {
        return legacyProductType;
    }

    public void setLegacyProductType(String legacyProductType) {
        this.legacyProductType = legacyProductType;
    }

    public String getLegacyProductSubType() {
        return legacyProductSubType;
    }

    public void setLegacyProductSubType(String legacyProductSubType) {
        this.legacyProductSubType = legacyProductSubType;
    }

    public String getProductIdDomain() {
        return productIdDomain;
    }

    public void setProductIdDomain(String productIdDomain) {
        this.productIdDomain = productIdDomain;
    }

    public String getProductIdId() {
        return productIdId;
    }

    public void setProductIdId(String productIdId) {
        this.productIdId = productIdId;
    }

    public String getProductIdVersion() {
        return productIdVersion;
    }

    public void setProductIdVersion(String productIdVersion) {
        this.productIdVersion = productIdVersion;
    }

    public String getParentProductIdDomain() {
        return parentProductIdDomain;
    }

    public void setParentProductIdDomain(String parentProductIdDomain) {
        this.parentProductIdDomain = parentProductIdDomain;
    }

    public String getParentProductIdId() {
        return parentProductIdId;
    }

    public void setParentProductIdId(String parentProductIdId) {
        this.parentProductIdId = parentProductIdId;
    }

    public String getParentProductIdVersion() {
        return parentProductIdVersion;
    }

    public void setParentProductIdVersion(String parentProductIdVersion) {
        this.parentProductIdVersion = parentProductIdVersion;
    }

    public String getIsOTC() {
        return isOTC;
    }

    public void setIsOTC(String isOTC) {
        this.isOTC = isOTC;
    }

    public String getCashFlowType() {
        return cashFlowType;
    }

    public void setCashFlowType(String cashFlowType) {
        this.cashFlowType = cashFlowType;
    }

    public String getCashFlowValue() {
        return cashFlowValue;
    }

    public void setCashFlowValue(String cashFlowValue) {
        this.cashFlowValue = cashFlowValue;
    }

    public String getCashFlowFrequency() {
        return cashFlowFrequency;
    }

    public void setCashFlowFrequency(String cashFlowFrequency) {
        this.cashFlowFrequency = cashFlowFrequency;
    }

    public String getNextResetDate() {
        return nextResetDate;
    }

    public void setNextResetDate(String nextResetDate) {
        this.nextResetDate = nextResetDate;
    }

    public String getUnderlyingAssetType() {
        return underlyingAssetType;
    }

    public void setUnderlyingAssetType(String underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
    }

    public String getCallPutIndicator() {
        return callPutIndicator;
    }

    public void setCallPutIndicator(String callPutIndicator) {
        this.callPutIndicator = callPutIndicator;
    }

    public String getBuySell() {
        return buySell;
    }

    public void setBuySell(String buySell) {
        this.buySell = buySell;
    }

    public String getStrikeCurrency() {
        return strikeCurrency;
    }

    public void setStrikeCurrency(String strikeCurrency) {
        this.strikeCurrency = strikeCurrency;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getStrikeUnitOfMeasure() {
        return strikeUnitOfMeasure;
    }

    public void setStrikeUnitOfMeasure(String strikeUnitOfMeasure) {
        this.strikeUnitOfMeasure = strikeUnitOfMeasure;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getTranche() {
        return tranche;
    }

    public void setTranche(String tranche) {
        this.tranche = tranche;
    }

    public String getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(String currencyList) {
        this.currencyList = currencyList;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public String getQuoteValue() {
        return quoteValue;
    }

    public void setQuoteValue(String quoteValue) {
        this.quoteValue = quoteValue;
    }

    public String getQuoteUnitOfMeasure() {
        return quoteUnitOfMeasure;
    }

    public void setQuoteUnitOfMeasure(String quoteUnitOfMeasure) {
        this.quoteUnitOfMeasure = quoteUnitOfMeasure;
    }

    public String getHasInflationRisk() {
        return hasInflationRisk;
    }

    public void setHasInflationRisk(String hasInflationRisk) {
        this.hasInflationRisk = hasInflationRisk;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public String getBarrierEventType1() {
        return barrierEventType1;
    }

    public void setBarrierEventType1(String barrierEventType1) {
        this.barrierEventType1 = barrierEventType1;
    }

    public String getBarrierEventDirection1() {
        return barrierEventDirection1;
    }

    public void setBarrierEventDirection1(String barrierEventDirection1) {
        this.barrierEventDirection1 = barrierEventDirection1;
    }

    public String getBarrierLevel1() {
        return barrierLevel1;
    }

    public void setBarrierLevel1(String barrierLevel1) {
        this.barrierLevel1 = barrierLevel1;
    }

    public String getBarrierEventStartDate1() {
        return barrierEventStartDate1;
    }

    public void setBarrierEventStartDate1(String barrierEventStartDate1) {
        this.barrierEventStartDate1 = barrierEventStartDate1;
    }

    public String getBarrierEventEndDate1() {
        return barrierEventEndDate1;
    }

    public void setBarrierEventEndDate1(String barrierEventEndDate1) {
        this.barrierEventEndDate1 = barrierEventEndDate1;
    }

    public String getBarrierRebateAmount1() {
        return barrierRebateAmount1;
    }

    public void setBarrierRebateAmount1(String barrierRebateAmount1) {
        this.barrierRebateAmount1 = barrierRebateAmount1;
    }

    public String getBarrierRebatePayoutStyle1() {
        return barrierRebatePayoutStyle1;
    }

    public void setBarrierRebatePayoutStyle1(String barrierRebatePayoutStyle1) {
        this.barrierRebatePayoutStyle1 = barrierRebatePayoutStyle1;
    }

    public String getBarrierEventType2() {
        return barrierEventType2;
    }

    public void setBarrierEventType2(String barrierEventType2) {
        this.barrierEventType2 = barrierEventType2;
    }

    public String getBarrierEventDirection2() {
        return barrierEventDirection2;
    }

    public void setBarrierEventDirection2(String barrierEventDirection2) {
        this.barrierEventDirection2 = barrierEventDirection2;
    }

    public String getBarrierLevel2() {
        return barrierLevel2;
    }

    public void setBarrierLevel2(String barrierLevel2) {
        this.barrierLevel2 = barrierLevel2;
    }

    public String getBarrierEventStartDate2() {
        return barrierEventStartDate2;
    }

    public void setBarrierEventStartDate2(String barrierEventStartDate2) {
        this.barrierEventStartDate2 = barrierEventStartDate2;
    }

    public String getBarrierEventEndDate2() {
        return barrierEventEndDate2;
    }

    public void setBarrierEventEndDate2(String barrierEventEndDate2) {
        this.barrierEventEndDate2 = barrierEventEndDate2;
    }

    public String getBarrierRebateAmount2() {
        return barrierRebateAmount2;
    }

    public void setBarrierRebateAmount2(String barrierRebateAmount2) {
        this.barrierRebateAmount2 = barrierRebateAmount2;
    }

    public String getBarrierRebatePayoutStyle2() {
        return barrierRebatePayoutStyle2;
    }

    public void setBarrierRebatePayoutStyle2(String barrierRebatePayoutStyle2) {
        this.barrierRebatePayoutStyle2 = barrierRebatePayoutStyle2;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String getDeliveryStartDate() {
        return deliveryStartDate;
    }

    public void setDeliveryStartDate(String deliveryStartDate) {
        this.deliveryStartDate = deliveryStartDate;
    }

    public String getDeliveryEndDate() {
        return deliveryEndDate;
    }

    public void setDeliveryEndDate(String deliveryEndDate) {
        this.deliveryEndDate = deliveryEndDate;
    }

    public String getExerciseFrequency() {
        return exerciseFrequency;
    }

    public void setExerciseFrequency(String exerciseFrequency) {
        this.exerciseFrequency = exerciseFrequency;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getIncludeInPnL() {
        return includeInPnL;
    }

    public void setIncludeInPnL(String includeInPnL) {
        this.includeInPnL = includeInPnL;
    }

    public String getRestructuringType() {
        return restructuringType;
    }

    public void setRestructuringType(String restructuringType) {
        this.restructuringType = restructuringType;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getOptionStyle() {
        return optionStyle;
    }

    public void setOptionStyle(String optionStyle) {
        this.optionStyle = optionStyle;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String calculatorType) {
        this.calculatorType = calculatorType;
    }

    public String getCutZone() {
        return cutZone;
    }

    public void setCutZone(String cutZone) {
        this.cutZone = cutZone;
    }

    public String getAccrualMethod() {
        return accrualMethod;
    }

    public void setAccrualMethod(String accrualMethod) {
        this.accrualMethod = accrualMethod;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public String getLegType() {
        return legType;
    }

    public void setLegType(String legType) {
        this.legType = legType;
    }

    public String getBidType() {
        return bidType;
    }

    public void setBidType(String bidType) {
        this.bidType = bidType;
    }

    public String getIsChinese() {
        return isChinese;
    }

    public void setIsChinese(String isChinese) {
        this.isChinese = isChinese;
    }

    public String getIsRealized() {
        return isRealized;
    }

    public void setIsRealized(String isRealized) {
        this.isRealized = isRealized;
    }

    public String getAveragingStartDate() {
        return averagingStartDate;
    }

    public void setAveragingStartDate(String averagingStartDate) {
        this.averagingStartDate = averagingStartDate;
    }

    public String getAveragingEndDate() {
        return averagingEndDate;
    }

    public void setAveragingEndDate(String averagingEndDate) {
        this.averagingEndDate = averagingEndDate;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getUnderlyingMaturityDate() {
        return underlyingMaturityDate;
    }

    public void setUnderlyingMaturityDate(String underlyingMaturityDate) {
        this.underlyingMaturityDate = underlyingMaturityDate;
    }

    public String getIsDigital() {
        return isDigital;
    }

    public void setIsDigital(String isDigital) {
        this.isDigital = isDigital;
    }

    public String getNextResetEffectiveDate() {
        return nextResetEffectiveDate;
    }

    public void setNextResetEffectiveDate(String nextResetEffectiveDate) {
        this.nextResetEffectiveDate = nextResetEffectiveDate;
    }

    public String getNextResetEndDate() {
        return nextResetEndDate;
    }

    public void setNextResetEndDate(String nextResetEndDate) {
        this.nextResetEndDate = nextResetEndDate;
    }

    public String getNextCancellableDate() {
        return nextCancellableDate;
    }

    public void setNextCancellableDate(String nextCancellableDate) {
        this.nextCancellableDate = nextCancellableDate;
    }

    public String getSettlementMechanism() {
        return settlementMechanism;
    }

    public void setSettlementMechanism(String settlementMechanism) {
        this.settlementMechanism = settlementMechanism;
    }

    public String getFacilityIdDomain() {
        return facilityIdDomain;
    }

    public void setFacilityIdDomain(String facilityIdDomain) {
        this.facilityIdDomain = facilityIdDomain;
    }

    public String getFacilityIdId() {
        return facilityIdId;
    }

    public void setFacilityIdId(String facilityIdId) {
        this.facilityIdId = facilityIdId;
    }

    public String getRelatedPartnerPortfolioIdDomain() {
        return relatedPartnerPortfolioIdDomain;
    }

    public void setRelatedPartnerPortfolioIdDomain(String relatedPartnerPortfolioIdDomain) {
        this.relatedPartnerPortfolioIdDomain = relatedPartnerPortfolioIdDomain;
    }

    public String getRelatedPartnerPortfolioIdId() {
        return relatedPartnerPortfolioIdId;
    }

    public void setRelatedPartnerPortfolioIdId(String relatedPartnerPortfolioIdId) {
        this.relatedPartnerPortfolioIdId = relatedPartnerPortfolioIdId;
    }

    public String getRelatedPartnerAccountIdDomain() {
        return relatedPartnerAccountIdDomain;
    }

    public void setRelatedPartnerAccountIdDomain(String relatedPartnerAccountIdDomain) {
        this.relatedPartnerAccountIdDomain = relatedPartnerAccountIdDomain;
    }

    public String getRelatedPartnerAccountIdId() {
        return relatedPartnerAccountIdId;
    }

    public void setRelatedPartnerAccountIdId(String relatedPartnerAccountIdId) {
        this.relatedPartnerAccountIdId = relatedPartnerAccountIdId;
    }

    public String getCalculatedMaturityDate() {
        return calculatedMaturityDate;
    }

    public void setCalculatedMaturityDate(String calculatedMaturityDate) {
        this.calculatedMaturityDate = calculatedMaturityDate;
    }

    public String getCustomAttributeName1() {
        return customAttributeName1;
    }

    public void setCustomAttributeName1(String customAttributeName1) {
        this.customAttributeName1 = customAttributeName1;
    }

    public String getCustomAttributeValue1() {
        return customAttributeValue1;
    }

    public void setCustomAttributeValue1(String customAttributeValue1) {
        this.customAttributeValue1 = customAttributeValue1;
    }

    public String getCustomAttributeName2() {
        return customAttributeName2;
    }

    public void setCustomAttributeName2(String customAttributeName2) {
        this.customAttributeName2 = customAttributeName2;
    }

    public String getCustomAttributeValue2() {
        return customAttributeValue2;
    }

    public void setCustomAttributeValue2(String customAttributeValue2) {
        this.customAttributeValue2 = customAttributeValue2;
    }

    public String getCustomAttributeName3() {
        return customAttributeName3;
    }

    public void setCustomAttributeName3(String customAttributeName3) {
        this.customAttributeName3 = customAttributeName3;
    }

    public String getCustomAttributeValue3() {
        return customAttributeValue3;
    }

    public void setCustomAttributeValue3(String customAttributeValue3) {
        this.customAttributeValue3 = customAttributeValue3;
    }
}
