package kitchenpos.eatinorders.tobe.domain.repository;

import kitchenpos.eatinorders.tobe.domain.entity.EatInOrder;
import kitchenpos.eatinorders.tobe.domain.entity.OrderTable;

import java.util.Optional;
import java.util.UUID;

public interface EatInOrderRepository {

    EatInOrder save(EatInOrder order);

    Optional<EatInOrder> findById(UUID id);

    boolean isAllCompleteByOrderTable(OrderTable orderTable);
}