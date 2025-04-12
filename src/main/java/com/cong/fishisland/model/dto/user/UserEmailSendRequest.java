package com.cong.fishisland.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户邮箱发送请求体
 * # @author <a href="https://github.com/lhccong">程序员聪</a>
 */
@Data
public class UserEmailSendRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String email;

}