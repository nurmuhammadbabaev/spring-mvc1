package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.Service;
import web.dao.ServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
 Service service=new ServiceImpl();
 @GetMapping("carsAll")
public String printAllCar(ModelMap model){
     model.addAttribute("infoCar",service.getAllCar());
    return "cars";
}

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam("count")int count, ModelMap model){

     model.addAttribute("infoCar",service.getCar(count));

  return "cars";
    }




}
