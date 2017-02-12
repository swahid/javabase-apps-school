/**
 * 
 */
package org.javabase.apps.service;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.EmpPost;
import org.javabase.apps.mapper.EmpPostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
@Service
public class EmpPostServiceImpl implements EmpPostService{

	@Autowired
	EmpPostMapper empPostMapper;
	
	@Override
	public List<EmpPost> getAllEmpPosts() {
		return empPostMapper.getAllEmpPosts();
	}
	
	@Override
	public List<EmpPost> getAllEmpPostsByParam(Map<String, Object> params) {
		return empPostMapper.getAllEmpPostsByParam(params);
	}

	@Override
	public EmpPost getEmpPostById(int empPostId) {
		return empPostMapper.getEmpPostById(empPostId);
	}

	@Override
	public boolean addEmpPost(EmpPost empPost) {
		return empPostMapper.addEmpPost(empPost);
	}

	@Override
	public boolean updateEmpPost(EmpPost empPost) {
		return empPostMapper.updateEmpPost(empPost);
	}

	@Override
	public boolean deleteEmpPost(int empPostId) {
		return empPostMapper.deleteEmpPost(empPostId);
	}

}
