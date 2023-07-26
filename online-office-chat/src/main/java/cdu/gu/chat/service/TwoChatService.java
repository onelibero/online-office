package cdu.gu.chat.service;

import cdu.gu.entity.Chat;

import java.util.List;

public interface TwoChatService {
    int sendMessage(Chat chat);
    List<Chat> fetchChat(int send_id,int fetch_id);
}
