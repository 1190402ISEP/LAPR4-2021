package eapli.base.atividade.application;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.atividade.repositories.AtividadeRepository;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.equipa.domain.Equipa;
import eapli.base.equipa.repositories.EquipaRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ReivindicarTarefasPendentesController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ColaboradorRepository colabRepo = PersistenceContext.repositories().colaboradores();
    private final AtividadeRepository atividadeRepository = PersistenceContext.repositories().atividade();
    private final EquipaRepository equipaRepository = PersistenceContext.repositories().equipa();

    private Colaborador colab;

    public void mostrarListaDeTarefasPendentesManuais() {

        List<Equipa> listaDeEquipas = (List<Equipa>) equipaRepository.findAll();
        List<AtividadeManual> listaDeTarefasPendentesManuais;
        if (!listaDeEquipas.isEmpty()) {
            for (Equipa equipa : listaDeEquipas) {
                String codUniEq = equipa.getCodigoUnicoEquipa().toString();
                listaDeTarefasPendentesManuais = atividadeRepository.getTarefasPendentesManuaisDaEquipa(codUniEq);
                System.out.println(listaDeTarefasPendentesManuais.toString());
            }
        } else {
            throw new IllegalArgumentException("Sem atividades manuais.");
        }
    }

    public void findColabByEmail() {
        String email = authz.session().get().authenticatedUser().email().toString();
        colab = colabRepo.findByEmail(email);
    }

    public void assignarAtividadeAColaborador(long idAtividade) {
        AtividadeManual at = null;
        try {
            at = ((AtividadeManual) atividadeRepository.ofIdentity(idAtividade).get());
            this.colab.assignarAtividadeAColaborador(at);
        } catch (NoSuchElementException nse) {
            System.err.println(String.format("Nenhuma Tarefa com o id %d encontrada!!!", idAtividade));
        }
        if (at != null) {
            at.assign(colab);
        }
        atividadeRepository.save(at);
        colabRepo.save(colab);
    }

}
