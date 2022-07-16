package com.mall.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author bowen
 * @email 2631702650@qq.com
 */

@Data
public class AccountProfile implements Serializable {
    private String username;

    private String avatar;

    private String email;

    private String password;
}
