/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.onboard.domain.mapper.model;

import com.onboard.domain.mapper.model.common.BaseItem;

import java.util.Date;

public class BugObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.title
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.createdTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Date createdTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.completedTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Date completedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.status
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.priority
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.assigneeId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer assigneeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.dueTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Date dueTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.idInProject
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer idInProject;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bug.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String creatorAvatar;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.id
     *
     * @return the value of bug.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.id
     *
     * @param id the value for bug.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.companyId
     *
     * @return the value of bug.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.companyId
     *
     * @param companyId the value for bug.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.projectId
     *
     * @return the value of bug.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.projectId
     *
     * @param projectId the value for bug.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.creatorId
     *
     * @return the value of bug.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.creatorId
     *
     * @param creatorId the value for bug.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.creatorName
     *
     * @return the value of bug.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.creatorName
     *
     * @param creatorName the value for bug.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.title
     *
     * @return the value of bug.title
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.title
     *
     * @param title the value for bug.title
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.description
     *
     * @return the value of bug.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.description
     *
     * @param description the value for bug.description
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.createdTime
     *
     * @return the value of bug.createdTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.createdTime
     *
     * @param createdTime the value for bug.createdTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.completedTime
     *
     * @return the value of bug.completedTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Date getCompletedTime() {
        return completedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.completedTime
     *
     * @param completedTime the value for bug.completedTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCompletedTime(Date completedTime) {
        this.completedTime = completedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.status
     *
     * @return the value of bug.status
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.status
     *
     * @param status the value for bug.status
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.priority
     *
     * @return the value of bug.priority
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.priority
     *
     * @param priority the value for bug.priority
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.assigneeId
     *
     * @return the value of bug.assigneeId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getAssigneeId() {
        return assigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.assigneeId
     *
     * @param assigneeId the value for bug.assigneeId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setAssigneeId(Integer assigneeId) {
        this.assigneeId = assigneeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.deleted
     *
     * @return the value of bug.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.deleted
     *
     * @param deleted the value for bug.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.dueTime
     *
     * @return the value of bug.dueTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Date getDueTime() {
        return dueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.dueTime
     *
     * @param dueTime the value for bug.dueTime
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.idInProject
     *
     * @return the value of bug.idInProject
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getIdInProject() {
        return idInProject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.idInProject
     *
     * @param idInProject the value for bug.idInProject
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setIdInProject(Integer idInProject) {
        this.idInProject = idInProject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bug.creatorAvatar
     *
     * @return the value of bug.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCreatorAvatar() {
        return creatorAvatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bug.creatorAvatar
     *
     * @param creatorAvatar the value for bug.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorAvatar(String creatorAvatar) {
        this.creatorAvatar = creatorAvatar == null ? null : creatorAvatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bug
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public BugObject(BugObject parent) {
        this.id = parent.getId();
        this.companyId = parent.getCompanyId();
        this.projectId = parent.getProjectId();
        this.creatorId = parent.getCreatorId();
        this.creatorName = parent.getCreatorName();
        this.title = parent.getTitle();
        this.description = parent.getDescription();
        this.createdTime = parent.getCreatedTime();
        this.completedTime = parent.getCompletedTime();
        this.status = parent.getStatus();
        this.priority = parent.getPriority();
        this.assigneeId = parent.getAssigneeId();
        this.deleted = parent.getDeleted();
        this.dueTime = parent.getDueTime();
        this.idInProject = parent.getIdInProject();
        this.creatorAvatar = parent.getCreatorAvatar();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bug
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public BugObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bug
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public BugObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bug
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public BugObject(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bug
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public BugObject(int id, boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bug
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public BugObject copy() {
        return new BugObject(this);
    }
}