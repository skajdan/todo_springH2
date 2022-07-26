package com.michal.spring_project.reports;

import com.michal.spring_project.model.event.TaskDone;
import com.michal.spring_project.model.event.TaskUndone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
class ChangedTaskEventListener{
    private static final Logger logger = LoggerFactory.getLogger(ChangedTaskEventListener.class);

    private final PersistedTaskEventRepository repository;

    ChangedTaskEventListener(final PersistedTaskEventRepository repository) {
        this.repository = repository;
    }

    @EventListener
    public void on(TaskDone event){
        logger.info("Got " + event);
        repository.save(new PersistedTaskEvent(event));
    }

    @EventListener
    public void on(TaskUndone event){
        logger.info("Got " + event);
        repository.save(new PersistedTaskEvent(event));
    }
}
