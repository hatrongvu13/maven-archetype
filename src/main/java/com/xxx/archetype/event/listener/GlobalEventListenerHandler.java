package com.xxx.archetype.event.listener;

import com.xxx.archetype.data.event.EventSuccessDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableAsync
public class GlobalEventListenerHandler {

    @Async
    @EventListener(condition = "#event.success")
    public void handleEventSuccess(EventSuccessDto event) {
        log.info("Start handleEventSuccess : {}", event);
        log.info("End handleEventSuccess : {}", event);
    }
}
