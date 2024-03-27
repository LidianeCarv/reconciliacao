package contas.model.reconciliacao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReconciliacaoRepository extends JpaRepository<Reconciliacao, Long> {
}
