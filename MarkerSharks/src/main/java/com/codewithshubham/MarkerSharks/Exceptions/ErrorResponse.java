package com.codewithshubham.MarkerSharks.Exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorResponse {
	private String error;
	private String message;

	public ErrorResponse(String error, String message) {
		this.error = error;
		this.message = message;
	}

	
}
