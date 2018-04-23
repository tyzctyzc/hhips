package com.hhips.api.persistence;

import com.hhips.common.model.PageModel;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 名称：DelegateService<br>
 * <p>
 * 描述：自定义的代理Service接口，封装了常用自定义sql的CRUD操作<br>
 *
 */
public interface DelegateService {

    /**
     * 无参查询单个对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的单个对象查询 sql 语句的映射名
     * @return T 查询的对象
     */
    <T> T selectOne(String statement);

    /**
     * 带参查询单个对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的单个对象查询 sql 语句的映射名
     * @param parameter 查询单个对象所需的参数
     * @return T 查询的对象
     */
    <T> T selectOne(String statement, Object parameter);

    /**
     * 无参查询对象集合<br>
     *
     * @param statement 对应 sqlMapper 模板中的集合查询 sql 语句的映射名
     * @return List<T> 查询的对象结果集
     */
    <T> List<T> selectList(String statement);

    /**
     * 带参查询对象集合<br>
     *
     * @param statement 对应 sqlMapper 模板中的集合查询 sql 语句的映射名
     * @param parameter 查询所需的参数
     * @return List<T> 查询的对象结果集
     */
    <T> List<T> selectList(String statement, Object parameter);

    /**
     * 带参查询对象集合（并带有条数范围）<br>
     *
     * @param statement 对应 sqlMapper 模板中的集合查询 sql 语句的映射名
     * @param parameter 查询所需的参数
     * @param rowBounds 查询条数范围（条数范围）
     * @return List<T> 查询的对象结果集
     */
    <T> List<T> selectList(String statement, Object parameter, RowBounds rowBounds);

    /**
     * 分页查询，返回 Page 分页对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的分页查询 sql 语句的映射名
     * @param offset    分页起始数量
     * @param limit     分页限制条数
     * @return PageModel<T> 分页结果集，自定义的 PageModel 模型
     */
    <T> PageModel<T> selectPagination(String statement, int offset, int limit);

    /**
     * 带参分页查询，返回 Page 分页对象<br>
     *
     * @param statement 对应 sqlMapper 模板中的分页查询 sql 语句的映射名
     * @param parameter 分页查询所需的参数
     * @param offset    分页起始数量
     * @param limit     分页限制条数
     * @return PageModel<T> 分页结果集，自定义的 PageModel 模型
     */
    <T> PageModel<T> selectPagination(String statement, Object parameter, int offset, int limit);

    /**
     * 无参增加方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的增加 sql 语句的映射名
     * @return int 增加成功的条数
     */
    int insert(String statement);

    /**
     * 带参增加方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的增加 sql 语句的映射名
     * @param parameter 增加数据所需的参数
     * @return int 增加成功的条数
     */
    int insert(String statement, Object parameter);

    /**
     * 无参修改方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的修改 sql 语句的映射名
     * @return int 修改成功的条数
     */
    int update(String statement);

    /**
     * 带参修改方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的修改 sql 语句的映射名
     * @param parameter 修改数据所需的参数
     * @return int 修改成功的条数
     */
    int update(String statement, Object parameter);

    /**
     * 无参删除方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的删除 sql 语句的映射名
     * @return int 删除成功的条数
     */
    int delete(String statement);

    /**
     * 带参删除方法<br>
     *
     * @param statement 对应 sqlMapper 模板中的删除 sql 语句的映射名
     * @param parameter 删除数据所需的参数
     * @return int 删除成功的条数
     */
    int delete(String statement, Object parameter);

}
