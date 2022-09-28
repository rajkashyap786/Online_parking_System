package com.parkingSystem.OnlineParkingSystem.Model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name="users")
public class User {

	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   private int user_id;
	   
//	   @NotEmpty
//	   @Size(min=4,message="Username must be 4 characters")
	   private String name;
	   
//	   @Email(message="Email address is not Valid !!")
	   private String email;
	   
//	   @NotEmpty
	   private String username;
	   
//	   @NotEmpty
//	   @Size(min=4,max=10,message="Password must be min of 3 characters and max of 10 characters")
//	   @Pattern(regexp="")
	   private String password;
	   
//	   @NotEmpty
	   private int contact;
//	   @NotEmpty
	   private String address;
	
	 @Column
	 @Enumerated(EnumType.STRING)
	 @ElementCollection(fetch=FetchType.EAGER)
	   private Set<Roles> roles=new HashSet<>();
	
	public User() {
		
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", email=" + email + ", username=" + username
				+ ", password=" + password + ", contact=" + contact + ", address=" + address + "]";
	}


//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//
//		Set<GrantedAuthority> authorities=new HashSet<>();
//		for(Roles r : this.roles) {
//			SimpleGrantedAuthority rol=new SimpleGrantedAuthority(r.name());
//		authorities.add(rol);
//		}
//		return authorities;
//	}
//
//
//	@Override
//	public boolean isAccountNonExpired() {
//		
//		return true;
//	}
//
//
//	@Override
//	public boolean isAccountNonLocked() {
//		
//		return true;
//	}
//
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//	
//		return true;
//	}
//
//
//	@Override
//	public boolean isEnabled() {
//		
//		return true;
//	}

}
