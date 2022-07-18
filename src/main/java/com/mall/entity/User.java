package com.mall.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

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
@Accessors(chain = true)
@TableName("user")
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotBlank(message = "用户名不能为空")
    private String username;

    private String avatar;
    @NotBlank(message = "密码不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    private String password;

    private Integer status;

    private LocalDateTime lastLogin;


}
