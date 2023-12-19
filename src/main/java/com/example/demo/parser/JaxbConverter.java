package com.example.demo.parser;

import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class JaxbConverter {

    public static java.util.Date parseDateTime( String lexicalXSDDateTime ) {

        Instant instant = DateTimeFormatter.ISO_INSTANT.parse(lexicalXSDDateTime,Instant::from);
        return Date.from(instant);
    }

    public static String printDateTime( java.util.Date val ) {
        return  DateTimeFormatter.ISO_INSTANT.format(val.toInstant());
    }
}
