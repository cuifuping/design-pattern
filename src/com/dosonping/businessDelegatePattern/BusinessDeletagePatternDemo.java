package com.dosonping.businessDelegatePattern;
//使用 BusinessDelegate 和 Client 类来演示业务代表模式。
public class BusinessDeletagePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");

        client.doTask();
    }
}
