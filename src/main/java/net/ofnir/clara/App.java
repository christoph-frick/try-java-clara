/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package net.ofnir.clara;

import clara.rules.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;

import java.util.*;

@SpringBootApplication
public class App  {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@Component
class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        WorkingMemory results =
                RuleLoader.loadRules("net.ofnir.clara")
                        .insert(Collections.singletonList(new Customer("Tim")))
                        .fireRules();
        for (QueryResult result: results.query("net.ofnir.clara/get-promotions")) {
            System.out.println(result.getResult("?promotion"));
        }
    }
}