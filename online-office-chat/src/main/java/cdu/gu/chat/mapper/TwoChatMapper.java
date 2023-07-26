package cdu.gu.chat.mapper;

import cdu.gu.entity.Chat;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TwoChatMapper {
    /**
     * 发送信息
     * @param chat
     * @return
     */
    int sendMessage(Chat chat);
    List<Chat> fetchChat(@Param("send_id") int send_id, @Param("fetch_id") int fetch_id);
}
