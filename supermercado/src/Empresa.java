public class Empresa extends Pessoa{
	private String nomeFantasia;
	
	public Empresa(String nomeFantasia, String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco, cpf, telefone);
	this.nomeFantasia = nomeFantasia;
	}
	public String getNomeFantasia(){
		return this.nomeFantasia;
	}
		public void setNomeFantasia(String nomeFantasia) {
			this.nomeFantasia = nomeFantasia;
		}

}
