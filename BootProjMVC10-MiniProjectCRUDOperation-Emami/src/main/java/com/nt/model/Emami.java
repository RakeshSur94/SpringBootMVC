package com.nt.model;

import java.io.Serializable;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "EMAMI_AGROTECH")

/*@SQLDelete(sql = "update emami_agrotech set STATUS='DELETED' where id=?")
@Where(clause = "STATUS<>'DELETED'")*/
public class Emami implements Serializable{
	
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "EMAMI_SEQ",initialValue = 1,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String name;
	
	private String desg;
	
	private Double sal;
	@Transient
	private String status="ACTIVE";

}
