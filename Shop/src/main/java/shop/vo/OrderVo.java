package shop.vo;

import java.util.ArrayList;
import java.util.List;

import shop.type.OrderStatusType;

public class OrderVo {
	private int orderId;
	private String orderDate;
	private String orderedTime;
	private OrderStatusType orderStatus;
	private int clientId;
	private ClientVo client;
	private List<OrderListVo> orderLists = new ArrayList<>();
	public OrderVo() {}
	
	public OrderVo(int orderId, String orderDate, String orderedTime, OrderStatusType orderStatus, int clientId) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderedTime = orderedTime;
		this.orderStatus = orderStatus;
		this.clientId = clientId;
	}

	
	public int getOrderId() {
		return orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public String getOrderedTime() {
		return orderedTime;
	}

	public OrderStatusType getOrderStatus() {
		return orderStatus;
	}

	public int getClientId() {
		return clientId;
	}

	public ClientVo getClient() {
		return client;
	}

	public List<OrderListVo> getOrderLists() {
		return orderLists;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public void setOrderedTime(String orderedTime) {
		this.orderedTime = orderedTime;
	}

	public void setOrderStatus(OrderStatusType orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public void setClient(ClientVo client) {
		this.client = client;
	}

	public void setOrderLists(List<OrderListVo> orderLists) {
		this.orderLists = orderLists;
	}

	
	@Override
	public String toString() {
		return "OrderVo []";
	}
	
	
	
}
