package co.istad.chhaya.assigment1spring;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
    private  String code;
    private String name;
    private Double price;
    private Boolean isAvailable;

}
