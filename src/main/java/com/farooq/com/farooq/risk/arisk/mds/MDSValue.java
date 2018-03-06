package com.farooq.risk.arisk.mds;

import com.farooq.risk.arisk.ARiskUtil;

public class MDSValue {


    private String logicalKey;

    public String getLogicalKey() {
        return logicalKey;
    }

    public void setLogicalKey(String logicalKeyValueStr) {
        this.logicalKey = ARiskUtil.MD5(logicalKeyValueStr);
    }

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


    private String
            marketDataSetSourceIdVersion;


    private String
            marketDataSetLegacySourceIdDomain;


    private String
            marketDataSetLegacySourceIdId;


    private String marketDataSetRiskType;


    private String
            marketDataSetCalculationType;


    private String marketDataSetModelDomain;


    private String marketDataSetModelId;


    private String marketDataSetOwnerDomain;


    private String marketDataSetOwnerId;


    private String marketDataSetCurrency;


    private String discountingMarketDataSet;


    private String referenceMarketDataSet;


    private String countryOfRisk;


    private String index;


    private String tranche;


    private String referenceIndex;


    private String sAndPRating;


    private String moodyRating;


    private String fitchRating;


    private String internalRating;


    private String compositeRating;


    private String instrumentIdDomain;


    private String instrumentIdId;


    private String
            alternateInstrumentIdDomain;


    private String alternateInstrumentIdId;


    private String currencyPair;


    private String compoundingMethod;


    private String seniority;


    private String restructuringType;


    private String referenceEntityIdDomain;


    private String referenceEntityIdId;


    private String curveMarketDomain;


    private String curveMarketId;


    private String curveType;


    private String curveSubType;


    private String parameterFamily;


    private String location;


    private String quality;


    private String isTradingAsDefaulted;


    private String guarantorName;


    private String guaranteeType;


    private String guaranteeEndDate;


    private String immConvention;


    private String premiumFrequency;


    private String markQuoteConvention;


    private String rowLabel;


    private String rowLabelDate;


    private String columnLabel;


    private String columnLabelDate;


    private String additionalLabelName1;


    private String additionalLabelValue1;


    private String additionalLabelName2;


    private String additionalLabelValue2;


    private String termStructureConvention;


    private String minuendMDSName;


    private String minuendMDSCurrency;


    private String minuendMDSResetTenor;


    private String subtrahendMDSName;


    private String subtrahendMDSCurrency;


    private String subtrahendMDSResetTenor;


    private String impliedFrom;


    private String outrightCurveName;


    private String resetTenor;


    private String isNonDeliverable;


    private String compositionType;


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

    public String getMarketDataSetSourceIdVersion() {
        return marketDataSetSourceIdVersion;
    }

    public void setMarketDataSetSourceIdVersion(String marketDataSetSourceIdVersion) {
        this.marketDataSetSourceIdVersion = marketDataSetSourceIdVersion;
    }

    public String getMarketDataSetLegacySourceIdDomain() {
        return marketDataSetLegacySourceIdDomain;
    }

    public void setMarketDataSetLegacySourceIdDomain(String marketDataSetLegacySourceIdDomain) {
        this.marketDataSetLegacySourceIdDomain = marketDataSetLegacySourceIdDomain;
    }

    public String getMarketDataSetLegacySourceIdId() {
        return marketDataSetLegacySourceIdId;
    }

    public void setMarketDataSetLegacySourceIdId(String marketDataSetLegacySourceIdId) {
        this.marketDataSetLegacySourceIdId = marketDataSetLegacySourceIdId;
    }

    public String getMarketDataSetRiskType() {
        return marketDataSetRiskType;
    }

    public void setMarketDataSetRiskType(String marketDataSetRiskType) {
        this.marketDataSetRiskType = marketDataSetRiskType;
    }

    public String getMarketDataSetCalculationType() {
        return marketDataSetCalculationType;
    }

    public void setMarketDataSetCalculationType(String marketDataSetCalculationType) {
        this.marketDataSetCalculationType = marketDataSetCalculationType;
    }

    public String getMarketDataSetModelDomain() {
        return marketDataSetModelDomain;
    }

    public void setMarketDataSetModelDomain(String marketDataSetModelDomain) {
        this.marketDataSetModelDomain = marketDataSetModelDomain;
    }

    public String getMarketDataSetModelId() {
        return marketDataSetModelId;
    }

    public void setMarketDataSetModelId(String marketDataSetModelId) {
        this.marketDataSetModelId = marketDataSetModelId;
    }

    public String getMarketDataSetOwnerDomain() {
        return marketDataSetOwnerDomain;
    }

    public void setMarketDataSetOwnerDomain(String marketDataSetOwnerDomain) {
        this.marketDataSetOwnerDomain = marketDataSetOwnerDomain;
    }

    public String getMarketDataSetOwnerId() {
        return marketDataSetOwnerId;
    }

    public void setMarketDataSetOwnerId(String marketDataSetOwnerId) {
        this.marketDataSetOwnerId = marketDataSetOwnerId;
    }

    public String getMarketDataSetCurrency() {
        return marketDataSetCurrency;
    }

    public void setMarketDataSetCurrency(String marketDataSetCurrency) {
        this.marketDataSetCurrency = marketDataSetCurrency;
    }

    public String getDiscountingMarketDataSet() {
        return discountingMarketDataSet;
    }

    public void setDiscountingMarketDataSet(String discountingMarketDataSet) {
        this.discountingMarketDataSet = discountingMarketDataSet;
    }

    public String getReferenceMarketDataSet() {
        return referenceMarketDataSet;
    }

    public void setReferenceMarketDataSet(String referenceMarketDataSet) {
        this.referenceMarketDataSet = referenceMarketDataSet;
    }

    public String getCountryOfRisk() {
        return countryOfRisk;
    }

    public void setCountryOfRisk(String countryOfRisk) {
        this.countryOfRisk = countryOfRisk;
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

    public String getReferenceIndex() {
        return referenceIndex;
    }

    public void setReferenceIndex(String referenceIndex) {
        this.referenceIndex = referenceIndex;
    }

    public String getsAndPRating() {
        return sAndPRating;
    }

    public void setsAndPRating(String sAndPRating) {
        this.sAndPRating = sAndPRating;
    }

    public String getMoodyRating() {
        return moodyRating;
    }

    public void setMoodyRating(String moodyRating) {
        this.moodyRating = moodyRating;
    }

    public String getFitchRating() {
        return fitchRating;
    }

    public void setFitchRating(String fitchRating) {
        this.fitchRating = fitchRating;
    }

    public String getInternalRating() {
        return internalRating;
    }

    public void setInternalRating(String internalRating) {
        this.internalRating = internalRating;
    }

    public String getCompositeRating() {
        return compositeRating;
    }

    public void setCompositeRating(String compositeRating) {
        this.compositeRating = compositeRating;
    }

    public String getInstrumentIdDomain() {
        return instrumentIdDomain;
    }

    public void setInstrumentIdDomain(String instrumentIdDomain) {
        this.instrumentIdDomain = instrumentIdDomain;
    }

    public String getInstrumentIdId() {
        return instrumentIdId;
    }

    public void setInstrumentIdId(String instrumentIdId) {
        this.instrumentIdId = instrumentIdId;
    }

    public String getAlternateInstrumentIdDomain() {
        return alternateInstrumentIdDomain;
    }

    public void setAlternateInstrumentIdDomain(String alternateInstrumentIdDomain) {
        this.alternateInstrumentIdDomain = alternateInstrumentIdDomain;
    }

    public String getAlternateInstrumentIdId() {
        return alternateInstrumentIdId;
    }

    public void setAlternateInstrumentIdId(String alternateInstrumentIdId) {
        this.alternateInstrumentIdId = alternateInstrumentIdId;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public String getCompoundingMethod() {
        return compoundingMethod;
    }

    public void setCompoundingMethod(String compoundingMethod) {
        this.compoundingMethod = compoundingMethod;
    }

    public String getSeniority() {
        return seniority;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public String getRestructuringType() {
        return restructuringType;
    }

    public void setRestructuringType(String restructuringType) {
        this.restructuringType = restructuringType;
    }

    public String getReferenceEntityIdDomain() {
        return referenceEntityIdDomain;
    }

    public void setReferenceEntityIdDomain(String referenceEntityIdDomain) {
        this.referenceEntityIdDomain = referenceEntityIdDomain;
    }

    public String getReferenceEntityIdId() {
        return referenceEntityIdId;
    }

    public void setReferenceEntityIdId(String referenceEntityIdId) {
        this.referenceEntityIdId = referenceEntityIdId;
    }

    public String getCurveMarketDomain() {
        return curveMarketDomain;
    }

    public void setCurveMarketDomain(String curveMarketDomain) {
        this.curveMarketDomain = curveMarketDomain;
    }

    public String getCurveMarketId() {
        return curveMarketId;
    }

    public void setCurveMarketId(String curveMarketId) {
        this.curveMarketId = curveMarketId;
    }

    public String getCurveType() {
        return curveType;
    }

    public void setCurveType(String curveType) {
        this.curveType = curveType;
    }

    public String getCurveSubType() {
        return curveSubType;
    }

    public void setCurveSubType(String curveSubType) {
        this.curveSubType = curveSubType;
    }

    public String getParameterFamily() {
        return parameterFamily;
    }

    public void setParameterFamily(String parameterFamily) {
        this.parameterFamily = parameterFamily;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getIsTradingAsDefaulted() {
        return isTradingAsDefaulted;
    }

    public void setIsTradingAsDefaulted(String isTradingAsDefaulted) {
        this.isTradingAsDefaulted = isTradingAsDefaulted;
    }

    public String getGuarantorName() {
        return guarantorName;
    }

    public void setGuarantorName(String guarantorName) {
        this.guarantorName = guarantorName;
    }

    public String getGuaranteeType() {
        return guaranteeType;
    }

    public void setGuaranteeType(String guaranteeType) {
        this.guaranteeType = guaranteeType;
    }

    public String getGuaranteeEndDate() {
        return guaranteeEndDate;
    }

    public void setGuaranteeEndDate(String guaranteeEndDate) {
        this.guaranteeEndDate = guaranteeEndDate;
    }

    public String getImmConvention() {
        return immConvention;
    }

    public void setImmConvention(String immConvention) {
        this.immConvention = immConvention;
    }

    public String getPremiumFrequency() {
        return premiumFrequency;
    }

    public void setPremiumFrequency(String premiumFrequency) {
        this.premiumFrequency = premiumFrequency;
    }

    public String getMarkQuoteConvention() {
        return markQuoteConvention;
    }

    public void setMarkQuoteConvention(String markQuoteConvention) {
        this.markQuoteConvention = markQuoteConvention;
    }

    public String getRowLabel() {
        return rowLabel;
    }

    public void setRowLabel(String rowLabel) {
        this.rowLabel = rowLabel;
    }

    public String getRowLabelDate() {
        return rowLabelDate;
    }

    public void setRowLabelDate(String rowLabelDate) {
        this.rowLabelDate = rowLabelDate;
    }

    public String getColumnLabel() {
        return columnLabel;
    }

    public void setColumnLabel(String columnLabel) {
        this.columnLabel = columnLabel;
    }

    public String getColumnLabelDate() {
        return columnLabelDate;
    }

    public void setColumnLabelDate(String columnLabelDate) {
        this.columnLabelDate = columnLabelDate;
    }

    public String getAdditionalLabelName1() {
        return additionalLabelName1;
    }

    public void setAdditionalLabelName1(String additionalLabelName1) {
        this.additionalLabelName1 = additionalLabelName1;
    }

    public String getAdditionalLabelValue1() {
        return additionalLabelValue1;
    }

    public void setAdditionalLabelValue1(String additionalLabelValue1) {
        this.additionalLabelValue1 = additionalLabelValue1;
    }

    public String getAdditionalLabelName2() {
        return additionalLabelName2;
    }

    public void setAdditionalLabelName2(String additionalLabelName2) {
        this.additionalLabelName2 = additionalLabelName2;
    }

    public String getAdditionalLabelValue2() {
        return additionalLabelValue2;
    }

    public void setAdditionalLabelValue2(String additionalLabelValue2) {
        this.additionalLabelValue2 = additionalLabelValue2;
    }

    public String getTermStructureConvention() {
        return termStructureConvention;
    }

    public void setTermStructureConvention(String termStructureConvention) {
        this.termStructureConvention = termStructureConvention;
    }

    public String getMinuendMDSName() {
        return minuendMDSName;
    }

    public void setMinuendMDSName(String minuendMDSName) {
        this.minuendMDSName = minuendMDSName;
    }

    public String getMinuendMDSCurrency() {
        return minuendMDSCurrency;
    }

    public void setMinuendMDSCurrency(String minuendMDSCurrency) {
        this.minuendMDSCurrency = minuendMDSCurrency;
    }

    public String getMinuendMDSResetTenor() {
        return minuendMDSResetTenor;
    }

    public void setMinuendMDSResetTenor(String minuendMDSResetTenor) {
        this.minuendMDSResetTenor = minuendMDSResetTenor;
    }

    public String getSubtrahendMDSName() {
        return subtrahendMDSName;
    }

    public void setSubtrahendMDSName(String subtrahendMDSName) {
        this.subtrahendMDSName = subtrahendMDSName;
    }

    public String getSubtrahendMDSCurrency() {
        return subtrahendMDSCurrency;
    }

    public void setSubtrahendMDSCurrency(String subtrahendMDSCurrency) {
        this.subtrahendMDSCurrency = subtrahendMDSCurrency;
    }

    public String getSubtrahendMDSResetTenor() {
        return subtrahendMDSResetTenor;
    }

    public void setSubtrahendMDSResetTenor(String subtrahendMDSResetTenor) {
        this.subtrahendMDSResetTenor = subtrahendMDSResetTenor;
    }

    public String getImpliedFrom() {
        return impliedFrom;
    }

    public void setImpliedFrom(String impliedFrom) {
        this.impliedFrom = impliedFrom;
    }

    public String getOutrightCurveName() {
        return outrightCurveName;
    }

    public void setOutrightCurveName(String outrightCurveName) {
        this.outrightCurveName = outrightCurveName;
    }

    public String getResetTenor() {
        return resetTenor;
    }

    public void setResetTenor(String resetTenor) {
        this.resetTenor = resetTenor;
    }

    public String getIsNonDeliverable() {
        return isNonDeliverable;
    }

    public void setIsNonDeliverable(String isNonDeliverable) {
        this.isNonDeliverable = isNonDeliverable;
    }

    public String getCompositionType() {
        return compositionType;
    }

    public void setCompositionType(String compositionType) {
        this.compositionType = compositionType;
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
