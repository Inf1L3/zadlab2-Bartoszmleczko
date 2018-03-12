package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    public static void main(String[] args) {
        /*    int nrmiesiaca;
         Scanner s= new Scanner(System.in);
         nrmiesiaca=s.nextInt(); 
         while(nrmiesiaca!=0)
         { 
         switch(nrmiesiaca)
         {
         case 1: System.out.println("Styczen");
         break;
         case 2: System.out.println("Luty");
         break;
         case 3: System.out.println("Marzec");
         break;
         case 4: System.out.println("Kwiecien");
         break;
         case 5: System.out.println("Maj");
         break;
         case 6: System.out.println("Czerwiec");
         break;
         case 7: System.out.println("Lipiec");
         break;
         case 8: System.out.println("Sierpien");
         break;
         case 9: System.out.println("Wrzesien");
         break;
         case 10: System.out.println("Pazdziernik");
         break;
         case 11: System.out.println("Listopad");
         break;
         case 12: System.out.println("Grudzien");
         break;
         default: System.out.println("Zly numer miesiaca");
                 
         }
         nrmiesiaca=s.nextInt(); 
         }
        
         int i=0;
         int a=0;
         int skok=1;
         do{
         a+=skok;
         i+=1;
         System.out.println("a = "+a);
         System.out.println("obieg petli numer "+(i));
         }while(a<1000);
         a=0;
         i=0;
         while(a<1000)
         {
         a+=skok;
         i+=1;
         System.out.println("a = "+a);          
         System.out.println("obieg petli numer "+(i));
         }*/
        /*for(int i = 0;i<=20;i++)                             //zad 5
         {
         if(i==2 || i== 6 || i==9 || i==15 || i==19)
         { 
         continue;
         }
               
         System.out.println(i);
            
         }*/
        /* double a,b,c;                                 //zad 1
         Scanner s= new Scanner(System.in);
         a=s.nextDouble();
         b=s.nextDouble();
         c=s.nextDouble();
         double delta = (b*b)-(4*a*c);
         double x1,x2;
         x1=((-b)-(Math.sqrt(delta)))/(2*a);
         x2=((-b)+(Math.sqrt(delta)))/(2*a);
         System.out.println("delta: "+delta);
         System.out.println("x1: "+x1);
         System.out.println("x2: "+x2);*/            //Zadania do tego momentu ukonczylem na zajeciach.

        Scanner s = new Scanner(System.in);                     // zad 3
      /*  float[] tab = new float[10];
         for (int i = 0; i < 10; i++) {
         tab[i] = s.nextFloat();
         }        int wybor;
         do{
         System.out.println("Wybierz funkcjonalnosc numerami 1-4. Wybierz 0 aby zakonczyc");    

         wybor = s.nextInt();
         int j = 0;
         if (wybor == 1) {
         do {
         System.out.println(tab[j]);
         j++;
         } while (j < 10);
         } else {
         if (wybor == 2) {
         j = 10 - 1;
         do {
         System.out.println(tab[j]);
         j--;
         } while (j >= 0);
         } else {
         if (wybor == 3) {
         j = 1;
         do {
         System.out.println(tab[j]);
         j += 2;
         } while (j < 10);
         } else {
         if (wybor == 4) {
         j = 0;
         do {
         System.out.println(tab[j]);
         j += 2;
         } while (j < 10);
         }
         }
         }

         }
         }while(wybor!=0);
         */

        /*double[] tab2 = new double[10];                                     //zad 4
         for (int i = 0; i < 10; i++) {
         tab2[i] = s.nextDouble();
         }
         int wybor = 0;
         do {
         System.out.println("Wybierz funkcje od 1-5. Wybierz 0 aby zakonczyc");
         wybor = s.nextInt();
         switch (wybor) {
         case 1:
         double suma = 0;
         for (int i = 0; i < 10; i++) {
         suma = suma + tab2[i];
         }
         System.out.println("Suma elementow tablicy wynosi: " + suma);
         break;
         case 2:
         double iloczyn = 1;
         for (int i = 0; i < 10; i++) {
         iloczyn = iloczyn * tab2[i];
         }
         System.out.println("Iloczyn elementow tablicy wynosi: " + iloczyn);
         break;
         case 3:
         double sum = 0;
         double srednia;
         for (int i = 0; i < 10; i++) {
         sum = sum + tab2[i];
         }
         srednia = sum / 10;
         System.out.println("Srednia elementow tablicy wynosi: " + srednia);
         break;
         case 4:
         double min = tab2[0];
         for (int i = 0; i < 10; i++) {
         if (min > tab2[i]) {
         min = tab2[i];
         }
         }
         System.out.println("Najmniejszy element tablicy to:" + min);
         break;
         case 5:
         double max = tab2[0];
         for (int i = 0; i < 10; i++) {
         if (max < tab2[i]) {
         max = tab2[i];
         }
         }
         System.out.println("Najwiekszy element tablicy to: " + max);
         break;
         default:   System.out.println("Zly numer"); 
         }
 
         } while (wybor != 0);*/
        /*
         int k,h=1;                                              //zad 6
         while(h==1)
         {
         System.out.println("Wpisz liczbe");
         k=s.nextInt();
         if(k<0)
         break;
                     
         }*/
        int n,g;
        System.out.println("Podaj ilosc elementow");
        n = s.nextInt();
        int[] sort = new int[n];
        for (int i = 0; i < n; i++) {
            sort[i] = s.nextInt();
        }
        for(int i=0;i<n;i++)
            for(int j=0;j<n-1;j++)
                if(sort[j]>sort[j+1])
                {
                    g=sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=g;
                }
        for (int i = 0; i < n; i++)
            System.out.println(sort[i]);
    }
}
