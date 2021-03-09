package com.dosonping.serviceLocatorPattern;
//位JNDI查询创建InitialContext
public class InitialContext {
    public Object lookup(String jndiName) {
        if(jndiName.equalsIgnoreCase("Service1")) {
            System.out.println("Looking up and creating a new Service1 Object");
            return new Service1();
        }else if(jndiName.equalsIgnoreCase("Service2")) {
            System.out.println("Looking up and creating a new Service2 Object");
            return new Service2();
        }
        return null;
    }
}
