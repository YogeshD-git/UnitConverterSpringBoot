package com.UnitConverter.UnitConverter.dto;

public class ResponseDTO {
	private Object value;
    private String message;
    private Integer statusCode;

    public ResponseDTO(Object value, String message, Integer statusCode) {
        this.value = value;
        this.message = message;
        this.statusCode = statusCode;
    }

    public Object getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }
}
