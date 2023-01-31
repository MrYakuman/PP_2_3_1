package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private CarService carService;
    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/car")
    public String printCar(@RequestParam(defaultValue = "5") String count, Model modelMap) {
        modelMap.addAttribute("message", carService.showCars(Integer.parseInt(count)));
        return "car";
    }
}

