package serviceadaptor.document.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "serviceadaptor.document.ws.AdaptorService_interface", serviceName="adaptor-service")
public class AdaptorService_implementation implements AdaptorService_interface {

	@Override
	public String get_motivation_phrase() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get_user_from_remote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String save_user_in_remote() {
		// TODO Auto-generated method stub
		return null;
	}

}
