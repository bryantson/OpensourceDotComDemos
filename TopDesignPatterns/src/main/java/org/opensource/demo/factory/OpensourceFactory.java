/**
 * OpensourceFactory.java
 *
 *  Implements a simple factory.
 *
 * @author Bryant Son
 * @since 06/26/2019
 */

package org.opensource.demo.factory;

public class OpensourceFactory {

    public OpensourceJVMServers getServerByVendor(String name) {
        if(name.equals("Apache")) {
            return new Tomcat();
        }
        else if(name.equals("Eclipse")) {
            return new Jetty();
        }
        else if (name.equals("RedHat")) {
            return new WildFly();
        }
        else {
            return null;
        }
    }
}
