package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarsDAO;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/cars")
public class CarsController {
    @Autowired
    private CarsDAO carsDAO;

    @GetMapping
    public String cars(@RequestParam(value = "count",required = false) Integer count, Model model) {
        model.addAttribute("cars",carsDAO.getCars(count));
        return "cars";
    }

}