package com.example.study01.vo;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;
import lombok.NonNull;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class TestVO {
	@NonNull
	private String id;
	
	private String pass;
}
