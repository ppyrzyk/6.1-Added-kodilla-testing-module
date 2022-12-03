package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SaleRepository {

    void createSoldProduct(User user, Product product, LocalDate saleDate);
}
