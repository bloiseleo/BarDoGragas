package com.bardogragas.infra;

import briot.events.DataDragonObservableThread;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.time.Instant;

@DataDragonDownloader
@Log4j2
public class DataDragonObserver implements DataDragonObservableThread.HandleDataDragonDownloadObserver {
    @Override
    public void handleDownloadStarted() {
        Instant now = Instant.now();
        log.info("Download started at {}", now.toString());
    }

    @Override
    public void handleDataDragonDownloadFinished(File file) {
        log.info("Download finished at {} and temp file located at {}", Instant.now().toString(), file.toPath());
    }

    @Override
    public void handleDataDragonDownloadError(Exception e) {

    }
}
