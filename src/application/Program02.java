package application;

import java.util.List;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartmentID ===");
		
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
        System.out.println("\n=== TEST : Seller findByAll ===");
		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
