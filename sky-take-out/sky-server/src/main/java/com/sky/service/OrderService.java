package com.sky.service;

import com.sky.dto.OrdersConfirmDTO;
import com.sky.dto.OrdersPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.OrderVO;

public interface OrderService {
    /**
     * Check Order Details
     * @param id
     * @return
     */
    OrderVO details(Long id);

    /**
     * Conditional Search Order
     * @param ordersPageQueryDTO
     * @return
     */
    PageResult conditionSearch(OrdersPageQueryDTO ordersPageQueryDTO);

    /**
     * Confirm Order
     *
     * @param ordersConfirmDTO
     */
    void confirm(OrdersConfirmDTO ordersConfirmDTO);
}
