package gz.itcast.contact;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
/**
 * 实现联系人操作接口
 * @author APPle
 *
 */
public class ContactOperatorImpl implements ContactOperator {

	/**
	 * 添加联系人
	 */
	@Override
	public void addContact(Contact contact) {
		
		try {
			File file = new File("e:/contact.xml");
			Document doc = null;
			Element rootElem = null;
			if(!file.exists()){
				/**
				 * 需求： 把contact对象保存到xml文件中
				 */
				//如果没有xml文件，则创建xml文件
				doc = DocumentHelper.createDocument();
				//创建根标签
				rootElem = doc.addElement("contactList");
			}else{
				//如果有xml文件，则读取xml文件
				doc = XMLUtil.getDocument();
				//如果有xml文件，读取根标签
				rootElem = doc.getRootElement();
			}

			//添加contact标签
			/**
			 * <contact id="1">
					<name>eric</name>
					<gender>男</gender>
					<age>20</age>
					<phone>1343333</phone>
					<email>eric@qq.com</email>
					<qq>554444</qq>
				</contact>
			 */
			Element contactElem = rootElem.addElement("contact");
			contactElem.addAttribute("id", contact.getId());
			contactElem.addElement("name").setText(contact.getName());
			contactElem.addElement("gender").setText(contact.getGender());
			contactElem.addElement("age").setText(contact.getAge()+"");
			contactElem.addElement("phone").setText(contact.getPhone());
			contactElem.addElement("email").setText(contact.getEmail());
			contactElem.addElement("qq").setText(contact.getQq());
			
			//把Document写出到xml文件
			XMLUtil.write2xml(doc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 修改联系人
	 */
	@Override
	public void updateContact(Contact contact) {
		/**
		 * 需求： 修改id值为2的联系人
		 * 	1）查询id值为2的contact标签
		 *  2）修改contact标签的内容
		 */
		try {
			//1.读取xml文件
			Document doc = XMLUtil.getDocument();
			
			Element contactElem = (Element)doc.selectSingleNode("//contact[@id='"+contact.getId()+"']");
			
			//2.修改contact标签内容
			contactElem.element("name").setText(contact.getName());
			contactElem.element("gender").setText(contact.getGender());
			contactElem.element("age").setText(contact.getAge()+"");
			contactElem.element("phone").setText(contact.getPhone());
			contactElem.element("email").setText(contact.getEmail());
			contactElem.element("qq").setText(contact.getQq());
			
			//3.把Document写出到xml文件
			XMLUtil.write2xml(doc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}
	
	/**
	 * 删除联系人
	 */
	@Override
	public void deleteContact(String id) {
		try {
			//1.读取xml文件
			Document doc = XMLUtil.getDocument();
			//2.查询需要删除id的contact
			Element contactElem = (Element)doc.selectSingleNode("//contact[@id='"+id+"']");
			//删除标签
			contactElem.detach();
			
			//3.把Document写出到xml文件
			XMLUtil.write2xml(doc);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * 查询所有联系人
	 */
	@Override
	public List<Contact> findAll() {
		//1.读取xml文件
		Document doc = XMLUtil.getDocument();
		
		//2.创建List对象
		List<Contact> list = new ArrayList<Contact>();
		//3.读取contact标签
		List<Element> conList = (List<Element>)doc.selectNodes("//contact");
		for(Element e:conList){
			//创建COntact对象
			Contact c = new Contact();
			c.setId(e.attributeValue("id"));
			c.setName(e.elementText("name"));
			c.setGender(e.elementText("gender"));
			c.setAge(Integer.parseInt(e.elementText("age")));
			c.setPhone(e.elementText("phone"));
			c.setEmail(e.elementText("email"));
			c.setQq(e.elementText("qq"));
			//把Contact放入list中
			list.add(c);
		}
		return list;
	}

}
