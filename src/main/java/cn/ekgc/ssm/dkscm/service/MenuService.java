package cn.ekgc.ssm.dkscm.service;

import java.util.List;

import cn.ekgc.ssm.dkscm.entity.Menu;
import cn.ekgc.ssm.dkscm.entity.Role;

public interface MenuService {
	List<Menu> getMenuListForIndex(Role role) throws Exception;
}
