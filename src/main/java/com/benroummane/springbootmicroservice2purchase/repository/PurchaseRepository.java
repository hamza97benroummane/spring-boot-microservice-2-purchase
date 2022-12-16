package com.benroummane.springbootmicroservice2purchase.repository;

import com.benroummane.springbootmicroservice2purchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PurchaseRepository extends JpaRepository<Purchase, Long>
{

    List<Purchase> findAllByUserId(Long userId);
}
