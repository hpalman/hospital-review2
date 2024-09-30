package com.hospital.review.service;

import org.springframework.stereotype.Service;

import com.hospital.review.domain.User;
import com.hospital.review.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String join(String userName, String password) {

        // userName 중복 check
        userRepository.findByUserName(userName).ifPresent(user -> {
            throw new RuntimeException(userName + "는 이미 있습니다.");
        });

        // 저장
        User user = User.builder()
                .userName(userName)
                .password(password)
                .build();
        userRepository.save(user);

        return "SUCCESS";
    }
}
