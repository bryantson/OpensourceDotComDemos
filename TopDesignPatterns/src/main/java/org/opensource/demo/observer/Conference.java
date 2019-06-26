package org.opensource.demo.observer;

import java.util.List;
import java.util.ArrayList;

public class Conference implements Topic {
    private List<Observer> listObservers;
    private int totalAttendees;
    private int totalSpeakers;
    private String nameEvent;

    public Conference() {
        listObservers = new ArrayList<Observer>();
    }

    public void addObserver(Observer observer) {
        listObservers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        int i = listObservers.indexOf(observer);
        if (i >= 0) {
            listObservers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i=0, nObservers = listObservers.size(); i < nObservers; ++ i) {
            Observer observer = listObservers.get(i);
            observer.update(totalAttendees,totalSpeakers,nameEvent);
        }
    }

    public void setConferenceDetails(int totalAttendees, int totalSpeakers, String nameEvent) {
        this.totalAttendees = totalAttendees;
        this.totalSpeakers = totalSpeakers;
        this.nameEvent = nameEvent;
        notifyObservers();
    }
}
