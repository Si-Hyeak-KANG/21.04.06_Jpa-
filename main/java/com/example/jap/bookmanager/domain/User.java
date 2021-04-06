package com.example.jap.bookmanager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

//lombok에서 getter 와 setter를 생성하는 방법
@Setter
@Getter
@ToString //lombok을 통해 ToString 생성
//생성자 관련 annotation 3가지
//거의 필수적으로 생성 해야한다.
//꼭 필요한 인자만을 이용해서 생성자를 만들어주는 어노테이션
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Data //Entity객체를 사용하면서 가장 많이 사용할 annotation
// @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode 포괄함.
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue//순차적으로 데이터를 증가
    private Long Id;

    @NonNull//필수값 지정  ,,, NonNull이 없으면 required는 no와 동일 효과 적용
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt; //생성된 시간(관리)
    private LocalDateTime updatedAt; //수정된 시간(관리)


/*    @AllArgsConstructor
    public User(@NonNull String name, @NonNull String email, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @NoArgsConstructor
    public User() {
    }

    @RequiredArgsConstructor
    public User(@NonNull String name, @NonNull String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return getClass().getName()
                +" : "
                +"name = " + name
                +" email = " + email
                +" createdAt = " + createdAt
                +" updatedAt = " + updatedAt;
    }
*/


}
