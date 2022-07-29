package jp.ac.yasunagalab.yacm_ws.presentation;


import jp.ac.yasunagalab.yacm_ws.domain.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterUserController {
    @GetMapping("/register_user")
    public String registerUserForm(Model model) {
        model.addAttribute("user", new User());
        return "register_user/registerUser";
    }

    @PostMapping("/register_user")
    public String registerUserSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        // get user instance from client
        return "register_user/resultRegisterUser";
    }
}
