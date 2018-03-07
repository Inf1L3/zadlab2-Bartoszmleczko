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
        for(int i = 0;i<=20;i++)
        {
            if(i==2 || i== 6 || i==9 || i==15 || i==19)
            { 
               continue;
            }
               
            System.out.println(i);
            
        }
        double a,b,c;
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
        System.out.println("x2: "+x2);
    }
}
