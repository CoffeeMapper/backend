package com.CoffeMapper.coffe.models;

import jakarta.persistence.Id;
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

    @GetMapping(path = "/api/"+VersionApp.version+"/coffee")
    public @ResponseBody Iterable<Coffe_point> getAllUsers() {
        return userRepository.findAll();
    }
}

//для будущего Post запроса, код не удалять

//    @RequestMapping(value="/organization",
//
//            method=RequestMethod.POST,
//
//            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
//
//    public void createRole(@ModelAttribute Coffe_point formData){
//        System.out.printf(formData.toString());
//
//    }
//}
