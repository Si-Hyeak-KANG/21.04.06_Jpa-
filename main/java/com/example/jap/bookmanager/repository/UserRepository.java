package com.example.jap.bookmanager.repository;

import com.example.jap.bookmanager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//<entity의 타입, User의 Id값.>
//아무것도 안했지만 JpaRepository를 상속받는 인터페이스만 만들어도 jpa의 많은 메서드를 활용 가능
//JpaReopository 또한 상위 Repository들이 존재한다.
public interface UserRepository extends JpaRepository<User, Long> {
}
