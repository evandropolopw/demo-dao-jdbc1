package application;

import java.util.Date;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(seller);
	}

}
