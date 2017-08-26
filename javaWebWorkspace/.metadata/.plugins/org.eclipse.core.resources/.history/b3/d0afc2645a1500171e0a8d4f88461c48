package gz.itcast.contact;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 联系人操作实现类的测试类
 * @author APPle
 *
 */
public class TestContactOperatorImpl {
	ContactOperator operator = null;
	
	/**
	 * 初始化对象实例
	 */
	@Before
	public void init(){
		operator = new ContactOperatorImpl();
	}
	

	@Test
	public void testAddContact(){
		Contact contact = new Contact();
		contact.setId("3");
		contact.setName("rose");
		contact.setGender("男");
		contact.setAge(20);
		contact.setPhone("134222233333");
		contact.setEmail("eric@qq.com");
		contact.setQq("33334444");
		operator.addContact(contact);
	}
	
	@Test
	public void testUpdateContact(){
		Contact contact = new Contact();
		contact.setId("3"); //修改的ID
		contact.setName("zhangsan");
		contact.setGender("女");
		contact.setAge(30);
		contact.setPhone("135222233333");
		contact.setEmail("zhangsan@qq.com");
		contact.setQq("33334444");
		operator.updateContact(contact);
	}
	
	@Test
	public void testDeleteContact(){
		operator.deleteContact("3");
	}
	
	@Test
	public void testFindAll(){
		List<Contact> list = operator.findAll();
		for (Contact contact : list) {
			System.out.println(contact);
		}
	}
}
