package cn.ekgc.ssm.dkscm.dao;

import java.util.List;
import java.util.Map;

import cn.ekgc.ssm.dkscm.entity.User;

public interface UserDao {
	List<User> findByQueryForPage(Map<String, Object> params) throws Exception;
}
