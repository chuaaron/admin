package com.admin.mybatis.mapper;

import com.admin.mybatis.domain.Store;
import com.admin.mybatis.util.BaseMapper;
import org.springframework.data.repository.query.Param;

/**
 * <p>Description: </p>
 * <p>Copyright(c) 2017-2019 lyzb.com Inc. All Rights Reserved.</p>
 * <p>Other: </p>
 * <p>Date：2018-04-21 16:47 </p>
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
public interface StoreMapper extends BaseMapper<Store> {
    Store selectNearByStore(@Param("record") Store store);
}
