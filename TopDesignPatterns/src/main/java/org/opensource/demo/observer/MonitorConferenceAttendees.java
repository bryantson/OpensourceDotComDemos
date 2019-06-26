package org.opensource.demo.observer;

public class MonitorConferenceAttendees implements Observer {
    private int totalAttendees;
    private int totalSpeakers;
    private String nameEvent;
    private Topic topic;

    public MonitorConferenceAttendees(Topic topic) {
        this.topic = topic;
        topic.addObserver(this);
    }

    public void update(int totalAttendees, int totalSpeakers, String nameEvent) {
        this.totalAttendees = totalAttendees;
        this.totalSpeakers = totalSpeakers;
        this.nameEvent = nameEvent;
        printConferenceInfo();
    }

    public void printConferenceInfo() {
        System.out.println(this.nameEvent + " has " + totalSpeakers + " speakers and " + totalAttendees + " attendees");
    }
}
