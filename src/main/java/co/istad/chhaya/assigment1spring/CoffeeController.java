package co.istad.chhaya.assigment1spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CoffeeController {
    private final ArrayList<Coffee> coffeeList;

    public CoffeeController(ArrayList<Coffee> coffeeList){
        this.coffeeList=coffeeList;
    }

    @GetMapping("/api/coffees")
    public ArrayList<Coffee> getAllCoffees(){
        return coffeeList;
    }

}
