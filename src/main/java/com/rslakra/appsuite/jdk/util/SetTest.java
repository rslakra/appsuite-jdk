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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @created 2018-02-10 01:21:10 PM
 * @since 1.0.0
 */
public class SetTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SetTest.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet();
        hashSet.add("Bernadine");
        hashSet.add("Elizabeth");
        hashSet.add("Gene");
        hashSet.add("Elizabeth");
        hashSet.add("Clara");
        LOGGER.debug("hashSet:{}", hashSet);
        System.out.println();
        LOGGER.debug("get first element:{}", hashSet.iterator().next());

        Set treeSet = new TreeSet(hashSet);
        LOGGER.debug("treeSet:{}", treeSet);
        System.out.println();

        Set treeSetReversed = new TreeSet(Collections.reverseOrder());
        treeSetReversed.add("Bernadine");
        treeSetReversed.add("Elizabeth");
        treeSetReversed.add("Gene");
        treeSetReversed.add("Elizabeth");
        treeSetReversed.add("Clara");
        LOGGER.debug("treeSetReversed:{}", treeSetReversed);
        System.out.println();
    }
}
