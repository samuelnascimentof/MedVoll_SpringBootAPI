package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

/**
 * DTO (Data Transfer Object) para representação dos dados de um médico no banco de dados
 *
 * @param nome
 * @param email
 * @param telefone
 * @param crm
 * @param especialidade
 * @param endereco
 */
public record DadosCadastroMedico(
        @NotBlank // Valida se uma string não é nula e nem está em branco
        String nome,
        @NotBlank
        @Email // Valida se é um email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // Valida de acordo com o regex informado
        String crm,
        @NotNull // Valida se não é nulo (@NotBlank só pode ser usado em strings)
        Especialidade especialidade,
        @NotNull
        @Valid // Informa que este atributo é um outro DTO que possui validações
        DadosEndereco endereco
) {
}
