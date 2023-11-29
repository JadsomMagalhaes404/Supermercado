public class Produto {
	private String nome;
	private String descricao;
	private String dataValidade;
	private String fornecedor;
	private float precoCompra;
	private float precoVenda;
	private int estoque;
	
	public Produto(String nome, String descricao, String dataValidade, String fornecedor, float precoCompra,
	float precoVenda, int estoque) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataValidade = dataValidade;
		this.fornecedor = fornecedor;
		this.precoCompra = precoCompra;
		this.precoVenda = precoVenda;
		this.estoque = estoque;
	}
	public String getNome() {
		return this.nome;
	}
		public void setNome(String nome) {
			this.nome = nome;
		}
	public String getDescricao() {
		return this.descricao;
	}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
	public String getDataValidade() {
		return this.dataValidade;
	}
		public void setDataValidade(String dataValidade) {
			this.dataValidade = dataValidade;
		}
	public String getFornecedor() {
		return this.fornecedor;
	}
		public void setFornecedor(String fornecedor) {
			this.fornecedor = fornecedor;
		}
	public float getPrecoCompra() {
		return this.precoCompra;
	}
		public void setPrecoCompra(float precoCompra) {
			this.precoCompra = precoCompra;
		}
	public float getPrecoVenda() {
		return this.precoVenda;
	}
		public void setPrecoVenda(float precoVenda) {
			this.precoVenda = precoVenda;
		}
	public int getEstoque() {
		return this.estoque;
	}
		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}
	
}
