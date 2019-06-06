
// File generated by OpenXava: Fri May 10 10:28:38 CEST 2019
// Archivo generado por OpenXava: Fri May 10 10:28:38 CEST 2019

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: OneLineAddress		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class OneLineAddress implements java.io.Serializable, org.openxava.test.model.IOneLineAddress {	

	// Constructor
	public OneLineAddress() {
		initMembers();
	} 

	private void initMembers() { 
		setFullAddress(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter fullAddressConverter;
	private org.openxava.converters.IConverter getFullAddressConverter() {
		if (fullAddressConverter == null) {
			try {
				fullAddressConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("fullAddress");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "fullAddress"));
			}
			
		}	
		return fullAddressConverter;
	} 
	private java.lang.String fullAddress;
	private java.lang.String get_FullAddress() {
		return fullAddress;
	}
	private void set_FullAddress(java.lang.String newFullAddress) {
		this.fullAddress = newFullAddress;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getFullAddress() {
		try {
			return (String) getFullAddressConverter().toJava(get_FullAddress());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FullAddress", "OneLineAddress", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setFullAddress(String newFullAddress) {
		try { 
			set_FullAddress((java.lang.String) getFullAddressConverter().toDB(newFullAddress));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "FullAddress", "OneLineAddress", "String"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static OneLineAddress findBy() throws javax.ejb.ObjectNotFoundException {
		org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from OneLineAddress as o"); 
		OneLineAddress r = (OneLineAddress) query.uniqueResult();
		if (r == null) {
			throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "OneLineAddress"));
		}
		return r; 
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("OneLineAddress").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "OneLineAddress"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}