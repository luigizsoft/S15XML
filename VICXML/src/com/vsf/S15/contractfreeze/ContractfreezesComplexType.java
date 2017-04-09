//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.02 a las 12:50:46 AM CEST 
//


package com.vsf.S15.contractfreeze;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para contractfreezesComplexType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="contractfreezesComplexType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractFreeze" type="{http://ifrs15.vodafone.com/events/contractfreeze_v1}contractFreezeComplexType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contractfreezesComplexType", propOrder = {
    "contractFreeze"
})
public class ContractfreezesComplexType {

    @XmlElement(name = "ContractFreeze", required = true)
    protected List<ContractFreezeComplexType> contractFreeze;

    /**
     * Gets the value of the contractFreeze property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractFreeze property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractFreeze().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractFreezeComplexType }
     * 
     * 
     */
    public List<ContractFreezeComplexType> getContractFreeze() {
        if (contractFreeze == null) {
            contractFreeze = new ArrayList<ContractFreezeComplexType>();
        }
        return this.contractFreeze;
    }

}
