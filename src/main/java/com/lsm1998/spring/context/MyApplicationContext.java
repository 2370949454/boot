package com.lsm1998.spring.context;

import com.lsm1998.spring.beans.factory.MyBeanFactory;

import java.util.Map;

/**
 * @作者：徐恒
 * @时间:2018/12/20-20:54
 * @说明：ApplicationContext接口
 */
public interface MyApplicationContext extends MyBeanFactory
{
    /**
     * 注册一个bean
     * @param name
     * @param bean
     * @return
     */
    boolean register(String name, Object bean);

    /**
     * 根据name删除一个Bean
     * @param name
     * @return
     */
    boolean remove(String name);

    /**
     * 根据类型删除一个bean
     * @param requiredType
     * @return
     */
    boolean remove(Class<?> requiredType);

    /**
     * 获取IOC容器
     * @return
     */
    Map<String,Object> getIoc();
}
