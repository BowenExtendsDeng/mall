package com.mall.mapper;

import com.mall.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author bowen
 * @since 2022-07-15
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
