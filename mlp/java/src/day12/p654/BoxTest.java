package day12.p654;

public class BoxTest {

	public static void main(String[] args) {
		Box<ItemVO> box = new Box<ItemVO>();
		box.setBox(new ItemVO(100,"pants",10000));
		
		ItemVO item = box.getBox();
		System.out.println(item);
		
		Box<CustomerVO> box2 = new Box<CustomerVO>();
	}

}
