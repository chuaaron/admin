package com.admin.mybatis.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Copyright(c) 2017-2019 lyzb.com Inc. All Rights Reserved.</p>
 * <p>Other: </p>
 * <p>Date：2018-04-21 14:32 </p>
 * <p>Modification Order 1: </p>
 * <pre>
 *  Modified Date：
 *  Version：
 *  Modifier：
 *  Modification Content：
 * </pre>
 * <p>Modification Order 2：…</p>
 *
 * @author <a href="wubin3347@gmail.com">wubin</a>
 * @version 1.0.0
 */
@Table(name = "car_order")
public class Order {

    @Id
    @Column(name = "id")
    private Long id;
    /**
     * 项目ID
     */
    @Column(name = "prpject_id")
    private Long projectId;
    /**
     * 项目名称
     */
    @Column(name = "project_name")
    private String projectName;
    /**
     * 订单价格
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;
    /**
     * 用户名称
     */
    @Column(name = "user_id")
    private Long userId;
    /**
     * 员工ID
     */
    @Column(name = "emp_id")
    private Long empId;
    /**
     * 员工姓名
     */
    @Column(name = "emp_name")
    private String empName;
    /**
     * car_Id
     */
    @Column(name = "car_id")
    private Long carId;
    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
