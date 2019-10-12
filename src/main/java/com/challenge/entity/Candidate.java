package com.challenge.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "candidate")
@EntityListeners(AuditingEntityListener.class)
public class Candidate {

	@EmbeddedId
	private CandidatePK id;
	
//	@Column(name = "user_id")
//	@JoinColumn(name = "user_id")
//	@NotNull
//	@ManyToOne(fetch = FetchType.EAGER)
//	private User userId;
//	
//	@Column(name = "acceleration_id")
//	@JoinColumn(name = "acceleration_id")
//	@NotNull
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Acceleration accelerationId;
//	
//	@Column(name = "company_id")
//	@JoinColumn(name = "company_id")
//	@NotNull
//	@ManyToOne(fetch = FetchType.EAGER)
//	private Company companyId;
	
	@Column(name = "status_id")
	private Integer statusId;
	
	@CreatedDate
	@Column(name = "created_at")
	private Timestamp createdAt;


}
