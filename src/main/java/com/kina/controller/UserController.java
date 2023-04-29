package com.kina.controller;

import com.kina.service.BookService;
import com.kina.service.UserService;
import com.kina.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // controller层调用service层
    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model) {
        // 把用户的信息存在session中
        List<String> names = userService.queryAllName();
        if (names.contains(username)) {
            model.addAttribute("username", username);
            model.addAttribute("password", password);
            session.setAttribute("userLoginInfo", username);
        }
        return "redirect:/book/allBook";
    }

}
