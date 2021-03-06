package com.neuedu.service;

import com.neuedu.entity.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有dept
     * @return
     */
    List<Dept> listDept();

    /**
     * 根据id的数组来删除多个emp
     * @param ids
     * @return
     */
    int deleteDeptByIds(int[] ids);
}
