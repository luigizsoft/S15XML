//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:48:24 AM CEST 
//


package com.vsf.S15.Brr;

import java.math.BigDecimal;
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
 *         &lt;element name="deviceInBundleBillingAmount" type="{http://ifrs.vodafone.com/commonTypes_v1}deviceInBundleBillingAmountType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="billDate" type="{http://ifrs.vodafone.com/commonTypes_v1}billDateType" minOccurs="0"/&gt;
 *         &lt;element name="billingType" type="{http://ifrs.vodafone.com/commonTypes_v1}billingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="deviceQuantity" type="{http://ifrs.vodafone.com/commonTypes_v1}deviceQuantityType"/&gt;
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
    "deviceInBundleBillingAmount",
    "companyCode",
    "billDate",
    "billingType",
    "deviceQuantity"
})
public class DeviceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceID;
    @XmlElement(required = true)
    protected BigDecimal deviceInBundleBillingAmount;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String billingType;
    @XmlElement(required = true)
    protected BigInteger deviceQuantity;

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
     * Obtiene el valor de la propiedad deviceInBundleBillingAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeviceInBundleBillingAmount() {
        return deviceInBundleBillingAmount;
    }

    /**
     * Define el valor de la propiedad deviceInBundleBillingAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeviceInBundleBillingAmount(BigDecimal value) {
        this.deviceInBundleBillingAmount = value;
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

}
