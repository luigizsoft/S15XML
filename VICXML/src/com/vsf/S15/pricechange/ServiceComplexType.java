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
 * <p>Clase Java para serviceComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceID" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceIDType"/&gt;
 *         &lt;element name="serviceTimeUnit" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceTimeUnitType" minOccurs="0"/&gt;
 *         &lt;element name="serviceStartDate" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceDateType" minOccurs="0"/&gt;
 *         &lt;element name="serviceEndDate" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceDateType"/&gt;
 *         &lt;element name="ServiceBillingProfile" type="{http://ifrs15.vodafone.com/events/pricechange_v1}serviceBillingProfileComplexType"/&gt;
 *         &lt;element name="serviceQuantity" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceQuantityType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="firstPlanBillingDate" type="{http://ifrs.vodafone.com/commonTypes_v1}firstPlanBillingDateType"/&gt;
 *         &lt;element name="effectivePriceChangeDate" type="{http://ifrs.vodafone.com/commonTypes_v1}effectivePriceChangeDateType" minOccurs="0"/&gt;
 *         &lt;element name="serviceEndDateEstimated" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceEndDateEstimatedType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceComplexType", propOrder = {
    "serviceID",
    "serviceTimeUnit",
    "serviceStartDate",
    "serviceEndDate",
    "serviceBillingProfile",
    "serviceQuantity",
    "companyCode",
    "firstPlanBillingDate",
    "effectivePriceChangeDate",
    "serviceEndDateEstimated"
})
public class ServiceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceTimeUnit;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceStartDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceEndDate;
    @XmlElement(name = "ServiceBillingProfile", required = true)
    protected ServiceBillingProfileComplexType serviceBillingProfile;
    @XmlElement(required = true)
    protected BigInteger serviceQuantity;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPlanBillingDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivePriceChangeDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar serviceEndDateEstimated;

    /**
     * Obtiene el valor de la propiedad serviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Define el valor de la propiedad serviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceTimeUnit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTimeUnit() {
        return serviceTimeUnit;
    }

    /**
     * Define el valor de la propiedad serviceTimeUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTimeUnit(String value) {
        this.serviceTimeUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Define el valor de la propiedad serviceStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceStartDate(XMLGregorianCalendar value) {
        this.serviceStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * Define el valor de la propiedad serviceEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceEndDate(XMLGregorianCalendar value) {
        this.serviceEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceBillingProfile.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBillingProfileComplexType }
     *     
     */
    public ServiceBillingProfileComplexType getServiceBillingProfile() {
        return serviceBillingProfile;
    }

    /**
     * Define el valor de la propiedad serviceBillingProfile.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBillingProfileComplexType }
     *     
     */
    public void setServiceBillingProfile(ServiceBillingProfileComplexType value) {
        this.serviceBillingProfile = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServiceQuantity() {
        return serviceQuantity;
    }

    /**
     * Define el valor de la propiedad serviceQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServiceQuantity(BigInteger value) {
        this.serviceQuantity = value;
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

    /**
     * Obtiene el valor de la propiedad serviceEndDateEstimated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceEndDateEstimated() {
        return serviceEndDateEstimated;
    }

    /**
     * Define el valor de la propiedad serviceEndDateEstimated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceEndDateEstimated(XMLGregorianCalendar value) {
        this.serviceEndDateEstimated = value;
    }

}
