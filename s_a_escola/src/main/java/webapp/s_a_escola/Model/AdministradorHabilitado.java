package webapp.s_a_escola.Model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class AdministradorHabilitado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cpf;

    public long getCPF() {
        return cpf;
    }

    public void setCPF(long cpf) {
        this.cpf = cpf;
    }
}
