package day18_20211028;

public class Price1DTO implements PriceInterface {
	// 경차 1번 가격
	
	int price = 0;
	
	@Override
	public void price(int price) {
		this.price=price;
		
	}

	@Override
	public int priceOut() {
		
		return this.price;
	}

}
