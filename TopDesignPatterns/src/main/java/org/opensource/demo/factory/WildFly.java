package org.opensource.demo.factory;

public class WildFly implements OpensourceJVMServers {
    public void startServer() {
        System.out.println("Starting WildFly Server...");
    }

    public void stopServer() {
        System.out.println("Shutting Down WildFly Server...");
    }

    public String getName() {
        return "WildFly";
    }
}
