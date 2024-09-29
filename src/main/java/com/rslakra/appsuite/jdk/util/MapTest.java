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
package com.rslakra.appsuite.jdk.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @created 2018-02-10 01:22:09 PM
 * @since 1.0.0
 */
public class MapTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MapTest.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, IntVal> hashMap = new HashMap();
        String[] inputData = {"one", "two", "five", "four", "three"};
        LOGGER.debug("inputData:{}", Arrays.toString(inputData));
        for (int i = 0, n = inputData.length; i < n; i++) {
            IntVal intVal = null;
            switch (inputData[i]) {
                case "one":
                    intVal = new IntVal(1);
                    break;
                case "two":
                    intVal = new IntVal(2);
                    break;
                case "three":
                    intVal = new IntVal(3);
                    break;
                case "four":
                    intVal = new IntVal(4);
                    break;
                case "five":
                    intVal = new IntVal(5);
                    break;
            }
            hashMap.put(inputData[i], intVal);
        }

        LOGGER.debug("hashMap:{}", hashMap);
        System.out.println();

        String key = "three";
        LOGGER.debug("Remove Key:{}, result:{}", key, hashMap.remove(key));
        System.out.println();

        // map values to array
        IntVal[] intValues = hashMap.values().toArray(new IntVal[hashMap.size()]);
        LOGGER.debug("intValues:{}", Arrays.toString(intValues));
        System.out.println();

        for (Map.Entry<String, IntVal> entry : hashMap.entrySet()) {
            LOGGER.debug("key:{}, value:{}", entry.getKey(), entry.getValue());
        }

        // TreeMap
        Map treeMap = new TreeMap(hashMap);
        LOGGER.debug("treeMap:{}", treeMap);
    }
}
