package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "players")
//In the above @Table is optional as the table name and Entity class name is same
public class Player {

	@Id
	//Here @Column is optional as column name is same in both Entity class and db table
	private int player_id;
	
	private String player_name;

	@Column(name = "player_age")
	private int age;
	
	@Column(name = "player_gender")
	private String gender;
	
	@Column(name = "player_city")
	private String city;
	
	
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Players [player_id=" + player_id + ", player_name=" + player_name + ", age=" + age + ", gender="
				+ gender + ", city=" + city + "]";
	}
	
	
}
