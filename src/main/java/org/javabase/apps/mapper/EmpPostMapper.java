package org.javabase.apps.mapper;

import java.util.List;
import java.util.Map;

import org.javabase.apps.entity.EmpPost;

/**
 * @author  Rashedunnabi <rashedunnabi21@gmail.com>
 * @version	1.0.0
 * @since	1.0.0
 */
public interface EmpPostMapper {
	
	public List<EmpPost> getAllEmpPosts();
	public List<EmpPost> getAllEmpPostsByParam(Map<String, Object> params);
	public EmpPost getEmpPostById(int empPostId);
	public boolean addEmpPost(EmpPost empPost);
	public boolean updateEmpPost(EmpPost empPost);
    public boolean deleteEmpPost(int empPostId);

}
