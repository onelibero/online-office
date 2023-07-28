package cdu.gu.feign.clients;


import cdu.gu.feign.config.DefaultFeignConfiguration;
import cdu.gu.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userservice",configuration = DefaultFeignConfiguration.class)
public interface UserClient {
    @GetMapping("/user/getUserById/{id}")
    User findById(@PathVariable("id") int id);
}
