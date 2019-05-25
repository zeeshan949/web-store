package com.akaiteam.domain;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

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
@Getter
@Setter
@ToString
@NamedQuery(name="UmsMember.findAll", query="SELECT u FROM UmsMember u")
public class UmsMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BigInteger id;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String city;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	private Integer gender;

	private String icon;

	private String job;

	@Column(name="member_level_id")
	private BigInteger memberLevelId;

	private String nickname;

	private String password;

	private String phone;

	private Integer status;

	private String username;
	
	public UmsMember(String username, String password) {
		super();
		this.password = password;
		this.username = username;
	}
	
	

}