package pe.edu.upc.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.DetalleVenta;
import pe.edu.upc.repositories.DetalleVentaRepository;
import pe.edu.upc.services.DetalleVentaService;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Transactional
    @Override
    public DetalleVenta save(DetalleVenta entity) throws Exception {
        return detalleVentaRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<DetalleVenta> findAll() throws Exception {
        return detalleVentaRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<DetalleVenta> findById(Long id) throws Exception {
        return detalleVentaRepository.findById(id);
    }

    @Transactional
    @Override
    public DetalleVenta update(DetalleVenta entity) throws Exception {
        return detalleVentaRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long id) throws Exception {
        detalleVentaRepository.deleteById(id);
    }
}
