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
package com.devamatre.appsuite.jdk.net.messages;

import com.devamatre.appsuite.core.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Rohtash Lakra
 * @version 1.0
 */

public class MainMessage {

    public MainMessage() {
    }

    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            byte dataBytes[] = new byte[45];
            final String pathString = IOUtils.pathString(IOUtils.getUserHome(), "Message.txt");
            inputStream = new FileInputStream(pathString);
            Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
            inputStream.read(dataBytes);
            Runtime rt = Runtime.getRuntime();
            for (int i = 0; i < 300; i++) {
                try {
                    Thread.sleep(99000);
                } catch (InterruptedException ex) {
                    //ignore me
                }
                rt.exec(new String[]{"net send", new String(dataBytes) + i});
                System.out.println(" count " + i);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            IOUtils.closeSilently(inputStream);
        }
    }
}
