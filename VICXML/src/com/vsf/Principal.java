package com.vsf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
//import java.util.Vector;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.vsf.S15.Inception.DeviceComplexType;
import com.vsf.S15.Inception.DeviceListComplexType;
import com.vsf.S15.Inception.InceptionComplexType;
import com.vsf.S15.Inception.Inceptions;
import com.vsf.S15.Inception.InceptionsComplexType;
import com.vsf.S15.Inception.ServiceComplexType;
import com.vsf.S15.Inception.ServiceListComplexType;
import com.vsf.*;


public class Principal {

	 static int NumLinea=0;
// Indices de los campos al deconstruir la linea del fichero
	// Para el evento
	static final int f_eventType			=0;
	static final int f_eventDate			=1;
//	static final int f_APID_Contract		=2;
	static final int f_eventContractID		=2;
	static final int f_companyCode			=3;
	static final int f_contractStartDate	=4;
	static final int f_contractEndDate		=5;
	static final int f_firstPlanBillingDate	=6;
	static final int f_billingType			=7;
	// Para el array de Servicios o Dispositivos
	static final int f_TipoElemento			=9; //Determina si es un Dispositivo (D) o un Servicio (S)
	static final int f_CD_POB				=11;
	static final int f_ID_Unico				=12; // El que corresponda al dispositivo o al servicio
	static final int f_StartDate			=13; // Fecha inicio Servicio / Transfer Date Dispositivo
	static final int f_EndDate				=14; // Fecha fin Servicio / null Dispositivo
		
	static final String ficheroSalidaXML="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\vicsalida";
	static int NumFichero =0;
	static int NuevoFichero=0;
	static int NuevoContrato=0;
	
	public static void main(String[] args) throws IOException, DatatypeConfigurationException, JAXBException, InstantiationException, IllegalAccessException  {
		// TODO Auto-generated method stub
		String Fichero=args[0];
		String linea;
		String[]Campos;
		
		// Inicializamos objetos
		Inceptions S15Incept = new Inceptions();
		InceptionsComplexType lstInceptions = new InceptionsComplexType(); // Lista de inceptions
		InceptionComplexType tdInception = new InceptionComplexType();
		ServiceListComplexType vListaServ = new ServiceListComplexType(); // Nueva Lista de servicios
		DeviceListComplexType vListaDev = new DeviceListComplexType();// Nueva Lista de servicios
		
		// Variable para guardar y detectar el cambio de contrato
		String aContratcID="";
		System.out.println("Comenzando generacion XML...");
		NumLinea=1;
		NuevoFichero=1;
		// Lectura del Fichero
		try {
			BufferedReader reader =	new BufferedReader(new	FileReader(Fichero));
			while((linea = reader.readLine())!=null) {
				Campos = linea.split(";"); // Deconstruyo el registro en campos
				// Compruebo si es la primera linea 
				//if (Utiles.PrimeraLinea(NumLinea)){
				//	NuevoFichero=1; // Es Primera Linea. Se genera un nuevo fichero
				//	} 
				
				if (NuevoFichero==1){ // Si se decide generar un nuevo fichero
					NumFichero ++; // Incrementamos para saber el numero de ficheros generados
					tdInception=new InceptionComplexType();
					lstInceptions.getInception().add(tdInception);
					S15Incept.setData(lstInceptions);
					vListaServ = new ServiceListComplexType();
					tdInception.setServiceList(vListaServ);// Añadimos la lista al inception
					tdInception.setDeviceList(vListaDev);// Añadimos la lista al inception
					tdInception.setEventContractID(Campos[f_eventContractID]);
					
				NuevoFichero=0; 
				} else{
				
				// Deteccion de cambios de contrato, cuando no sea nuevo fichero que ya va implicito
				if (!aContratcID.equals(Campos[f_eventContractID].trim())) {
					NuevoContrato=1;
					tdInception=new InceptionComplexType();
					lstInceptions.getInception().add(tdInception);
					S15Incept.setData(lstInceptions);
					vListaServ = new ServiceListComplexType();
					tdInception.setServiceList(vListaServ);// Añadimos la lista al inception
					tdInception.setDeviceList(vListaDev);// Añadimos la lista al inception
					tdInception.setEventContractID(Campos[f_eventContractID]);

					
				} else {NuevoContrato=0;}
				}
				aContratcID=Campos[f_eventContractID].trim();
		
				if (0==0){
				// Identificamos si es Servicio o Dispositivo
				if (Utiles.EsServicio(Campos[f_TipoElemento])){
					// Informamos los datos de servicios 
					ServiceComplexType	Servicio = new ServiceComplexType(); // Creamos un servicio
					Utiles.addServiceAtrib(Servicio, Campos[f_CD_POB],Campos[f_ID_Unico],Campos[f_StartDate],Campos[f_EndDate] ); // Asignamos los valores
					vListaServ.getService().add(Servicio);// Agregamos a la lista de servicios
				} else if (Utiles.EsDispositivo(Campos[f_TipoElemento])){
						// Informamos los datos de dispositivos 
						DeviceComplexType	Device = new DeviceComplexType(); // Creamos un servicio
						Utiles.addDeviceAtrib(Device, Campos[f_CD_POB],Campos[f_ID_Unico],Campos[f_StartDate],Campos[f_EndDate] ); // Asignamos los valores
						vListaDev.getDevice().add(Device);// Agregamos a la lista de servicios
				} else {
						System.out.println("Can't find element type (Service/Device)");
				}
				}	
				
				NumLinea ++;

			} // Fin lectura lineas fichero
			
			reader.close();
			
			Utiles.Genera(S15Incept, ficheroSalidaXML, NumFichero);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Finalizada extraccion !!!!");	
	
	}
	
	

}
