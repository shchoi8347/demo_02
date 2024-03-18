package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
// 퍼시스턴스 계층, 비지니스 계층에서 사용되는 데이터
public class TodoEntity {
    private String id;
    private String userId; // 이메일
    private String title; // 할 일 이름
    private boolean done; // 완료 여부   
}
