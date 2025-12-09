package App;

import Model.Reserva;
import Service.SistemaReservas;

public class Main {
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();


        Reserva r1 = new Reserva(1, "Sebastian", "2025-01-12", 2);
        Reserva r2 = new Reserva(2, "Maria", "2025-01-13", 3);


        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        // Uso de setter
        r1.setDuracionHoras(4);
        System.out.println("\nSe modificó la duración de la reserva 1\n");

        // Listar reservas
        sistema.listarReservas();

        System.out.println("\n Total de reservas: " + sistema.contarReservas());
        //Recuerda que es para declarar excepciones
        try {
            sistema.eliminarReserva(2);
            sistema.eliminarReserva(10);  // ID que NO existe
        } catch (Exception e) {
            System.out.println("Ocurrió un error al eliminar la reserva.");
        }

        // Listar otra vez
        System.out.println("\n Listado actualizado:");
        sistema.listarReservas();

        // Conteo final
        System.out.println("\n Total final de reservas: " + sistema.contarReservas());
    }

}
