package shop.manager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import shop.vo.ClientVo;

public class ClientManager {
	private List<ClientVo> list = new ArrayList<>();
		
	public ClientManager() {}
	
	public ClientManager (List<ClientVo> list) {
		this.list = list;
	}
	public void setList(List<ClientVo> list) {
		this.list = list;
	}
	public list<ClientVo> getList() {
		return list;}
	}
	
	public void addClient(ClientVo client) {
		list.add(client);
	}
	public ClientVo findClient(HttpServletRequest req) {
		String ClientIp = req.getRemoteAddr();
		for(ClientVo client : list) {
			if(client.getClientIp().equals(clientIp)) {
				return client;
			}
		}
		return null;
	}
}