package cdu.gu.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Chat {
    private Integer id;
    private Integer send_id;
    private User send_user;
    private Integer fetch_id;
    private User fetch_user;
    private Integer room_id;
    private String content;
    private Date create_time = new Date();
}
