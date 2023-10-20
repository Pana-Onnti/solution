import java.util.Scanner;
import documents.Document;
import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;

public class DocumentCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de documento a crear:");
        System.out.println("1. Factura (Invoice)");
        System.out.println("2. Orden (Order)");
        System.out.println("3. Orden Urgente (UrgentOrder)");

        int choice = scanner.nextInt();
        Document document = null;

        switch (choice) {
            case 1:
                document = createInvoice();
                break;
            case 2:
                document = createOrder();
                break;
            case 3:
                document = createUrgentOrder();
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        if (document instanceof Invoice) {
            System.out.println("Tipo de documento: Factura");
            Invoice invoice = (Invoice) document;

            System.out.print("Ingrese el número de factura: ");
            invoice.setId(scanner.next());

            System.out.print("Ingrese el nombre del cliente: ");
            invoice.setClient_name(scanner.next());

            System.out.print("Ingrese el monto: ");
            invoice.setPrice((int) scanner.nextDouble());

            System.out.println("ID del documento : ");
            invoice.setDocumentId(String.valueOf((int) scanner.nextDouble()));

            System.out.println("Nombre del documento:");
            invoice.setDocumentName(scanner.next());

        } else if (document instanceof Order) {
            System.out.println("Tipo de documento: Orden");
            Order order = (Order) document;

            System.out.print("Ingrese el número de Orden: ");
            order.setId(scanner.next());

            System.out.print("Ingrese el monto: ");
            order.setPrice((int) scanner.nextDouble());

            System.out.print("Ingrese la cantidad: ");
            order.setQuantity((int) scanner.nextDouble());

            System.out.print("Ingrese el producto: ");
            order.setProduct(scanner.next());

            System.out.println("ID del documento : ");
            order.setDocumentId(String.valueOf((int) scanner.nextDouble()));

            System.out.println("Nombre del documento:");
            order.setDocumentName(scanner.next());

        } else if (document instanceof UrgentOrder) {
            System.out.println("Tipo de documento: Orden Urgente");
            UrgentOrder urgentOrder = (UrgentOrder) document;

            System.out.print("¿Es urgente? (true/false): ");
            urgentOrder.setUrgent(scanner.nextBoolean());
        }
        System.out.println("Se ha creado un documento de tipo: " + document.getClass().getSimpleName());
        System.out.println("ID del documento : " + document.getDocumentId());
        System.out.println("Nombre del documento: " + document.getDocumentName());


    }

    public static Invoice createInvoice() {
        return new Invoice();
    }

    public static Order createOrder() {
        return new Order();
    }

    public static UrgentOrder createUrgentOrder() {
        return new UrgentOrder();
    }
}
