package com.vsf;

import javax.xml.datatype.DatatypeConfigurationException;

import com.vsf.S15.Inception.DeviceListComplexType;
import com.vsf.S15.Inception.InceptionComplexType;
import com.vsf.S15.Inception.Inceptions;
import com.vsf.S15.Inception.InceptionsComplexType;
import com.vsf.S15.Inception.ServiceListComplexType;

public class NuevoS15Inception extends Inceptions {

	static InceptionsComplexType ListaInceptions=null;
	InceptionComplexType Inception=null;
	ServiceListComplexType ListaServicios=null;
	DeviceListComplexType ListaDispositivos= null;
	
	public NuevoS15Inception() throws DatatypeConfigurationException {

		this.ListaInceptions.getInception().add(Inception);
		this.Inception.setServiceList(ListaServicios);
		this.Inception.setDeviceList(ListaDispositivos);

	}
	

}
