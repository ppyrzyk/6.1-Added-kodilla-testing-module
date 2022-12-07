package com.kodilla.good.patterns.challenges.FoodDelivery;

public class MailInfo implements SaleInformation{
    @Override
    public void inform(Order order, boolean isSold) {
         if(isSold) {
             System.out.println("\nDear"+ order.getUser().getFirstName() + " " + order.getUser().getLastName() + " your order has been successful.");
             System.out.println("Ordered products: " + order.getProduct().getName() + " price of " + order.getProduct().getPrice() + "USD");
             System.out.println("You have ordered " + order.getPurchaseVolume() + " units");
             System.out.println("The purchased products will be sent to the following address: "
                     + order.getUser().getAddress());
             System.out.println("You have placed the order on: " + order.getSaleDate());
         }else{
             System.out.println("Dear " + order.getUser().getFirstName()+ "\nYour order could not be completed. \nPlease try again!" +
                     "\nThank you");
             System.out.println("The products " + order.getProduct().getName() + " are not available at the moment. Please adjust the quantity of units");
         }

    }
}
