package biscontiflavian.gsm.ClassesDAO;

import java.sql.Connection;

public class JoueurDAO {
	public abstract class DAO<T> {
		protected Connection connect = null;
		
		public DAO(Connection conn){
			this.connect = conn;
		}
		
		public abstract boolean create(T obj);
		
		public abstract boolean delete(T obj);
		
		public abstract boolean update(T obj);
		
		public abstract T find(int id);
	}
}