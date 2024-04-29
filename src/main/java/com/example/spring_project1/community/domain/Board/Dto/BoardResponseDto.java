package com.example.spring_project1.community.domain.Board.Dto;

import jakarta.persistence.Column;
import java.time.LocalDateTime;

public class BoardResponseDto {
    private Long id;

    private String pw;

    private String title;

    private String sub_title;

    private LocalDateTime createdAt;

    private LocalDateTime modifiedAt;

    public BoardResponseDto(Long id, String pw, String title, String sub_title, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.pw = pw;
        this.title = title;
        this.sub_title = sub_title;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }

    public Long getId() {
        return id;
    }

    public String getPw() { return pw; }

    public String getTitle() {
        return title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }


}
