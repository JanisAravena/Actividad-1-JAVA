public class TiendaOnline {
    public static void main(String[] args) {
        // VARIABLES DE LA TIENDA
        // Mensajes de la aplicación
        String mensajeBienvenida = "Bienvenido a nuestra tienda en línea, ";
        String mensajeConfirmacion = ", tu pedido ha sido confirmado";
        String mensajeRechazo = ", lamentablemente el artículo seleccionado está agotado";
        String mensajeMostrarTotal = "El total de tu compra es: $";

        // Variables de productos (agrega las tuyas a continuación)
        double precioLibro = 1.00;
        double precioCamiseta = 1.00;
        double precioPantalon = 1.00;
        double precioZapatos = 1.00;

        // Variables de clientes (agrega las tuyas a continuación)
        String cliente1 = "Ana";
        String cliente2 = "Miguel";
        String cliente3 = "Alex";

        // Estado de pedidos (agrega las tuyas a continuación)
        boolean pedidoConfirmadoCliente1 = true;
        boolean pedidoConfirmadoCliente2 = false;
        boolean pedidoConfirmadoCliente3 = true;

        // 1. Ana ha pedido un pantalón. Imprime el mensaje del estado de su pedido
        // haciendo uso de una sentencia if.
        System.out.println("1. " + mensajeBienvenida + cliente1);
        if (pedidoConfirmadoCliente1) {
            System.out.println(cliente1 + mensajeConfirmacion);
        } else {
            System.out.println(cliente1 + mensajeRechazo);
        }

        // 2. Miguel ha pedido unos zapatos y un libro. Imprime el mensaje del estado de su
        // pedido haciendo uso de una sentencia if.
        System.out.println("2. " + mensajeBienvenida + cliente2);
        if (pedidoConfirmadoCliente2) {
            System.out.println(cliente2 + mensajeConfirmacion);
        } else {
            System.out.println(cliente2 + mensajeRechazo);
        }

        // 3. Alex ha comprado 2 pares de zapatos, una camiseta y unos pantalones. Imprime
        // el total de su orden e imprime el mensaje del estado de su pedido haciendo
        // uso de una sentencia if.
        System.out.println("3. " + mensajeBienvenida + cliente3);
        double totalClienteAlex = precioZapatos * 2;
        totalClienteAlex = totalClienteAlex + precioCamiseta;
        totalClienteAlex = totalClienteAlex + precioPantalon;
        System.out.println(mensajeMostrarTotal + totalClienteAlex);
        if (pedidoConfirmadoCliente3) {
            System.out.println(cliente3 + mensajeConfirmacion);
        } else {
            System.out.println(cliente3 + mensajeRechazo);
        }

        // 4. Miguel se ha dado cuenta que le cobraron unos pantalones y una camiseta. Imprime un mensaje con su nuevo total calculando la diferencia entre el pedido con error con su pedido actual

        System.out.println("4. " + mensajeBienvenida + cliente2);
        double totalPedidoMiguel = precioZapatos + precioLibro;
        double totalPedidoMiguelConError = totalPedidoMiguel + precioPantalon + precioCamiseta;
        double diferencia = totalPedidoMiguelConError - totalPedidoMiguel;
        System.out.println(mensajeMostrarTotal+ (totalPedidoMiguel - diferencia));
    }
}
