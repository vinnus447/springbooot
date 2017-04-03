package learn.study.controller;

import learn.study.entity.phone;
import learn.study.service.PhoneDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.awt.*;
import java.lang.reflect.Method;
import java.util.Collection;

/**
 * Created by vinod on 4/1/2017.
 */


@RestController
@RequestMapping("/phoneDetails")
public class PhoneBookController {
    @Autowired
    private PhoneDetailsService phoneDetailsService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<phone> getAllPhoneDetails() {

        return phoneDetailsService.getAllPhoneDetails();
    }



    @RequestMapping(value = "/{phoneNumber}",method = RequestMethod.GET)
    public phone getPhoneDetailsByNumber(@PathVariable("phoneNumber") String phoneNumber){

        return phoneDetailsService.getPhoneDetailsByNumber(phoneNumber);
    }

    @RequestMapping(value = "/{phoneNumber}",method = RequestMethod.DELETE)
    public void removePhoneDetailsByNumber(@PathVariable("phoneNumber") String phoneNumber){

        phoneDetailsService.removePhoneDetailsByNumber(phoneNumber);

    }

    @RequestMapping(method=RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePoneDetailsByPhoneNumber(@RequestBody  phone p){

        phoneDetailsService.updatePoneDetailsByPhoneNumber(p);
    }

    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPhoneDetails(@RequestBody phone p){
        phoneDetailsService.insertPhoneDetails(p);
    }
}
