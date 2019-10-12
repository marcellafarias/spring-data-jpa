package com.challenge.entity;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "candidate")
@EntityListeners(AuditingEntityListener.class)
public class Candidate {

	@EmbeddedId
	private CandidatePK id;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private User user;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Acceleration acceleration;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Company company;

	@NotNull
	@Column(name = "status")
	private Integer status;

	@CreatedDate
	@Column(name = "created_at")
	private Timestamp createdAt;

	public CandidatePK getId() {
		return id;
	}

	public void setId(CandidatePK id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Acceleration getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(Acceleration acceleration) {
		this.acceleration = acceleration;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer statusId) {
		this.status = statusId;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidate other = (Candidate) obj;
		return Objects.equals(id, other.id);
	}

}
