package aplicacion.servicio;
import dominio.modelo.Cliente;
import dominio.puerto.PortRepositorioCliente;

public class RegistrarCliente {
    private final PortRepositorioCliente RepositorioCliente;

    // Inyección de dependencias
    public RegistrarCliente(PortRepositorioCliente clienteRepository) {
        this.RepositorioCliente = clienteRepository;
    }

    public Cliente ejecutar(String nombre, String contacto) {
        // Validaciones del negocio
        Cliente nuevoCliente = new Cliente(null, nombre, contacto);
        return RepositorioCliente.guardar(nuevoCliente);
    }
}
