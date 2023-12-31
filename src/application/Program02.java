package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

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
		
        System.out.println("\n=== TEST 3: Seller findByAll ===");
		
		list = sellerDao.findAll();
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: Seller insert ===");
		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: Seller Upated ===");
		seller = sellerDao.findById(10);
		seller.setName("Lilly");
		seller.setEmail("lilly@gmail.com");
		sellerDao.update(seller);
		System.out.println("Updated completed!");
		
		System.out.println("\n=== TEST 6: Seller Delete ===");
		System.out.println("Entre id for delete test: ");
		Scanner sc = new Scanner(System.in);
		   int id = sc.nextInt();
		   sellerDao.deleteById(id);
		   System.out.println("Delete completed");
		sc.close();
	}

}
