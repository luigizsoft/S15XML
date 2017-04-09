//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:50:46 AM CEST 
//


package com.vsf.S15.contractfreeze;

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
 *         &lt;element name="revisedServiceEndDate" type="{http://ifrs.vodafone.com/commonTypes_v1}revisedServiceEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceBillingProfile" type="{http://ifrs15.vodafone.com/events/contractfreeze_v1}serviceBillingProfileComplexType" minOccurs="0"/&gt;
 *         &lt;element name="serviceQuantity" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceQuantityType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="firstPlanBillingDate" type="{http://ifrs.vodafone.com/commonTypes_v1}firstPlanBillingDateType"/&gt;
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
    "revisedServiceEndDate",
    "serviceBillingProfile",
    "serviceQuantity",
    "companyCode",
    "firstPlanBillingDate"
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
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar revisedServiceEndDate;
    @XmlElement(name = "ServiceBillingProfile")
    protected ServiceBillingProfileComplexType serviceBillingProfile;
    @XmlElement(required = true)
    protected BigInteger serviceQuantity;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstPlanBillingDate;

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
     * Obtiene el valor de la propiedad revisedServiceEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRevisedServiceEndDate() {
        return revisedServiceEndDate;
    }

    /**
     * Define el valor de la propiedad revisedServiceEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRevisedServiceEndDate(XMLGregorianCalendar value) {
        this.revisedServiceEndDate = value;
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

}
