/******************************************************************************
 * Copyright (C) Devamatre Technologies 2017
 * 
 * This code is licensed to Devamatre under one or more contributor license 
 * agreements. The reproduction, transmission or use of this code or the 
 * snippet is not permitted without prior express written consent of Devamatre. 
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the license is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied and the 
 * offenders will be liable for any damages. All rights, including  but not
 * limited to rights created by patent grant or registration of a utility model 
 * or design, are reserved. Technical specifications and features are binding 
 * only insofar as they are specifically and expressly agreed upon in a written 
 * contract.
 * 
 * You may obtain a copy of the License for more details at:
 *      http://www.devamatre.com/licenses/license.txt.
 *      
 * Devamatre reserves the right to modify the technical specifications and or 
 * features without any prior notice.
 *****************************************************************************/
package com.devamatre.jdk.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Rohtash Lakra
 * @created 2017-10-11 08:49:19 PM
 * @version 1.0.0
 * @since 1.0.0
 */
public class ForEachDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);

		intList.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer value) {
				System.out.println(value);
			}
		});

		intList.stream().filter(p -> p > 3).forEach(p -> System.out.println(p));

	}

}
