/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.services;

import com.mycompany.binarywebservice.Employeedata;
import com.mycompany.binarywebservice.EmployeedataJpaController;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author shelc
 */
@WebService
public class FileHandlerService {

    @WebMethod
    public int getFileSize(String filename, byte[] data) throws Exception {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_BinaryWebService_war_1.0-SNAPSHOTPU");
        EmployeedataJpaController imagesRepo = new EmployeedataJpaController(emf);

        Employeedata empfile = new Employeedata();
        empfile.setData(data);
        empfile.setFilename(filename);
        empfile.setId(imagesRepo.getEmployeedataCount() + 1);

        imagesRepo.create(empfile);

        return data.length;
    }

    @WebMethod
    public void WaitFor10Secs() {

        try {

            System.out.println("Start..." + new Date());
            TimeUnit.SECONDS.sleep(10);
            System.out.println("End..." + new Date());;

        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }

    }

    @WebMethod
    public String getFileName(String filename, byte[] data) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_BinaryWebService_war_1.0-SNAPSHOTPU");
        EmployeedataJpaController imagesRepo = new EmployeedataJpaController(emf);

        Employeedata empfile = new Employeedata();
        return empfile.getFilename();

    }
}
