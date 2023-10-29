/******************************************************************************
 * Copyright (C) Devamatre Inc 2009-2018. All rights reserved.
 *
 * This code is licensed to Devamatre under one or more contributor license
 * agreements. The reproduction, transmission or use of this code, in source
 * and binary forms, with or without modification, are permitted provided
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
package com.devamatre.appsuite.jdk.net.http;

import com.devamatre.appsuite.core.IOUtils;
import com.devamatre.appsuite.core.SSLUtils;
import com.devamatre.appsuite.jdk.net.NetConstants;
import com.devamatre.appsuite.jdk.net.ProcessConnection;

import javax.net.ssl.SSLServerSocket;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This class implements a multi-threaded simple HTTP server that supports the
 * GET request method. It listens on port 44, waits client requests, and serves
 * documents. 443 is the default port number for HTTPs. It is important to note
 * that port numbers between 0 and 1023 are reserved. If you run HttpsServer on
 * a different port number, the url should be: https://localhost:portnumber but
 * if you run it on 443 then the URL is: https://localhost.
 *
 * @author rohtash.singh Created on May 24, 2005
 */

public class HTTPSClient {

    private int port;

    /**
     * @param port
     */
    public HTTPSClient(int port) {
        this.port = port;
    }

    /**
     * The rest of the JSSE related code is in the getServer method: It access
     * the serverkeys keystore. The JKS is the Java KeyStore (a type of keystore
     * created by keytool). The KeyManagerFactory is used to create an X.509 key
     * manager for the keystore. An SSLContext is an environment for
     * implementing JSSE. It is used to create a ServerSocketFactory that in
     * turn used to create a SSLServerSocket. Although we specify SSL 3.0, the
     * implementation that is returned will often support other protocol
     * versions, such as TLS 1.0. Older browsers, however, use SSL 3.0 more
     * widely. Note that by default client authentication is not required. For
     * if you wish for your server to require client authentication, use:
     * serversocket.setNeedClientAuth(true).
     *
     * @return
     * @throws Exception
     */
    public ServerSocket getServer() throws Exception {

        String filePath = IOUtils.getClassFilePath(HTTPSClient.class);
        String certFilePath = IOUtils.pathString(filePath, NetConstants.SERVER_KEYS);
        SSLServerSocket serversocket = SSLUtils.makeSSLServerSocket(certFilePath, NetConstants.KEY_PASSWORD.toCharArray(), NetConstants.KEY_PASSWORD.toCharArray(), port);
        return serversocket;
    }

    // multi-threading -- create a new connection for each request
    public void run() {
        ServerSocket listen;
        try {
            listen = getServer();
            while (true) {
                Socket client = listen.accept();
                System.out.println("Client: " + client);
                new ProcessConnection(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception:" + e.getMessage());
        }
    }

    /**
     * @param argv
     * @throws Exception
     */
    public static void main(String argv[]) throws Exception {
        HTTPSClient httpsClient = new HTTPSClient(NetConstants.HTTPS_PORT);
        httpsClient.run();
    }
}
