package com.aidijing.manage.service;

import com.aidijing.manage.bean.domain.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 后台管理用户 服务类
 * </p>
 *
 * @author 披荆斩棘
 * @since 2017-06-19
 */
public interface UserService extends IService< User > {


	User get ( Long id );

	User update ( User user );

	boolean save ( User user );

	boolean delete ( Long id );

	User findByUsername ( String Username );

	boolean isExist ( Long userId );

	boolean isNotExist ( Long userId );


}
