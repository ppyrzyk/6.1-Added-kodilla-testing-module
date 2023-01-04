package com.kodilla.patterns.strategy;

public class DeniedPredictor implements BuyPredictor{
    @Override
    public String predictWhatToBuy() {
        return null;
    }
}
