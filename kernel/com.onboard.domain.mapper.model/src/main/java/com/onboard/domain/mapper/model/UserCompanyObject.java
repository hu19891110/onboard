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

public class UserCompanyObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_company.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_company.userId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_company.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_company.groupId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer groupId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_company.id
     *
     * @return the value of user_company.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_company.id
     *
     * @param id the value for user_company.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_company.userId
     *
     * @return the value of user_company.userId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_company.userId
     *
     * @param userId the value for user_company.userId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_company.companyId
     *
     * @return the value of user_company.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_company.companyId
     *
     * @param companyId the value for user_company.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_company.groupId
     *
     * @return the value of user_company.groupId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getDepartmentId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_company.groupId
     *
     * @param groupId the value for user_company.groupId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDepartmentId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_company
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public UserCompanyObject(UserCompanyObject parent) {
        this.id = parent.getId();
        this.userId = parent.getUserId();
        this.companyId = parent.getCompanyId();
        this.groupId = parent.getDepartmentId();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_company
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public UserCompanyObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_company
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public UserCompanyObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_company
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public UserCompanyObject copy() {
        return new UserCompanyObject(this);
    }
}