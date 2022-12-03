package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface InformationService {
    void information(User user, Product product, LocalDate saleDate, boolean isSold );
}
