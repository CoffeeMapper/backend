package com.CoffeMapper.coffe.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="")
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam Integer id,
                                            @RequestParam String name,
                                            @RequestParam String logo,
                                            @RequestParam String discription,
                                            @RequestParam String email,
                                            @RequestParam String addres,
                                            @RequestParam String login,
                                            @RequestParam String password) {

        Organization n = new Organization();

        n.setId(id);
        n.setLogo(logo);
        n.setDiscription(discription);
        n.setAddres(addres);
        n.setLogin(login);
        n.setName(name);
        n.setEmail(email);
        n.setPassword(password);

        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/hello")
    public @ResponseBody Iterable<Organization> getAllUsers() {
        return userRepository.findAll();
    }
}
//curl http://localhost:8081/add -d name=First -d email=someemail@someemailprovider.com
//curl http://localhost:8081/hello