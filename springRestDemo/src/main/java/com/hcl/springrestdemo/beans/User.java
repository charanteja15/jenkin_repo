package com.hcl.springrestdemo.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class User
{
	private int userId;
	private String userName;

	
}
