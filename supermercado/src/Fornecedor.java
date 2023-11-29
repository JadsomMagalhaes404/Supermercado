public class Fornecedor extends Pessoa{
	private String empresa;
	
	public Fornecedor(String empresa,String nome, String endereco, String cpf, String telefone) {
	super(nome, endereco, cpf, telefone);
	this.empresa = empresa;
	}
	public String getEmpresa() {
		return this.empresa;
	}
		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}

}
