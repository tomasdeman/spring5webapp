package be.tomasdeman.spring5webapp.controllers;

import be.tomasdeman.spring5webapp.repositories.AuthorRepository;
import be.tomasdeman.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController
{
  private AuthorRepository bookRepository;

  public AuthorController(AuthorRepository bookRepository)
  {
    this.bookRepository = bookRepository;
  }

  @RequestMapping("/authors")
  public String getBooks(Model model)
  {
    model.addAttribute("authors", bookRepository.findAll());
    return "authors";
  }
}
