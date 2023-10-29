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
package com.devamatre.appsuite.jdk.events.customized;

import java.util.Observable;
import java.util.Observer;

/**
 * The Observer and Observable classes are superseded by a more elaborate event framework (see e333 Creating a Custom
 * Event). However, these two classes can still be useful for implementing a simple event notifier.
 * <p>
 * // Declare the model class MyModel extends Observable { // The setChanged() protected method must overridden to make
 * it public synchronized void setChanged() { super.setChanged(); } }
 *
 * @author Rohtash Singh
 * @version Feb 3, 2006
 */
public class SimpleEventNotifier extends Observable {

    // The setChanged() protected method must overridden to make it public
    public synchronized void setChanged() {
        System.out.println("Called setChanged!");
    }

    public static void main(String[] args) {

        // Create the model
        SimpleEventNotifier notifier = new SimpleEventNotifier();

        // Register for events
        notifier.addObserver(new Observer() {
            public void update(Observable o, Object arg) {
                System.out.println("Observer update called!");
            }
        });

        // Indicate that the model has changed
        notifier.setChanged();

        // Fire an event to all the views
        Object arg = "some information about the event";
        notifier.notifyObservers(arg);

    }
}
