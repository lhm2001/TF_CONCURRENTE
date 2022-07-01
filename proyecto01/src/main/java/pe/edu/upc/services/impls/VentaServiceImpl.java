package pe.edu.upc.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.Venta;
import pe.edu.upc.repositories.VentaRepository;
import pe.edu.upc.services.VentaService;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Transactional
    @Override
    public Venta save(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Venta> findAll() throws Exception {
        return ventaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Venta> findById(Long id) throws Exception {
        return ventaRepository.findById(id);
    }

    @Transactional
    @Override
    public Venta update(Venta entity) throws Exception {
        return ventaRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long id) throws Exception {
        ventaRepository.deleteById(id);
    }
}
