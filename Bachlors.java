package com.AppartmentFamilyDivision;

public class Bachlors {
 static    int Maximum_Memebers=4;
  static   int number_of_members;
    static int numbers_of_liters_of_water;
    static int daily_extra_Liters;
    static int daily_amount_for_water_extra_water_for_five_liters=10;

    public static void main(String[] args) {
        Bachlors bb=new Bachlors();
        bb.flat1();
        bb.flat2();
        bb.flat3();
        bb.flat4();
        bb.flat5();
        bb.flat6();
        bb.flat7();

    }
    public int flat1(){
        number_of_members=3;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
      return   number_of_members;
    }
    public int flat2(){
        number_of_members=2;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat3(){
        number_of_members=1;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat4(){
        number_of_members=3;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat5(){
        number_of_members=4;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat6(){
        number_of_members=3;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat7(){
        number_of_members=4;
        numbers_of_liters_of_water=45*number_of_members;
        daily_extra_Liters=5*number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
}
