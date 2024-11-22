package com.example.demo;

import com.example.demo.parser.XmlDataParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.gleif.data.schema.leidata._2016.LEIRecordType;

import javax.xml.stream.XMLStreamException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;




public class GleifXmlToJson {

    static final String COLLECTION = "lEIRecordType";
    static String gleifFilePath="/home/nakul/Downloads/20241114-0800-gleif-goldencopy-lei2-golden-copy.xml1";
    public static void main(String[] args) throws XMLStreamException, JAXBException, IOException {

        loadGelifData();

    }
    public static void loadGelifData() throws XMLStreamException, JAXBException, IOException {
        XmlDataParser dataParser = new XmlDataParser(gleifFilePath);
        try(BufferedWriter writer= Files.newBufferedWriter(Paths.get(gleifFilePath+".json"))) {
            ObjectMapper objectMapper = new ObjectMapper();
            dataParser.parse((LEIRecordType record) -> {
                try {
                    writer.write(objectMapper.writeValueAsString(record));
                    writer.write("\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
           });
        }
    }




}
