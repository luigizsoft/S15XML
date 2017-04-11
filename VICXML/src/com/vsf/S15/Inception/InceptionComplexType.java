//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.11 a las 12:11:23 PM CEST 
//


package com.vsf.S15.Inception;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para inceptionComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="inceptionComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://ifrs.vodafone.com/commonTypes_v3}eventTypeType"/&gt;
 *         &lt;element name="eventDate" type="{http://ifrs.vodafone.com/commonTypes_v3}eventDateType"/&gt;
 *         &lt;element name="eventContractID" type="{http://ifrs.vodafone.com/commonTypes_v3}eventContractIDType"/&gt;
 *         &lt;element name="iFRS15SynonymID" type="{http://ifrs.vodafone.com/commonTypes_v3}iFRS15SynonymIDType" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v3}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="contractStartDate" type="{http://ifrs.vodafone.com/commonTypes_v3}contractDateType" minOccurs="0"/&gt;
 *         &lt;element name="contractEndDate" type="{http://ifrs.vodafone.com/commonTypes_v3}contractDateType" minOccurs="0"/&gt;
 *         &lt;element name="contractTimeUnit" type="{http://ifrs.vodafone.com/commonTypes_v3}contractTimeUnitType" minOccurs="0"/&gt;
 *         &lt;element name="firstPlanBillingDate" type="{http://ifrs.vodafone.com/commonTypes_v3}firstPlanBillingDateType" minOccurs="0"/&gt;
 *         &lt;element name="catchUpIndicator" type="{http://ifrs.vodafone.com/commonTypes_v3}catchUpIndicatorType" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v3}billingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceList" type="{http://ifrs15.vodafone.com/events/inception_v3}deviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceList" type="{http://ifrs15.vodafone.com/events/inception_v3}serviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="MaterialRightsList" type="{http://ifrs15.vodafone.com/events/inception_v3}materialRightsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v3}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/inception_v3}mIAttributesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="averageDiscountFactor" type="{http://ifrs.vodafone.com/commonTypes_v3}averageDiscountFactorType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://ifrs.vodafone.com/commonTypes_v3}currencyType"/&gt;
 *         &lt;element name="RebateList" type="{http://ifrs15.vodafone.com/events/inception_v3}rebatesListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FundList" type="{http://ifrs15.vodafone.com/events/inception_v3}fundsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="CostList" type="{http://ifrs15.vodafone.com/events/inception_v3}CostListComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inceptionComplexType", propOrder = {
    "eventType",
    "eventDate",
    "eventContractID",
    "ifrs15SynonymID",
    "companyCode",
    "contractStartDate",
    "contractEndDate",
    "contractTimeUnit",
    "firstPlanBillingDate",
    "catchUpIndicator",
    "billingType",
    "deviceList",
    "serviceList",
    "materialRightsList",
    "lmSpecificMiDimensions",
    "miAttributes",
    "averageDiscountFactor",
    "currency",
    "rebateList",
    "fundList",
    "costList"
})
public class InceptionComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eventType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eventContractID;
    @XmlElement(name = "iFRS15SynonymID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ifrs15SynonymID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractEndDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contractTimeUnit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPlanBillingDate;
    protected String catchUpIndicator;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingType;
    @XmlElement(name = "DeviceList")
    protected DeviceListComplexType deviceList;
    @XmlElement(name = "ServiceList")
    protected ServiceListComplexType serviceList;
    @XmlElement(name = "MaterialRightsList")
    protected MaterialRightsListComplexType materialRightsList;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    protected BigDecimal averageDiscountFactor;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyType currency;
    @XmlElement(name = "RebateList")
    protected RebatesListComplexType rebateList;
    @XmlElement(name = "FundList")
    protected FundsListComplexType fundList;
    @XmlElement(name = "CostList")
    protected CostListComplexType costList;

    /**
     * Obtiene el valor de la propiedad eventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Define el valor de la propiedad eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Obtiene el valor de la propiedad eventDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Define el valor de la propiedad eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Obtiene el valor de la propiedad eventContractID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventContractID() {
        return eventContractID;
    }

    /**
     * Define el valor de la propiedad eventContractID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventContractID(String value) {
        this.eventContractID = value;
    }

    /**
     * Obtiene el valor de la propiedad ifrs15SynonymID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFRS15SynonymID() {
        return ifrs15SynonymID;
    }

    /**
     * Define el valor de la propiedad ifrs15SynonymID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFRS15SynonymID(String value) {
        this.ifrs15SynonymID = value;
    }

    /**
     * Obtiene el valor de la propiedad companyCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Define el valor de la propiedad companyCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Obtiene el valor de la propiedad contractStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Define el valor de la propiedad contractStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad contractEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractEndDate() {
        return contractEndDate;
    }

    /**
     * Define el valor de la propiedad contractEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractEndDate(XMLGregorianCalendar value) {
        this.contractEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad contractTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTimeUnit() {
        return contractTimeUnit;
    }

    /**
     * Define el valor de la propiedad contractTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTimeUnit(String value) {
        this.contractTimeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad firstPlanBillingDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstPlanBillingDate() {
        return firstPlanBillingDate;
    }

    /**
     * Define el valor de la propiedad firstPlanBillingDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstPlanBillingDate(XMLGregorianCalendar value) {
        this.firstPlanBillingDate = value;
    }

    /**
     * Obtiene el valor de la propiedad catchUpIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatchUpIndicator() {
        return catchUpIndicator;
    }

    /**
     * Define el valor de la propiedad catchUpIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchUpIndicator(String value) {
        this.catchUpIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad billingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingType() {
        return billingType;
    }

    /**
     * Define el valor de la propiedad billingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingType(String value) {
        this.billingType = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceList.
     * 
     * @return
     *     possible object is
     *     {@link DeviceListComplexType }
     *     
     */
    public DeviceListComplexType getDeviceList() {
        return deviceList;
    }

    /**
     * Define el valor de la propiedad deviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceListComplexType }
     *     
     */
    public void setDeviceList(DeviceListComplexType value) {
        this.deviceList = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceList.
     * 
     * @return
     *     possible object is
     *     {@link ServiceListComplexType }
     *     
     */
    public ServiceListComplexType getServiceList() {
        return serviceList;
    }

    /**
     * Define el valor de la propiedad serviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceListComplexType }
     *     
     */
    public void setServiceList(ServiceListComplexType value) {
        this.serviceList = value;
    }

    /**
     * Obtiene el valor de la propiedad materialRightsList.
     * 
     * @return
     *     possible object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public MaterialRightsListComplexType getMaterialRightsList() {
        return materialRightsList;
    }

    /**
     * Define el valor de la propiedad materialRightsList.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public void setMaterialRightsList(MaterialRightsListComplexType value) {
        this.materialRightsList = value;
    }

    /**
     * Obtiene el valor de la propiedad lmSpecificMiDimensions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLMSpecificMiDimensions() {
        return lmSpecificMiDimensions;
    }

    /**
     * Define el valor de la propiedad lmSpecificMiDimensions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLMSpecificMiDimensions(String value) {
        this.lmSpecificMiDimensions = value;
    }

    /**
     * Obtiene el valor de la propiedad miAttributes.
     * 
     * @return
     *     possible object is
     *     {@link MIAttributesComplexType }
     *     
     */
    public MIAttributesComplexType getMIAttributes() {
        return miAttributes;
    }

    /**
     * Define el valor de la propiedad miAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link MIAttributesComplexType }
     *     
     */
    public void setMIAttributes(MIAttributesComplexType value) {
        this.miAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad averageDiscountFactor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAverageDiscountFactor() {
        return averageDiscountFactor;
    }

    /**
     * Define el valor de la propiedad averageDiscountFactor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAverageDiscountFactor(BigDecimal value) {
        this.averageDiscountFactor = value;
    }

    /**
     * Obtiene el valor de la propiedad currency.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyType }
     *     
     */
    public CurrencyType getCurrency() {
        return currency;
    }

    /**
     * Define el valor de la propiedad currency.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyType }
     *     
     */
    public void setCurrency(CurrencyType value) {
        this.currency = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateList.
     * 
     * @return
     *     possible object is
     *     {@link RebatesListComplexType }
     *     
     */
    public RebatesListComplexType getRebateList() {
        return rebateList;
    }

    /**
     * Define el valor de la propiedad rebateList.
     * 
     * @param value
     *     allowed object is
     *     {@link RebatesListComplexType }
     *     
     */
    public void setRebateList(RebatesListComplexType value) {
        this.rebateList = value;
    }

    /**
     * Obtiene el valor de la propiedad fundList.
     * 
     * @return
     *     possible object is
     *     {@link FundsListComplexType }
     *     
     */
    public FundsListComplexType getFundList() {
        return fundList;
    }

    /**
     * Define el valor de la propiedad fundList.
     * 
     * @param value
     *     allowed object is
     *     {@link FundsListComplexType }
     *     
     */
    public void setFundList(FundsListComplexType value) {
        this.fundList = value;
    }

    /**
     * Obtiene el valor de la propiedad costList.
     * 
     * @return
     *     possible object is
     *     {@link CostListComplexType }
     *     
     */
    public CostListComplexType getCostList() {
        return costList;
    }

    /**
     * Define el valor de la propiedad costList.
     * 
     * @param value
     *     allowed object is
     *     {@link CostListComplexType }
     *     
     */
    public void setCostList(CostListComplexType value) {
        this.costList = value;
    }

}
