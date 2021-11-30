package com.AppartmentFamilyDivision;

public class BigFamily {
    static    int Maximum_Memebers=7;
    static   int number_of_members;
    static int numbers_of_liters_of_water;
    static int daily_extra_Liters;
    static int daily_amount_for_water_extra_water_for_five_liters=10;
    public static void main(String[] args) {
        BigFamily bb=new BigFamily();
        bb.flat17();
        bb.flat18();
        bb.flat19();
        bb.flat20();
    }
    public int flat17() {
        number_of_members = 7;
        numbers_of_liters_of_water = 45 * number_of_members;
        daily_extra_Liters = 5 * number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat18() {
        number_of_members = 6;
        numbers_of_liters_of_water = 45 * number_of_members;
        daily_extra_Liters = 5 * number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat19() {
        number_of_members = 8;
        numbers_of_liters_of_water = 45 * number_of_members;
        daily_extra_Liters = 5 * number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
    public int flat20() {
        number_of_members = 6;
        numbers_of_liters_of_water = 45 * number_of_members;
        daily_extra_Liters = 5 * number_of_members;
        System.out.println("total limit per day "+numbers_of_liters_of_water+" liters ");
        boolean waterFilled=false;
        return   number_of_members;
    }
}
