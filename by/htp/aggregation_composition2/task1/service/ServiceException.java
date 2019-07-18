package by.htp.aggregation_composition2.task1.service;

public class ServiceException extends Exception {

	private static final long serialVersionUID = -5015966408617509119L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Exception e) {
		super(e);
	}

	public ServiceException(String message, Exception e) {
		super(message, e);
	}

}
