package pe.edu.upc.services;

import pe.edu.upc.entities.Cliente;

import java.util.Optional;

public interface ClienteService extends CrudService<Cliente,Long> {

    Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception;
}
