package com.amk.service;

import com.amk.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    
    @Autowired
    private StudentDao studentDao;

    @Transactional//事务添加,目前在方法上加，还可以在类上面加
    public void changeInfo(){
        studentDao.updateAgeById(88,1);
        int i=1/0;

        System.out.println("-----------");
        studentDao.updateNameById("test2",1);
    }
}
