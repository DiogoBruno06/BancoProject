package br.com.banco.project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class AssociadoEntity {

    @Id
    private long id;

    @Column(name = "Nome")
    @NotNull
    @NotEmpty
    @Pattern(
            regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ]+(?: [A-Za-zÀ-ÖØ-öø-ÿ]+)*$",
            message = "Nome inválido"
    )
    private String nome;

    @Column(name = "DataCadastro")
    @NotNull
    @NotEmpty
    private LocalDate dataCadastro;

    @CPF
    @NotNull
    @NotEmpty
    @Pattern(regexp = "^\\d{11}$|^\\d{14}$", message = "CPF ou CNPJ inválido")
    private String cpfCnpj;

    @Email
    @NotNull
    @NotEmpty
    private String email;

    @Column(name = "Telefone")
    @NotNull
    @NotEmpty
    private Long telefone;

    @Column(name = "NomeSocial")
    private String nomeSocial;
}
