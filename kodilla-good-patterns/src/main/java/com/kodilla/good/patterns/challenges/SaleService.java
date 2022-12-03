package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface SaleService {
    boolean sale(User user, Product product, LocalDate saleDate);
}
