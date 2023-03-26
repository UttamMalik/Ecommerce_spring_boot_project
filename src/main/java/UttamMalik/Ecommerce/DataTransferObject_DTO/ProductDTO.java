package UttamMalik.Ecommerce.DataTransferObject_DTO;

import UttamMalik.Ecommerce.model.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
