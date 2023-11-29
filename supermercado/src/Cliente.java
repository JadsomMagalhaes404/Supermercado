public class Cliente extends Pessoa{
	private String categoria;
	
	public Cliente(String categoria,String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

}
