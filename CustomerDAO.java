package com.user.web.mobile.otp;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {

	private static List<Message> customers;
	
	static
	{
		customers = new ArrayList<Message>();
		customers.add(new Message(new Long(101), "1212323435"));
		customers.add(new Message(new Long(201), "3435452345"));
		customers.add(new Message(new Long(301), "8762372987"));
		customers.add(new Message(new Long(401), "2113443435"));
		customers.add(new Message(new Long(501), "4545452345"));
		customers.add(new Message(new Long(601), "1286568955"));
	}


	public List<Message> list() {
		return customers;
	}

	public Message get(Long id) {
		for (Message custid : customers) {
			if (custid.getCustid().equals(id)) {
				return custid;
			}
		}
		return null;
	}

}
