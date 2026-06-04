import clases.Cajero;

public class Aplicacion {
    public static void main(String[] args) {

        // retirarDinero
        System.out.println("1. Retiro de dinero");
        System.out.println(Cajero.retirarDinero(9000));
        System.out.println(Cajero.retirarDinero(1500.50));

        // pagarFactura
        System.out.println("\n2. Pago de factura");
        System.out.println(Cajero.pagarFactura(1500.50, 1000.00));
        System.out.println(Cajero.pagarFactura(1000.00, 1000.00));
        System.out.println(Cajero.pagarFactura(1500.00, 2000.00));

        // cambiarBilletes
        System.out.println("\n3. Cambio de billetes");
        System.out.println("Puedes cambiar $2000 a billetes de $50?  => " + Cajero.cambiarBilletes(2000, 50));
        System.out.println("Puedes cambiar $2010 a billetes de $50?  => " + Cajero.cambiarBilletes(2010, 50));
        System.out.println("Puedes cambiar $2000 a billetes de $30?  => " + Cajero.cambiarBilletes(2000, 30));

        // totalDeBilletesYMonedas
        System.out.println("\n4. Total de billetes y monedas");
        System.out.println("1999 => " + Cajero.totalDeBilletesYMonedas(1999));
        System.out.println("500  => " + Cajero.totalDeBilletesYMonedas(500));
        System.out.println("37   => " + Cajero.totalDeBilletesYMonedas(37));
    }
}
