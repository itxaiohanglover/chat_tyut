package com.tyut.chat.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private Integer id;
    private Integer from;
    private Integer to;
    private String content;
}
