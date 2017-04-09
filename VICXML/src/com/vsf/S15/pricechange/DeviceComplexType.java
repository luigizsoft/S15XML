//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:55:22 AM CEST 
//


package com.vsf.S15.pricechange;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para deviceComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deviceComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deviceID" type="{http://ifrs.vodafone.com/commonTypes_v1}deviceIDType"/&gt;
 *         &lt;element name="DeviceBillingProfile" type="{http://ifrs15.vodafone.com/events/pricechange_v1}deviceBillingProfileComplexType" minOccurs="0"/&gt;
 *         &lt;element name="OneOffPayments" type="{http://ifrs15.vodafone.com/events/pricechange_v1}oneOffPaymentListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="deviceQuantity" type="{http://ifrs.vodafone.com/commonTypes_v1}deviceQuantityType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="firstPlanBillingDate" type="{http://ifrs.vodafone.com/commonTypes_v1}firstPlanBillingDateType" minOccurs="0"/&gt;
 *         &lt;element name="effectivePriceChangeDate" type="{http://ifrs.vodafone.com/commonTypes_v1}effectivePriceChangeDateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deviceComplexType", propOrder = {
    "deviceID",
    "deviceBillingProfile",
    "oneOffPayments",
    "deviceQuantity",
    "companyCode",
    "firstPlanBillingDate",
    "effectivePriceChangeDate"
})
public class DeviceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceID;
    @XmlElement(name = "DeviceBillingProfile")
    protected DeviceBillingProfileComplexType deviceBillingProfile;
    @XmlElement(name = "OneOffPayments")
    protected OneOffPaymentListComplexType oneOffPayments;
    @XmlElement(required = true)
    protected BigInteger deviceQuantity;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPlanBillingDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivePriceChangeDate;

    /**
     * Obtiene el valor de la propiedad deviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceID() {
        return deviceID;
    }

    /**
     * Define el valor de la propiedad deviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceID(String value) {
        this.deviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceBillingProfile.
     * 
     * @return
     *     possible object is
     *     {@link DeviceBillingProfileComplexType }
     *     
     */
    public DeviceBillingProfileComplexType getDeviceBillingProfile() {
        return deviceBillingProfile;
    }

    /**
     * Define el valor de la propiedad deviceBillingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceBillingProfileComplexType }
     *     
     */
    public void setDeviceBillingProfile(DeviceBillingProfileComplexType value) {
        this.deviceBillingProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad oneOffPayments.
     * 
     * @return
     *     possible object is
     *     {@link OneOffPaymentListComplexType }
     *     
     */
    public OneOffPaymentListComplexType getOneOffPayments() {
        return oneOffPayments;
    }

    /**
     * Define el valor de la propiedad oneOffPayments.
     * 
     * @param value
     *     allowed object is
     *     {@link OneOffPaymentListComplexType }
     *     
     */
    public void setOneOffPayments(OneOffPaymentListComplexType value) {
        this.oneOffPayments = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceQuantity() {
        return deviceQuantity;
    }

    /**
     * Define el valor de la propiedad deviceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceQuantity(BigInteger value) {
        this.deviceQuantity = value;
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
     * Obtiene el valor de la propiedad effectivePriceChangeDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectivePriceChangeDate() {
        return effectivePriceChangeDate;
    }

    /**
     * Define el valor de la propiedad effectivePriceChangeDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectivePriceChangeDate(XMLGregorianCalendar value) {
        this.effectivePriceChangeDate = value;
    }

}
