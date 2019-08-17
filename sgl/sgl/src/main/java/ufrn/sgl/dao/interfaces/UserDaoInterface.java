package ufrn.sgl.dao.interfaces;

import ufrn.sgl.model.User;

public interface UserDaoInterface {

	/**
	 * create a new user in the database
	 * @param user the user to create
	 */
	public void create ( User user );
	
	/**
	 * get a user of database by a ID
	 * @param id the User ID
	 * @return the user that match with ID
	 */
	public User read (long id);
	
	/**
	 * update the user in a database
	 * @param user the user for update
	 */
	public void update (User user);

	/**
	 * delete the user of database
	 * @param user the user for delete
	 */
	public void delete (User user);
	
}