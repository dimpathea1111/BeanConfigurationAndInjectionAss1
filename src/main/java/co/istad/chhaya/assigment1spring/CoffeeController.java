package co.istad.chhaya.assigment1spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CoffeeController {
    private final List<Coffee> coffees;
    public CoffeeController(List<Coffee> coffees){
        this.coffees=coffees;
    }

    @GetMapping("/coffees")
    public Map<String, Object> getCoffees(){
        return  Map.of(
                "coffees", coffees
        );
    }

}
