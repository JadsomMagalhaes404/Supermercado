public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String cpf, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	public String getNome() {
		return this.nome;
	}
		public void setNome(String nome) {
			this.nome = nome;
		}
	public String getEndereco() {
		return this.endereco;
	}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
	public String getCpf() {
		return this.cpf;
	}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
	public String getTelefone() {
		return this.telefone;
	}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
}
