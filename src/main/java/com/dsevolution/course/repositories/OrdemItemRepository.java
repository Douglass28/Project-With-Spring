package com.dsevolution.course.repositories;

import com.dsevolution.course.entities.Category;
import com.dsevolution.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Integer> {
}
