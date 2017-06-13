package finalApp.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import finalApp.Model.Person;



@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        Person person = new Person();
        model.addAttribute(person);
        return "index";
    }
 
    @PostMapping("/")
    public String consumeForm(@Valid Person person, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            errors.forEach(err -> System.out.println(err.getDefaultMessage()));
        }
        return "index";
    }

}
