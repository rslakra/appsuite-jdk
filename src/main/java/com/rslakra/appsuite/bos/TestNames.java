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
package com.rslakra.appsuite.bos;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @created 2018-02-10 01:21:50 PM
 * @since 1.0.0
 */
public class TestNames {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Staring filling memory");
        Names names = new Names();
        Name name = null;
        Name tempName = null;
        Runtime rt = Runtime.getRuntime();
        int j = 1;
        for (int i = 0; i < 100000; i++) {
            j++;
            tempName = new Name("Test", String.valueOf((i + 1)));
            name = tempName;
            names.addName(name);
            tempName = null;
            if (j == 25000) {
                j = 1;
                System.gc();
                long totalMemory = rt.totalMemory();
                long freeMemory = rt.freeMemory();
                long usedMem = totalMemory - freeMemory;
                System.out.println(
                    "totalMemory : " + totalMemory + ", freeMemory : " + freeMemory + ", usedMem : " + usedMem);
            }
        }
        System.out.println("End");
    }

}
