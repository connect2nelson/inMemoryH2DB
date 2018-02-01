package fun.abm.nelson.inMemoryH2DbDemo.controller;


import fun.abm.nelson.inMemoryH2DbDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserDetailsController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity userDetails() {
        List userDetails = userService.getUserDetails();
        return new ResponseEntity(userDetails, HttpStatus.OK);
    }
}
