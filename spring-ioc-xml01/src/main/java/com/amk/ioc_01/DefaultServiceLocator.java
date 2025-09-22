package com.amk.ioc_01;

/**
 * @author 阿明楷
 * @Date 2025/9/22:16:51
 * @See:
 */
public class DefaultServiceLocator {

    private static ClientServiceImpl  clientService= new ClientServiceImpl();

    public ClientServiceImpl createClientServiceInstance() {
        return clientService;
    }
}
