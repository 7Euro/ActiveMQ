package com.leo.produce;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leo
 * @date 2020/4/1 16:11
 */
public class LambdaAPI {

    /**
     * Lambda 表达式
     */
    @Test
    public void test1(){
        int b;
        int c = 6;
    }


    List<Employee> employees = Arrays.asList(
            new Employee("张三",18,3222.34),
            new Employee("李四",14,33.21),
            new Employee("王五",16,32.22),
            new Employee("李六",25,3432.34),
            new Employee("许仙",34,11112.34)
    );
    /**
     * 需求：获取当前公司中年龄大于20的员工
     */
    public List<Employee> filterEmployees(List<Employee> list) {
        List<Employee> em = new ArrayList<>();
        for (Employee emp: list) {
            if(emp.getAge() > 20) {
                em.add(emp);
            }
        }
        return em;
    }

    /**
     * 需求：获取当前公司中年龄大于20的员工
     */
    @Test
    public void test3(){
        List<Employee> list = filterEmployees(employees);
        for (Employee employee :
                list) {
            System.out.println(employee);
        }
    }

    /**
     * 需求：
     */

}
