package com.psh10066.commerce.domain.model.product;

import com.psh10066.commerce.api.dto.request.GetAllProductsRequest;
import com.psh10066.commerce.api.dto.request.GetCategoryProductsRequest;
import com.psh10066.commerce.api.dto.response.GetAllProductsResponse;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductRepository {

    Product save(Product product);
    ProductDetail saveProductDetail(ProductDetail productDetail);
    ProductPrice saveProductPrice(ProductPrice productPrice);
    ProductCategory saveProductCategory(ProductCategory productCategory);
    ProductOptionGroup saveProductOptionGroup(ProductOptionGroup productOptionGroup);
    ProductOption saveProductOption(ProductOption productOption);
    ProductImage saveProductImage(ProductImage productImage);
    ProductTag saveProductTag(ProductTag productTag);

    ProductOption getProductOptionByOptionId(Long id);
    ProductOptionGroup getProductOptionGroupByOptionGroupId(Long optionGroupId);

    Page<GetAllProductsResponse> getAllProducts(GetAllProductsRequest request);
    Page<GetAllProductsResponse> getCategoryProducts(Long categoryId, GetCategoryProductsRequest request);
    List<GetAllProductsResponse> getNewProducts();
    List<GetAllProductsResponse> getPopularProducts();
    Integer getCategoryProductCount(Long categoryId);

    Product getById(Long id);
    ProductDetail getProductDetailById(Long id);
    ProductPrice getProductPriceById(Long id);
    List<ProductCategory> findProductCategoriesById(Long id);
    List<ProductOptionGroup> findProductOptionGroupsById(Long id);
    List<ProductImage> findProductImagesById(Long id);
    List<ProductTag> findProductTagsById(Long id);

    List<ProductOption> findProductOptionsByProductOptionGroupId(Long productOptionGroupId);

    void deleteProductCategoryById(Long id);
    void deleteProductOptionByOptionId(Long optionId);
}
