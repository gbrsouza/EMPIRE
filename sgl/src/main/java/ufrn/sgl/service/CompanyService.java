package ufrn.sgl.service;

import ufrn.sgl.dao.CompanyDao;
import ufrn.sgl.dao.interfaces.CompanyDaoInterface;
import ufrn.sgl.model.Company;
import ufrn.sgl.service.interfaces.CompanyServiceInterface;

public class CompanyService implements CompanyServiceInterface {

	private CompanyDaoInterface dao = new CompanyDao();
	
	@Override
	public long create(Company company) {
		return dao.create(company);
	}

	@Override
	public Company read(long id) {
		return dao.read(id);
	}

	@Override
	public void update(Company company) {
		dao.update(company);
	}

	@Override
	public void delete(long id) {
		dao.delete(id);
	}
	
	@Override
	public Company read(Company company) {
		return dao.read(company);
	}
	
}