package com.deepak.spring.test.springbootkubernetes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomepageController {

    private static final String HOME_PAGE_TEMPLATE = "index";

    @Autowired
    private AppConfig config;

    @GetMapping
    public String helloWorldPage(final Model model) {
        model.addAttribute("message", config.getMessage());
        model.addAttribute("secret", config.getSecret());
        return HOME_PAGE_TEMPLATE;
    }
}
