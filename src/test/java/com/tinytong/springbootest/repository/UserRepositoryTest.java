package com.tinytong.springbootest.repository;

import com.tinytong.springbootest.enity.User;
//import org.graalvm.compiler.lir.LIRInstruction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public UserRepository userRepository;

    public String testFuck="HHHH";


    @Test
    void finAll(){
        System.out.println(userRepository.findAll());
    }
    @Test
    void save(){
        User user= new User();
        user.setUser_id("zhangtongtong");
        user.setUser_password("111");
        User user1=userRepository.save(user);
        System.out.println(user1);

    }


    @Test
    void TestDemo(){
//       userRepository.findAll().toArray();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("zhangtong");
        String demo="zhangtong";
        if (list.contains(demo)==true){
            System.out.println("nimasi?");
        }


            User userResult=new User();
            userResult.setUser_id("123");
            userResult.setUser_password("lalal");
            User user1=userRepository.save(userResult);
            System.out.println(user1);
            System.out.println(user1);

        System.out.println(list);
//        System.out.println(userRepository.findAll());
    }

@Test
    void testArray(){
        userRepository.findAll();
        int a=userRepository.findAll().size();
        List<String> list = new ArrayList<String>();
        for (int i=0;i<a;i++){
            list.add(userRepository.findAll().get(i).getUser_id());
        }
        boolean flag=list.contains("cao");
    System.out.println(flag);
    System.out.println(list);
//    boolean a=userRepository.findAll()==true;
//        System.out.println(a);
//        System.out.println(userRepository.findAll().get(1).getUser_id());
    }

    @Test
    void testString(){
        String a="zhangtong";
        String b="zhangtong";
        if (a==b){
            System.out.println("==");
        }else{
            System.out.println("!=");
        }
    }
    @Test
    void check() {

//        String a="1";
        User user=userRepository.getOne("1");
        Optional<User> findResult = userRepository.findById("1");

        try {
            findResult.get();
            System.out.println(findResult.get().getUser_password());

        }catch (Exception e){
            System.out.println("error");
        }

    }
    @Test
    void findTest(){

        System.out.println(testFuck);
    }
}