package com.mustafaergan.ornek1;

public class TavsanKlonlama {

    public static void main(String[] args) {
        Tavsan tavsan1 = new Tavsan();
        tavsan1.setAge(5);
        Tavsan tavsan2 = (Tavsan) tavsan1.clone();

        System.out.println("tavsan 1 yasi: "+tavsan1.getAge());
        System.out.println("tavsan 2 yasi: "+tavsan2.getAge());

        tavsan2.setAge(10);

        System.out.println("tavsan 1 yasi: "+tavsan1.getAge());
        System.out.println("tavsan 2 yasi: "+tavsan2.getAge());


        tavsan1.setTur(Tur.TURK);
        tavsan2.setTur(Tur.ALMAN);


        System.out.println("tavsan 1 tur: "+tavsan1.getTur());
        System.out.println("tavsan 2 tur: "+tavsan2.getTur());


        tavsan2 = (Tavsan) tavsan1.clone();

        System.out.println("tavsan 1 yasi: "+tavsan1.getAge());
        System.out.println("tavsan 2 yasi: "+tavsan2.getAge());

        System.out.println("tavsan 1 tur: "+tavsan1.getTur());
        System.out.println("tavsan 2 tur: "+tavsan2.getTur());

    }

}
