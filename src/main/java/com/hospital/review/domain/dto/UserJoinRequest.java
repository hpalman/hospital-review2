package com.hospital.review.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class UserJoinRequest {
    private String userName;
    private String password;
}
