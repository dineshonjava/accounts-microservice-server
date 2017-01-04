/**
 * 
 */
package com.doj.ms.accounts;

import java.io.Serializable;

/**
 * @author Dinesh.Rajput
 *
 */
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long amount;
	private String number;
	private String name;
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [amount=" + amount + ", number=" + number + ", name=" + name + "]";
	}
	public Account(Long amount, String name, String number) {
		super();
		this.amount = amount;
		this.number = number;
		this.name = name;
	}
	
}
