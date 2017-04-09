//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 06:27:05 PM CEST 
//


package com.vsf.S15.termination;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Header" type="{http://ifrs.vodafone.com/commonTypes_v1}fileHeaderComplexType"/&gt;
 *         &lt;element name="Data" type="{http://ifrs15.vodafone.com/events/termination_v1}termiantionsComplexType"/&gt;
 *         &lt;element name="Footer" type="{http://ifrs.vodafone.com/commonTypes_v1}fileFooterComplexType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "data",
    "footer"
})
@XmlRootElement(name = "Terminations")
public class Terminations {

    @XmlElement(name = "Header", required = true)
    protected FileHeaderComplexType header;
    @XmlElement(name = "Data", required = true)
    protected TermiantionsComplexType data;
    @XmlElement(name = "Footer", required = true)
    protected FileFooterComplexType footer;

    /**
     * Obtiene el valor de la propiedad header.
     * 
     * @return
     *     possible object is
     *     {@link FileHeaderComplexType }
     *     
     */
    public FileHeaderComplexType getHeader() {
        return header;
    }

    /**
     * Define el valor de la propiedad header.
     * 
     * @param value
     *     allowed object is
     *     {@link FileHeaderComplexType }
     *     
     */
    public void setHeader(FileHeaderComplexType value) {
        this.header = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link TermiantionsComplexType }
     *     
     */
    public TermiantionsComplexType getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link TermiantionsComplexType }
     *     
     */
    public void setData(TermiantionsComplexType value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad footer.
     * 
     * @return
     *     possible object is
     *     {@link FileFooterComplexType }
     *     
     */
    public FileFooterComplexType getFooter() {
        return footer;
    }

    /**
     * Define el valor de la propiedad footer.
     * 
     * @param value
     *     allowed object is
     *     {@link FileFooterComplexType }
     *     
     */
    public void setFooter(FileFooterComplexType value) {
        this.footer = value;
    }

}
