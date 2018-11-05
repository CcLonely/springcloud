package top.cg0509.task.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import top.cg0509.task.entity.JobAndTrigger;

@Mapper
public interface JobAndTriggerMapper {

	public List<JobAndTrigger> getJobAndTriggerDetails();
}
