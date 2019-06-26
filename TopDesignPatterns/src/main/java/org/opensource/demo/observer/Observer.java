package org.opensource.demo.observer;

public interface Observer {
    public void update(int totalAttendees, int totalSpeakers, String nameEvent);
}
