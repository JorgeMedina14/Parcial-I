public class Prueba {
    public static void main(String[] args) {
        Solicitudes sistema = new Solicitudes();

        sistema.agregarSolicitud(new Solicitud("Jorge", "Problema con la Laptop"));
        sistema.agregarSolicitud(new Solicitud("Xavier", "Error en la impresora"));
        sistema.agregarSolicitud(new Solicitud("Carlos", "Problema con el wifi"));

        sistema.procesarSolicitud();
        sistema.procesarSolicitud();
        sistema.procesarSolicitud();
        sistema.procesarSolicitud();
    }
}
