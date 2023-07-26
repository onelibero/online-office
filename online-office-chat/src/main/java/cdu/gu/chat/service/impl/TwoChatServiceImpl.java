package cdu.gu.chat.service.impl;

import cdu.gu.chat.mapper.TwoChatMapper;
import cdu.gu.chat.service.TwoChatService;
import cdu.gu.entity.Chat;
import cdu.gu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TwoChatServiceImpl implements TwoChatService {
    @Autowired
    private TwoChatMapper twoChatMapper;


    @Override
    public int sendMessage(Chat chat) {
        return twoChatMapper.sendMessage(chat);
    }


    @Override
    public List<Chat> fetchChat(int send_id, int fetch_id) {
        RestTemplate restTemplate = new RestTemplate();
        List<Chat> chatList = twoChatMapper.fetchChat(send_id,fetch_id);
        String url = "http://user/user/getUserById/1";
        User user = restTemplate.getForObject(url,User.class);
        System.out.println("查询的"+user);
        for (Chat chat:chatList){
            chat.setSend_user(user);
            chat.setFetch_user(user);
            break;
        }
        return chatList;
    }
}
