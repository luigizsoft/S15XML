package com.vsf;

import javax.xml.datatype.DatatypeConfigurationException;

import com.vsf.S15.Inception.InceptionComplexType;

public class NuevoInception extends InceptionComplexType {

	public NuevoInception(InceptionComplexType tdInception, String eventType, String eventDate, String eventContractID,
			String companyCode) throws DatatypeConfigurationException {

		this.setEventType(eventType);
		this.setEventDate(Utiles.FechaXML(eventDate));
		this.setEventContractID(eventContractID);
		this.setCompanyCode(companyCode);
		

	
	}

}
