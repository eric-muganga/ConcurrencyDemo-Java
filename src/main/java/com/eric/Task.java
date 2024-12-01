package com.eric;

public class Task {
    private int id;
    private int duration;

    public Task(int id, int duration) {
        this.id = id;
        this.duration = duration;
    }


    public int getId() {
        return id;
    }
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
