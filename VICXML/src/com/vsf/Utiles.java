package com.vsf;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import com.vsf.S15.Inception.InceptionComplexType;
import com.vsf.S15.Inception.Inceptions;
import com.vsf.S15.Inception.InceptionsComplexType;
import com.vsf.S15.Inception.ObjectFactory;
import com.vsf.S15.Inception.ServiceComplexType;
import com.vsf.S15.Inception.ServiceListComplexType;

public class Utiles {

	
	public static boolean PrimeraLinea (int NumLinea){
		if (NumLinea==1){
				return true;
			}else {
				return false;
			}
	}
	
	
	// Devuelve la fecha de text como tipo XMLGregorianCalendar
	public static XMLGregorianCalendar FechaXML(String FechaTxt) throws DatatypeConfigurationException{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		Date Fecha = null ;
		try {
			Fecha=dateFormat.parse(FechaTxt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(Fecha);
		XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		return date2;
	}
	
	
	// Comprueba si es un servicio o un dispositivo
	public static boolean EsServicio(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("S")){
			return true;
		} else{
		return false;
		}
	}
	// Comprueba si es un servicio o un dispositivo
	public static boolean EsDispositivo(String Contenido){
		String auxContenido=Contenido.trim();
		if (auxContenido.equals("D")){
			return true;
		} else{
		return false;
		}
	}

	
	
	public static void Genera ( Inceptions s15Inceptions, String ficheroSalidaXML, int numfichero) throws JAXBException{
		
		String sufijofileXML=String.valueOf(numfichero);
		String XMLFile=ficheroSalidaXML+"_"+sufijofileXML+".xml";
		File ficheroXML= new File(XMLFile);
		JAXBContext contexto = JAXBContext.newInstance(s15Inceptions.getClass() );
      Marshaller marshaller = contexto.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
          Boolean.TRUE);
      marshaller.marshal(s15Inceptions,ficheroXML);	
	}
	
	public static boolean CambioContrato(String ContractA, String ContractB){
		if (ContractA.trim().equals(ContractB.trim()))
		{
			return true;
		} else {
			return false;
		}
	}

	public static  InceptionComplexType NuevoInception(InceptionComplexType ObjInception,
													String eventType, 
													String eventDate, 
													String eventContractID,
													String companyCode) throws DatatypeConfigurationException{
		ObjInception.setEventType(eventType);
		ObjInception.setEventDate(Utiles.FechaXML(eventDate));
		ObjInception.setEventContractID(eventContractID);
		ObjInception.setCompanyCode(companyCode);
		
		return ObjInception;
		
	}

	

	//public static void addServiceAtrib(ServiceComplexType Servicio, String Linea){
	//	Servicio.setServiceCode(Linea[f_CD_POB]);


	//}
	
	
	
	
	
	
	
	
	
	
	
}
