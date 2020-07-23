package com.example.demo.pojo;

import lombok.Getter;
import lombok.Setter;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class SystemUser {

	@ApiModelProperty(value = " 员工id ")
	private String userId;

	@ApiModelProperty(value = " 密码 ")
	private String userPassword;

	@ApiModelProperty(value = " 显示顺序 ")
	private Integer userSort;

	@ApiModelProperty(value = " 中文名 ")
	private String chineseName;

	private String userType;

	@ApiModelProperty(value = " 成本 ")
	private BigDecimal userPrice;

	@ApiModelProperty(value = " 工作地点 ")
	private String workPlace;

	@ApiModelProperty(value = " 员工状态0-在职，1-离职 ")
	private Integer userState;

	@ApiModelProperty(value = " 创建人 ")
	private String createUser;

	@ApiModelProperty(value = " 创建时间 ")
	private Date createTime;

	@ApiModelProperty(value = " 租户id ")
	private String tenantId;

	@ApiModelProperty(value = " 删除标识 ")
	private Integer deleteTag;

	@ApiModelProperty(value = " 盐值 ")
	private String salt;

	@ApiModelProperty(value = " 修改用户 ")
	private String updateUser;

	@ApiModelProperty(value = " 修改时间 ")
	private Date updateTime;

	@ApiModelProperty(value = " 部门id ")
	private String organizationId;

	@ApiModelProperty(value = " 部门名字 ")
	private String organizationName;

	@ApiModelProperty(value = " 是否超级管理员，0 不是，1 是 ")
	private Integer admin;

	@ApiModelProperty(value = " 身份证 ")
	private String identification;

	@ApiModelProperty(value = " 工号 ")
	private String jobNumber;

	@ApiModelProperty(value = " 资源池类型 ")
	private String resourceType;

	@ApiModelProperty(value = " 入职时间 ")
	private Date hireDate;

	@ApiModelProperty(value = " 钉钉userId ")
	private String dingTalkId;

	@ApiModelProperty(value = " 岗位编码 ")
	private String deptId;

	private String deptName;

	@ApiModelProperty(value = " varchar ")
	private String postName;

	@ApiModelProperty(value = " 是否为pmo管理员 ")
	private String isPmo;

	@ApiModelProperty(value = " 数据来源（0表示来源于主数据人员，1表示来源于主数据用户） ")
	private String dataResource;

	@ApiModelProperty(value = " 判断主数据同步时是否更新 ")
	private String isChange;
}
