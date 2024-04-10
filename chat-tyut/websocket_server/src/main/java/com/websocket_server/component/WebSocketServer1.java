package com.websocket_server.component;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@ServerEndpoint("/socket1/{userId}")
@Component
public class WebSocketServer1 {
    /**
     *记录当先在线数量
     **/
    public static final Map<String,Session> sessionMap = new ConcurrentHashMap<>();

    @OnOpen
    public void onOpen(Session session, @PathParam("userId")String userId){
        if(userId==null)    return;
        //判断是否重复
        if(sessionMap.get(userId)!=null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("type",0);
            this.sendMessage(jsonObject.toString(),sessionMap.get(userId));
            sessionMap.remove(userId);
        }
        System.out.println("用户："+userId+"已连接server2");
        sessionMap.put(userId,session);
        //群发
        JSONObject online = new JSONObject();
        online.put("type",1);
        online.put("onlineNum",sessionMap.size());
        this.sendAllMessage(online.toString());
    }
    @OnClose
    public void onClose(Session session,@PathParam("userId") String userId){
        sessionMap.remove(userId);
        System.out.println("用户"+userId+" 已从server2下线了！");
        //群发
        JSONObject online = new JSONObject();
        online.put("type",1);
        online.put("onlineNum",sessionMap.size());
        this.sendAllMessage(online.toString());
    }
    @OnMessage
    public void onMessage(String message,Session session,@PathParam("userId") String userId){
        this.sendAllMessage(message);
    }
    @OnError
    public void onError(Session session,Throwable error){
        error.printStackTrace();
    }

    private void sendMessage(String message,Session toSession){
        try {
            toSession.getBasicRemote().sendText(message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void sendAllMessage(String message){
        try {
            for(Session session : sessionMap.values()){
                session.getBasicRemote().sendText(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
