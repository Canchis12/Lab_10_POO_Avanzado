package Service;

import Model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    //Practicar mas el ArrayList
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada: ID " + r.getId());
    }

    public void eliminarReserva(int id) {
        boolean eliminada = false;

        for (Reserva r : reservas) {
            if (r.getId() == id) {
                reservas.remove(r);
                System.out.println("Reserva eliminada: ID " + id);
                eliminada = true;
                break;
            }
        }

        if (!eliminada) {
            System.out.println(" No se encontró una reserva con ID " + id);
        }
    }

    public void listarReservas() {
        System.out.println("\n LISTADO DE RESERVAS:");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        }
        for (Reserva r : reservas) {
            r.mostrarInfo();
        }
    }

    public int contarReservas() {
        return reservas.size();
    }
}
