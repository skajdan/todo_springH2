package com.michal.spring_project.model.event;

import com.michal.spring_project.model.Task;

import java.time.Clock;

public class TaskDone extends TaskEvent{
    public TaskDone(final Task source) {
        super(source.getId(), Clock.systemDefaultZone());
    }
}
