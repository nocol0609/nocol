package gz.itcast.contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 主程序
 * @author APPle
 *
 */
public class MainProgram {

	public static void main(String[] args) {
		try {
			/*Scanner scanner = new Scanner(System.in);
			String command = scanner.next();*/
			
			BufferedReader br = 
							new BufferedReader(new InputStreamReader(System.in));
			
			ContactOperator operator = new ContactOperatorImpl();
			//不断接收输入
			while(true){
				//1.看到菜单
				printMenu();
				
				//2.接收用户输入的命令
				String command = br.readLine();
				
				//3.根据用户的输入执行不同的操作
				if("1".equals(command)){
					//添加联系人
					//获取用输入的数据
					Contact contact  = new Contact();
					//获取ID
					System.out.println("请输入编号：");
					String id = br.readLine();
					//获取姓名
					System.out.println("请输入姓名：");
					String name = br.readLine();
					//获取性别
					System.out.println("请输入性别：");
					String gender = br.readLine();
					//获取年龄
					System.out.println("请输入年龄：");
					String age = br.readLine();
					//获取电话
					System.out.println("请输入电话：");
					String phone = br.readLine();
					//获取邮箱
					System.out.println("请输入邮箱：");
					String email = br.readLine();
					//获取QQ
					System.out.println("请输入QQ：");
					String qq = br.readLine();
					
					contact.setId(id);
					contact.setName(name);
					contact.setGender(gender);
					contact.setAge(Integer.parseInt(age));
					contact.setPhone(phone);
					contact.setEmail(email);
					contact.setQq(qq);
					
					operator.addContact(contact);
				}else if("2".equals(command)){
					//修改联系人
					//获取用输入的数据
					Contact contact  = new Contact();

					//获取ID
					System.out.println("请输入需要修改的编号：");
					String id = br.readLine();
					//获取姓名
					System.out.println("请输入修改后的姓名：");
					String name = br.readLine();
					//获取性别
					System.out.println("请输入修改后的性别：");
					String gender = br.readLine();
					//获取年龄
					System.out.println("请输入修改后的年龄：");
					String age = br.readLine();
					//获取电话
					System.out.println("请输入修改后的电话：");
					String phone = br.readLine();
					//获取邮箱
					System.out.println("请输入修改后的邮箱：");
					String email = br.readLine();
					//获取QQ
					System.out.println("请输入修改后的QQ：");
					String qq = br.readLine();
					
					contact.setId(id);
					contact.setName(name);
					contact.setGender(gender);
					contact.setAge(Integer.parseInt(age));
					contact.setPhone(phone);
					contact.setEmail(email);
					contact.setQq(qq);
					
					
					operator.updateContact(contact);
				}else if("3".equals(command)){
					//删除联系人
					//获取需要删除的ID
					System.out.println("请输入删除的编号：");
					String id = br.readLine();
					
					operator.deleteContact(id);
				}else if("4".equals(command)){
					//查询所有联系人
					List<Contact> list = operator.findAll();
					//打印输出
					for (Contact con : list) {
						System.out.println(con);
					}
				}else if("Q".equals(command)){
					break;
				}else{
					System.out.println("输入的命令有误！");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new  RuntimeException(e);
		}
			
		
	}

	private static void printMenu() {
		System.out.println("====================");
		System.out.println("[1]添加联系人");
		System.out.println("[2]修改联系人");
		System.out.println("[3]删除联系人");
		System.out.println("[4]查看所有联系人");
		System.out.println("[Q]退出系统");
		System.out.println("====================");
	}

}
