package com.zhe.user.persistence;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:zhe.yang
 * @Description:基础的BaseMappr
 * @DATE:Created in 13:28 2017/11/7 0007
 */

public interface BaseUserMapper<T2 extends Serializable> {
    /**
     * @Author:zhe.yang
     * @Description:根据条件查询个数
     * @Date:15:24 2017/11/7 0007
     */
    <T2> int findTotal(@Param("param") T2 record);

    /**
     * @Author:zhe.yang
     * @Description:根据条件删
     * @Date:15:24 2017/11/7 0007
     */

    <T2> int delete(@Param("param") T2 record);

    /**
     * @Author:zhe.yang
     * @Description:插入
     * @Date:15:25 2017/11/7 0007
     */

    <T2> int insert(T2 record);

    /**
     * @Author:zhe.yang
     * @Description:根据条件查询带分页
     * @Date:15:25 2017/11/7 0007
     * @param: * @param null
     */

    <T2> List<T2> select(@Param("param") T2 record, @Param("start") int start, @Param("end") int end);

    /**
     * @Author:zhe.yang
     * @Description:根据Id进行更新
     * @Date:15:25 2017/11/7 0007
     * @param: * @param null
     */

    <T2> int update(@Param("param") T2 record);

}
