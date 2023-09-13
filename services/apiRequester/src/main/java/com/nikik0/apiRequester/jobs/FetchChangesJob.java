package com.nikik0.apiRequester.jobs;

import com.nikik0.apiRequester.service.ApiRequesterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class FetchChangesJob {

    private final ApiRequesterService requesterService;

    @Scheduled(fixedRate = 60*60*1000)
    public void fetchChanges(){
        log.info("started job");
        requesterService.gettest();
    }
}
