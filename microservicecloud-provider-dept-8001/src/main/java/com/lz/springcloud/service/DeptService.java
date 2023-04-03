package com.lz.springcloud.service;

import com.lz.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
