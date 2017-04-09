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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para updateComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventType" type="{http://ifrs.vodafone.com/commonTypes_v1}eventTypeType"/&gt;
 *         &lt;element name="eventDate" type="{http://ifrs.vodafone.com/commonTypes_v1}eventDateType"/&gt;
 *         &lt;element name="eventContractID" type="{http://ifrs.vodafone.com/commonTypes_v1}eventContractIDType"/&gt;
 *         &lt;element name="iFRS15SynonymID" type="{http://ifrs.vodafone.com/commonTypes_v1}iFRS15SynonymIDType" minOccurs="0"/&gt;
 *         &lt;element name="DeviceList" type="{http://ifrs15.vodafone.com/events/update_v1}deviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceList" type="{http://ifrs15.vodafone.com/events/update_v1}serviceListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="MaterialRightsList" type="{http://ifrs15.vodafone.com/events/update_v1}materialRightsListComplexType" minOccurs="0"/&gt;
 *         &lt;element name="MIAttributes" type="{http://ifrs15.vodafone.com/events/update_v1}mIAttributesComplexType" minOccurs="0"/&gt;
 *         &lt;element name="companyCode" type="{http://ifrs.vodafone.com/commonTypes_v1}companyCodeType" minOccurs="0"/&gt;
 *         &lt;element name="lMSpecificMiDimensions" type="{http://ifrs.vodafone.com/commonTypes_v1}lMSpecificMiDimensionsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateComplexType", propOrder = {
    "eventType",
    "eventDate",
    "eventContractID",
    "ifrs15SynonymID",
    "deviceList",
    "serviceList",
    "materialRightsList",
    "miAttributes",
    "companyCode",
    "lmSpecificMiDimensions"
})
public class UpdateComplexType {

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
    @XmlElement(name = "DeviceList")
    protected DeviceListComplexType deviceList;
    @XmlElement(name = "ServiceList")
    protected ServiceListComplexType serviceList;
    @XmlElement(name = "MaterialRightsList")
    protected MaterialRightsListComplexType materialRightsList;
    @XmlElement(name = "MIAttributes")
    protected MIAttributesComplexType miAttributes;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyCode;
    @XmlElement(name = "lMSpecificMiDimensions")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lmSpecificMiDimensions;

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

}
