package zoho;
class test{
   static int count ;
test(){
	//count=11;
	count++;
	System.out.println(count);
}
test(int a){
	//count = 10;
	count++;
	System.out.println(count);
}
	static void display() {
		//count=100;
		System.out.println(count);
	}
	

}

public class Zgs08 {
	public static void main(String[] args) {
	    test.count=1000;
		test.display();
		test count1 = new test();
		test count2 = new test(5);
		test count3 = new test(6);


	}
	

}
