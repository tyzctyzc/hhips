package com.hhips.web.controller.user;

import com.hhips.api.user.SysUserService;
import com.hhips.api.user.UserRoleRelService;
import com.hhips.common.model.MsgModel;
import com.hhips.common.model.PageModel;
import com.hhips.core.controller.BaseController;
import com.hhips.dao.model.user.SysUser;
import com.hhips.dao.model.user.SysUserExample;
import com.hhips.dao.model.user.UserRoleRel;
import com.hhips.dao.model.user.UserRoleRelExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 名称：UserController<br>
 * <p>
 * 描述：用户管理模块<br>
 *
 */
@Controller
@RequestMapping("/common/user")
public class UserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private UserRoleRelService userRoleRelService;

    @RequestMapping("/manage")
    public String manage() {
        return "common/user/manage";
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<SysUser> list(int offset, int limit, String search, String sort, String order) {
        SysUserExample example = new SysUserExample();
        PageModel<SysUser> pageModel = sysUserService.selectByExampleForOffsetPage(example, offset, limit);
        return pageModel;
    }

    /**
     * 用户对应角色保存方法<br>
     *
     * @param userId  用户Id
     * @param roleStr 角色列表字符串
     * @return MsgModel 消息模型
     */
    @RequestMapping(value = "/roleSave", method = RequestMethod.POST)
    @ResponseBody
    public MsgModel roleSave(String userId, String roleStr) {
        List<String> roleIds = Arrays.asList(roleStr.split(","));

        // 先清除历史数据
        UserRoleRelExample example = new UserRoleRelExample();
        example.createCriteria().andUserIdEqualTo(userId);
        userRoleRelService.deleteByExample(example);

        // 添加
        for (String roleId : roleIds) {
            if (!this.isNull(roleId.trim())) {
                UserRoleRel userRoleRel = new UserRoleRel();
                userRoleRel.setRelId(this.getUUID());
                userRoleRel.setUserId(userId);
                userRoleRel.setRoleId(roleId);
                userRoleRelService.insertSelective(userRoleRel);
            }
        }
        return this.resultMsg("保存成功");
    }

    @RequestMapping("/upload")
    @ResponseBody
    public String upload(HttpServletRequest request) {
        List<String> fileNames = this.fileUpLoad(request);
        System.out.println(fileNames);
        return "success";
    }

}
