

import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        String monedaBase ="";
        String monedaDestino ="";
        Scanner ingreso = new Scanner(System.in);
        ConvertirMoneda convertir = new ConvertirMoneda();
        Moneda resultado;
        BuscaMoneda buscaMoneda = new BuscaMoneda();
        Moneda busqueda1;
        Moneda busqueda2;

        while (opcion != 8){
            try {
                imprimeMenu();
                opcion = ingreso.nextInt();

                switch (opcion){
                    case 1:
                        resultado = convertir.convierteMoneda("USD", "ARS");
                        System.out.println(resultado.toString());
                        break;
                    case 2:
                        resultado = convertir.convierteMoneda("ARS", "USD");
                        System.out.println(resultado.toString());
                        break;
                    case 3:
                        resultado = convertir.convierteMoneda("USD", "BRL");
                        System.out.println(resultado.toString());
                        break;
                    case 4:
                        resultado = convertir.convierteMoneda("BRL", "USD");
                        System.out.println(resultado.toString());
                        break;
                    case 5:
                        resultado = convertir.convierteMoneda("USD", "COP");
                        System.out.println(resultado.toString());
                        break;
                    case 6:
                        resultado = convertir.convierteMoneda("COP", "USD");
                        System.out.println(resultado.toString());
                        break;
                    case 7: {
                        ingreso.nextLine();
                        System.out.println("Ingrese la divisa que desea convertir teniendo en cuenta que el codigo de divisa debe ser " +
                                "ISO 4217");
                        monedaBase = ingreso.nextLine();
                        System.out.println("Ingrese la 2da divisa teniendo en cuenta que el codigo de divisa debe ser ISO 4217");
                        monedaDestino = ingreso.nextLine();
                        busqueda1 = buscaMoneda.buscarMoneda(monedaBase);
                        busqueda2 = buscaMoneda.buscarMoneda(monedaDestino);
                        if (busqueda1.result() == "error" || busqueda2.result() == "error") {
                            System.out.println("No se encontraron divisas");
                        } else {
                            resultado = convertir.convierteMoneda(monedaBase, monedaDestino);
                            System.out.println(resultado.toString());
                        }
                        break;
                    }
                    case 8:
                        System.out.println("Terminando el programa, muchas gracias por haber usado nuestro sistema");
                        break;
                    default:
                        System.out.println("Opción Incorrecta");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número valido");
                ingreso.nextLine();

            }
        }



    }


    public static void imprimeMenu() {
        System.out.println("""
                **********************************
                *    CONVERTIDOR DE MONEDAS      *
                **********************************\n
                1- Dolar (USD) a Peso Argentino (ARS)
                2- Peso Argentino (ARS) a Dolar (USD)
                3- Dolar (USD) a Real Brasileño (BRL)
                4- Real Brasileño (BRL) a (USD)
                5- Dolar (USD) a Peso Colombiano (COP)
                6- Peso Colombiano (COP) a Dolar (USD)
                7- Otro tipo de conversión
                8- Salir
                
                """);
        System.out.println("Ingrese opción:");
    }
}
