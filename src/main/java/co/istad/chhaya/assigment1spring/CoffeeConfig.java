package co.istad.chhaya.assigment1spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class CoffeeConfig {

    @Bean
    public Coffee coffee1(){
        return new Coffee("A001", "Latte", 2.5, true);
    }

    @Bean
    public Coffee coffee2(){
        return new Coffee("A002", "Espresso", 2.0, false);
    }
    @Bean
    public Coffee coffee3(){
        return new Coffee("A003", "Matcha", 3.0, true);
    }

    @Bean
    public ArrayList<Coffee> coffeeList(){
        ArrayList<Coffee> list=new ArrayList<>();
        list.add(coffee1());
        list.add(coffee2());
        list.add(coffee3());
        return list;
    }

}
