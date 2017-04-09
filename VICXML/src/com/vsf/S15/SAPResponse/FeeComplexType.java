//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:56:42 AM CEST 
//


package com.vsf.S15.SAPResponse;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para feeComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="feeComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feeID" type="{http://ifrs.vodafone.com/commonTypes_v1}feeIDType"/&gt;
 *         &lt;element name="sAPRARFeeID" type="{http://ifrs.vodafone.com/commonTypes_v1}sAPRARFeeIDType"/&gt;
 *         &lt;element name="pOBType" type="{http://ifrs.vodafone.com/commonTypes_v1}pOBTypeType"/&gt;
 *         &lt;element name="pOBName" type="{http://ifrs.vodafone.com/commonTypes_v1}pOBNameType"/&gt;
 *         &lt;element name="effectiveQuantity" type="{http://ifrs.vodafone.com/commonTypes_v1}effectiveQuantityType"/&gt;
 *         &lt;element name="fulfilmentQuantity" type="{http://ifrs.vodafone.com/commonTypes_v1}fulfilmentQuantityType"/&gt;
 *         &lt;element name="PlannedInvoiceList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}plannedInvoiceListComplexType"/&gt;
 *         &lt;element name="PlannedRevenueList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}plannedRevenueListComplexType"/&gt;
 *         &lt;element name="PostedRevenueList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}postedRevenueListComplexType"/&gt;
 *         &lt;element name="InvoicedAmountList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}invoicedAmountListComplexType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feeComplexType", propOrder = {
    "feeID",
    "saprarFeeID",
    "pobType",
    "pobName",
    "effectiveQuantity",
    "fulfilmentQuantity",
    "plannedInvoiceList",
    "plannedRevenueList",
    "postedRevenueList",
    "invoicedAmountList",
    "companyCode"
})
public class FeeComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String feeID;
    @XmlElement(name = "sAPRARFeeID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String saprarFeeID;
    @XmlElement(name = "pOBType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobType;
    @XmlElement(name = "pOBName", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pobName;
    @XmlElement(required = true)
    protected BigInteger effectiveQuantity;
    @XmlElement(required = true)
    protected BigInteger fulfilmentQuantity;
    @XmlElement(name = "PlannedInvoiceList", required = true)
    protected PlannedInvoiceListComplexType plannedInvoiceList;
    @XmlElement(name = "PlannedRevenueList", required = true)
    protected PlannedRevenueListComplexType plannedRevenueList;
    @XmlElement(name = "PostedRevenueList", required = true)
    protected PostedRevenueListComplexType postedRevenueList;
    @XmlElement(name = "InvoicedAmountList", required = true)
    protected InvoicedAmountListComplexType invoicedAmountList;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;

    /**
     * Obtiene el valor de la propiedad feeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeID() {
        return feeID;
    }

    /**
     * Define el valor de la propiedad feeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeID(String value) {
        this.feeID = value;
    }

    /**
     * Obtiene el valor de la propiedad saprarFeeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPRARFeeID() {
        return saprarFeeID;
    }

    /**
     * Define el valor de la propiedad saprarFeeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPRARFeeID(String value) {
        this.saprarFeeID = value;
    }

    /**
     * Obtiene el valor de la propiedad pobType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBType() {
        return pobType;
    }

    /**
     * Define el valor de la propiedad pobType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBType(String value) {
        this.pobType = value;
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

    /**
     * Obtiene el valor de la propiedad effectiveQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEffectiveQuantity() {
        return effectiveQuantity;
    }

    /**
     * Define el valor de la propiedad effectiveQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEffectiveQuantity(BigInteger value) {
        this.effectiveQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad fulfilmentQuantity.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFulfilmentQuantity() {
        return fulfilmentQuantity;
    }

    /**
     * Define el valor de la propiedad fulfilmentQuantity.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFulfilmentQuantity(BigInteger value) {
        this.fulfilmentQuantity = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedInvoiceList.
     * 
     * @return
     *     possible object is
     *     {@link PlannedInvoiceListComplexType }
     *     
     */
    public PlannedInvoiceListComplexType getPlannedInvoiceList() {
        return plannedInvoiceList;
    }

    /**
     * Define el valor de la propiedad plannedInvoiceList.
     * 
     * @param value
     *     allowed object is
     *     {@link PlannedInvoiceListComplexType }
     *     
     */
    public void setPlannedInvoiceList(PlannedInvoiceListComplexType value) {
        this.plannedInvoiceList = value;
    }

    /**
     * Obtiene el valor de la propiedad plannedRevenueList.
     * 
     * @return
     *     possible object is
     *     {@link PlannedRevenueListComplexType }
     *     
     */
    public PlannedRevenueListComplexType getPlannedRevenueList() {
        return plannedRevenueList;
    }

    /**
     * Define el valor de la propiedad plannedRevenueList.
     * 
     * @param value
     *     allowed object is
     *     {@link PlannedRevenueListComplexType }
     *     
     */
    public void setPlannedRevenueList(PlannedRevenueListComplexType value) {
        this.plannedRevenueList = value;
    }

    /**
     * Obtiene el valor de la propiedad postedRevenueList.
     * 
     * @return
     *     possible object is
     *     {@link PostedRevenueListComplexType }
     *     
     */
    public PostedRevenueListComplexType getPostedRevenueList() {
        return postedRevenueList;
    }

    /**
     * Define el valor de la propiedad postedRevenueList.
     * 
     * @param value
     *     allowed object is
     *     {@link PostedRevenueListComplexType }
     *     
     */
    public void setPostedRevenueList(PostedRevenueListComplexType value) {
        this.postedRevenueList = value;
    }

    /**
     * Obtiene el valor de la propiedad invoicedAmountList.
     * 
     * @return
     *     possible object is
     *     {@link InvoicedAmountListComplexType }
     *     
     */
    public InvoicedAmountListComplexType getInvoicedAmountList() {
        return invoicedAmountList;
    }

    /**
     * Define el valor de la propiedad invoicedAmountList.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoicedAmountListComplexType }
     *     
     */
    public void setInvoicedAmountList(InvoicedAmountListComplexType value) {
        this.invoicedAmountList = value;
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

}
