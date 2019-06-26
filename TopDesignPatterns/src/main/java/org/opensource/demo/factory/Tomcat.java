package org.opensource.demo.factory;

public class Tomcat implements OpensourceJVMServers {
    public void startServer() {
        System.out.println("Starting Tomcat Server...");
    }

    public void stopServer() {
        System.out.println("Shutting Down Tomcat Server...");
    }

    public String getName() {
        return "Tomcat";
    }
}
