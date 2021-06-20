package eapli.base.atividade.application;

import eapli.base.atividade.domain.AtividadeManual;
import eapli.base.clientusermanagement.domain.Colaborador;
import eapli.base.clientusermanagement.repositories.ColaboradorRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class ConsultarAtividadeController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ColaboradorRepository colabRepo = PersistenceContext.repositories().colaboradores();

    public void showAtividadeDoColab() {
        boolean vf = true;
        String email = authz.session().get().authenticatedUser().email().toString();
        Colaborador colab = colabRepo.findByEmail(email);
        if (!colab.getAtividades().isEmpty()) {
            System.out.println();
            System.out.println("COLABORADOR:");
            System.out.println(colab);
            for (AtividadeManual ativ : colab.getAtividades()) {
                if (vf) {
                    System.out.println("ATIVIDADES PENDENTES:");
                    vf = false;
                }
                System.out.println(ativ);
            }
        } else {
            throw new IllegalArgumentException("Colaborador não tem atividades manuais.");
        }
    }
}


