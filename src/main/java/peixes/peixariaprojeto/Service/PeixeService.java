package peixes.peixariaprojeto.Service;

import peixes.peixariaprojeto.Model.Peixe;

public interface PeixeService {
    Iterable<Peixe> buscarTodos();

    Peixe buscarPorId(Integer id);

    void inserir(Peixe peixe);

    void atualizar(Integer id, Peixe peixe);

    void deletar(Integer id);

}
