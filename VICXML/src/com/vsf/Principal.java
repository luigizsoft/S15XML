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
	static final int f_StartDate			=13; // Aplica tanto a Dispositivo como a Servicio
	static final int f_EndDate				=14; // Aplica tanto a Dispositivo como a Servicio
	
	
	
	static final String ficheroSalidaXML="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\vicsalida";
	static int NumFichero =0;
	static int NuevoFichero=0;
	
	// Variables de los objetos
	static final Inceptions S15Incept = new Inceptions();
	static final InceptionsComplexType lstInceptions = new InceptionsComplexType(); // Lista de inceptions
	static final InceptionComplexType tdInception = new InceptionComplexType();
	static final ServiceListComplexType vListaServ = new ServiceListComplexType(); // Nueva Lista de servicios
	static final DeviceListComplexType vListaDev = new DeviceListComplexType();// Nueva Lista de servicios


	
	public static void main(String[] args) throws IOException, DatatypeConfigurationException, JAXBException  {
		// TODO Auto-generated method stub
		String Fichero=args[0];
		String linea;
		String[]Campos;
		
		Inceptions S15Incept = new Inceptions();
		InceptionsComplexType lstInceptions = new InceptionsComplexType(); // Lista de inceptions
		InceptionComplexType tdInception = new InceptionComplexType();
		ServiceListComplexType vListaServ = new ServiceListComplexType(); // Nueva Lista de servicios
		DeviceListComplexType vListaDev = new DeviceListComplexType();// Nueva Lista de servicios
		
		// Variable para guardar y detectar el cambio de contrato
		String aContratcID="";
		System.out.println("Comenzando generacion XML...");
		NumLinea=1;

		// Lectura del Fichero
		try {
			BufferedReader reader =	new BufferedReader(new	FileReader(Fichero));
			while((linea = reader.readLine())!=null) {
				Campos = linea.split(";"); // Deconstruyo el registro en campos
				// Compruebo si es la primera linea  o es cambio de contrato
				if (Utiles.PrimeraLinea(NumLinea)){
					NuevoFichero=1; // Es Primera Linea. Se genera un nuevo fichero
					} 
				
				if (NuevoFichero==1){ // Si se decide generar un nuevo fichero
					NumFichero ++; // Incrementamos para saber el numero de ficheros generados
				
				//Nuevo documento
					//lstInceptions=null;
					S15Incept.setHeader(null);
					S15Incept.setData(lstInceptions); // Asociamos la lista de inceptions al documento
					S15Incept.setFooter(null);
				// Nuevo inception
					//tdInception=null;
					lstInceptions.getInception().add(tdInception); // se a�ade el nuevo inception
							tdInception.setServiceList(vListaServ);// A�adimos la lista al inception
							tdInception.setDeviceList(vListaDev);// A�adimos la lista al inception
					
					
				NuevoFichero=0; 
				}
				
				// Informamos los datos de servicios 
				
				ServiceComplexType	Servicio = new ServiceComplexType(); // Creamos un servicio
				Utiles.addServiceAtrib(Servicio, Campos[f_CD_POB],Campos[f_ID_Unico],Campos[f_StartDate],Campos[f_EndDate] ); // Asignamos los valores
				vListaServ.getService().add(Servicio);// Agregamos a la lista de servicios

				
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
