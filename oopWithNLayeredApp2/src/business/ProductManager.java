/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import core.loging.Logger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import dataAccess.ProductDao;
import entities.Product;
import java.util.List;

/**
 *
 * @author Dell e7270
 */
public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception { // response   
        //iş kuralları yazılır   
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }
        productDao.add(product);
        for (Logger logger : loggers) { // [db, mail]
            logger.log(product.getName());
        }
    }
}
