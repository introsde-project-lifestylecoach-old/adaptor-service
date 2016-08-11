package serviceadaptor.document.ws;

public interface AdaptorService_interface {
	//motivational phrases getter
	public String get_motivation_phrase();
	
	//remote db methods
	public String get_user_from_remote();
	public String save_user_in_remote();
}
