package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TOrder {
    private int id; // 主键id
    private String name; // 商品名称
    private Double price; // 商品价格
    private String dbSource; // 所存的数据库
    private  String propertryName; //属性名称
}
