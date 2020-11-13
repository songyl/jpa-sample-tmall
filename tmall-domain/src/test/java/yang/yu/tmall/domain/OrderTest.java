package yang.yu.tmall.domain;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest extends BaseUnitTest {

    @Test
    void calculateTotalPrice() {
        OrderLine orderLine1 = new OrderLine();
        orderLine1.setProduct(new Product("a", null));
        orderLine1.setUnitPrice(Money.valueOf(150));
        orderLine1.setQuantity(new BigDecimal(3));
        orderLine1.setDiscountRate(new BigDecimal(30));

        OrderLine orderLine2 = new OrderLine();
        orderLine1.setProduct(new Product("b", null));
        orderLine2.setUnitPrice(Money.valueOf(25.4));
        orderLine2.setQuantity(new BigDecimal(3.2));
        orderLine2.setDiscountRate(new BigDecimal(0));

        Order order = new Order();
        order.addLineItem(orderLine1);
        order.addLineItem(orderLine2);
        double subtotal1 = 150 * 3 * (100 - 30) / 100;
        //System.out.println(subtotal1);
        double subtotal2 = 25.4 * 3.2;
        //System.out.println(subtotal2);
        assertThat(order.getTotalPrice().getAmount().doubleValue())
                .isCloseTo(subtotal1 + subtotal2, Percentage.withPercentage(0.00001));
   }
}