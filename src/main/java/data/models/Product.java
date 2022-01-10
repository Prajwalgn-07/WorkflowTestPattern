package data.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private String brand;
    private Integer price;
    private List<Integer> size;
    private List<String>color;
    private List<Integer>quantity;
    private String description;
}
