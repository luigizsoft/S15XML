//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:48:24 AM CEST 
//


package com.vsf.S15.Brr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fileHeaderComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fileHeaderComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fileSequenceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceEvent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceOpco" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileHeaderComplexType", namespace = "http://ifrs.vodafone.com/commonTypes_v1", propOrder = {
    "fileName",
    "createdAt",
    "fileSequenceID",
    "sourceEvent",
    "sourceOpco"
})
public class FileHeaderComplexType {

    @XmlElement(required = true)
    protected String fileName;
    @XmlElement(required = true)
    protected String createdAt;
    @XmlElement(required = true)
    protected String fileSequenceID;
    @XmlElement(required = true)
    protected String sourceEvent;
    @XmlElement(required = true)
    protected String sourceOpco;

    /**
     * Obtiene el valor de la propiedad fileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Define el valor de la propiedad fileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * Obtiene el valor de la propiedad createdAt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Define el valor de la propiedad createdAt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Obtiene el valor de la propiedad fileSequenceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSequenceID() {
        return fileSequenceID;
    }

    /**
     * Define el valor de la propiedad fileSequenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSequenceID(String value) {
        this.fileSequenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceEvent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceEvent() {
        return sourceEvent;
    }

    /**
     * Define el valor de la propiedad sourceEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceEvent(String value) {
        this.sourceEvent = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceOpco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOpco() {
        return sourceOpco;
    }

    /**
     * Define el valor de la propiedad sourceOpco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOpco(String value) {
        this.sourceOpco = value;
    }

}
