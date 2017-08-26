package com.nocol.send;

import com.briup.gather.Gather;


public interface Configuration {
	ServerImpl getServer() throws Exception;
	DBImpl getDbStore() throws Exception;
	ClientImpl getClient() throws Exception;
	Gather getGather() throws Exception;
	
}
