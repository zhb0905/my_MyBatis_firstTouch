package com.zhb.mybatis.mapper;

import com.zhb.mybatis.bean.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    Dept getDeptEmpByDid(@Param("did") int did);

}
