
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
		//��ŷ��ص�booleanֵ
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
	//�������
	ArrayList<String> Student=new ArrayList<>();
	public Integer big;
	public Integer medium;
	public Integer small;
	SSystem(int big,int medium,int small){
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	//���ѧ��
	public boolean addStudent(int stuType){
		if(stuType==1) {
			if(big>0) {
				Student.add("���");
				big--;
				return true;
			}
			else
				return false;
		}
		if(stuType==2) {
			if(medium>0) {
				Student.add("�а�");
				medium--;
				return true;
			}
			else
				return false;
		}
		if(stuType==3) {
			if(small>0) {
				Student.add("С��");
				small--;
				return true;
			}
			else
				return false;
		}
		return false;
     }
	//��ȡʣ��༶��λ
	 public int getBig() {
		return this.big;
	 }
	 public int getMedium() {
		 return this.medium;
	 }
	 public int getSmall(){
			return this.small;
	 }
	 //��ӡѧ������ѧ˳��
	 public void getPlanSignUp(){
		for(String a:Student) {
			//System.out.println("�Ǽ�ѧ��");
			System.out.print(a);
		}
	 }
}

//�޸�
