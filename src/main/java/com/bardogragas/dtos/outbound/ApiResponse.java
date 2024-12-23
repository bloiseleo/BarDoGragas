package com.bardogragas.dtos.outbound;

import org.springframework.http.HttpStatusCode;

public class ApiResponse {
    private String message;
    private HttpStatusCode status;
    public ApiResponse(String message, HttpStatusCode status) {
        this.message = message;
        this.status = status;
    }
}
