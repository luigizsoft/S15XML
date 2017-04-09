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
	
	public static void main(String[] args) throws IOException, DatatypeConfigurationException, JAXBException  {
		// TODO Auto-generated method stub
		System.out.println("Prueba");
		String Fichero=args[0];
		String linea;
		String[]Campos;
		
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
				if (Utiles.PrimeraLinea(NumLinea)||Utiles.CambioContrato(aContratcID, Campos[f_eventContractID]))	{
					if (Utiles.PrimeraLinea(NumLinea)){
						NuevoFichero=1; // Es Primera Linea. Se genera nuevo Inception de tipo tdInception
						// Creamos nuevo objeto Inceptions
						
					//	NuevoS15Inception S15Inception = new NuevoS15Inception();
						
												Inceptions S15Inceptions = new Inceptions(); // Clase principal (raiz) que sera exportada a XML
						InceptionsComplexType ListaInceptions=null;  // Subclase (Lista) de inception ya que puede haber varios
							InceptionComplexType Inception = null; // Tipo Inception individual
								ServiceListComplexType ListaServicios = null; // Lista de Servicios
								DeviceListComplexType ListaDispositivos = null;// Lista de Dispositivos	
								
						// Construimos objeto Inceptions (Documento)
						InceptionComplexType unInception= new NuevoInception(Inception, Campos[f_eventType], Campos[f_eventDate], Campos[f_eventContractID], Campos[f_companyCode]);
		System.out.println("Prueba");
								
								
					} else {
						// No es la primera linea pero es un contrato nuevo
						
					}
					
				} else {
			// No es la primera linea ni contrato nuevo
					
			
					
					
					
				}
				
				NumLinea ++;

			} // Fin lectura lineas fichero
			
			reader.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Finalizada extraccion !!!!");	
	
	}

}
