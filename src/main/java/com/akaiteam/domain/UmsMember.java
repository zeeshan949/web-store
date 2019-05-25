package com.akaiteam.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 * The persistent class for the ums_member database table.
 * 
 */
@Entity
@Table(name="ums_member")
@NamedQuery(name="UmsMember.findAll", query="SELECT u FROM UmsMember u")
@Getter
@Setter
@ToString
public class UmsMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String password;

	private Integer status;

	private String username;

	public UmsMember() {
	}
	
	public UmsMember(String username, String password) {
		super();
		this.password = password;
		this.username = username;
	}
	
	

}