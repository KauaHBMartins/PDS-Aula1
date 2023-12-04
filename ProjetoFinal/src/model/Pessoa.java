package model;

public class Pessoa {

	private String nome;
	private int cpf;
	private String email;
	private int telefone;
	private int nascimento;
	private String endereco;
	private String cidade;
	private int cep;
	public Object getEstado() {
		return estado;
	}
	public void setEstado(Object object) {
		this.estado = object;
	}
	public Object getGenero() {
		return genero;
	}
	public void setGenero(Object object) {
		this.genero = object;
	}
	public Object getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Object object) {
		this.nacionalidade = object;
	}
	private Object estado;
	private Object genero;
	private Object nacionalidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getNascimento() {
		return nascimento;
	}
	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
}
