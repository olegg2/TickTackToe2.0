package ua.oleg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Player extends BaseEntity{
	@Column(name="username", unique = true, nullable = false)
	private String username;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="email", unique = true, nullable = false)
	private String email;
	
}
