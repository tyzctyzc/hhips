package com.hhips.service.product;

import com.hhips.api.product.TbProductService;
import com.hhips.common.service.impl.BaseServiceImpl;
import com.hhips.common.spring.DataSourceContextHolder;
import com.hhips.dao.mapper.product.TbProductMapper;
import com.hhips.dao.model.product.TbProduct;
import com.hhips.dao.model.product.TbProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述：TODO<br>
 *
 */
@Service("tbProductService")
public class TbProductServiceImpl extends BaseServiceImpl<TbProductMapper, TbProduct, TbProductExample> implements TbProductService {

    @Autowired
    TbProductMapper tbProductMapper;

}
