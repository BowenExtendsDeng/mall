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
public class Blog{

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String title;

    private String description;

    private String content;

    private LocalDateTime created;

    private Integer status;


}
