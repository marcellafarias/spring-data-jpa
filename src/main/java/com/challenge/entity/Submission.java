package com.challenge.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "submission")
@EntityListeners(AuditingEntityListener.class)
public class Submission {

	@EmbeddedId
	private SubmissionPK id;

	@NotNull
	private Float score;

	@CreatedDate
	@Column(name = "created_at")
	private LocalDate createdAt;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private User user;

	@ManyToOne
	@JoinColumn(insertable = false, updatable = false)
	private Challenge challenge;

	public SubmissionPK getId() {
		return id;
	}

	public void setId(SubmissionPK id) {
		this.id = id;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Challenge getChallenge() {
		return challenge;
	}

	public void setChallenge(Challenge challenge) {
		this.challenge = challenge;
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
		Submission other = (Submission) obj;
		return Objects.equals(id, other.id);
	}

}