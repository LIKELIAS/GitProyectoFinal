package Procesos;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        double ars, afp, balance, isr=0, salariobr, agregado = 0, porcent = 0, sueldone;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Digita el salario bruto: ");
        salariobr=leer.nextDouble();
        
        ars = salariobr * (2.87/100);
        afp = salariobr * (3.04/100);
        
        
        balance = salariobr - ars - afp;
        
        if(salariobr<=34865){
            //Nada XD
        }else if(salariobr > 34685 && salariobr <= 52027.42){
            balance = balance - 34685;
            porcent = 15/100;
        }else if(salariobr > 52027.42 && salariobr <= 72260.25){
            balance = balance - 52027.42;
            agregado = 2601.33;
            porcent = 20/100;
        }else if(salariobr > 72260.25){
            balance = balance - 72260.25;
            agregado = 6648;
            porcent = 25/100;
        }
        isr = (balance * porcent) + agregado;
//        sueldone = salariobr - ars - afp - isr;
        
        System.out.println("El valor ars: " + ars);
        System.out.println("El valor afp: " + afp);
        System.out.println("El impuesto sobre la renta es de: " + isr);
//        System.out.println("El sueldo neto es de: " + sueldone);
    }
}
