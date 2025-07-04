package br.com.banco.project.service;

import br.com.banco.project.model.AssociadoEntity;
import br.com.banco.project.repository.AssociadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AssociadoService {

    private final AssociadoRepository associadoRepository;


    public AssociadoEntity createAssociado(AssociadoEntity associado) {
        return associadoRepository.save(associado);
    }
}
