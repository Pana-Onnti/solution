import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.setId("1");
        invoice.setClient_name("Cliente A");
        invoice.setPrice(500);
        invoice.setDocumentId("1232");
        invoice.setDocumentName("Factura");

        Order order = new Order();
        order.setId("2");
        order.setProduct("Producto X");
        order.setQuantity(10);
        order.setPrice(200);

        UrgentOrder urgentOrder = new UrgentOrder();
        urgentOrder.setId("3");
        urgentOrder.setProduct("Producto Urgente");
        urgentOrder.setQuantity(5);
        urgentOrder.setPrice(300);
        urgentOrder.setUrgent(true);

        System.out.println("Detalles de la Factura:");
        System.out.println("ID: " + invoice.getId());
        System.out.println("Nombre del Cliente: " + invoice.getClient_name());
        System.out.println("Precio: " + invoice.getPrice());

        System.out.println("\nDetalles del Pedido:");
        System.out.println("ID: " + order.getId());
        System.out.println("Producto: " + order.getProduct());
        System.out.println("Cantidad: " + order.getQuantity());
        System.out.println("Precio: " + order.getPrice());

        System.out.println("\nDetalles del Pedido Urgente:");
        System.out.println("ID: " + urgentOrder.getId());
        System.out.println("Producto: " + urgentOrder.getProduct());
        System.out.println("Cantidad: " + urgentOrder.getQuantity());
        System.out.println("Precio: " + urgentOrder.getPrice());
        System.out.println("Es un pedido Urgente " );
    }

}