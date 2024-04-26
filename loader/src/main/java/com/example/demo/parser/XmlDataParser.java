package com.example.demo.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.function.Consumer;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.gleif.data.schema.leidata._2016.LEIRecordType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

@Component
public class XmlDataParser {
	
	 @Value("${gleif.file.path}")
	String gleifFilePath;
	
	
	public void parse(Consumer<LEIRecordType> consumer) throws FileNotFoundException, XMLStreamException, JAXBException
	{
		System.out.println(gleifFilePath);
		  JAXBContext jaxbContext = JAXBContext.newInstance(LEIRecordType.class);
		  
	        // unmarshall: String "source" to Java object
	        Unmarshaller um = jaxbContext.createUnmarshaller();
		
		   XMLInputFactory xmlFactory = XMLInputFactory.newInstance();
	        XMLStreamReader reader = xmlFactory.createXMLStreamReader(new FileReader(gleifFilePath));
	        
	        while(reader.hasNext())
	        {
	        	
	        	int next = reader.next();
	        	if(next == XMLStreamConstants.START_ELEMENT && reader.getLocalName().equals("LEIRecord"))
	        	{
	        		LEIRecordType leiRecord = um.unmarshal(reader,LEIRecordType.class).getValue();
	        		
	        		consumer.accept(leiRecord);
	        	}
	        	
	        }
	}

}
 
   