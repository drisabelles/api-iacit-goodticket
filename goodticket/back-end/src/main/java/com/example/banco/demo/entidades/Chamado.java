package com.example.banco.demo.entidades;
import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("chamados")
@Data
public class Chamado {
	
	@Id
	private String id;
	
	private String titulo;
	
	private String descricao;
	
	private String tipo;
	
	private String equipamento; 
	
	private String descri_equipamento;
	
	private Number num_maquina;
	
	private String local;
	
	private Number sala;
	
	private Date datahora;
	
	private String resolucao;
	
	private String status;
	
	private String dificuldade;
	
	private String prioridade;
	
	private Usuario relator;

}
