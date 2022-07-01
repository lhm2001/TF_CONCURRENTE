package pe.edu.upc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.entities.DetalleVenta;


@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta,Long> {
}
