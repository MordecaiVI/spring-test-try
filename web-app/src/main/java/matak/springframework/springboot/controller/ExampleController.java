package matak.springframework.springboot.controller;


import matak.springframework.model.ShippingAddress;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress(){
        return new ShippingAddress();
    }

}
