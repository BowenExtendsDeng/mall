package com.mall.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author bowen
 * @since 2022-07-15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{

    private static final long serialVersionUID = 1L;

    private String username;

    private String avatar;

    private String email;

    private String password;

    private Integer status;

    private LocalDateTime lastLogin;


}
