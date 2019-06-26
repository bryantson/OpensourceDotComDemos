/**
 * OpensourceSingleton.java
 *
 *  Implements a basic Singleton. Not threadsafe.
 *
 * @author Bryant Son
 * @since 06/26/2019
 */

package org.opensource.demo.singleton;

public class OpensourceSingleton {

    private static OpensourceSingleton uniqueInstance;

    private int id;

    private OpensourceSingleton() {
    }

    public static OpensourceSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new OpensourceSingleton();
        }
        return uniqueInstance;
    }

}
