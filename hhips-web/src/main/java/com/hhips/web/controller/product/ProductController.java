package com.hhips.web.controller.product;

import com.hhips.api.product.TbProductService;
import com.hhips.common.model.PageModel;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.product.TbProduct;
import com.hhips.dao.model.product.TbProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 名称：roductController<br>
 * <p>
 * 描述：产品信息管理<br>
 *
 */
@Controller
@RequestMapping("/demo/product")
public class ProductController extends BaseController {

    @Autowired
    private TbProductService tbProductService;

    @RequestMapping("/init")
    public String init() {
        return "demo/product/init";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<TbProduct> list(int offset, int limit, String search, String sort, String order) {
        TbProductExample example = new TbProductExample();
        PageModel<TbProduct> pageModel = tbProductService.selectByExampleForOffsetPage(example, offset, limit);
        return pageModel;
    }

}
