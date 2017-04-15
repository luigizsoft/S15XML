package com.vsf;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Currency;
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

import com.vsf.S15.Inception.CurrencyType;
import com.vsf.S15.Inception.DeviceComplexType;
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
		DateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
		Date Fecha = null ;
		// Temporal
		if (FechaTxt.equals("")){
			FechaTxt="17540303";
		}
		//
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
	
	public static BigDecimal DecimalXML(String ImporteTxt){
	// Temporal
		if (ImporteTxt.equals("")){
			ImporteTxt="0";
		}
	//
		BigDecimal Importe = new BigDecimal(ImporteTxt);
		return Importe;
	}

	public static BigInteger IntXML(String ImporteTxt){
		BigInteger Valor = new BigInteger(ImporteTxt);
		return Valor;
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

	public static  InceptionComplexType NuevoInception(InceptionComplexType ObjInception) throws DatatypeConfigurationException{
		
		return ObjInception;
		
	}
//	public static  InceptionComplexType NuevoInception(InceptionComplexType ObjInception,
//			String eventType, 
//			String eventDate, 
//			String eventContractID,
//			String companyCode) throws DatatypeConfigurationException{
//ObjInception.setEventType(eventType);
//ObjInception.setEventDate(Utiles.FechaXML(eventDate));
//ObjInception.setEventContractID(eventContractID);
//ObjInception.setCompanyCode(companyCode);

//return ObjInception;

//}

	
	public static void addContractAtrib(InceptionComplexType Contrato, 
			String f_eventType, String f_eventDate, String f_eventContractID, 
			String f_eventSynonimId, String f_companyCode, String f_contractStartDate, 
			String f_contractEndDate, String f_contractTimeUnit, String f_firstPlanBillingDate, 
			String f_catchUpIndicator, String f_billingType, String f_averageDiscountFactor,
			String f_currency ) throws DatatypeConfigurationException{

		Contrato.setEventType(f_eventType);
		Contrato.setEventDate(FechaXML(f_eventDate));
		Contrato.setEventContractID(f_eventContractID);
		Contrato.setIFRS15SynonymID(f_eventSynonimId);
		Contrato.setCompanyCode(f_companyCode);
		Contrato.setContractStartDate(FechaXML(f_contractStartDate));
		Contrato.setContractEndDate(FechaXML(f_contractEndDate));
		Contrato.setContractTimeUnit(f_contractTimeUnit);
		Contrato.setFirstPlanBillingDate(FechaXML(f_firstPlanBillingDate));
		Contrato.setCatchUpIndicator(f_catchUpIndicator);
		Contrato.setBillingType(f_billingType);
		Contrato.setAverageDiscountFactor(DecimalXML(f_averageDiscountFactor));
		Contrato.setCurrency(CurrencyType.fromValue(f_currency));
		
	}

	public static void addServiceAtrib(ServiceComplexType Servicio, 
			String f_POB_CD_POB, String f_POB_ID_Unico, 
			String f_POB_serviceTimeUnit,
			String f_POB_activatedServices,
			String f_POB_transferDate,
			String f_POB_StartDate,
			String f_POB_EndDate) throws DatatypeConfigurationException{
		
		Servicio.setServiceCode(f_POB_CD_POB);
		Servicio.setServiceID(f_POB_ID_Unico);
		Servicio.setServiceTimeUnit(f_POB_serviceTimeUnit);
		Servicio.setActivatedServices(IntXML(f_POB_activatedServices));
		Servicio.setServiceTransferDate(FechaXML(f_POB_transferDate));
		Servicio.setServiceStartDate(FechaXML(f_POB_StartDate));
		Servicio.setServiceEndDate(FechaXML(f_POB_EndDate));


	}

	public static void addDeviceAtrib(DeviceComplexType Device, 
			String f_POB_CD_POB, String f_POB_ID_Unico, 
			String f_POB_serviceTimeUnit,
			String f_POB_activatedServices,
			String f_POB_transferDate,
			String f_POB_StartDate,
			String f_POB_EndDate) throws DatatypeConfigurationException{
		
		
		Device.setDeviceCode(f_POB_CD_POB);
		Device.setDeviceID(f_POB_ID_Unico);
		Device.setDeviceTransferDate(FechaXML(f_POB_transferDate));
		Device.setDeviceStartDate(FechaXML(f_POB_StartDate));
		Device.setDeviceEndDate(FechaXML(f_POB_EndDate));


	}
//	public static void addDeviceAtrib(DeviceComplexType Device, String s_CD_POB, String s_ID_Unico, String s_StartDate, String s_EndDate) throws DatatypeConfigurationException{
		
//		Device.setDeviceCode(s_CD_POB);
//		Device.setDeviceID(s_ID_Unico);
//		Device.setDeviceTransferDate(FechaXML(s_StartDate));
		


	//}




	
	
	
	
	
	
	
	
	
	
}
