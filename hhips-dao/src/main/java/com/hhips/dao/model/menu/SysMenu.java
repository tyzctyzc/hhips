package com.hhips.dao.model.menu;

import java.io.Serializable;

public class SysMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_ID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单ID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_PID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单父ID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuPid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_NAME
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单名称
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_DESCRIBE
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单描述
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuDescribe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_URL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单地址URL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_ICON
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 图标
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuIcon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_INDEX
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单排序
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private Integer menuIndex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_TYPE
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单类型（文件夹/菜单）
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private String menuType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_LEVEL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 菜单级别
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private Integer menuLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_MENU.MENU_VALID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    /**
     * 有效值
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private Boolean menuValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SYS_MENU
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_ID
     *
     * @return the value of SYS_MENU.MENU_ID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_ID
     *
     * @param menuId the value for SYS_MENU.MENU_ID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_PID
     *
     * @return the value of SYS_MENU.MENU_PID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuPid() {
        return menuPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_PID
     *
     * @param menuPid the value for SYS_MENU.MENU_PID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuPid(String menuPid) {
        this.menuPid = menuPid == null ? null : menuPid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_NAME
     *
     * @return the value of SYS_MENU.MENU_NAME
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_NAME
     *
     * @param menuName the value for SYS_MENU.MENU_NAME
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_DESCRIBE
     *
     * @return the value of SYS_MENU.MENU_DESCRIBE
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuDescribe() {
        return menuDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_DESCRIBE
     *
     * @param menuDescribe the value for SYS_MENU.MENU_DESCRIBE
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuDescribe(String menuDescribe) {
        this.menuDescribe = menuDescribe == null ? null : menuDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_URL
     *
     * @return the value of SYS_MENU.MENU_URL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_URL
     *
     * @param menuUrl the value for SYS_MENU.MENU_URL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_ICON
     *
     * @return the value of SYS_MENU.MENU_ICON
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_ICON
     *
     * @param menuIcon the value for SYS_MENU.MENU_ICON
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_INDEX
     *
     * @return the value of SYS_MENU.MENU_INDEX
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public Integer getMenuIndex() {
        return menuIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_INDEX
     *
     * @param menuIndex the value for SYS_MENU.MENU_INDEX
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuIndex(Integer menuIndex) {
        this.menuIndex = menuIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_TYPE
     *
     * @return the value of SYS_MENU.MENU_TYPE
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_TYPE
     *
     * @param menuType the value for SYS_MENU.MENU_TYPE
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_LEVEL
     *
     * @return the value of SYS_MENU.MENU_LEVEL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_LEVEL
     *
     * @param menuLevel the value for SYS_MENU.MENU_LEVEL
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_MENU.MENU_VALID
     *
     * @return the value of SYS_MENU.MENU_VALID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public Boolean getMenuValid() {
        return menuValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_MENU.MENU_VALID
     *
     * @param menuValid the value for SYS_MENU.MENU_VALID
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    public void setMenuValid(Boolean menuValid) {
        this.menuValid = menuValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_MENU
     *
     * @mbg.generated Wed Feb 07 16:05:00 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", menuPid=").append(menuPid);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuDescribe=").append(menuDescribe);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", menuIcon=").append(menuIcon);
        sb.append(", menuIndex=").append(menuIndex);
        sb.append(", menuType=").append(menuType);
        sb.append(", menuLevel=").append(menuLevel);
        sb.append(", menuValid=").append(menuValid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}