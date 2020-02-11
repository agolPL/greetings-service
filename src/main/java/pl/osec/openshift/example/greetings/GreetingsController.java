package pl.osec.openshift.example.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class GreetingsController {

    @GetMapping
    String greetings() {
        return "Hello WJUG dziwne asdasd asd \n";
    }
}
