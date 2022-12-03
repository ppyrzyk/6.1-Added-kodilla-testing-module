package com.kodilla.good.patterns.challenges;

public class PurchaseProcessor {

    private InformationService informationService;
    private SaleService saleService;
    private SaleRepository saleRepository;

    public PurchaseProcessor(InformationService informationService, SaleService saleService, SaleRepository saleRepository) {
        this.informationService = informationService;
        this.saleService = saleService;
        this.saleRepository = saleRepository;
    }

    final void process(final Order order){

        boolean isSold = saleService.sale(order.getUser(), order.getProduct(), order.getSaleDate());
        if(isSold){
            informationService.information(order.getUser(), order.getProduct(), order.getSaleDate(), true);
            saleRepository.createSoldProduct(order.getUser(), order.getProduct(), order.getSaleDate());
        }else{
            informationService.information(order.getUser(), order.getProduct(), order.getSaleDate(), false);
        }
    }
}
