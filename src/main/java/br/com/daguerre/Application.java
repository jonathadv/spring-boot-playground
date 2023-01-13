package br.com.daguerre;

import br.com.daguerre.domain.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
  @Value("${application.name}")
  private String applicationName;

  @Value("${application.version}")
  private String applicationVersion;

  @Autowired
  @Qualifier("dog")
  private Animal dog;

  @Autowired
  @Qualifier("cat")
  private Animal cat;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @GetMapping("/cat")
  public String catSpeak() {
    return cat.speak();
  }

  @GetMapping("/dog")
  public String dogSpeak() {
    return dog.speak();
  }

  @GetMapping("/hello")
  public String helloWorld() {
    return String.format("%s (v%s)", applicationName, applicationVersion);
  }
}
