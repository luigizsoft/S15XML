//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:56:42 AM CEST 
//


package com.vsf.S15.SAPResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para sAPRARResponseComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sAPRARResponseComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://ifrs.vodafone.com/commonTypes_v1}eventTypeType"/&gt;
 *         &lt;element name="eventDate" type="{http://ifrs.vodafone.com/commonTypes_v1}eventDateType"/&gt;
 *         &lt;element name="eventContractID" type="{http://ifrs.vodafone.com/commonTypes_v1}eventContractIDType"/&gt;
 *         &lt;element name="iFRS15SynonymID" type="{http://ifrs.vodafone.com/commonTypes_v1}iFRS15SynonymIDType" minOccurs="0"/&gt;
 *         &lt;element name="iFRS15SAPRARContractID" type="{http://ifrs.vodafone.com/commonTypes_v1}iFRS15SAPRARContractIDType"/&gt;
 *         &lt;element name="ServiceList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}serviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}deviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="MaterialRightList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}materialRightsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="RebateList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}rebatesListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FundList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}fundsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="LeasingList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}leasingListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="FeeList" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}feeListComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sAPRARResponseComplexType", propOrder = {
    "eventType",
    "eventDate",
    "eventContractID",
    "ifrs15SynonymID",
    "ifrs15SAPRARContractID",
    "serviceList",
    "deviceList",
    "materialRightList",
    "rebateList",
    "fundList",
    "leasingList",
    "feeList"
})
public class SAPRARResponseComplexType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eventType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eventContractID;
    @XmlElement(name = "iFRS15SynonymID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ifrs15SynonymID;
    @XmlElement(name = "iFRS15SAPRARContractID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ifrs15SAPRARContractID;
    @XmlElement(name = "ServiceList")
    protected ServiceListComplexType serviceList;
    @XmlElement(name = "DeviceList")
    protected DeviceListComplexType deviceList;
    @XmlElement(name = "MaterialRightList")
    protected MaterialRightsListComplexType materialRightList;
    @XmlElement(name = "RebateList")
    protected RebatesListComplexType rebateList;
    @XmlElement(name = "FundList")
    protected FundsListComplexType fundList;
    @XmlElement(name = "LeasingList")
    protected LeasingListComplexType leasingList;
    @XmlElement(name = "FeeList")
    protected FeeListComplexType feeList;

    /**
     * Obtiene el valor de la propiedad eventType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Define el valor de la propiedad eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Obtiene el valor de la propiedad eventDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Define el valor de la propiedad eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Obtiene el valor de la propiedad eventContractID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventContractID() {
        return eventContractID;
    }

    /**
     * Define el valor de la propiedad eventContractID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventContractID(String value) {
        this.eventContractID = value;
    }

    /**
     * Obtiene el valor de la propiedad ifrs15SynonymID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFRS15SynonymID() {
        return ifrs15SynonymID;
    }

    /**
     * Define el valor de la propiedad ifrs15SynonymID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFRS15SynonymID(String value) {
        this.ifrs15SynonymID = value;
    }

    /**
     * Obtiene el valor de la propiedad ifrs15SAPRARContractID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFRS15SAPRARContractID() {
        return ifrs15SAPRARContractID;
    }

    /**
     * Define el valor de la propiedad ifrs15SAPRARContractID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFRS15SAPRARContractID(String value) {
        this.ifrs15SAPRARContractID = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceList.
     * 
     * @return
     *     possible object is
     *     {@link ServiceListComplexType }
     *     
     */
    public ServiceListComplexType getServiceList() {
        return serviceList;
    }

    /**
     * Define el valor de la propiedad serviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceListComplexType }
     *     
     */
    public void setServiceList(ServiceListComplexType value) {
        this.serviceList = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceList.
     * 
     * @return
     *     possible object is
     *     {@link DeviceListComplexType }
     *     
     */
    public DeviceListComplexType getDeviceList() {
        return deviceList;
    }

    /**
     * Define el valor de la propiedad deviceList.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceListComplexType }
     *     
     */
    public void setDeviceList(DeviceListComplexType value) {
        this.deviceList = value;
    }

    /**
     * Obtiene el valor de la propiedad materialRightList.
     * 
     * @return
     *     possible object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public MaterialRightsListComplexType getMaterialRightList() {
        return materialRightList;
    }

    /**
     * Define el valor de la propiedad materialRightList.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public void setMaterialRightList(MaterialRightsListComplexType value) {
        this.materialRightList = value;
    }

    /**
     * Obtiene el valor de la propiedad rebateList.
     * 
     * @return
     *     possible object is
     *     {@link RebatesListComplexType }
     *     
     */
    public RebatesListComplexType getRebateList() {
        return rebateList;
    }

    /**
     * Define el valor de la propiedad rebateList.
     * 
     * @param value
     *     allowed object is
     *     {@link RebatesListComplexType }
     *     
     */
    public void setRebateList(RebatesListComplexType value) {
        this.rebateList = value;
    }

    /**
     * Obtiene el valor de la propiedad fundList.
     * 
     * @return
     *     possible object is
     *     {@link FundsListComplexType }
     *     
     */
    public FundsListComplexType getFundList() {
        return fundList;
    }

    /**
     * Define el valor de la propiedad fundList.
     * 
     * @param value
     *     allowed object is
     *     {@link FundsListComplexType }
     *     
     */
    public void setFundList(FundsListComplexType value) {
        this.fundList = value;
    }

    /**
     * Obtiene el valor de la propiedad leasingList.
     * 
     * @return
     *     possible object is
     *     {@link LeasingListComplexType }
     *     
     */
    public LeasingListComplexType getLeasingList() {
        return leasingList;
    }

    /**
     * Define el valor de la propiedad leasingList.
     * 
     * @param value
     *     allowed object is
     *     {@link LeasingListComplexType }
     *     
     */
    public void setLeasingList(LeasingListComplexType value) {
        this.leasingList = value;
    }

    /**
     * Obtiene el valor de la propiedad feeList.
     * 
     * @return
     *     possible object is
     *     {@link FeeListComplexType }
     *     
     */
    public FeeListComplexType getFeeList() {
        return feeList;
    }

    /**
     * Define el valor de la propiedad feeList.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeListComplexType }
     *     
     */
    public void setFeeList(FeeListComplexType value) {
        this.feeList = value;
    }

}
