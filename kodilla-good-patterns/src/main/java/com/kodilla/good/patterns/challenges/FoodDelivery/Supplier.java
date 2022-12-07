package com.kodilla.good.patterns.challenges.FoodDelivery;

import java.util.Objects;

public class Supplier implements SupplierProcess {

    private String name;
    private String suppliersAddress;

    public Supplier(String name, String suppliersAddress) {
        this.name = name;
        this.suppliersAddress = suppliersAddress;
    }

    public String getName() {
        return name;
    }

    public String getSuppliersAddress() {
        return suppliersAddress;
    }

    @Override
    public void process(Product getProduct, int purchaseVolume) {
        System.out.println("Information");
    }
    @Override
    public String toString(){
        return "Supplier" + name +
                "with headquarters at: " + suppliersAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(name, supplier.name) && Objects.equals(suppliersAddress, supplier.suppliersAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, suppliersAddress);
    }
}