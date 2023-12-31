package com.devamatre.appsuite.java.annotations.serialize;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.devamatre.appsuite.jdk.annotations.serialize.JsonSerializer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Rohtash Lakra
 * @created 12/24/19 3:57 PM
 */
public class TestJsonSerializer {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(TestJsonSerializer.class);

    /**
     *
     */
    @Test
    public void testSerialize() {
        final JsonSerializer jsonSerializer = new JsonSerializer();
        String testJsonString = "{\"firstName\":\"Rohtash\",\"lastName\":\"Lakra\",\"gender\":\"Male\"}";
        Person person = new Person();
        person.setFirstName("Rohtash");
        person.setLastName("Lakra");
        person.setSex("Male");
        person.setAddress("California, USA");
        String jsonPerson = jsonSerializer.serialize(person);
        LOGGER.debug(jsonPerson);
        assertEquals(testJsonString, jsonPerson);
    }
}
