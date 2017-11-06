package org.levvel.poc;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	


	@RequestMapping(value = "account/from/{fromid}/to/{toid}/amount/{amount}/when/{when}", method = RequestMethod.GET,headers="Accept=application/json")
	public User transfer(@PathVariable String fromid, @PathVariable String toid, @PathVariable String amount,@PathVariable String when) throws Exception {

		if(Integer.parseInt(amount) < 50)
			throw new Exception("Transfer failed");
		User user = new User(fromid, toid, amount, when);
		System.out.print(user.toString());
		return user;
	}

}
