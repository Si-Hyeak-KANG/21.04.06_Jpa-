package com.example.jap.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();//NoArgsConstructor
        user.setEmail("martin@gmail.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        //AllArgsConstructor user == user1
        User user1 = new User(null,"martin","martin@gmail.com", LocalDateTime.now(),LocalDateTime.now());
        User user2 = new User("martin", "martin@gmail.com");//RequiredArgsConstructor

        User user3 = User.builder()
                .name("martin")
                .email("martin@gmail.com")
                .build();

        System.out.println(">>> " + user);
        //자바의 모든 객체는 Object 클래스의 하위객체
        //안보이지만 모든 자바 클래스는 Object를 상속 중
        //toString은 Object의 메서드
        //따라서 위에서 user란 객체만 호출했을 경우 user.toString() 을 출력하는 격
        //자바에서 모든 객체는 toString 메서드를 오버라이드하도록 권고

    }
}