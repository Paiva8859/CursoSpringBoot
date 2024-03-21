package webapp.s_a_escola.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import webapp.s_a_escola.Model.AdministradorHabilitado;

public interface AdministradorRepository extends CrudRepository<AdministradorHabilitado, Long> {
    // criado para a busca Administrador por id ou chave primária
    @Query(value = "select u from administradores_habilitados u where u.cpf like %?1%")
    List<AdministradorHabilitado> findByCPF(long cpf);
}