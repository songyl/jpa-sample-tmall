package yang.yu.tmall.domain;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.Stream;

public interface Orders {
    Optional<Order> getById(int id);

    Optional<Order> getByOrderNo(String orderNo);

    Stream<Order> findByBuyerOrderByCreatedDesc(Buyer buyer);

    Stream<Order> findByCreatedBetweenOrderByCreatedDesc(LocalDateTime from, LocalDateTime to);

    Stream<Order> findByBuyerAndCreatedBetweenOrderByCreatedDesc(Buyer buyer, LocalDateTime from, LocalDateTime to);

    Stream<Order> findByBuyerAndStatusOrderByCreatedDesc(Buyer buyer, OrderStatus status);
}
