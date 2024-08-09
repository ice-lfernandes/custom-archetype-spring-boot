package ${package-name}.app.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HelloGreetingResource {

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public String greeting() {
    return "Hello, World!";
  }

}
