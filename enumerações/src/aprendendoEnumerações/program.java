package aprendendoEnumerações;

import java.util.Date;

import entities.aprendendoEnumerações.Order;
import entities.enums.aprendendoEnumerações.OrderStatus;

public class program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);

		// instanciando objetos convewrtendo uma string para um enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);

	}
}
