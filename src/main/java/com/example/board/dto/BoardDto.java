package com.example.board.dto;

import lombok.Data;

@Data
public class BoardDto {

    private int no;
    private String title;
    private String content;
    private String writer;
    private String regDate;
    private int count;

}
