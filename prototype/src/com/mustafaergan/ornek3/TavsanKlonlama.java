package com.mustafaergan.ornek3;

public class TavsanKlonlama {

    public static void main(String[] args) {
        Tavsan tavsan1 = new Tavsan();
        tavsan1.setAge(5);
        tavsan1.setSahibi("Mustafa");
        Tavsan tavsan2 = (Tavsan) tavsan1.clone();

        System.out.println("tavsan 1 sahibi: "+tavsan1.getSahibi().getIsim());
        System.out.println("tavsan 2 sahibi: "+tavsan2.getSahibi().getIsim());

        tavsan2.getSahibi().setIsim("Ahmet");

        System.out.println("tavsan 1 sahibi: "+tavsan1.getSahibi().getIsim());
        System.out.println("tavsan 2 sahibi: "+tavsan2.getSahibi().getIsim());

    }

}
