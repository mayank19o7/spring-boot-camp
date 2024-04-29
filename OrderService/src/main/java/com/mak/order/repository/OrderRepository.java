package com.mak.order.repository;

import com.mak.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for managing {@link Order} entities.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    /**
     * Find orders by category.
     *
     * @param category the category to search for
     * @return a list of orders matching the given category
     */
    List<Order> findByCategory(String category);
}
