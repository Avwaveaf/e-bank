package com.avwaveaf.cardsservice;

import com.avwaveaf.cardsservice.constants.BeansConst;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = BeansConst.AUDIT_AWARE_IMPL)
public class CardsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsServiceApplication.class, args);
    }

}
