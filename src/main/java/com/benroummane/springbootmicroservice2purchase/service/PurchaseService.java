package com.benroummane.springbootmicroservice2purchase.service;

import com.benroummane.springbootmicroservice2purchase.model.Purchase;

import java.util.List;

public interface PurchaseService
{
    Purchase savePurchase(Purchase purchase);

    List<Purchase> findAllPurchasesOfUser(Long userId);
}
