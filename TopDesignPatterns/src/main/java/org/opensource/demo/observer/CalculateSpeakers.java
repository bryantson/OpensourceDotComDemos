package org.opensource.demo.observer;

public class CalculateSpeakers implements Observer {
    private int totalAttendees;
    private int totalSpeakers;
    private Topic topic;

    public CalculateSpeakers(Topic topic) {
        this.topic = topic;
        topic.addObserver(this);
    }

    public void update(int totalAttendees, int totalSpeakers, String nameEvent) {
        this.totalAttendees = totalAttendees;
        this.totalSpeakers = totalSpeakers;
        calculateSpeakersPercent();
    }

    public void calculateSpeakersPercent() {
        System.out.print("We have about " + (totalSpeakers * 100 / totalAttendees) + " % of speakers");
    }
}
