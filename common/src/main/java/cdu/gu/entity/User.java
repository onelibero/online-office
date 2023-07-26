package cdu.gu.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private Integer id;
    private String user_id;
    private String username;
    private String password;
    private String salt;
    private String phone;
    private String email;
    private String avatar;
    private List<String> signature;
    private Date create_time = new Date();
}
