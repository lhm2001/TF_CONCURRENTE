package pe.edu.upc.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.Cliente;
import pe.edu.upc.repositories.ClienteRepository;
import pe.edu.upc.services.ClienteService;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    @Transactional
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() throws Exception {
        return clienteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findById(Long id) throws Exception {
        return  clienteRepository.findById(id);
    }

    @Override
    @Transactional
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    @Transactional
    public void deleteById(Long id) throws Exception {
        clienteRepository.deleteById(id);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<Cliente> findByNumeroDocumento(String numeroDocumento) throws Exception {
        return clienteRepository.findByNumeroDocumento(numeroDocumento);
    }
}
