
import java.util.ArrayList;
interface ISignUp{
	public boolean addStudent(int stuType);
}
interface IParams{
	public int getBig();
	public int getMedium();
	public int getSmall();
	public void getPlanSignUp();
}
public class SchoolSystem {
	public static void main(String[] args) {
		//存放返回的boolean值
		boolean n;
		SSystem school=new SSystem(1,1,0);
		n=school.addStudent(1);
		System.out.println(n);
		n=school.addStudent(2);
		System.out.println(n);
		n=school.addStudent(3);
		System.out.println(n);
		n=school.addStudent(1);
		System.out.println(n);;
		school.getPlanSignUp();
	}
}
class SSystem implements ISignUp,IParams{
	//存放数据
	ArrayList<String> Student=new ArrayList<>();
	public Integer big;
	public Integer medium;
	public Integer small;
	SSystem(int big,int medium,int small){
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	//添加学生
	public boolean addStudent(int stuType){
		if(stuType==1) {
			if(big>0) {
				Student.add("大班");
				big--;
				return true;
			}
			else
				return false;
		}
		if(stuType==2) {
			if(medium>0) {
				Student.add("中班");
				medium--;
				return true;
			}
			else
				return false;
		}
		if(stuType==3) {
			if(small>0) {
				Student.add("小班");
				small--;
				return true;
			}
			else
				return false;
		}
		return false;
     }
	//获取剩余班级空位
	 public int getBig() {
		return this.big;
	 }
	 public int getMedium() {
		 return this.medium;
	 }
	 public int getSmall(){
			return this.small;
	 }
	 //打印学生的入学顺序
	 public void getPlanSignUp(){
		for(String a:Student) {
			//System.out.println("登记学生");
			System.out.print(a);
		}
	 }
}

//修改
