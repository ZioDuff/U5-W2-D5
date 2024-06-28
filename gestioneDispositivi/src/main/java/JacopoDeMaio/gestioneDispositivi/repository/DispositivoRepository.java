package JacopoDeMaio.gestioneDispositivi.repository;

import JacopoDeMaio.gestioneDispositivi.entities.Dispositivo;
import JacopoDeMaio.gestioneDispositivi.enums.TipoDispositivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DispositivoRepository extends JpaRepository<Dispositivo, UUID> {

}
