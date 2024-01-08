package db;

public class DbIntregityException extends RuntimeException {

	public static final long serialVersionUID = 1l;

	public DbIntregityException(String msg) {
		super(msg);
	}
}
