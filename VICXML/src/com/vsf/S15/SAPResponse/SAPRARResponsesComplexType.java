//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:56:42 AM CEST 
//


package com.vsf.S15.SAPResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sAPRARResponsesComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sAPRARResponsesComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SAPRARResponse" type="{http://ifrs15.vodafone.com/events/saprarresponse_v1}sAPRARResponseComplexType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sAPRARResponsesComplexType", propOrder = {
    "saprarResponse"
})
public class SAPRARResponsesComplexType {

    @XmlElement(name = "SAPRARResponse", required = true)
    protected List<SAPRARResponseComplexType> saprarResponse;

    /**
     * Gets the value of the saprarResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saprarResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSAPRARResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SAPRARResponseComplexType }
     * 
     * 
     */
    public List<SAPRARResponseComplexType> getSAPRARResponse() {
        if (saprarResponse == null) {
            saprarResponse = new ArrayList<SAPRARResponseComplexType>();
        }
        return this.saprarResponse;
    }

}
