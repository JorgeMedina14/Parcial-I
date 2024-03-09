import java.util.LinkedList;
import java.util.Queue;

public class Solicitudes {
    private Queue<Solicitud> colaS;

    public Solicitudes() {
        colaS = new LinkedList<>();
    }

    public void agregarSolicitud(Solicitud solicitud) {
        colaS.offer(solicitud);
        System.out.println("Solicitud de " + solicitud.getCliente() + " agregada a la cola.");
    }

    public void procesarSolicitud() {
        if (!colaS.isEmpty()) {
            Solicitud solicitud = colaS.poll();
            System.out.println("Atendiendo a " + solicitud.getCliente() + ": " + solicitud.getProblema());
        } else {
            System.out.println("No hay solicitudes en cola.");
        }
    }
}
