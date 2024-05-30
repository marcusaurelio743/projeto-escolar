package escola.model.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	@Column(nullable = false, length = 200)
	private String nome;
	
	@Column(nullable = false,length = 100)
	private String cpf;
	
	@Column(nullable = false, length = 200)
	private String nomeMae;
	
	@Column(nullable = false, length = 200)
	private String nomePai;
	
	@Column(nullable = false, length = 200)
	private String endereco;
	
	@Column(nullable = false, length = 50)
	private String telefone;
	
	@Column(nullable = false, length = 100)
	private String sexo;
	
	@OneToMany
	private List<Turma> turmas;
	
	private LocalDate dataCadastro;
	
	
	

}
