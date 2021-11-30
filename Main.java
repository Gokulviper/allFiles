package com.gokulFIRSTPROJECT;
import com.AppartmentFamilyDivision.*;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static {
        System.out.println("WELCOME TO THE WATER MANAGEMENT SYSTEM " +
                "\nPLEASE DON'T WASTE THE WATER" +
                "\nENTER YOUR FLAT NUMBER FOR GET A TODAY WATER " +
                "\nIF YOU NEW TO OUR FLAT GO TO OUR DOCUMENTATION");
    }

    public static void main(String[] args) {
        Bachlors bachlors = new Bachlors();               //flat 1 to 7
        NormalFamily normalFamily = new NormalFamily();   //flat 8 to 16
        BigFamily bigFamily = new BigFamily();            //flat 17 t0 20
        Scanner sc = new Scanner(System.in);
        Set set=new HashSet();  //this for checkig the family how many times of water supplied

        while (true) {
      System.out.println("ENTER YOUR APARTMENT NO ");
      boolean waterDelivered = true;
      int flat_no = sc.nextInt();
      findFlat(flat_no);

      System.out.println("type 1 to get the today limit \n if you already taken the water today limit is over press 2");

      int get_today_water = sc.nextInt();
      if(get_today_water==2){
          System.out.println("thank you have a nice day");
          break;}
      else if(get_today_water!=1&&get_today_water!=2){
          System.out.println("enter the 1 or 2  ");
         continue;
      }


      if (get_today_water == 1&&!set.contains(flat_no)) {
          if(!set.contains(flat_no))
              set.add(flat_no);
              System.out.println("your daily limit water is distributed");
              System.out.println("if you continue to another house or exit");
              System.out.println("1 for continue" +
                      "\n2 for exit \n press 3 for other requirement");

              int check= sc.nextInt();
              if(check==1){
                  continue;
              }else if(check==2)
              break;
              else if(check==3){
                  additional();
                  break;
              }
              else {
                  System.out.println("enter  1 or 2");
                  continue;
              }


          } else {
              System.out.println("you already taken the daily limit"+"\n if you want any other requirements press 1 or you want a exit press 2");
      int al=sc.nextInt();
      if(al==1){
          additional();
      }
      else{
          break;
      }
      }
      }
          //System.out.println("enter the the number correctly '1'");

  }

    private static void additional() {
        //method for the additional details for the users
      System.out.println("press 1 for feedback \n press 2 for change your family strength \n press 3 for exit");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      if(num==1){
          System.out.println("welcome to if you have any complaints or any question please kindly aks here");
          System.out.println("press 1 for complaint \n press 2 for normal feedback ");
          int number=sc.nextInt();
          if(number==2) {
              System.out.println("enter your feedback");
              String ss = sc.next();
              System.out.println("thanks for your feedback");
              return;
          }
          if(number==1) {
              System.out.println("enter your complient");
              String ss = sc.next();
              System.out.println("we recived your compliant sorry for the inconvienece we ill immediately get the action thank you");
          return;
          }
          if(number!=1&&number!=2){
              System.out.println("please enter one or two");
          }

      }
      if(num==2){
          System.out.println("enter your flat number");
          int flat_change=sc.nextInt();
          int change=findFlat(flat_change);
          System.out.println("your current family numbers Strength "+change);
          System.out.println("enter your new family numbers strength");
          int new_strength=sc.nextInt();
        int changed_number=  changeFamilyStrength(flat_change,new_strength);
          System.out.println("your family Strength is changed to  = "+changed_number);
          System.out.println("water level increases within 24 hours thank you");


      }
    }

    private static int changeFamilyStrength(int flat_no, int new_family_strength) {
        Bachlors bachlors = new Bachlors();               //flat 1 to 7
        NormalFamily normalFamily = new NormalFamily();   //flat 8 to 16
        BigFamily bigFamily = new BigFamily();            //flat 17 t0 20
        if (flat_no == 1) {
            int change=   bachlors.flat1();
          change=new_family_strength;
            return change;
        }
        if (flat_no == 2) {
            int change=    bachlors.flat2();change=new_family_strength;
            return change;
        }
        if (flat_no == 3) {
            int change=     bachlors.flat3();change=new_family_strength;
            return change;
        }
        if (flat_no == 4) {
            int change=     bachlors.flat4();change=new_family_strength;
            return change;
        }
        if (flat_no == 5) {
            int change=    bachlors.flat5();change=new_family_strength;
            return change;
        }
        if (flat_no == 6) {
            int change=   bachlors.flat6();change=new_family_strength;return change;
        }
        if (flat_no == 7) {
            int change=    bachlors.flat7();change=new_family_strength;return change;
        }
        if (flat_no == 8) {
            int change=   normalFamily.flat8();change=new_family_strength;return change;
        }
        if (flat_no == 9) {
            int change=    normalFamily.flat9();change=new_family_strength;return change;
        }
        if (flat_no == 10) {
            int change=   normalFamily.flat10();change=new_family_strength;return change;

        }
        if (flat_no == 12) {
            int change=   normalFamily.flat12();change=new_family_strength;return change;
        }
        if (flat_no == 13) {
            int change=   normalFamily.flat13();change=new_family_strength;return change;
        }
        if (flat_no == 14) {
            int change=    normalFamily.flat14();change=new_family_strength;return change;
        }
        if (flat_no == 17) {
            int change=    bigFamily.flat17();change=new_family_strength;return change;

        }
        if (flat_no == 15) {
            int change=   normalFamily.flat15();change=new_family_strength;return change;
        }
        if (flat_no == 16) {
            int change=   normalFamily.flat16();change=new_family_strength;return change;
        }
        if (flat_no == 19) {
            int change=   bigFamily.flat19();change=new_family_strength;return change;

        }
        if (flat_no == 18) {
            int change=    bigFamily.flat18();change=new_family_strength;return change;

        }
        if (flat_no == 20) {
            int change=    bigFamily.flat20();change=new_family_strength;return change;

        }
        return 0;
    }


    private static int findFlat(int flat_no) {  //to identify the flat
        Bachlors bachlors = new Bachlors();               //flat 1 to 7
        NormalFamily normalFamily = new NormalFamily();   //flat 8 to 16
        BigFamily bigFamily = new BigFamily();            //flat 17 t0 20


        if (flat_no == 1) {
            return bachlors.flat1();
        }

        if (flat_no == 2) {
            return bachlors.flat2();
        }
        if (flat_no == 3) {
            return bachlors.flat3();
        }
        if (flat_no == 4) {
            return bachlors.flat4();
        }
        if (flat_no == 5) {
            return bachlors.flat5();
        }
        if (flat_no == 6) {
            return bachlors.flat6();
        }
        if (flat_no == 7) {
            return bachlors.flat7();
        }
        if (flat_no == 8) {
            return normalFamily.flat8();
        }
        if (flat_no == 9) {
            return normalFamily.flat9();
        }
        if (flat_no == 10) {
            return normalFamily.flat10();

        }
        if (flat_no == 12) {
            return normalFamily.flat12();
        }
        if (flat_no == 13) {
            return normalFamily.flat13();
        }
        if (flat_no == 14) {
            return normalFamily.flat14();
        }
        if (flat_no == 17) {
            bigFamily.flat17();

        }
        if (flat_no == 15) {
            return normalFamily.flat15();
        }
        if (flat_no == 16) {
            return normalFamily.flat16();
        }
        if (flat_no == 19) {
            return bigFamily.flat19();

        }
        if (flat_no == 18) {
            return bigFamily.flat18();

        }
        if (flat_no == 20) {
            return bigFamily.flat20();

        }
return 0;
    }
}
