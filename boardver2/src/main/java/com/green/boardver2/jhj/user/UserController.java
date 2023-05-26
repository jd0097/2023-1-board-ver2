package com.green.boardver2.jhj.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("jhjUserController")
@RequestMapping("/jhj/user")
public class UserController {

    @PostMapping
    public int postUser() {
        return 0;
    }
}
