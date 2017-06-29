/* 
 * Copyright 2014 (C) Sears Holdings Corp  
 *  
 * Created on : 07-Mar-14
 * Author     : Ranjit Bhakta   
 * 
 *----------------------------------------------------------------------------- 
 * Revision History (Release 1.0.0.0) 
 *----------------------------------------------------------------------------- 
 * VERSION     AUTHOR/      DESCRIPTION OF CHANGE 
 * OLD/NEW     DATE                RFC NO 
 *----------------------------------------------------------------------------- 
 * --/1.0  | Ranjit Bhakta  | Initial Create. 
 *         | 07-Mar-14      | 
 *---------|--------------- |--------------------------------------------------- 
 */
package com.searshc.hs.som.thm.utils;

import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;

import com.searshc.hs.som.thm.client.adapter.npj.ProfileDelegateAdapter;

/**
 * This class contains all required utility
 * methods
 * 
 * @author Ranjit Bhakta
 * @version 1.0, Mar 07, 2014
 */
public class CommonUtils {
	private static final Logger logger = LoggerFactory.getLogger(ProfileDelegateAdapter.class);
	
	/**
	 * Convert an JAXBElement to its xml representation
	 * 
	 * @param element
	 * @param clazz class object on which xml representation wis sought
	 * @return xml representation of the object
	 */
	public static <T>String getXMLRepresentation(Object element, Class<T> clazz){
		String xml = "";
		
		if(element != null){
	      try {
	      	JAXBContext context = null;
	      	
	      	if(clazz != null){
	      		context = JAXBContext.newInstance(clazz); 
	      	}else {
	      		context = JAXBContext.newInstance(element.getClass());
	      	}
	      	
	      	if(element instanceof Node){
	      		Unmarshaller um = context.createUnmarshaller();
				element = um.unmarshal((Node)element);
	      	}
	      	
	      	Marshaller marshaller = context.createMarshaller(); 
	      	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); 
		    
	        marshaller.marshal(element, baos);
		      
		    xml = baos.toString();
	      } catch (JAXBException e) {
	      	logger.error("Could not convert the object to xml", e);
	      }
		}

      return xml;
	}
	
	/**
	 * Get String from date object according to passed date format
	 * 
	 * @param date the date object
	 * @param format the date format string
	 * @return date in string format
	 */
	public static String getDateAsString(Date date, String format){
		DateFormat dateFormat = new SimpleDateFormat(format);
		String dateString = null;
		
		try{
			dateString = dateFormat.format(date);

		}catch(Exception excp){
			logger.error("Date can not be formatted as string", excp);
		}
		
		return dateString;
	}
	
	/**
	 * Get date object from date string
	 * 
	 * @param dateString the date string 
	 * @param format the date format string
	 * @return date object
	 */
	public static Date getStringAsDate(String dateString, String format){
		DateFormat dateFormat = new SimpleDateFormat(format);
		Date date = null;
		
		try{
			date = dateFormat.parse(dateString);

		}catch(Exception excp){
			logger.error("Date string can not be formatted as date object ", excp);
		}
		
		return date;
	}
}	