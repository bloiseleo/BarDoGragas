package com.bardogragas.infra;

import briot.apis.DataDragonAPI;
import briot.events.DataDragonObservableThread;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ResourceLoader;

import java.net.http.HttpClient;
import java.util.List;

@DataDragonDownloader
@Log4j2
public class DataDragonDownloadCMD implements CommandLineRunner {
    private final DataDragonAPI api;
    private final DataDragonObservableThread.HandleDataDragonDownloadObserver observer;
    public DataDragonDownloadCMD(ResourceLoader resourceLoader, DataDragonObservableThread.HandleDataDragonDownloadObserver observer) {
        HttpClient client = HttpClient.newHttpClient();
        this.api = new DataDragonAPI(client);
        this.observer = observer;
    }
    private String getLastVersion() {
        List<String> versions = api.getVersion();
        return versions.get(0);
    }
    @Override
    public void run(String... args) throws Exception {
        String lastVersion = getLastVersion();
        api.dragonTail(lastVersion, observer);
    }
}
