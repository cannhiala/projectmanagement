package pro.revise.entity;

import java.util.Date;

public class Project {
	private int projectId;
	private String projectName;
	private String description;
	private Date cratedOn;
	private Date updatedOn;
	private boolean isActive;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCratedOn() {
		return cratedOn;
	}

	public void setCratedOn(Date cratedOn) {
		this.cratedOn = cratedOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Project(int projectId, String projectName, String description, Date cratedOn, Date updatedOn,
			boolean isActive) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.description = description;
		this.cratedOn = cratedOn;
		this.updatedOn = updatedOn;
		this.isActive = isActive;
	}
	

	public Project(int projectId, String projectName, boolean isActive) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", description=" + description
				+ ", cratedOn=" + cratedOn + ", updatedOn=" + updatedOn + ", isActive=" + isActive + "]";
	}

	public Project() {
	}

}
