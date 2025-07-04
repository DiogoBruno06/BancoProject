package br.com.banco.project.controller;


import br.com.banco.project.model.AssociadoEntity;
import br.com.banco.project.service.AssociadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associados")
public class AssociadoController {

    @Autowired
    private AssociadoService associadoService;

    @PostMapping("/create")
    public ResponseEntity<AssociadoEntity> createAssociado(AssociadoEntity associado) {
        return new ResponseEntity<>(associadoService.createAssociado(associado), HttpStatus.CREATED);
    }

    @GetMapping("/findAll")
    public List<AssociadoEntity> findAll(){
        return associadoService.getAllAssociados();
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<AssociadoEntity> findById(@PathVariable Long id) {
        return new ResponseEntity<>(associadoService.getAssociadoById(id).get(), HttpStatus.FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAssociado(@PathVariable long id){
        associadoService.deleteAssociado(id);
    }
}
