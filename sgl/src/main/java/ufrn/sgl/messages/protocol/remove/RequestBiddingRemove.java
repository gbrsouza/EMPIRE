package ufrn.sgl.messages.protocol.remove;

public class RequestBiddingRemove extends RequestRemove{

	private static final long serialVersionUID = -5482676472911505262L;

	private final long id;
	private final String token;
	
	public RequestBiddingRemove(long id, String token) {
		this.id = id;
		this.token = token;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getId() {
		return id;
	}

	public String getToken() {
		return token;
	}
	

}