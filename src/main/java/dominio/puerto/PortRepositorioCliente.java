package dominio.puerto;
import dominio.modelo.Cliente;

public interface PortRepositorioCliente {
    Cliente guardar(Cliente cliente);
}
