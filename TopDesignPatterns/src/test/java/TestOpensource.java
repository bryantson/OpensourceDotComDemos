/**
 * TestOpensource.java
 *
 *  Runs the JUnit tests for implemented classes
 * @author Bryant Son
 * @since 06/26/2019
 */

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.opensource.demo.factory.OpensourceFactory;
import org.opensource.demo.factory.OpensourceJVMServers;
import org.opensource.demo.observer.CalculateSpeakers;
import org.opensource.demo.observer.MonitorConferenceAttendees;
import org.opensource.demo.singleton.ImprovedOpensourceSingleton;
import org.opensource.demo.singleton.OpensourceSingleton;
import org.opensource.demo.observer.Conference;

public class TestOpensource {

    @Test
    public void testSingleton_ReturnsSameInstance() {
        System.out.println("\n==== Running Singleton Pattern Test Case: ==== \n");

        OpensourceSingleton firstObject = OpensourceSingleton.getInstance();
        OpensourceSingleton secondObject = OpensourceSingleton.getInstance();

        assertTrue(firstObject.equals(secondObject));
    }

    @Test
    public void testImprovedSingleton_ReturnsSameInstance() {
        System.out.println("\n==== Running Improved Singleton Pattern Test Case: ==== \n");

        ImprovedOpensourceSingleton firstObject = ImprovedOpensourceSingleton.getInstance();
        ImprovedOpensourceSingleton secondObject = ImprovedOpensourceSingleton.getInstance();

        assertTrue(firstObject.equals(secondObject));
    }

    @Test
    public void testFactory_RunsEclipseJetty() {
        System.out.println("\n==== Running Factory Pattern Test Case: ===== \n");

        OpensourceFactory opensourceFactory = new OpensourceFactory();
        OpensourceJVMServers server = opensourceFactory.getServerByVendor("Eclipse");

        assertEquals(server.getName(),"Jetty");
        server.startServer();
        server.stopServer();
    }


    @Test
    public void testFactory_RunsApacheTomcat() {
        System.out.println("\n==== Running Factory Pattern Test Case: ==== \n");

        OpensourceFactory opensourceFactory = new OpensourceFactory();
        OpensourceJVMServers server = opensourceFactory.getServerByVendor("Apache");

        assertEquals(server.getName(),"Tomcat");
        server.startServer();
        server.stopServer();
    }

    @Test
    public void testFactory_RunsRedHatWildFly() {
        System.out.println("\n==== Running Factory Pattern Test Case: ==== \n");

        OpensourceFactory opensourceFactory = new OpensourceFactory();
        OpensourceJVMServers server = opensourceFactory.getServerByVendor("RedHat");

        assertEquals(server.getName(),"WildFly");
        server.startServer();
        server.stopServer();
    }

    @Test
    public void testObserver() {
        System.out.println("\n==== Running Observer Pattern Test Case: ===== \n");

        Conference newConference = new Conference();

        MonitorConferenceAttendees conferenceAttendeesPrint = new MonitorConferenceAttendees(newConference);
        CalculateSpeakers calculateSpeakers = new CalculateSpeakers(newConference);

        newConference.setConferenceDetails(20,10,"AllThingsOpen");
    }


}
