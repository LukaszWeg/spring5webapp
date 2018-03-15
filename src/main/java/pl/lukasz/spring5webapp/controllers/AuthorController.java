package pl.lukasz.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.lukasz.spring5webapp.repositories.AuthorRepository;
@Controller
public class AuthorController {
    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(value = "/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
