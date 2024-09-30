package com.hospital.review.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AppException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -6085487888211764349L;
    private ErrorCode errorCode;
    private String message;
}
