package tests.day14TestNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGFirst {

    /*
         testNG test methodlarini isim sirasina göre calistirir.
         priority degeri verilen methodlar priority degeri kücükten büyüge göre calisir

         Esit olan priority degerlerine harf sirasina göre calisir eger priority degeri yazmazsak
         priority=0 kabul edilir

     */



    @Test(priority = 6)
    public  void ilkTest(){

        System.out.println("illk teest calisti");

    }
    @Test(priority = 9)
    public  void ikinciTest(){

        System.out.println("illk teest calisti");

    }
    @Test (priority = 44)
    public  void ucuncuTest(){

        System.out.println("illk teest calisti");

    }

}
