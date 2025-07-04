package br.com.banco.project.controller;


import br.com.banco.project.model.AssociadoEntity;
import br.com.banco.project.service.AssociadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/associado")
public class AssociadoController {

    @Autowired
    private AssociadoService associadoService;

    @PostMapping("/create")
    public ResponseEntity<AssociadoEntity> createAssociado(AssociadoEntity associado) {
        return new ResponseEntity<>(associadoService.createAssociado(associado), HttpStatus.CREATED);
    }
}
