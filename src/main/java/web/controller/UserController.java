package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.DAO.UserDAOPackage.UserDAO;
import web.DAO.UserDAOPackage.UserDAOImpl;
import web.model.User;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserDAO userDAO;

    @Autowired
    public UserController(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping
    public String printUsers(Model model) {
        model.addAttribute("users", userDAO.showUsers());
        return "users";
    }

    @PostMapping
    public String create(@ModelAttribute("user") User user) {
        userDAO.save(user);
        return "redirect:/";
    }
    @GetMapping("/new")
    public String newUser(@ModelAttribute("user") User user) {
        return "/newUser";
    }

    @GetMapping("/{id}")
    public String printUserById(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userDAO.getUserById(id));
        return "/userID";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user") User user) {
        userDAO.update(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") long id) {
        userDAO.delete(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") long id) {
        model.addAttribute("user", userDAO.getUserById(id));
        return "/edit";
    }

}
