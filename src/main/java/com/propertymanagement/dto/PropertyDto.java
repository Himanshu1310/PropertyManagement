package com.propertymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PropertyDto {
	private String title;
	private String description;
	private String ownerName;
	private String ownerMail;
	private Double price;
	private String address;
}
