package com.company;

import java.io.InputStreamReader;
import java.time.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // declaro variables
         Scanner input= new Scanner(new InputStreamReader(System.in));
         String name;
         String lastName;
         Month monthOfBirth = null;
         int monthIndex=0;
         int yearOfBirth=0;
         int dayofBirth=0;
         LocalDate inputDoB=null;
         LocalDate localdate= LocalDate.now();
         Period diff=null;
    // Arranca Proceso
         System.out.println("¡Hola! ¡Bievenido al primer ejercicio de capcitacion Java!");
         System.out.println("Por favor, ingresa un nombre (si queres terminar el proceso, ingresa 0");
         name=input.next();
         while(!name.contentEquals("0")){
            System.out.println("Por favor, ingresa un apellido");
            lastName=input.next();
            System.out.println("Por favor, ingresa tu dia de nacimiento");
            dayofBirth=input.nextInt();
            System.out.println("Por favor, ingresa el mes de nacimiento (en numero)");
            monthIndex=input.nextInt();
            while(monthIndex<=0 || monthIndex>12){
                System.out.println("¡Ingresa un mes valido!");
                monthIndex=input.nextInt();
            }
            monthOfBirth=getMonthValue(monthIndex);
            System.out.println("Por favor, ingresa un año de nacimiento");
            yearOfBirth=input.nextInt();
            inputDoB=LocalDate.of(yearOfBirth, monthOfBirth,dayofBirth);
            Persona homunculo=new Persona(name, lastName,inputDoB);
             diff=Period.between(homunculo.getDoB(),localdate);
            System.out.println("Mi nombre es "+homunculo.getName()+" "+homunculo.getLastName()+" y tengo "+
            diff.getYears()+" años");
            System.out.println("Si queres crear una nueva persona, ingresa un nombre, sino ingresa 0");
            name=input.next();
         }
         System.out.println("Gracias por usar este programa!");

    }

    //test
    private static Month getMonthValue(int monthIndex) {
        Month monthValue=null;
        switch (monthIndex){
            case 1:
                monthValue=Month.JANUARY;
                break;
            case 2:
                monthValue=Month.FEBRUARY;
                break;
            case 3:
                monthValue=Month.MARCH;
                break;
            case 4:
                monthValue=Month.APRIL;
                break;
            case 5:
                monthValue=Month.MAY;
                break;
            case 6:
                monthValue=Month.JUNE;
                break;
            case 7:
                monthValue=Month.JULY;
                break;
            case 8:
                monthValue=Month.AUGUST;
                break;
            case 9:
                monthValue=Month.SEPTEMBER;
                break;
            case 10:
                monthValue=Month.OCTOBER;
                break;
            case 11:
                monthValue=Month.NOVEMBER;
                break;
            case 12:
                monthValue=Month.DECEMBER;
                break;
        }
        return monthValue;
    }


}
