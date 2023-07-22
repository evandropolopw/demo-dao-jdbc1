package application;

import modal.dao.DaoFactory;
import modal.dao.SellerDao;
import model.entities.Seller;

public class Program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
