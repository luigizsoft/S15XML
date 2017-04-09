//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:56:42 AM CEST 
//


package com.vsf.S15.SAPResponse;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para postedRevenueComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="postedRevenueComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amountLC" type="{http://ifrs.vodafone.com/commonTypes_v1}amountLCType"/&gt;
 *         &lt;element name="currencyLC" type="{http://ifrs.vodafone.com/commonTypes_v1}currencyLCType"/&gt;
 *         &lt;element name="amountGC" type="{http://ifrs.vodafone.com/commonTypes_v1}amountGCType"/&gt;
 *         &lt;element name="currencyGC" type="{http://ifrs.vodafone.com/commonTypes_v1}currencyGCType"/&gt;
 *         &lt;element name="period" type="{http://ifrs.vodafone.com/commonTypes_v1}periodType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "postedRevenueComplexType", propOrder = {
    "amountLC",
    "currencyLC",
    "amountGC",
    "currencyGC",
    "period"
})
public class PostedRevenueComplexType {

    @XmlElement(required = true)
    protected BigDecimal amountLC;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyLC;
    @XmlElement(required = true)
    protected BigDecimal amountGC;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyGC;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String period;

    /**
     * Obtiene el valor de la propiedad amountLC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountLC() {
        return amountLC;
    }

    /**
     * Define el valor de la propiedad amountLC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountLC(BigDecimal value) {
        this.amountLC = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyLC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyLC() {
        return currencyLC;
    }

    /**
     * Define el valor de la propiedad currencyLC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyLC(String value) {
        this.currencyLC = value;
    }

    /**
     * Obtiene el valor de la propiedad amountGC.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountGC() {
        return amountGC;
    }

    /**
     * Define el valor de la propiedad amountGC.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountGC(BigDecimal value) {
        this.amountGC = value;
    }

    /**
     * Obtiene el valor de la propiedad currencyGC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyGC() {
        return currencyGC;
    }

    /**
     * Define el valor de la propiedad currencyGC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyGC(String value) {
        this.currencyGC = value;
    }

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

}
