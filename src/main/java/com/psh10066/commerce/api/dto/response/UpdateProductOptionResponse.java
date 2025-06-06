package com.psh10066.commerce.api.dto.response;

import java.math.BigDecimal;

public record UpdateProductOptionResponse(
    Long id,
    Long optionGroupId,
    String name,
    BigDecimal additionalPrice,
    String sku,
    Integer stock,
    Integer displayOrder
) {
}
