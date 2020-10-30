package pro.revise.dao.impl;

import java.util.ArrayList;
import java.util.List;

import pro.revise.dao.ProjectDAO;
import pro.revise.entity.Project;

public class ProjectDAOImpl implements ProjectDAO {

	public List<Project> getProjects() {
		List<Project> pros = new ArrayList<Project>();
		pros.add(new Project(1, "API Maintainment", true));
		pros.add(new Project(2, "API Develop", true));
		return pros;
	}

}
