/******************************************************************************
 * Copyright (C) Devamatre Inc 2009-2018. All rights reserved.
 *
 * This code is licensed to Devamatre under one or more contributor license 
 * agreements. The reproduction, transmission or use of this code, in source 
 * and binary forms, with or without modification, are permitted provided 
 * that the following conditions are met:
 * <pre>
 *  1. Redistributions of source code must retain the above copyright notice,
 *  this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and/or other materials provided with the distribution.
 * </pre>
 * <p/>
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *
 * Devamatre reserves the right to modify the technical specifications and or 
 * features without any prior notice.
 *****************************************************************************/
package com.devamatre.appsuite.jdk;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

    private Properties properties;

    /**
     *
     */
    public PropertiesTest() {
        this(System.getProperties());
    }

    /**
     * @param properties
     */
    public PropertiesTest(Properties properties) {
        this.properties = properties;
        this.properties.put("PropertiesTest", "PropertiesTest");
    }

    /**
     * @param key
     * @param value
     */
    public void addProperty(String key, String value) {
        properties.put(key, value);
    }

    /**
     *
     */
    public void printProperties() {
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()) {
            String key = (String) keys.nextElement();
            String value = (String) properties.get(key);
            System.out.println(key + ": " + value);
        }
    }

    /**
     * @param properties
     */
    public void updateProperties(Properties properties) {
        PropertiesTest flatProperties = null;
        if (properties == null) {
            flatProperties = new PropertiesTest();
        } else {
            flatProperties = new PropertiesTest(properties);
        }
        flatProperties.addProperty("FirstName", "Rohtash");
        flatProperties.addProperty("Properties", "Testing -5 Error");
        System.out.println("========== All Properties ===========");
        flatProperties.printProperties();
        System.out.println("======================================");
    }

    /**
     *
     */
    public void updateProperties() {
        updateProperties(new Properties());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        PropertiesTest instance = new PropertiesTest();
        System.out.println("========== Before Properties Change ===========");
        instance.printProperties();
        System.out.println("======================================");
        instance.updateProperties();
        System.out.println("========== After Properties Change ===========");
        instance.printProperties();
        System.out.println("======================================");
    }
}
