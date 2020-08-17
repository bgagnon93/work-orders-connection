package com.bgagnon;

import com.bgagnon.agent.Agent;
import com.bgagnon.agent.AgentBuilder;
import com.bgagnon.agent.AgentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner test(AgentRepository repository) {
        return (args) -> {
            List<Agent> agents = repository.getFromLocation("Bangalore");

            Agent agent = repository.findById("A007").get();
            Agent agent2 = new AgentBuilder().code("A014").name("Brian").workingArea("Connecticut").commission((float) 1000.00).phone("203-513-1395").country("USA").build();
//            Agent agent2 = Agent.builder().code("111111").name("Brian").workingArea("Developer").commission((float) 1000.00).phone("203-513-1395").country("USA").build();
            repository.save(agent2);
        };
    }
}
