package com.inhatc.jstalk.model;

import org.w3c.dom.Comment;

import java.util.HashMap;
import java.util.Map;

import javax.sql.CommonDataSource;

public class ChatModel {

    public Map<String, Boolean> users = new HashMap<>(); //채팅방의 유저들
    public Map<String, Comment> comments = new HashMap<>(); //채팅방의 대화내용

    public static class Comment{

        public String uid;
        public String message;
        public Object timestamp;
    }
}
