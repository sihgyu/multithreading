package java8;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author yusx
 * @date 2020/12/29 2:55 下午
 * 订单类
 */
@Data
public class Order {
    private Long id;

    /**
     * 顾客id
     */
    private Long customerId;

    /**
     * 顾客名称
     */
    private String customerName;

    /**
     * 总价格
     */
    private Double totalPrice;

    /**
     * 商品列表
     */
    private List<OrderItem> orderItemList;

    /**
     * 下单时间
     */
    private LocalDateTime placedAt;
}
