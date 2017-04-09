//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:51:44 AM CEST 
//


package com.vsf.S15.fulfillment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para fulfilmentComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fulfilmentComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://ifrs.vodafone.com/commonTypes_v1}eventTypeType"/&gt;
 *         &lt;element name="eventDate" type="{http://ifrs.vodafone.com/commonTypes_v1}eventDateType"/&gt;
 *         &lt;element name="eventContractID" type="{http://ifrs.vodafone.com/commonTypes_v1}eventContractIDType"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="deliveryNumber" type="{http://ifrs.vodafone.com/commonTypes_v1}deliveryNumberType"/&gt;
 *         &lt;element name="DeviceList" type="{http://ifrs15.vodafone.com/events/fulfilment_v1}deviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceList" type="{http://ifrs15.vodafone.com/events/fulfilment_v1}serviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="MaterialRightsList" type="{http://ifrs15.vodafone.com/events/fulfilment_v1}materialRightsListComplexType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fulfilmentComplexType", propOrder = {
    "eventType",
    "eventDate",
    "eventContractID",
    "companyCode",
    "deliveryNumber",
    "deviceList",
    "serviceList",
    "materialRightsList"
})
public class FulfilmentComplexType {

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
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryNumber;
    @XmlElement(name = "DeviceList")
    protected DeviceListComplexType deviceList;
    @XmlElement(name = "ServiceList")
    protected ServiceListComplexType serviceList;
    @XmlElement(name = "MaterialRightsList")
    protected MaterialRightsListComplexType materialRightsList;

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
     * Obtiene el valor de la propiedad deliveryNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    /**
     * Define el valor de la propiedad deliveryNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryNumber(String value) {
        this.deliveryNumber = value;
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
     * Obtiene el valor de la propiedad materialRightsList.
     * 
     * @return
     *     possible object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public MaterialRightsListComplexType getMaterialRightsList() {
        return materialRightsList;
    }

    /**
     * Define el valor de la propiedad materialRightsList.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialRightsListComplexType }
     *     
     */
    public void setMaterialRightsList(MaterialRightsListComplexType value) {
        this.materialRightsList = value;
    }

}
