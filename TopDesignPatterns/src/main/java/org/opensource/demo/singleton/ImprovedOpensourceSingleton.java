/**
 * ImprovedOpensourceSingleton.java
 *
 *  Implements a basic Singleton. Double-checked locking for thread safety.
 *
 * @author Bryant Son
 * @since 06/26/2019
 */

package org.opensource.demo.singleton;

public class ImprovedOpensourceSingleton {

    private volatile static ImprovedOpensourceSingleton uniqueInstance;

    private ImprovedOpensourceSingleton() {}

    public static ImprovedOpensourceSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (ImprovedOpensourceSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ImprovedOpensourceSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
