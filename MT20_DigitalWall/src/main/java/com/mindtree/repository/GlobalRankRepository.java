package com.mindtree.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.model.GlobalRank;

public interface GlobalRankRepository extends JpaRepository<GlobalRank, String>
{
	
	
	@Query(value="select * from global_rank where rank<101",nativeQuery=true)
	
    public List<GlobalRank> getTopRunnersGlobally();
}
