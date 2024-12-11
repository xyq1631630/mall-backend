package com.mall.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * Order delivery info
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    @Schema(title = "订单id")
    private Long orderId;
    @Schema(title = "物流公司")
    private String deliveryCompany;
    @Schema(title = "物流单号")
    private String deliverySn;
}
