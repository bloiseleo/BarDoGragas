package com.bardogragas.dtos.outbound;

import org.springframework.http.HttpStatusCode;

public class ApiResponseData<T> extends ApiResponse {
    private T data;
    public ApiResponseData(String message, HttpStatusCode status, T data) {
        super(message, status);
        this.data = data;
    }
}
