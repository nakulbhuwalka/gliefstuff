package com.example.demo.parser;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.gleif.data.schema.leidata._2016.LEIRecordType;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class XmlDataParser {


    private final String gleifFilePath;

    public XmlDataParser(String gleifFilePath) {
        this.gleifFilePath = gleifFilePath;


    }


    public void parse(Consumer<LEIRecordType> consumer) throws XMLStreamException, JAXBException {
        System.out.println(gleifFilePath);
        JAXBContext jaxbContext = JAXBContext.newInstance(LEIRecordType.class);

        // unmarshall: String "source" to Java object
        Unmarshaller um = jaxbContext.createUnmarshaller();

        XMLInputFactory xmlFactory = XMLInputFactory.newInstance();

        try (ZipInputStream is = new ZipInputStream(new FileInputStream(gleifFilePath + ".zip"))) {
            ZipEntry entry = is.getNextEntry();
            System.out.println(entry);
            XMLStreamReader reader = xmlFactory.createXMLStreamReader(is);

            while (reader.hasNext()) {

                int next = reader.next();
                if (next == XMLStreamConstants.START_ELEMENT && reader.getLocalName().equals("LEIRecord")) {
                    LEIRecordType leiRecord = um.unmarshal(reader, LEIRecordType.class).getValue();

                    consumer.accept(leiRecord);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
 
   