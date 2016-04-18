package br.com.partiu.modelo;
// Generated Feb 26, 2016 2:18:19 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Reserva generated by hbm2java
 */
@Entity
@Table(name = "reserva", catalog = "partiu")
public class Reserva implements java.io.Serializable {

	private Integer identificador;
	private Estabelecimento estabelecimento;
	private Date dataReserva;
	private Date hora;
	private Integer qntLugar;

	public Reserva() {
	}

	public Reserva(Estabelecimento estabelecimento, Date dataReserva, Date hora, Integer qntLugar) {
		this.estabelecimento = estabelecimento;
		this.dataReserva = dataReserva;
		this.hora = hora;
		this.qntLugar = qntLugar;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Identificador", unique = true, nullable = false)
	public Integer getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	public Estabelecimento getEstabelecimento() {
		return this.estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Data_reserva", length = 10)
	public Date getDataReserva() {
		return this.dataReserva;
	}

	public void setDataReserva(Date dataReserva) {
		this.dataReserva = dataReserva;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "Hora", length = 8)
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Column(name = "Qnt_lugar")
	public Integer getQntLugar() {
		return this.qntLugar;
	}

	public void setQntLugar(Integer qntLugar) {
		this.qntLugar = qntLugar;
	}

}