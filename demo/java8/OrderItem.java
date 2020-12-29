package java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yusx
 * @date 2020/12/29 3:00 下午
 * 商品类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    /**
     * 商品id
     */
    private Long productId;

    /**
     * 商品名称
     */
    private Long productName;

    /**
     * 商品价格
     */
    private Double productPrice;

    /**
     * 商品数量
     */
    private Integer productQuantity;
}
