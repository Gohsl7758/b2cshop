package cn.hgu.dao;

import java.util.List;

import cn.hgu.model.Street;
import cn.hgu.model.Types;

public interface listDao {
	public List<Types> show_select();
	public List<Street> show_select_two();
}	
