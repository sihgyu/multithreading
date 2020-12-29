package java8;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author yusx
 * @date 2020/12/29 3:05 下午
 */
@Data
@AllArgsConstructor
public class Customer {
    /**
     * 顾客id
     */
    private Long id;

    /**
     * 顾客姓名
     */
    private String name;
}
