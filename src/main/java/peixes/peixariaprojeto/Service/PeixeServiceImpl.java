package peixes.peixariaprojeto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peixes.peixariaprojeto.Model.Peixe;
import peixes.peixariaprojeto.Repository.PeixeRepository;

import java.util.Optional;

@Service
public class PeixeServiceImpl implements PeixeService {

    @Autowired
    private PeixeRepository peixeRepository;

    @Override
    public Iterable<Peixe> buscarTodos() {
        return peixeRepository.findAll();
    }

    @Override
    public Peixe buscarPorId(Integer id) {
        Optional<Peixe> peixe = peixeRepository.findById(id);
        return peixe.get();
    }

    @Override
    public void inserir(Peixe peixe) {
        peixeRepository.save(peixe);
    }

    @Override
    public void atualizar(Integer id, Peixe peixe) {
        Optional<Peixe> peixebd = peixeRepository.findById(id);
        if(peixebd.isPresent()){
            peixeRepository.save(peixe);
        }

    }

    @Override
    public void deletar(Integer id) {
        peixeRepository.deleteById(id);
    }
}
