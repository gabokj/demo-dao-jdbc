package model.dao;

public class DaoFactory {

	public static SellerDao createSallerDao() {
		return new SellerDaoJDBC();
	}
}
