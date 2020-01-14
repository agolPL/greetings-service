package pl.osec.openshift.example.greetings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
class GreetingsController {

    @GetMapping
    String greetings() {
        return "Greetings Wrocław JUG\n";
    }
}
