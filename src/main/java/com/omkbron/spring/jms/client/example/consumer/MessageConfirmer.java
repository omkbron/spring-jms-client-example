package com.omkbron.spring.jms.client.example.consumer;

import com.omkbron.spring.jms.example.model.Confirmation;


public interface MessageConfirmer {
	void confirm(Confirmation confirmation);
}
