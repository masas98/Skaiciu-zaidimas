package com.company;

public class Main {

    public static void main(String[] args) {
// 1užd Sugeneruokite 300 atsitiktinių skaičių nuo 0 iki 300,
// atspausdinkite juos atskirtus tarpais ir suskaičiuokite kiek tarp jų yra didesnių už 150.
// Skaičiai didesni nei 275 turi būti atspausdinti skliausteliuose” [ ] “.

//        for(int i=0; i<300; i++){
//            int rnd = (int)((Math.random()*300));
//            if (rnd>150&&rnd<275){
//                System.out.print(" "+rnd);
//            }
//            if (rnd>275){
//                System.out.print(" ["+rnd+"]");
//            }
//
//        }

//        Vienoje eilutėje atspausdinkite visus skaičius nuo 1 iki 3000, kurie dalijasi iš 77 be liekanos.
//        Skaičius atskirkite kableliais. Po paskutinio skaičiaus kablelio neturi būti.

//        for (int i=0; i<3000; i++){
//            int random=(int)((Math.random()*3000));
//            int skaicius=random%77;
//            if (skaicius==0){
//                System.out.print(","+random);
//            }
//        }

//        Nupieškite kvadratą iš “*”, kurio kraštines sudaro 100 “*”.
//                  * * * * * * * * * * *
//                  * * * * * * * * * * *
//                  * * * * * * * * * * *
//                  * * * * * * * * * * *
//                  * * * * * * * * * * *
//                  * * * * * * * * * * *
//                  * * * * * * * * * * *


//    for (int i=0; i<25; i++) {
//        System.out.println("");
//        for (int a = 0; a < 25; a++) {
//            System.out.print(" *");
//        }
//    }

//

        //    for (int i=0; i<4; i++){
//        int random=(int)((Math.random()*2));
//        if (random != 0)
//            System.out.println("H");
//
//    }
//        ;

//        boolean herbas=true;
//        int count=0;
//        while (herbas /* kol moneta nelygi herbui*/){
//            while(count<3) {
//                int random=(int)((Math.random()*2));
//
//                if (random == 1) {
//                    System.out.println("S");
//                    count=0;
//
//                } else {
//                    System.out.println("H");
//                    herbas = false;
//                    count++;
//
//                }
//            }
//        }





        int countPetras=0;
        int countKazys=0;
        boolean laimetojas=false;

        while(laimetojas==false){
            if (countPetras<222 && countKazys<222){
                int petras=(int) (Math.random()* 16 + 5);
                int kazys=(int) (Math.random()* 21 + 5);
//                System.out.println("Petras: "+petras);
//                System.out.println("Kazys:" +kazys);
                countPetras = countPetras + petras;
                countKazys = countKazys + kazys;
//                System.out.println("Petro suma: "+countPetras);
//                System.out.println("Kazio suma: "+countKazys);

            }
            else {

                if (countPetras >=222 && countKazys <= 222){
                    System.out.println("Laimėtojas Petras");
                }
                if (countKazys >= 222 && countPetras <= 222){
                    System.out.println("Laimėtojas Kazys");
                }
                if (countKazys>=222 && countPetras>=222){
                    System.out.println("Lygiosios");
                }
                laimetojas=true;
            }


        }











        }
}
