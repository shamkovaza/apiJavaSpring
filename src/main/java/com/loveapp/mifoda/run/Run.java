package com.loveapp.mifoda.run;

import java.time.LocalDateTime;

public class Run {
    private final int id;
    private final String title;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final int distance;
    private final Location location;

    public Run(int id, String title, LocalDateTime startTime, LocalDateTime endTime, int distance, Location location) {
        this.id = id;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public int getDistance() {
        return distance;
    }

    public Location getLocation() {
        return location;
    }


}