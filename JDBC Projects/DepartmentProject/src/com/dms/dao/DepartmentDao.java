package com.dms.dao;

import com.dms.exception.DepartmentNotFoundException;
import com.dms.model.Department;
import java.util.List;

public interface DepartmentDao {
    void addDepartment(Department dept);
    Department getDepartmentById(int id) throws DepartmentNotFoundException;
    List<Department> getAllDepartments();
    boolean updateDepartment(Department dept);
    boolean deleteDepartment(int id) throws DepartmentNotFoundException;
    
}
