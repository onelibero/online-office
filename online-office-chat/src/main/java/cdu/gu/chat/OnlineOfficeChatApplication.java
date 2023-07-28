package cdu.gu.chat;

import cdu.gu.feign.clients.UserClient;
import cdu.gu.feign.config.DefaultFeignConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients(clients = UserClient.class,defaultConfiguration = DefaultFeignConfiguration.class)
@SpringBootApplication
@MapperScan("cdu.gu.chat.mapper")
public class OnlineOfficeChatApplication {
    /**
     * 创建restTemplate类并注入bean
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }



    public static void main(String[] args) {
        SpringApplication.run(OnlineOfficeChatApplication.class, args);
    }


}
