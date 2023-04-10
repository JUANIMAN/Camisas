package com.fes.aragon;

import java.util.Scanner;

public class TiendaCamisas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Creamos un array para guardar la cantidad de cada tipo de camisa
        int[] cantidadCamisasTipo = new int[Camisas.values().length];
        for (int i = 0; i < Camisas.values().length; i++) {
            cantidadCamisasTipo[i] = 0;
        }

        // Pedimos al usuario que introduzca la cantidad de cada tipo de camisa
        for (Camisas camisa : Camisas.values()) {
            System.out.print("Ingrese la cantidad de " + camisa.getNombreCamisa() + " que quiere comprar: ");
            int cantidad = scanner.nextInt();
            cantidadCamisasTipo[camisa.getIdCamisa()-1] = cantidad;
        }

        scanner.close();

        // Calculamos el cantidad total de camisas
        int cantidadCamisas = 0;
        for (Camisas camisa : Camisas.values()) {
            int cantidad = cantidadCamisasTipo[camisa.getIdCamisa()-1];
            cantidadCamisas += cantidad;
        }

        // Calculamos el precio total de las camisas
        int precioTotal = 0;
        for (Camisas camisa : Camisas.values()) {
            int cantidad = cantidadCamisasTipo[camisa.getIdCamisa()-1];
            precioTotal += cantidad * camisa.getPrecio();
        }

        if (cantidadCamisas > 0) {
            // Mostramos la Cantidad de cada tipo de camisas al usuario
            System.out.println("\nCantidad de camisas compradas (por tipo):");
            for (Camisas camisa : Camisas.values()) {
                int cantidad = cantidadCamisasTipo[camisa.getIdCamisa()-1];
                System.out.println(camisa.getNombreCamisa() + ": " + cantidad);
            }

            double descuento = calcularDescuento(cantidadCamisas);
            double precioTotalConDescuento = totalConDescuento(precioTotal,descuento);

            // Mostramos los resultados al usuario
            System.out.println("\nResumen de compra:");
            System.out.println("Cantidad de camisas: " + cantidadCamisas);
            System.out.println("Precio total sin descuento: $" + precioTotal);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Total con descuento: $" + precioTotalConDescuento);
        } else {
            System.out.println("\nNo compraste ninguna camisa");
        }
    }

    // Metodo para calcular el descuento en base a la cantidad de camisas compradas
    public static double calcularDescuento(int cantidadCamisas) {
        if (cantidadCamisas == 1 || cantidadCamisas == 2) {
            return 0.0;
        } else if (cantidadCamisas >= 3 && cantidadCamisas <= 5) {
            return 0.05;
        } else if (cantidadCamisas > 5) {
            return 0.08;
        } else {
            return 0.0;
        }
    }

    public static double totalConDescuento(int precioTotal, double descuento) {
        return precioTotal - (precioTotal * descuento);
    }

}
