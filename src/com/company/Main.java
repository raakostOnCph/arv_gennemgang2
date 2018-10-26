package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Menneske menneske = new Menneske();

        menneske.setiEgenskaber(new Mand());


        Menneske menneske1 = new Menneske();

        menneske1.setiEgenskaber(new Kvinde());


        Menneske menneske2 = new Menneske();

        menneske2.setiEgenskaber(new Transkønnet());

        System.out.println(menneske1.getiEgenskaber().aktivitet());

        System.out.println(menneske.getiEgenskaber().aktivitet());

        System.out.println(menneske2.getiEgenskaber().aktivitet());
    }

}
