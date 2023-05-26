package ma.sir.pmp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@EnableFeignClients("ma.zsmart.engflexy.required.facade")
@SpringBootApplication
public class PmpApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx = SpringApplication.run(PmpApplication.class, args);
    }

    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }
}
