package cdu.gu.chat.clients;

import cdu.gu.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/getUserById/{id}")
    User findById(@PathVariable("id") int id);
}
