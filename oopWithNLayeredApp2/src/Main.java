
import business.ProductManager;
import core.loging.DatabaseLogger;
import core.loging.FileLogger;
import core.loging.Logger;
import core.loging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell e7270
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Product product1 = new Product(1,"Iphone Xr", 9000);
        
        Logger[] loggers= {};
        
        ProductManager productManager=new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);
    }
}
