package model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Dictionary;


@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Component
public class Shop {
    private String type;
    private String description;
    private String city;
    private String street;
    private Integer number;
    private Integer postcode;
    private ArrayList<Dictionary<Monster, Integer>> storage;

}
