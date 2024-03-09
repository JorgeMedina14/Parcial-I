public class Solicitud {
    private String cliente;
    private String problema;

    public Solicitud(String cliente, String problema) {
        this.cliente = cliente;
        this.problema = problema;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProblema() {
        return problema;
    }
}
