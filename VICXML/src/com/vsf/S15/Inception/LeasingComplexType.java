//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:44:26 AM CEST 
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
 * <p>Clase Java para leasingComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="leasingComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="leasingID" type="{http://ifrs.vodafone.com/commonTypes_v1}leasingIDType"/&gt;
 *         &lt;element name="leasingStartDate" type="{http://ifrs.vodafone.com/commonTypes_v1}leasingDateType" minOccurs="0"/&gt;
 *         &lt;element name="leasingEndDate" type="{http://ifrs.vodafone.com/commonTypes_v1}leasingDateType" minOccurs="0"/&gt;
 *         &lt;element name="leasingType" type="{http://ifrs.vodafone.com/commonTypes_v1}leasingTypeType"/&gt;
 *         &lt;element name="leasedAssetFairValue" type="{http://ifrs.vodafone.com/commonTypes_v1}leasedAssetFairValueType" minOccurs="0"/&gt;
 *         &lt;element name="financeCharge" type="{http://ifrs.vodafone.com/commonTypes_v1}financeChargeType" minOccurs="0"/&gt;
 *         &lt;element name="referenceAccount" type="{http://ifrs.vodafone.com/commonTypes_v1}referenceAccountType" minOccurs="0"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v1}pOBNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leasingComplexType", propOrder = {
    "leasingID",
    "leasingStartDate",
    "leasingEndDate",
    "leasingType",
    "leasedAssetFairValue",
    "financeCharge",
    "referenceAccount",
    "pobName"
})
public class LeasingComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String leasingID;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leasingStartDate;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar leasingEndDate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String leasingType;
    protected BigDecimal leasedAssetFairValue;
    protected BigDecimal financeCharge;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceAccount;
    @XmlElement(name = "pOBName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobName;

    /**
     * Obtiene el valor de la propiedad leasingID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeasingID() {
        return leasingID;
    }

    /**
     * Define el valor de la propiedad leasingID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeasingID(String value) {
        this.leasingID = value;
    }

    /**
     * Obtiene el valor de la propiedad leasingStartDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeasingStartDate() {
        return leasingStartDate;
    }

    /**
     * Define el valor de la propiedad leasingStartDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeasingStartDate(XMLGregorianCalendar value) {
        this.leasingStartDate = value;
    }

    /**
     * Obtiene el valor de la propiedad leasingEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLeasingEndDate() {
        return leasingEndDate;
    }

    /**
     * Define el valor de la propiedad leasingEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLeasingEndDate(XMLGregorianCalendar value) {
        this.leasingEndDate = value;
    }

    /**
     * Obtiene el valor de la propiedad leasingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeasingType() {
        return leasingType;
    }

    /**
     * Define el valor de la propiedad leasingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeasingType(String value) {
        this.leasingType = value;
    }

    /**
     * Obtiene el valor de la propiedad leasedAssetFairValue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLeasedAssetFairValue() {
        return leasedAssetFairValue;
    }

    /**
     * Define el valor de la propiedad leasedAssetFairValue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLeasedAssetFairValue(BigDecimal value) {
        this.leasedAssetFairValue = value;
    }

    /**
     * Obtiene el valor de la propiedad financeCharge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFinanceCharge() {
        return financeCharge;
    }

    /**
     * Define el valor de la propiedad financeCharge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFinanceCharge(BigDecimal value) {
        this.financeCharge = value;
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

    /**
     * Obtiene el valor de la propiedad pobName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBName() {
        return pobName;
    }

    /**
     * Define el valor de la propiedad pobName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBName(String value) {
        this.pobName = value;
    }

}
