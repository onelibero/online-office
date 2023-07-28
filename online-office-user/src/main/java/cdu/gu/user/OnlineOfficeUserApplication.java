package cdu.gu.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("cdu.gu.user.mapper")
public class OnlineOfficeUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineOfficeUserApplication.class, args);
    }

}
