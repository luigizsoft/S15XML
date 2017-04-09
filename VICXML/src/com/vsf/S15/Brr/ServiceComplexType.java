//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:48:24 AM CEST 
//


package com.vsf.S15.Brr;

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
 * <p>Clase Java para serviceComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceID" type="{http://ifrs.vodafone.com/commonTypes_v1}deviceIDType"/&gt;
 *         &lt;element name="serviceInBundleBillingAmount" type="{http://ifrs.vodafone.com/commonTypes_v1}serviceInBundleBillingAmountType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="billDate" type="{http://ifrs.vodafone.com/commonTypes_v1}billDateType" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v1}billingTypeType" minOccurs="0"/&gt;
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
    "serviceInBundleBillingAmount",
    "companyCode",
    "billDate",
    "billingType"
})
public class ServiceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(required = true)
    protected BigDecimal serviceInBundleBillingAmount;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingType;

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
     * Obtiene el valor de la propiedad serviceInBundleBillingAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceInBundleBillingAmount() {
        return serviceInBundleBillingAmount;
    }

    /**
     * Define el valor de la propiedad serviceInBundleBillingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceInBundleBillingAmount(BigDecimal value) {
        this.serviceInBundleBillingAmount = value;
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

}
