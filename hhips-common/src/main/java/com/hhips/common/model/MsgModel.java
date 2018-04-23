package com.hhips.common.model;

import java.io.Serializable;

/**
 * 名称：MsgModel<br>
 * <p>
 * 描述：消息模型<br>
 *
 */
public class MsgModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 状态值<br>
     */
    private String status;

    /**
     * 消息<br>
     */
    private String msg;

    /**
     * 返回对象<br>
     */
    private Object res;

    /**
     * 获取状态值<br>
     *
     * @return String 状态值
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态值<br>
     *
     * @param status 状态值
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取消息<br>
     *
     * @return String 消息内容
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置消息<br>
     *
     * @param msg 消息内容
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取结果对象<br>
     *
     * @return Object 结果对象
     */
    public Object getRes() {
        return res;
    }

    /**
     * 设置结果对象<br>
     *
     * @param res 结果对象
     */
    public void setRes(Object res) {
        this.res = res;
    }

    /**
     * 无参构造方法，构建 MsgModel 对象<br>
     */
    public MsgModel() {
        super();
    }

    /**
     * 代参构造方法，构建 MsgModel 对象<br>
     *
     * @param status 状态值
     * @param msg    消息内容
     * @param res    结果对象
     */
    public MsgModel(String status, String msg, Object res) {
        super();
        this.status = status;
        this.msg = msg;
        this.res = res;
    }

    /**
     * 代参构造方法，构建 MsgModel 对象<br>
     *
     * @param status 状态值
     * @param msg    消息内容
     */
    public MsgModel(String status, String msg) {
        super();
        this.status = status;
        this.msg = msg;
    }

    /**
     * 代参构造方法，构建 MsgModel 对象<br>
     *
     * @param msg 消息内容
     */
    public MsgModel(String msg) {
        super();
        this.msg = msg;
    }

}