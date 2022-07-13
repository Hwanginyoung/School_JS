package shop.vo;

public class ClientVo {
	private int clientId;
	private String clientIp;
	private int clientName;
	private ClientType clientType;
	public ClientVo() {}
	
	public ClientVo(int clientId, String clientIp, int clientName, ClientType clientType) {
		super();
		this.clientId = clientId;
		this.clientIp = clientIp;
		this.clientName = clientName;
		this.clientType = clientType;
	}

	
	public int getClientId() {
		return clientId;
	}

	public String getClientIp() {
		return clientIp;
	}

	public int getClientName() {
		return clientName;
	}

	public ClientType getClientType() {
		return clientType;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public void setClientName(int clientName) {
		this.clientName = clientName;
	}

	public void setClientType(ClientType clientType) {
		this.clientType = clientType;
	}

	
	@Override
	public String toString() {
		return "ClientVo []";
	}
	
	
}
