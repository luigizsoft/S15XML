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
 * <p>Clase Java para rebateComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rebateComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rebateID" type="{http://ifrs.vodafone.com/commonTypes_v1}rebateIDType"/&gt;
 *         &lt;element name="rebateAmount" type="{http://ifrs.vodafone.com/commonTypes_v1}rebateAmountType" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="billDate" type="{http://ifrs.vodafone.com/commonTypes_v1}billDateType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rebateComplexType", propOrder = {
    "rebateID",
    "rebateAmount",
    "companyCode",
    "billDate"
})
public class RebateComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String rebateID;
    protected BigDecimal rebateAmount;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billDate;

    /**
     * Obtiene el valor de la propiedad rebateID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRebateID() {
        return rebateID;
    }

    /**
     * Define el valor de la propiedad rebateID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRebateID(String value) {
        this.rebateID = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateAmount.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRebateAmount() {
        return rebateAmount;
    }

    /**
     * Define el valor de la propiedad rebateAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRebateAmount(BigDecimal value) {
        this.rebateAmount = value;
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

}
