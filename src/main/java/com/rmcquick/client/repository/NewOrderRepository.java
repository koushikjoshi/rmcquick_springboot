package com.rmcquick.client.repository;

import com.rmcquick.client.model.NewOrder;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewOrderRepository extends JpaRepository<NewOrder, Long> {

    @EntityGraph(attributePaths = "status")
    List<NewOrder> findAllWithStatus();

}
