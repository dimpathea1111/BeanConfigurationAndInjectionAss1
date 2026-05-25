package co.istad.chhaya.assigment1spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.UUID;

@Configuration
public class CoffeeConfig {

  @Bean
    public Coffee  cortado(){
      Coffee coffee=new Coffee();
      coffee.setCode("A001");
      coffee.setName("Cortado");
      coffee.setPrice(1.25);
      coffee.setIsAvailable(true);
      return coffee;
  }

    @Bean
    public Coffee  macchiato(){
        Coffee coffee=new Coffee();
        coffee.setCode("A002");
        coffee.setName("Macchiato");
        coffee.setPrice(2.50);
        coffee.setIsAvailable(true);

        return coffee;
    }

    @Bean
    public Coffee  mocha(){
        Coffee coffee=new Coffee();
        coffee.setCode("A003");
        coffee.setName("Mocha");
        coffee.setPrice(2.00);
        coffee.setIsAvailable(true);
        return coffee;
    }

    @Bean
    public List<Coffee> coffees(
            Coffee cortado,
            Coffee macchiato,
            Coffee mocha
    ){
      return  List.of(
              cortado,
              macchiato,
              mocha
      );
    }



}
