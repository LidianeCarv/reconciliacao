package contas.model.reconciliacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReconciliacaoService {
    @Autowired
    public ReconciliacaoRepository repository;

    public Long criar(ReconciliacaoDTO reconciliacaoDTO){
        Reconciliacao reconciliacao = reconciliacaoDTO.toReconciliacao();
        repository.save(reconciliacao);
        return reconciliacao.getId();
    }

    public void atualizar (ReconciliacaoDTO reconciliacaoDTO){
        if (reconciliacaoDTO.getId() == null){
            throw new RuntimeException("Para atualizar é necessário passar o id da reconciliacao!");
        }
        this.criar(reconciliacaoDTO);
    }

    public List<ReconciliacaoDTO> getAll () {
        return repository
                .findAll()
                .stream()
                .map(ReconciliacaoDTO::new).collect(Collectors.toList());
    }

    public void  excluir (Long reconciliacaoId){
        repository.deleteById(reconciliacaoId);
    }
}