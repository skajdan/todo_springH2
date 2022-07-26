package com.michal.spring_project.model.event;

import com.michal.spring_project.model.Task;

import java.time.Clock;

public class TaskUndone extends TaskEvent {
    public TaskUndone(final Task source) {
        super(source.getId(), Clock.systemDefaultZone());
    }
}
