/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataAccess;

import entities.Product;

/**
 *
 * @author Dell e7270
 */
public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        // sedece db erişim kodları yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
