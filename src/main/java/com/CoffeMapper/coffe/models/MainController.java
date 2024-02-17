package com.CoffeMapper.coffe.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="")
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam Integer id,
                                            @RequestParam String name,
                                            @RequestParam String logo,
                                            @RequestParam String description,
                                            @RequestParam String email,
                                            @RequestParam String address,
                                            @RequestParam String login,
                                            @RequestParam String password) {

        Organization n = new Organization();

        n.setId(id);
        n.setLogo(logo);
        n.setDiscription(description);
        n.setAddress(address);
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

    @RequestMapping(value="/organization",

            method=RequestMethod.POST,

            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public void createRole(@ModelAttribute Organization formData){
        System.out.printf(formData.toString());

    }
}
//curl http://localhost:8081/add -d name=First -d email=someemail@someemailprovider.com
//curl http://localhost:8081/hello