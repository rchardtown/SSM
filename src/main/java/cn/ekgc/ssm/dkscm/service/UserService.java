package cn.ekgc.ssm.dkscm.service;

import cn.ekgc.ssm.dkscm.entity.User;

public interface UserService {
		User getUserByCellphone( String cellphone)throws Exception;
}
