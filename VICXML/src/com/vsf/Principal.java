package com.vsf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
//import java.util.Vector;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.vsf.S15.Inception.DeviceBillingProfileComplexType;
import com.vsf.S15.Inception.DeviceComplexType;
import com.vsf.S15.Inception.DeviceListComplexType;
import com.vsf.S15.Inception.InceptionComplexType;
import com.vsf.S15.Inception.Inceptions;
import com.vsf.S15.Inception.InceptionsComplexType;
import com.vsf.S15.Inception.MIAttributesComplexType;
import com.vsf.S15.Inception.ServiceBillingProfileComplexType;
import com.vsf.S15.Inception.ServiceComplexType;
import com.vsf.S15.Inception.ServiceListComplexType;
import com.vsf.*;

public class Principal {

	static int NumLinea=0;
// Indices de los campos al deconstruir la linea del fichero
	// Para el evento/Contrato
	static final int f_eventType			=0;
	static final int f_eventDate			=1;
	static final int f_eventContractID		=2;
	static final int f_eventSynonimId		=3;
	static final int f_companyCode			=4;
	static final int f_contractStartDate	=5;
	static final int f_contractEndDate		=6;
	static final int f_contractTimeUnit		=7;
	static final int f_firstPlanBillingDate	=8;
	static final int f_catchUpIndicator		=9;
	static final int f_billingType			=10;
	static final int f_averageDiscountFactor=11;
	static final int f_currency				=12;
	// Para el array de Servicios o Dispositivos
	static final int f_TipoElemento			=13; //Determina si es un Dispositivo (D) o un Servicio (S)
	static final int f_POB_CD_POB				=14;
	static final int f_POB_ID_Unico				=15; // 
	static final int f_POB_serviceTimeUnit		=16; //Aplica solo a Servicios 
	static final int f_POB_activatedServices	=17; //Aplica solo a Servicios 
	static final int f_POB_transferDate			=18; // 
	static final int f_POB_StartDate			=19; // Fecha inicio Servicio / Transfer Date Dispositivo
	static final int f_POB_EndDate				=20; // Fecha fin Servicio / null Dispositivo
	static final int f_POB_BillProfIndex		=21; // Orden de los valores de Billing Profile. Uso interno
	static final int f_POB_BillProf				=22; // Billing Profile
	static final int f_POB_ssp					=23;
	static final int f_POB_oneOffPaymentType	=24;
	static final int f_POB_oneOffPaymentAmount	=25;
	static final int f_POB_serviceEndDateEstimated=26; // Solo aplica a SERVICIOS
	static final int f_POB_financingDiscountRate=27; // Solo aplica a DISPOSITIVOS
	// Para COPA a nivel de POB
	static final int f_POB_COPA_customerType			=28;
	static final int f_POB_COPA_callOriginDestination	=29;
	static final int f_POB_COPA_channel					=30;
	static final int f_POB_COPA_segment					=31;
	static final int f_POB_COPA_bearerTechnology		=32;
	static final int f_POB_COPA_valueTier				=33;
	static final int f_POB_COPA_proposition				=34;
	static final int f_POB_COPA_deviceTechnology		=35;
	static final int f_POB_COPA_customer				=36;
	static final int f_POB_COPA_spare1					=37;
	static final int f_POB_COPA_spare2					=38;
	static final int f_POB_COPA_brand					=39;
	static final int f_POB_COPA_documentType			=40;
	static final int f_POB_COPA_tradingPartner			=41;
	static final int f_POB_COPA_batch					=42;
	static final int f_POB_COPA_valuationType			=43;
	static final int f_POB_COPA_functionalArea			=44;
	static final int f_POB_COPA_orderNumber				=45;
	static final int f_POB_COPA_salesOffice				=46;
	static final int f_POB_COPA_salesOrg				=47;
	// Continuamos con POB 
	static final int f_POB_maxRolloverPeriod	=48;// Solo aplica a SERVICIOS
	static final int f_POB_discountIndicator	=49;
	static final int f_POB_quantity				=50;
	static final int f_POB_avgDiscountFactor	=51;// Solo aplica a DISPOSITIVOS (También está a nivel de contrato)
	static final int f_POB_companyCode			=52;
	static final int f_POB_firstPlanBillingDate	=53;
	static final int f_POB_profitCenter			=54;
	static final int f_POB_excludeFromAllocation=55;
	static final int f_POB_referenceAccount		=56;
	static final int f_POB_pobName				=57;
	static final int f_POB_billingType			=58;
	static final int f_POB_indirectChannel		=59; // Solo aplica a SERVICIOS
	static final int f_POB_serviceType			=60; // Solo aplica a SERVICIOS
	//Costes // Solo aplica para SVT
	static final int f_POB_Cost_companyCode		=61; 
	static final int f_POB_Cost_costTransferDate=62; 
	static final int f_POB_Cost_serviceIDDeviceID=63; //Se crea para la matriz de POB_Level
	static final int f_POB_Cost_costAmount		=64; // Matriz Amount dentreo de POB_Level
	static final int f_POB_Cost_costType		=65; // Matriz Amount dentreo de POB_Level
	static final int f_POB_Cost_referenceAccount=66; // Matriz Amount dentreo de POB_Level
	
	static String ID_Servicio="";
	static String ID_Device="";
	static String POB_Code="";

	// Para Windows
//	static final String ficheroSalidaXML="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\vicsalida\\CON_";
	static final String ficheroSalidaXML="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\CON_";
	static final String ficheroSalidaControl="C:\\VSF-JAVA\\WKSVSF\\VICXML\\salida\\";

	// PAra unix
//	static final String ficheroSalidaControl="";
//	static final String ficheroSalidaXML="CON";

	
	static int NumFichero =0;
	static int NuevoFichero=0;
	static int NuevoContrato=0;
	static int NumContratos=1;
	static int NumContratosXfichero=2;
//	static int NumContratosXfichero=23000;
	
	static int GeneradoFichero=0;

	static int CtrlNumPobs=0;
	static int CtrlContratos=0;
	static int AntCtrlNumPobs=0;
	static int AntCNumLinea=0;
	static int AntNumContratos=0;
	
	static long TiempoInicial;
	static long TiempoFinal;
	static Date fechaInicio=new Date();
	static Date fechaFin=new Date();

	static long AntTiempo;
	static long TiempoActual;
	static Date AntFecha=new Date();
	static Date FechaActual=new Date();
	
	static long TiempoTranscurrido;
	
	static long TotalRegistros=58000000;
	
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
		ServiceComplexType Servicio = new ServiceComplexType();
		ServiceBillingProfileComplexType ServBillProf= new ServiceBillingProfileComplexType();
		DeviceComplexType Device = new DeviceComplexType();
		DeviceBillingProfileComplexType DevBillProf= new DeviceBillingProfileComplexType();
		MIAttributesComplexType COPAService = new MIAttributesComplexType();
		MIAttributesComplexType COPADevice = new MIAttributesComplexType();
		
		

		// Variable para guardar y detectar el cambio de contrato
		String aContratcID="";
		System.out.println("Comenzando generacion XML...");
		NumLinea=1;
		NuevoFichero=1;
//		File FicheroControl=new File ("Fichero.txt");
		TiempoInicial=fechaInicio.getTime();
		AntTiempo=TiempoInicial;
//		Utiles.EscribeHoraFileControl(Fichero, TiempoInicial);
		
		
		
		// Lectura del Fichero
		try {
			BufferedReader reader =	new BufferedReader(new	FileReader(Fichero));
			while((linea = reader.readLine())!=null) {
				Campos = linea.split(";"); // Deconstruyo el registro en campos
				
// Si cambia la POB o el contrato, generamos nuevo grupo (Esto se hace para Billing profile)			
if (!ID_Servicio.equals(Campos[f_POB_ID_Unico])||!aContratcID.equals(Campos[f_eventContractID].trim())||!POB_Code.equals(Campos[f_POB_CD_POB])){

				if (NuevoFichero==1){ // Si se decide generar un nuevo fichero
				//	NumFichero ++; // Incrementamos para saber el numero de ficheros generados
					if (GeneradoFichero==1) {
						S15Incept = new Inceptions();
						lstInceptions = new InceptionsComplexType();
					}
					tdInception=new InceptionComplexType();
					lstInceptions.getInception().add(tdInception);
					S15Incept.setData(lstInceptions);
					vListaServ = new ServiceListComplexType();
					vListaDev = new DeviceListComplexType();
					tdInception.setServiceList(vListaServ);// Añadimos la lista al inception
					tdInception.setDeviceList(vListaDev);// Añadimos la lista al inception
					tdInception.setEventContractID(Campos[f_eventContractID]);
					Utiles.addContractAtrib(tdInception, 
					Campos[f_eventType],
							Campos[f_eventDate],
							Campos[f_eventContractID],
							Campos[f_eventSynonimId],
							Campos[f_companyCode],
							Campos[f_contractStartDate],
							Campos[f_contractEndDate],
							Campos[f_contractTimeUnit],
							Campos[f_firstPlanBillingDate],
							Campos[f_catchUpIndicator],
							Campos[f_billingType],
							Campos[f_averageDiscountFactor],
							Campos[f_currency]);
					
					
					NuevoFichero=0; 
				} else{
				
				// Deteccion de cambios de contrato, cuando no sea nuevo fichero que ya va implicito
				if (!aContratcID.equals(Campos[f_eventContractID].trim())) {
					NuevoContrato=1;
					NumContratos ++;
					if (GeneradoFichero==1) {
						S15Incept = new Inceptions();
						lstInceptions = new InceptionsComplexType();
					}
					tdInception=new InceptionComplexType();
					lstInceptions.getInception().add(tdInception);
					S15Incept.setData(lstInceptions);
					vListaServ = new ServiceListComplexType();
					vListaDev = new DeviceListComplexType();
					tdInception.setServiceList(vListaServ);// Añadimos la lista al inception
					tdInception.setDeviceList(vListaDev);// Añadimos la lista al inception
					tdInception.setEventContractID(Campos[f_eventContractID]);
					Utiles.addContractAtrib(tdInception, 
					Campos[f_eventType],
							Campos[f_eventDate],
							Campos[f_eventContractID],
							Campos[f_eventSynonimId],
							Campos[f_companyCode],
							Campos[f_contractStartDate],
							Campos[f_contractEndDate],
							Campos[f_contractTimeUnit],
							Campos[f_firstPlanBillingDate],
							Campos[f_catchUpIndicator],
							Campos[f_billingType],
							Campos[f_averageDiscountFactor],
							Campos[f_currency]);

				} else {NuevoContrato=0;}
				}
}				
				aContratcID=Campos[f_eventContractID].trim();
		
if (0==0){ //Para en debug no ejecutar este cacho
	
	
///////////////////
/// PARTE DE POBS 
///////////////////
			////////////////////
			/// POBs Servicios
			////////////////////
				// Identificamos si es Servicio o Dispositivo
				if (Utiles.EsServicio(Campos[f_TipoElemento])){
					// Informamos los datos de servicios 
						// Si cambia de servicio se crea uno nuevo
					if (!ID_Servicio.equals(Campos[f_POB_ID_Unico])||!POB_Code.equals(Campos[f_POB_CD_POB])){
						Servicio= new ServiceComplexType();
						ServBillProf = new ServiceBillingProfileComplexType();
					//	Utiles.addServiceAtrib(Servicio, Campos[f_POB_CD_POB],Campos[f_POB_ID_Unico],Campos[f_POB_StartDate],Campos[f_POB_EndDate] ); // Asignamos los valores
						Utiles.addServiceAtrib(Servicio,
								Campos[f_POB_CD_POB],
								Campos[f_POB_ID_Unico],
								Campos[f_POB_serviceTimeUnit],
								Campos[f_POB_activatedServices],
								Campos[f_POB_transferDate],
								Campos[f_POB_StartDate],
								Campos[f_POB_EndDate],
								Campos[f_POB_ssp],
								Campos[f_POB_serviceEndDateEstimated],
								Campos[f_POB_maxRolloverPeriod],
								Campos[f_POB_discountIndicator],
								Campos[f_POB_quantity],
								Campos[f_POB_companyCode],
								Campos[f_POB_firstPlanBillingDate],
							    Campos[f_POB_profitCenter],
							    Campos[f_POB_excludeFromAllocation],
							    Campos[f_POB_referenceAccount],
							    Campos[f_POB_pobName],
							    Campos[f_POB_billingType],
							    Campos[f_POB_indirectChannel],
							    Campos[f_POB_serviceType]
								
								);
					
						vListaServ.getService().add(Servicio);// Agregamos a la lista de servicios
						CtrlNumPobs ++;

					}

					// Billing Profile
					BigDecimal Importe = new BigDecimal(Campos[f_POB_BillProf]);
					// Temporal
				//	BigDecimal Importe = new BigDecimal("3");
					ServBillProf.getBillingAmount().add(Importe);
					Servicio.setServiceBillingProfile(ServBillProf);

			/////////////////////
			/// COPA SERVICIOS///
			/////////////////////
					COPAService=new MIAttributesComplexType();
					Utiles.AddPobCOPAServ(Servicio,COPAService, 
							Campos[f_POB_COPA_customerType],
							Campos[f_POB_COPA_callOriginDestination],
							Campos[f_POB_COPA_channel],
							Campos[f_POB_COPA_segment],
							Campos[f_POB_COPA_bearerTechnology],
							Campos[f_POB_COPA_valueTier],
							Campos[f_POB_COPA_proposition],
							Campos[f_POB_COPA_deviceTechnology],
							Campos[f_POB_COPA_customer],
							Campos[f_POB_COPA_spare1],
							Campos[f_POB_COPA_spare2],
							Campos[f_POB_COPA_brand],
							Campos[f_POB_COPA_documentType],
							Campos[f_POB_COPA_tradingPartner],
							Campos[f_POB_COPA_batch],
							Campos[f_POB_COPA_valuationType],
							Campos[f_POB_COPA_functionalArea],
							Campos[f_POB_COPA_orderNumber],
							Campos[f_POB_COPA_salesOffice],
							Campos[f_POB_COPA_salesOrg]
							);

					
					
			/////////////////////
					ID_Servicio=Campos[f_POB_ID_Unico];
					POB_Code=Campos[f_POB_CD_POB];
			////////////////////
			/// POBs Dispositivos
			////////////////////
						
				} else if (Utiles.EsDispositivo(Campos[f_TipoElemento])){
									// Informamos los datos de dispositivos 
									// Si cambia de dispositivo se crea uno nuevo
								if (!ID_Device.equals(Campos[f_POB_ID_Unico])||!POB_Code.equals(Campos[f_POB_CD_POB])){
									Device= new DeviceComplexType();
									DevBillProf = new DeviceBillingProfileComplexType();
//									Utiles.addDeviceAtrib(Device, Campos[f_POB_CD_POB],Campos[f_POB_ID_Unico],Campos[f_POB_StartDate],Campos[f_POB_EndDate] ); // Asignamos los valores
									Utiles.addDeviceAtrib(Device,
											Campos[f_POB_CD_POB],
											Campos[f_POB_ID_Unico],
											//Campos[f_POB_serviceTimeUnit],
										//	Campos[f_POB_activatedServices],
											Campos[f_POB_transferDate],
											Campos[f_POB_StartDate],
											Campos[f_POB_EndDate],
											Campos[f_POB_ssp],
											Campos[f_POB_financingDiscountRate],
										//	Campos[f_POB_maxRolloverPeriod],
											Campos[f_POB_discountIndicator],
											Campos[f_POB_quantity],
											Campos[f_POB_avgDiscountFactor],
											Campos[f_POB_companyCode],
											Campos[f_POB_firstPlanBillingDate],
										    Campos[f_POB_profitCenter],
										    Campos[f_POB_excludeFromAllocation],
										    Campos[f_POB_referenceAccount],
										    Campos[f_POB_pobName],
										    Campos[f_POB_billingType]
										    
											);


									vListaDev.getDevice().add(Device);// Agregamos a la lista de servicios
									CtrlNumPobs ++;

								}
								// Billing Profile
								BigDecimal Importe = new BigDecimal(Campos[f_POB_BillProf]);
								// Temporal
								//BigDecimal Importe = new BigDecimal("3");
								//
								DevBillProf.getBillingAmount().add(Importe);
								Device.setDeviceBillingProfile(DevBillProf);
								/////////////////////
								/// COPA DEVICES///
								/////////////////////
								COPADevice=new MIAttributesComplexType();
								Utiles.AddPobCOPADev(Device,COPADevice, 
										Campos[f_POB_COPA_customerType],
										Campos[f_POB_COPA_callOriginDestination],
										Campos[f_POB_COPA_channel],
										Campos[f_POB_COPA_segment],
										Campos[f_POB_COPA_bearerTechnology],
										Campos[f_POB_COPA_valueTier],
										Campos[f_POB_COPA_proposition],
										Campos[f_POB_COPA_deviceTechnology],
										Campos[f_POB_COPA_customer],
										Campos[f_POB_COPA_spare1],
										Campos[f_POB_COPA_spare2],
										Campos[f_POB_COPA_brand],
										Campos[f_POB_COPA_documentType],
										Campos[f_POB_COPA_tradingPartner],
										Campos[f_POB_COPA_batch],
										Campos[f_POB_COPA_valuationType],
										Campos[f_POB_COPA_functionalArea],
										Campos[f_POB_COPA_orderNumber],
										Campos[f_POB_COPA_salesOffice],
										Campos[f_POB_COPA_salesOrg]
										);

										
										
								/////////////////////

				
								ID_Device=Campos[f_POB_ID_Unico];
								POB_Code=Campos[f_POB_CD_POB];

						// Informamos los datos de dispositivos 
						//DeviceComplexType	Device = new DeviceComplexType(); // Creamos un servicio
				} else {
						System.out.println("Can't find element type (Service/Device)");
				}
////////////////////
/// FIN POBS ///////
////////////////////
				
}	

//////////////////////////////////////
/// CONTROL DE FICHEROS A GENERAR ////
//////////////////////////////////////
			// Comprueba cuantos contratos se van a mandar en cada fichero. Controla que sea cuando finaliza el evento.
			if (NumContratosXfichero<NumContratos && NuevoContrato==1)
				{
					AntNumContratos=CtrlContratos;
					CtrlContratos=AntNumContratos+NumContratos;
					Utiles.Genera(S15Incept, ficheroSalidaXML, NumFichero); // Comentado en pruebas
					NumFichero ++; // Incrementamos para saber el numero de ficheros generados
					NuevoFichero=1;
					NumContratos=0;
					GeneradoFichero=1;
					
					
					// Escribe el fichero de control de exportacion

					TiempoActual=new Date().getTime();
					long Tiempo=Utiles.RestaFechas(AntTiempo, TiempoActual);
					long msecTranscurridos=Utiles.RestaFechas(TiempoInicial, TiempoActual);
					TotalRegistros=TotalRegistros-NumLinea;
					String Estimado1=Utiles.EstimaTimepoRestante(TotalRegistros,NumLinea-AntCNumLinea,Tiempo,
							  NumLinea,msecTranscurridos );

					Utiles.AppendFicheroControl(NumFichero, ficheroSalidaControl, NumFichero, 
							NumLinea, CtrlContratos, CtrlNumPobs,
							NumLinea-AntCNumLinea,CtrlContratos-AntNumContratos,CtrlNumPobs-AntCtrlNumPobs,Tiempo,msecTranscurridos,Estimado1);
					AntCtrlNumPobs=CtrlNumPobs;
					AntCNumLinea=NumLinea;
					AntTiempo=TiempoActual;
					
					
				} else {GeneradoFichero=0;}
				NumLinea ++;

///////////////////////////
/// FIN LECTURA FICHERO //
///////////////////////////
			} // Fin lectura lineas fichero
			reader.close();
			NumFichero ++;
			// Cuando acaba con el fichero imprime el resto.
			if (NumContratosXfichero>=NumContratos ){
				Utiles.Genera(S15Incept, ficheroSalidaXML, NumFichero); // Comentado en pruebas
				// Escribe el fichero de control de exportacion
				AntNumContratos=CtrlContratos;
				CtrlContratos=AntNumContratos+NumContratos;
				TiempoActual=new Date().getTime();
				long Tiempo=Utiles.RestaFechas(AntTiempo, TiempoActual);
				long msecTranscurridos=Utiles.RestaFechas(TiempoInicial, TiempoActual);
				TotalRegistros=TotalRegistros-NumLinea;
				String Estimado1=Utiles.EstimaTimepoRestante(TotalRegistros,NumLinea-AntCNumLinea,Tiempo,
																		  NumLinea,msecTranscurridos );
				Utiles.AppendFicheroControl(NumFichero, ficheroSalidaControl, NumFichero, 
						NumLinea, CtrlContratos, CtrlNumPobs,
						NumLinea-AntCNumLinea,CtrlContratos-AntNumContratos,CtrlNumPobs-AntCtrlNumPobs,Tiempo,msecTranscurridos,Estimado1);
				AntCtrlNumPobs=CtrlNumPobs;
				AntCNumLinea=NumLinea;
				AntNumContratos=NumContratos;
				AntTiempo=TiempoActual;
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TiempoFinal=fechaFin.getTime();
//		Utiles.EscribeHoraFileControl(Fichero, TiempoFinal);
	
	System.out.println("Finalizada extraccion !!!!");	
	
	}
	
	

}
