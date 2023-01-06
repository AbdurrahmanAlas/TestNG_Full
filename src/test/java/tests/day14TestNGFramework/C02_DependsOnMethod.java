package tests.day14TestNGFramework;

import org.testng.annotations.Test;

public class C02_DependsOnMethod {


    @Test()
    public  void ilkTest(){

        System.out.println("illk teest calisti");

    }
    @Test(dependsOnMethods = "ilkTest")
    public  void ikinciTest(){

        System.out.println("2 teest calisti");

    }
    @Test (dependsOnMethods = "ikinciTest ")
    public  void ucuncuTest(){

        System.out.println("3 teest calisti");

    }



}
