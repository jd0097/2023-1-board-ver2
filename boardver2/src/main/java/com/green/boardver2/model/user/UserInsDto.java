package com.green.boardver2.model.user;

import lombok.Data;

@Data
public class UserInsDto {
    private String uid;
    private String upw;
    private String nm;
    private char gender;
    private String addr;
}
