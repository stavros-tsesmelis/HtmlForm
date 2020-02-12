package gr.test.forms.handlingformsubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingsController {


    @GetMapping("/greetings")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greetings";
    }


    @PostMapping("/greetings")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }


}

