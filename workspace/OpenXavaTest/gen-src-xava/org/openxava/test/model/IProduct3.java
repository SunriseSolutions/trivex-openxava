

// File generated by OpenXava: Fri May 10 10:28:38 CEST 2019
// Archivo generado por OpenXava: Fri May 10 10:28:38 CEST 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Product3		Java interface for entity/Interfaz java para Entidad

package org.openxava.test.model;

import java.math.*;
import java.rmi.RemoteException;


public interface IProduct3  extends org.openxava.model.IModel {	

	// Properties/Propiedades 	
	public static final String PROPERTY_number = "number"; 	
	long getNumber() throws RemoteException; 	
	public static final String PROPERTY_comments = "comments"; 
	java.lang.String getComments() throws RemoteException;
	void setComments(java.lang.String comments) throws RemoteException; 	
	public static final String PROPERTY_description = "description"; 
	String getDescription() throws RemoteException;
	void setDescription(String description) throws RemoteException;		

	// References/Referencias  	
	// Subfamily2 : Aggregate 
	
	org.openxava.test.model.SubfamilyInfo getSubfamily2() throws RemoteException;
	void setSubfamily2(org.openxava.test.model.SubfamilyInfo newSubfamily2) throws RemoteException;  	
	// Subfamily1 : Aggregate 
	
	org.openxava.test.model.SubfamilyInfo getSubfamily1() throws RemoteException;
	void setSubfamily1(org.openxava.test.model.SubfamilyInfo newSubfamily1) throws RemoteException; 

	// Family : Reference/Referencia
	
	org.openxava.test.model.IFamily getFamily() throws RemoteException;
	void setFamily(org.openxava.test.model.IFamily newFamily) throws RemoteException;

	// Methods 


}