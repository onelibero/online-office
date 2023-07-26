package cdu.gu.user.controller;


import cdu.gu.entity.User;
import cdu.gu.user.service.PersonalService;
import cdu.gu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class PersonalController {
    @Autowired
    private PersonalService personalService;
    @GetMapping("/register")
    public String register(){
        return "sfsf";
    }
    @GetMapping("/getUserById/{userId}")
    public R searchUserById(@PathVariable("userId") int  id){
        System.out.println(id);
        User user = personalService.searchUserById(id);
        System.out.println(user);
        if (personalService.searchUserById(id) != null)
            return R.ok().put("user",user);
       else return R.error();
    }
}
