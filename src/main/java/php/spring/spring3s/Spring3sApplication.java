package php.spring.spring3s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"php.spring.spring3s"})
public class Spring3sApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring3sApplication.class, args);
    }

}
