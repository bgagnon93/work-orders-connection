package com.bgagnon.agent;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgentRepository extends CrudRepository<Agent, String> {

    @Query("SELECT a FROM Agent a WHERE LOWER(a.workingArea)=LOWER(:workingArea)")
    List<Agent> getFromLocation(@Param("workingArea") String workingArea);
}
