package guru.springframework.chucknorris.controller;

import guru.springframework.chucknorris.service.ChuckNorrisService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChuckNorrisController {

    ChuckNorrisService chuckNorrisService;

    public ChuckNorrisController(ChuckNorrisService service){
        this.chuckNorrisService = service;
    }

    @GetMapping({"/", ""})
    public String viewJoke(Model model){
        String joke = chuckNorrisService.getJoke();
       model.addAttribute("joke", joke);

       return "index";
    }
}
