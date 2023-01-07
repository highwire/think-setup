package com.mps.think.setup.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mps.think.setup.model.ParentClass;
@Repository
public interface ParentClassRepo extends JpaRepository<ParentClass, Integer>{

	

			@Query(value = "select parent_name,child_name,subchild_name from THINK_SETUP.parent_class p inner join THINK_SETUP.child_class c on p.parent_id=c.parent_id inner join THINK_SETUP.sub_child_class sc on c.child_id=sc.child_id where p.parent_id=parent_id",nativeQuery = true)
			ParentClass findByParentId(Integer parent_id);
}
