package clases;

import java.util.Date;

public class Cajero {
    // Método de retiro de dinero
    public static String retirarDinero(double cantidad) {
        if (cantidad > 8000) {
            return "Estás tratando de retirar mucho dinero, el límite es $8000";
        } else {
            return "Retiraste exitosamente la cantidad de $" + cantidad;
        }

    }

    // Método de pago factura
    public static String pagarFactura(double total, double pago) {
        Date fecha = new Date();
        if (pago < total) {
            double faltante = total - pago;
            return "El día de " + fecha.toString() + " pagaste $" + pago + " aún te hacen falta $" + faltante;
        } else if (pago == total) {
            return "Gracias por tu pago completo el día de " + fecha.toString();
        } else {
            double cambio = pago - total;
            return "Gracias por tu pago el día de " + fecha.toString() + ", tu cambio es de $" + cambio;
        }

    }

    // Metodo para cambiar billetes
    public static boolean cambiarBilletes(int total, int denominacion) {
        if (total % denominacion == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo para calcular billetes y monedas
    public static String totalDeBilletesYMonedas(int total) {
        int[] denBilletes = { 500, 200, 100, 50, 20 };
        int[] denMonedas = { 10, 5, 2, 1 };
        StringBuilder resultado = new StringBuilder();

        for (int den : denBilletes) {
            int cantidad = total / den;
            if (cantidad > 0) {
                if (resultado.length() > 0)
                    resultado.append(", ");
                resultado.append(cantidad)
                        .append(cantidad == 1 ? " billete de " : " billetes de ")
                        .append(den);
                total -= cantidad * den;
            }
        }

        for (int den : denMonedas) {
            int cantidad = total / den;
            if (cantidad > 0) {
                if (resultado.length() > 0)
                    resultado.append(", ");
                resultado.append(cantidad)
                        .append(cantidad == 1 ? " moneda de " : " monedas de ")
                        .append(den);
                total -= cantidad * den;
            }
        }

        return resultado.toString();
    }
}
