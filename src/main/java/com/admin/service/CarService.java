package com.admin.service;

import com.admin.mybatis.domain.Car;
import com.admin.mybatis.domain.Order;
import com.admin.mybatis.domain.Store;
import com.admin.mybatis.util.IService;
import com.admin.mybatis.vo.CarVo;
import com.admin.mybatis.vo.OrderVo;

/**
 * <p>Description: </p>
 * <p>Copyright(c) 2017-2019 lyzb.com Inc. All Rights Reserved.</p>
 * <p>Other: </p>
 * <p>Date：2018-04-21 11:55 </p>
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
public interface CarService extends IService<Car> {

    /**
     * 添加车辆基本信息,送优惠券
     *
     * @param carVo
     * @return
     */
    boolean insertCarInfo(CarVo carVo);

    /**
     * 添加订单
     */
    Order addOrder(OrderVo orderVo);

    /**
     * 根据经纬度查询最近的店铺
     * @param store
     * @return
     */
    Store getGeo(Store store);

}
