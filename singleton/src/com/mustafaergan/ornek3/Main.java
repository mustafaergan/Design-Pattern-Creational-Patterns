package com.mustafaergan.ornek3;


public class Main {
    public static void main(String[] args) {

        Thread threadBir = new Thread(() -> {Util util = Util.getInstance();});
        Thread threadIki = new Thread(() -> {Util util = Util.getInstance();});

        threadBir.start();
        threadIki.start();

        System.out.println(Util.getInstance().topla(4,5));

        System.out.println(Util.getInstance().topla(4,5));

    }
}
