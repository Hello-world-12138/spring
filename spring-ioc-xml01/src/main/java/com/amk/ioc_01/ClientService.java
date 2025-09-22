package com.amk.ioc_01;

/**
 * @author 阿明楷
 * @Date 2025/9/22:16:40
 * @See:
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {

        return clientService;
    }
}
