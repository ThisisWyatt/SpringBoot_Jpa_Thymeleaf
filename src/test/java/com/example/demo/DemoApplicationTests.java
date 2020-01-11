package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;


@SpringBootTest
class DemoApplicationTests {
    @Test
    void contextLoads() {
        System.out.println("test哈哈哈哈哈哈哈哈哈哈");
    }

    @Resource //自动注入，通过这个注解，项目启动之后，SpringBoot会帮助我们实例一个jdbc对象
    private JdbcTemplate jdbcTemplate;
    @Test
    void mySqlTest() {
        String sql = "select id,name,password from spring.user";
//        RowMapper对象：将查询出的每一行数据封装成用户定义的类
        List<User> userList = (List<User>) jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
        System.out.println("查询成功");
        for(User user:userList){
            System.out.println("【id】:"+user.getId()+";【name】:"+user.getName());
        }
    }

    @Resource
    private UserService userService;
    @Test
    void testRepository(){
        List<User> list=userService.findByNameLike("%1        %");
        System.out.println("查询成功");
        for (User user : list) {
            System.out.println("id:" + user.getId() + " name:" + user.getName() + " password:" + user.getPassword());
        }
//        User user=new User();
//        user.setId("6");
//        user.setName("正");
//        user.setPassword("456");
//        userService.save(user);
    }

    @Test
    void printTest(){
        Optional<User> list=userService.findById("11");
        User user=list.orElse(null);
        assert user != null;// assert 后面的布尔表达式为false 则会抛出异常
        System.out.println("【id】:"+user.getId()+";【name】:"+user.getName());
    }

    @Test
    void assertTest(){
        try {
            assert false;
        } catch (Exception e) {
            System.out.println("布尔表达式报错");
        }
        System.out.println("正确");
    }

    @Test
    void deleteTest(){
        userService.delete("1");
    }
}
