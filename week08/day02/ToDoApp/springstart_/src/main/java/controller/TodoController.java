package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.ToDoRepository;

@Controller
@RequestMapping(value ="/todo")
public class TodoController {
  ToDoRepository toDoRepository;

  @Autowired
  public TodoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public String list2(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "This is my first todo!";
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  @ResponseBody
  public String list(Model model) {
    return "index";
  }
}