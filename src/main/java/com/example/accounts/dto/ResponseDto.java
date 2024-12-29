package com.example.accounts.dto;

import lombok.Data;

@Data
public class ResponseDto {
    private String statusCode;
    private String statusMsg;

    public ResponseDto() {
    }

    public ResponseDto(String statusCode, String statusMsg) {
        this.statusCode = statusCode;
        this.statusMsg = statusMsg;
    }
}
