//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 06:27:35 PM CEST 
//


package com.vsf.S15.update;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/update_v1}mIAttributesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v1}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="profitCenter" type="{http://ifrs.vodafone.com/commonTypes_v1}profitCenterType" minOccurs="0"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v1}referenceAccountType" minOccurs="0"/&gt;
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
    "miAttributes",
    "companyCode",
    "lmSpecificMiDimensions",
    "profitCenter",
    "referenceAccount"
})
public class DeviceComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deviceID;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String profitCenter;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceAccount;

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
     * Obtiene el valor de la propiedad profitCenter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitCenter() {
        return profitCenter;
    }

    /**
     * Define el valor de la propiedad profitCenter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitCenter(String value) {
        this.profitCenter = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceAccount() {
        return referenceAccount;
    }

    /**
     * Define el valor de la propiedad referenceAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceAccount(String value) {
        this.referenceAccount = value;
    }

}
