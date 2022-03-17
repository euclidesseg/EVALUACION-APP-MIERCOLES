package co.edu.cesde;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner datos =  new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("              vienvenidos a  Muerte lenta");
        System.out.println("");
        System.out.println("                        MENU");
        System.out.println("");
        System.out.println("              AMBURGUESA            1000");
        System.out.println("              PERROS                8000");
        System.out.println("              SALCHIPAPAS           6000");
        System.out.println("              CHORIZOZ              7000");


        int numeroPersonas = 0;
        int i = 1;
        int plato1 = 0,plato2 = 0, plato3 = 0, plato4 = 0;
        int plato = 0;
        int numeroPlato;
        double compra = 0;
        double valorPlato = 0;
        double compraTotal = 0;
        double adescontar = 0;
        double descuento = 0;
        int propina = 0, descuento2 = 0;

        double valorTotal = 0;

        System.out.println("Numero de personas");
        numeroPersonas = datos.nextInt();

        while (i <= numeroPersonas){
            datos.nextLine();
            System.out.println(" Que Plato desea llevar el cliente numero " + i);
            System.out.println("      1 PARA   AMBURGUESA            ");
            System.out.println("      2 PARA    PERROS               ");
            System.out.println("      3 PARA   SALCHIPAPAS           ");
            System.out.println("      4 PARA   CHORIZOs              ");
            plato = datos.nextInt();

            if (plato == 1){
                plato1= plato1 + 1;
                valorPlato = valorPlato +  10000;
                if (valorPlato >= 200000){
                }

            }else if (plato == 2){
                plato2 = plato2 + 1;
                valorPlato = valorPlato +  8000;


            }else if (plato == 3){
                plato3= plato3+ 1;
                valorPlato = valorPlato +  6000;


            }else if (plato == 4){
                plato4= plato4 + 1;
                valorPlato = valorPlato +  7000;

            }

            i++;
        }
        compra = valorPlato;
        if(compra > 2000){
            adescontar = 0.10;
            descuento = compra * 0.10;
            compraTotal = compra - descuento;
            System.out.println("se le realizo un descuento por compra superior a 20000");
        }else{
            compraTotal = compra;
        }
        System.out.println("¿Desea incluir propina?");
        propina = datos.nextInt();
        if(propina == 1){
            compraTotal = compraTotal + (compraTotal * 0.10);
        }else{
            compraTotal = compraTotal;
        }
        if(plato1 >= 2 || plato2 >= 2 || plato3 >= 2 || plato4 >= 2){
            compraTotal = compraTotal - (compraTotal * 0.05);
            System.out.println("se le realizo otro descuento por comprar dos platos iguales");

        }else{
            compraTotal = compraTotal;
        }
        System.out.println("el valor total de la compra es " + compraTotal);

    }
}

