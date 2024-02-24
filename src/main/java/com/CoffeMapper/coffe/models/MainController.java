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

//    @PostMapping(path="/add")
//    public @ResponseBody String addNewUser (@RequestParam Integer coffe_point_id,
//                                            @RequestParam String name,
//                                            @RequestParam String logo,
//                                            @RequestParam String description,
//                                            @RequestParam String email,
//                                            @RequestParam String address,
//                                            @RequestParam Integer brand_id,
//                                            @RequestParam String work_time) {
//
//        Coffe_point n = new Coffe_point();
//
//        n.setCoffe_point_id(coffe_point_id);
//        n.setLogo(logo);
//        n.setDescription(description);
//        n.setAddress(address);
//        n.setBrand_id(brand_id);
//        n.setName(name);
//        n.setEmail(email);
//        n.setWork_time(work_time);
//
//        userRepository.save(n);
//        return "Saved";
//    }


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


//curl http://localhost:8081/add -d name=First -d email=someemail@someemailprovider.com
//curl http://localhost:8081/hello /