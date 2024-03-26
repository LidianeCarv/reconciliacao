
package contas.model.reconciliacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/reconciliacao", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReconciliacaoEndpoint {
    @Autowired
    private ReconciliacaoService reconciliacaoService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<Void> criar(@RequestBody ReconciliacaoDTO reconciliacaoDTO) {
        if (reconciliacaoDTO.getId() != null ){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        reconciliacaoService.criar(reconciliacaoDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/{reconciliacaoId}")
    @ResponseBody
    public void atualizar(@PathVariable("reconciliacaoId") Long reconciliacaoId,   //PUT
                                @RequestBody ReconciliacaoDTO reconciliacaoDTO) {
        reconciliacaoDTO.setId(reconciliacaoId);
        reconciliacaoService.atualizar(reconciliacaoDTO);
    }

    @GetMapping
    @ResponseBody
    public List<ReconciliacaoDTO> getAll() {
        return reconciliacaoService.getAll();
    }    //GET

    @DeleteMapping("/{reconciliacaoId}")
    @ResponseBody
    public void excluir(@PathVariable("reconciliacaoId") Long reconciliacaoId){
        reconciliacaoService.excluir(reconciliacaoId);
    }   //DELETE
}
