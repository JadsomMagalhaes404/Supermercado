
public class Repositor extends Pessoa{
	private String cartTrabalho;

	public Repositor(String cartTrabalho, String nome, String endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);
		this.cartTrabalho = cartTrabalho;
	}
	public String getCartTrabalho() {
		return this.cartTrabalho;
	}
		public void setCartTrabalhor(String cartTrabalho) {
			this.cartTrabalho = cartTrabalho;
		}
}
