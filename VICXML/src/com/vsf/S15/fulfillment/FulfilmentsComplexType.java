//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:51:44 AM CEST 
//


package com.vsf.S15.fulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fulfilmentsComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fulfilmentsComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fulfilment" type="{http://ifrs15.vodafone.com/events/fulfilment_v1}fulfilmentComplexType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fulfilmentsComplexType", propOrder = {
    "fulfilment"
})
public class FulfilmentsComplexType {

    @XmlElement(name = "Fulfilment", required = true)
    protected List<FulfilmentComplexType> fulfilment;

    /**
     * Gets the value of the fulfilment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fulfilment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFulfilment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FulfilmentComplexType }
     * 
     * 
     */
    public List<FulfilmentComplexType> getFulfilment() {
        if (fulfilment == null) {
            fulfilment = new ArrayList<FulfilmentComplexType>();
        }
        return this.fulfilment;
    }

}
