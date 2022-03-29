package com.zhb.mybatis.mapper;

import com.zhb.mybatis.bean.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    Emp getEmpAndDeptByEid(@Param("eid") int eid);
}
