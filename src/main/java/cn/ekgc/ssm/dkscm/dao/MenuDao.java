package cn.ekgc.ssm.dkscm.dao;

import java.util.List;
import java.util.Map;

import cn.ekgc.ssm.dkscm.entity.Menu;

public interface MenuDao {
	List<Menu> findListByQuery(Map<String, Object> params) throws Exception;
}
