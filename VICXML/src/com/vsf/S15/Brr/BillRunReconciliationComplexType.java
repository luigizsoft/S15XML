//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:48:24 AM CEST 
//


package com.vsf.S15.Brr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para billRunReconciliationComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="billRunReconciliationComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://ifrs.vodafone.com/commonTypes_v1}eventTypeType"/&gt;
 *         &lt;element name="eventDate" type="{http://ifrs.vodafone.com/commonTypes_v1}eventDateType"/&gt;
 *         &lt;element name="eventContractID" type="{http://ifrs.vodafone.com/commonTypes_v1}eventContractIDType"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v1}billingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="currency" type="{http://ifrs.vodafone.com/commonTypes_v1}currencyType"/&gt;
 *         &lt;element name="billDate" type="{http://ifrs.vodafone.com/commonTypes_v1}billDateType" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://ifrs.vodafone.com/commonTypes_v1}invoiceNumberType"/&gt;
 *         &lt;element name="DeviceList" type="{http://ifrs15.vodafone.com/events/billrunreconciliation_v1}deviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceList" type="{http://ifrs15.vodafone.com/events/billrunreconciliation_v1}serviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="RebateList" type="{http://ifrs15.vodafone.com/events/billrunreconciliation_v1}rebatesListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FundList" type="{http://ifrs15.vodafone.com/events/billrunreconciliation_v1}fundsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FeeList" type="{http://ifrs15.vodafone.com/events/billrunreconciliation_v1}feesListComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billRunReconciliationComplexType", propOrder = {
    "eventType",
    "eventDate",
    "eventContractID",
    "billingType",
    "currency",
    "billDate",
    "companyCode",
    "invoiceNumber",
    "deviceList",
    "serviceList",
    "rebateList",
    "fundList",
    "feeList"
})
public class BillRunReconciliationComplexType {

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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CurrencyType currency;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String invoiceNumber;
    @XmlElement(name = "DeviceList")
    protected DeviceListComplexType deviceList;
    @XmlElement(name = "ServiceList")
    protected ServiceListComplexType serviceList;
    @XmlElement(name = "RebateList")
    protected RebatesListComplexType rebateList;
    @XmlElement(name = "FundList")
    protected FundsListComplexType fundList;
    @XmlElement(name = "FeeList")
    protected FeesListComplexType feeList;

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
     * Obtiene el valor de la propiedad billDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillDate() {
        return billDate;
    }

    /**
     * Define el valor de la propiedad billDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillDate(XMLGregorianCalendar value) {
        this.billDate = value;
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
     * Obtiene el valor de la propiedad invoiceNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Define el valor de la propiedad invoiceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
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
     * Obtiene el valor de la propiedad feeList.
     * 
     * @return
     *     possible object is
     *     {@link FeesListComplexType }
     *     
     */
    public FeesListComplexType getFeeList() {
        return feeList;
    }

    /**
     * Define el valor de la propiedad feeList.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesListComplexType }
     *     
     */
    public void setFeeList(FeesListComplexType value) {
        this.feeList = value;
    }

}
