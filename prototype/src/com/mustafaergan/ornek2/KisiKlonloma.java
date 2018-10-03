package com.mustafaergan.ornek2;


public class KisiKlonloma {
    public static void main(String[] args) {
        Kisi mustafa1 = KisiFabrikasi.getPrototype("mustafa");
        System.out.println(mustafa1);

        Kisi mustafa2 = KisiFabrikasi.getPrototype("mustafa");
        System.out.println(mustafa2);


        Kisi ahmet1 = KisiFabrikasi.getPrototype("ahmet",10);
        Kisi ahmet2 = KisiFabrikasi.getPrototype("ahmet",20);

        System.out.println("Kisi Yas:"+ahmet1.getYas());
        System.out.println("Kisi Yas:"+ahmet2.getYas());


    }
}
