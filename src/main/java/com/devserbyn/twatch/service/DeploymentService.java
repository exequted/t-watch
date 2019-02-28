package com.devserbyn.twatch.service;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.IOException;

@PropertySources ({
        @PropertySource ("classpath:deployment.properties")
})
public interface DeploymentService {

    @Scheduled (cron = "${deployment.preventScheduling.cronExp}")
    void postponeSnoozeOnServer() throws IOException;
}
