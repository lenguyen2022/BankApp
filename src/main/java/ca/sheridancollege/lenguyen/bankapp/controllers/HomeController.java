package ca.sheridancollege.lenguyen.bankapp.controllers;

import ca.sheridancollege.lenguyen.bankapp.databases.AccountRepository;
import ca.sheridancollege.lenguyen.bankapp.databases.BankRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    AccountRepository accountRepository;
    BankRepository bankRepository;
    public HomeController(AccountRepository accountRepository, BankRepository bankRepository) {
        this.accountRepository = accountRepository;
        this.bankRepository = bankRepository;
    }

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("accounts", accountRepository.findAll());
        modelAndView.addObject("banks", bankRepository.findAll());
        return modelAndView;
    }
    @RequestMapping("/addAccount")
    public ModelAndView addAccount() {
        ModelAndView modelAndView = new ModelAndView("addAccount");
        return modelAndView;
    }
    @RequestMapping("/addBank")
    public ModelAndView addBank() {
        ModelAndView modelAndView = new ModelAndView("addBank");
        return modelAndView;
    }
}
