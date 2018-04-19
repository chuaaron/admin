package com.admin.mybatis.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Copyright(c) 2017-2019 lyzb.com Inc. All Rights Reserved.</p>
 * <p>Other: </p>
 * <p>Date：2018-04-19 21:15 </p>
 * <p>Modification Record 1: </p>
 * <pre>
 *  Modified Date：
 *  Version：
 *  Modifier：
 *  Modification Content：
 * </pre>
 * <p>Modification Record 2：…</p>
 *
 * @author <a href="wubin3347@gmail.com">wubin</a>
 * @version 1.0.0
 */
@Table(name = "car_brand")
public class Brand implements Serializable {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "parent_id")
    private Long parentId;
    /**
     * 品牌名称
     */
    @Column(name = "brand_name")
    private String brandName;
    /**
     * 品牌logo
     */
    @Column(name = "brand_logo")
    private String brandLogo;
    /**
     * 排序
     */
    @Column(name = "brand_sort")
    private String brandSort;
    /**
     * 层级
     */
    @Column(name = "brand_level")
    private String brandLevel;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(String brandSort) {
        this.brandSort = brandSort;
    }

    public String getBrandLevel() {
        return brandLevel;
    }

    public void setBrandLevel(String brandLevel) {
        this.brandLevel = brandLevel;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
