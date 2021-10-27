package spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "spring_boot")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}