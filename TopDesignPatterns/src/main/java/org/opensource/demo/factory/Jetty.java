package org.opensource.demo.factory;

public class Jetty implements OpensourceJVMServers {
    public void startServer() {
        System.out.println("Starting Jetty Server...");
    }

    public void stopServer() {
        System.out.println("Shutting Down Jetty Server...");
    }

    public String getName() {
        return "Jetty";
    }
}
