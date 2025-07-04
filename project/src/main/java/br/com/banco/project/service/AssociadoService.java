package br.com.banco.project.service;

import br.com.banco.project.model.AssociadoEntity;
import br.com.banco.project.repository.AssociadoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AssociadoService {

    private final AssociadoRepository associadoRepository;


    public AssociadoEntity createAssociado(AssociadoEntity associado) {
        return associadoRepository.save(associado);
    }

    public List<AssociadoEntity> getAllAssociados() {
        return associadoRepository.findAll();
    }

    public Optional<AssociadoEntity> getAssociadoById(Long id) {
        return associadoRepository.findById(id);
    }

    public void deleteAssociado(Long id) {
        associadoRepository.deleteById(id);
    }
}
