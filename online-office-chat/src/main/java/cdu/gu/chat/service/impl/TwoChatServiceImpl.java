package cdu.gu.chat.service.impl;

import cdu.gu.chat.mapper.TwoChatMapper;
import cdu.gu.chat.service.TwoChatService;
import cdu.gu.entity.User;
import cdu.gu.feign.clients.UserClient;
import cdu.gu.entity.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TwoChatServiceImpl implements TwoChatService {
    @Autowired
    private TwoChatMapper twoChatMapper;

    @Autowired
    private UserClient userClient;
    @Override
    public int sendMessage(Chat chat) {
        return twoChatMapper.sendMessage(chat);
    }


    @Override
    public List<Chat> fetchChat(int send_id, int fetch_id) {

        List<Chat> chatList = twoChatMapper.fetchChat(send_id,fetch_id);
        User user = userClient.findById(send_id);
        System.out.println(userClient.findById(send_id));
        for (Chat chat:chatList){
            chat.setSend_user(user);
            chat.setFetch_user(user);
            break;
        }
        return chatList;
    }
}
