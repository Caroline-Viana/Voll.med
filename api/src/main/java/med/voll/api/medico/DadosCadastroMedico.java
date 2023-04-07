package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
		@NotBlank(message = "Campo nome é obrigatório!")
		String nome, 
		@NotBlank(message = "Campo email é obrigatório!")
		@Email
		String email, 
		@NotBlank(message = "Campo telefone é obrigatório!")
		String telefone,
		@NotBlank(message = "Campo crm é obrigatório!")
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		@NotNull
		Especialidade especialidade, 
		@NotNull
		@Valid
		DadosEndereco endereco) {

}
