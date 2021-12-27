package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int day,month;
        String burc="";
        Scanner input= new Scanner(System.in);
        System.out.print("Doğdunuz gün: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        //Switch mantığını en dıştaki if e veriyoruz.
        //Ocak ayı
        if (month==1){
            if(day>=1 && day<=31){
                if(day<22){
                    burc="Oğlak";
                }
                else{
                    burc="Kova";
                }
            }
        }
        //Şubat ayı
        if (month==2){
            if(day>=1 && day<=28){
                if(day<20){
                    burc="Kova";
                }
                else{
                    burc="Balık";
                }
            }
        }
        //Mart ayı
        if (month==3){
            if(day>=1 && day<=31){
                if(day<21){
                    burc="Balık";
                }
                else{
                    burc="Koç";
                }
            }
        }
        //Nisan ayı
        if (month==4){
            if(day>=1 && day<=31){
                if(day<21){
                    burc="Koç";
                }
                else{
                    burc="Boğa";
                }
            }
        }
        //Mayıs ayı
        if (month==5){
            if(day>=1 && day<=31){
                if(day<22){
                    burc="Boğa";
                }
                else{
                    burc="İkizler";
                }
            }
        }
        //Haziran ayı
        if (month==6){
            if(day>=1 && day<=31){
                if(day<23){
                    burc="İkizler";
                }
                else{
                    burc="Yengeç";
                }
            }
        }
        //Temmuz ayı
        if (month==7){
            if(day>=1 && day<=31){
                if(day<23){
                    burc="Yengeç";
                }
                else{
                    burc="Aslan";
                }
            }
        }
        //Ağustos ayı
        if (month==8){
            if(day>=1 && day<=31){
                if(day<23){
                    burc="Aslan";
                }
                else{
                    burc="Başak";
                }
            }
        }
        //Eylül ayı
        if (month==9){
            if(day>=1 && day<=31){
                if(day<23){
                    burc="Başak";
                }
                else{
                    burc="Terazi";
                }
            }
        }
        //Ekim ayı
        if (month==10){
            if(day>=1 && day<=31){
                if(day<23){
                    burc="Terazi";
                }
                else{
                    burc="Akrep";
                }
            }
        }
        //Kasım ayı
        if (month==11){
            if(day>=1 && day<=31){
                if(day<22){
                    burc="Akrep";
                }
                else{
                    burc="Yay";
                }
            }
        }
        //Ocak ayı
        if (month==12){
            if(day>=1 && day<=31){
                if(day<22){
                    burc="Yay";
                }
                else{
                    burc="Oğlak";
                }
            }
        }
        System.out.println(burc);
        //Switch-if bitişi

    }
}
