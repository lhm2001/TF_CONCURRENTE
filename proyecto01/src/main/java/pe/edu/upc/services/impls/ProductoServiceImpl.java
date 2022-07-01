package pe.edu.upc.services.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.entities.Producto;
import pe.edu.upc.repositories.ProductoRepository;
import pe.edu.upc.services.ProductoService;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Transactional
    @Override
    public Producto save(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Producto> findAll() throws Exception {
        return productoRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Producto> findById(Long id) throws Exception {
        return productoRepository.findById(id);
    }

    @Transactional
    @Override
    public Producto update(Producto entity) throws Exception {
        return productoRepository.save(entity);
    }

    @Transactional
    @Override
    public void deleteById(Long id) throws Exception {
        productoRepository.deleteById(id);
    }
}
