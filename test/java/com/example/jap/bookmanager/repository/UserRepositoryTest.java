package com.example.jap.bookmanager.repository;

import com.example.jap.bookmanager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional//session 유지
    void crud() {

        /*
        //findAll()
        List<User> users = userRepository.findAll(Sort.by(Sort.Direction.DESC,"name"));//이름의 역순

        //findAllById()
//        List<Long> ids = new ArrayList<>();
//        ids.add(1L);
//        ids.add(3L);
//        ids.add(5L);

        List<User> users = userRepository.findAllById(Lists.list(1L, 3L, 5L));//assertJ를 통한 라이브러리, L은 숫자가 LONG type 이라는 말
        //지정해준 id만 호출
         */

        /*
        //saveAll(), save()
        User user1 = new User("jack", "jack@fastfast.com");
        User user2 = new User("string","string@fafa.com");
        User user3 = new User("kaka", "kaka@mnu.tt");

        userRepository.saveAll(Lists.newArrayList(user1, user2));
        userRepository.save(user3);

        users.forEach(System.out::println);
        */

        /*
        //getOne() , findById().orElse()
//        User user = userRepository.getOne(1L); @Transactional//session 유지

        User user = userRepository.findById(1L).orElse(null);//Optrional<T> findById(id) -> .orElse(other)
        System.out.println(user);
        */

        /*
        //flush()
        userRepository.saveAndFlush(new User("new martin","newmartin@cccc.cocm"));
        userRepository.findAll().forEach(System.out::println);// Flush()는 쿼리에 변화를 주는 것이 아닌 DB반영 시점을 조절하는 내용이여서 로그상 변화 확인 x
        */

        /*
        //count()
        Long count = userRepository.count();
        System.out.println(count);
        //existsById()
        boolean exists = userRepository.existsById(1L);
        System.out.println(exists);//의외로 카운트 쿼리 조회 가능
        */

        /*
        //delete(), deleteById(), deleteAll(), deleteInBatch()
        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
        userRepository.deleteById(1L);
        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L, 3L)));
        userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L, 3L)));//delete 쿼리 단순화
        userRepository.deleteAllInBatch();//select 쿼리가 존재x where 쿼리 존재 x
        userRepository.findAll().forEach(System.out::println);
         */
        /*
        //조회 쿼리
        Page<User> users = userRepository.findAll(PageRequest.of(0,3)); //PageRequest는 Pageable의 구현체, zero-based

        System.out.println(users);
        System.out.println("totalElements" + users.getTotalElements());//전체 element의 갯수 = count
        System.out.println("totalPages" + users.getTotalPages());//전체 page수
        System.out.println("numberOfElements : " + users.getNumberOfElements());//현재 가져온 레코드 수
        System.out.println("sort : " + users.getSort());
        System.out.println("size : " + users.getSize()); //페이징할 때 나누는 크기

        users.getContent().forEach(System.out::println);
         */
        /*
        //검색이 필요한 인자를 Example qeury,,실제로는 생각보다 많이 쓰이지는 않음.
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")//매칭하는데서 무시하겠다.
                .withMatcher("email", endsWith());//확인하겠다
        Example<User> example = Example.of(new User("ma","gmail.com"), matcher);
        userRepository.findAll(example).forEach(System.out::println);
         */


        //update query
        userRepository.save(new User("daniel", "danial@naver.com"));//ENTITY가 NULL이면 오류

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("martin-updated@fastcampus.com");

        userRepository.save(user);
    }
}