package br.com.banco.project.model;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
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
    private Long id;

    @Schema(
            description = "Nome completo do cliente",
            example = "Kalil Bct"
    )
    @Size(min = 2, max = 100)
    @NotBlank
    @Column(name = "NOME_ASSOCIADO")
    @Pattern(
            regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ]+(?: [A-Za-zÀ-ÖØ-öø-ÿ]+)*$",
            message = "Nome inválido"
    )
    private String nome;

    @Column(name = "DATA_CADASTRO")
    @NotNull
    private LocalDate dataCadastro;

    @Schema(
            description = "CPF/CNPJ Cliente",
            example = "12345678911"
    )
    @NotNull
    @Pattern(regexp = "^\\d{11}$|^\\d{14}$", message = "CPF ou CNPJ inválido")
    @Column(name = "NUM_CPF_CNPJ")
    private String cpfCnpj;

    @Email
    @Schema(
            description = "Email do associado",
            example = "kalil123@gmail.com"
    )
    @Column(name = "EMAIL")
    @NotNull
    private String email;

    @Schema(
            description = "Telefone do associado",
            example = "839860102030"
    )
    @Column(name = "NUM_TELEFONE")
    @NotNull
    private Long telefone;


    @Schema(
            description = "Nome social",
            example = "Leo Gamalho"
    )
    @Column(name = "NOME_SOCIAL")
    private String nomeSocial;
}
