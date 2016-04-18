package br.com.partiu.modelo;
// Generated Feb 26, 2016 2:18:19 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name = "usuario", catalog = "partiu")
public class Usuario implements java.io.Serializable {

	private Integer id;
	private String login;
	private String senha;
	private String email;
	private Set<Cliente> clientes = new HashSet<Cliente>(0);
	private Set<Gerente> gerentes = new HashSet<Gerente>(0);

	public Usuario() {
	}

	public Usuario(String login, String senha, String email, Set<Cliente> clientes, Set<Gerente> gerentes) {
		this.login = login;
		this.senha = senha;
		this.email = email;
		this.clientes = clientes;
		this.gerentes = gerentes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Login", length = 20)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "Senha", length = 10)
	public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column(name = "Email", length = 30)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario")
	public Set<Gerente> getGerentes() {
		return this.gerentes;
	}

	public void setGerentes(Set<Gerente> gerentes) {
		this.gerentes = gerentes;
	}

}
