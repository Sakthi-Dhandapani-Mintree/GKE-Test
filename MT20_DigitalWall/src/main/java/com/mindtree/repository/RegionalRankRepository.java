package com.mindtree.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mindtree.model.RegionalRank;

public interface RegionalRankRepository extends JpaRepository<RegionalRank, String>
{
	
	@Query(value="select * from regional_rank where rank<101 and location=?1",nativeQuery=true)
	
    public List<RegionalRank> getTopRunnersLocally(String location);
}
