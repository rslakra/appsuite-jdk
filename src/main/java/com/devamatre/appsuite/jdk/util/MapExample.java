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
package com.devamatre.appsuite.jdk.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Rohtash Lakra (rohtash.lakra@devamatre.com)
* @author Rohtash Lakra (rohtash.singh@gmail.com)
 * @created 2018-02-10 01:22:09 PM
 * @version 1.0.0
 * @since 1.0.0
 */
public class MapExample {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] str = { "one", "two", "five", "four", "three" };
		Map map = new HashMap();
		for (int i = 0, n = str.length; i < n; i++) {
			String key = str[i];
			int value = -1;
			if (key.equals("one")) {
				value = 1;
			} else if (key.equals("two")) {
				value = 2;
			} else if (key.equals("three")) {
				value = 3;
			} else if (key.equals("four")) {
				value = 4;
			} else if (key.equals("five")) {
				value = 5;
			}
			map.put(key, new IntVal(value));
		}
		System.out.println(map);
		Map sortedMap = new TreeMap(map);
		System.out.println(sortedMap);
	}
}
