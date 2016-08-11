package serviceadaptor.document.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface AdaptorService_interface {
	//motivational phrases getter
	public String get_motivation_phrase();
	
	//remote db methods
	public String get_user_from_remote();
	public String save_user_in_remote();
}
