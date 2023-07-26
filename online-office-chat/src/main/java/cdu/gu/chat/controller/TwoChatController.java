package cdu.gu.chat.controller;

import cdu.gu.chat.service.TwoChatService;
import cdu.gu.entity.Chat;
import cdu.gu.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chat")
public class TwoChatController {
    @Autowired
    private TwoChatService twoChatService;

    /**
     * 发送消息
     * @param chat
     * @return
     */
    @PostMapping("/send")
    public R sendMessage(@RequestBody Chat chat){
        if(twoChatService.sendMessage(chat)!=0)
            return R.ok();
        else return R.error();
    }
    @GetMapping("/fetch")
    public R fetchChat(@RequestBody Chat chat){

        List<Chat> chatList = twoChatService.fetchChat(chat.getSend_id(),chat.getFetch_id());
        System.out.println(chatList);
        if (chatList!=null && chatList.size() >0)
            return R.ok().put("chatList",chatList);
        return R.error();
    }

}


