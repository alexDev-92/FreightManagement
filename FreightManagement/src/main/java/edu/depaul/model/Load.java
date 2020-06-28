package edu.depaul.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "loads")
public class Load implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name = "load_id")
	private long id;
	
	@Column(name ="weight")
	private int weight;
	
	@Column(name ="shipping_city")
	private String shippingCity;
	
	@Column(name ="shipping_state")
	private String shippingState;
	
	@Column(name ="receiving_city")
	private String receivingCity;
	
	@Column(name ="receiving_state")
	private String receivingState;
	
	@Column(name ="commodity")
	private String commodity;
	/*
	@Column(name ="")
	private boolean loadShipped;
	*/
	@Column(name ="shipping_date")
	private Date shippingDate;
	
	@Column(name ="receiving_date")
	private Date receivingDate;
	
	


}
