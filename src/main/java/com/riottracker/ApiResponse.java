package com.riottracker;

import java.net.http.HttpResponse;

public class ApiResponse {
    private final int statusCode;
    private final String body;
    private final boolean isSuccess;

    ApiResponse(HttpResponse<String> response) {
        statusCode = response.statusCode();
        if (statusCode == 200 || statusCode == 201) {
            isSuccess = true;
        } else {
            isSuccess = false;
        }
        body = response.body();
    }

    public String getBody() {
        return body;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }
}
