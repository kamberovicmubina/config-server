package ba.unsa.etf.nwt.easytravelapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EasytravelappApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasytravelappApplication.class, args);
    }

}
