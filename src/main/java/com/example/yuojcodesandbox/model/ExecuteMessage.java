package com.example.yuojcodesandbox.model;

import lombok.Data;

@Data
public class ExecuteMessage {

//    不要要int不如默认值会是0，会自动正常推出
    private Integer exitValue;

    private String message;

    private String errorMessage;

    private Long time;

    private Long memory;
}
