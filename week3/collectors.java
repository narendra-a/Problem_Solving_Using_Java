package second;
import java.util.*;
import java.util.stream.Collectors;
public class collectors {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	List<student> students=new ArrayList<>();
	for(int i=0;i<n;i++) {
		String name=sc.next();
		int marks=sc.nextInt();
		students.add(new student(name,marks));
	}
	int k=sc.nextInt();
	List<student> topK=students.stream().sorted((a,b)->{
		if(a.marks!=b.marks) {
			return b.marks-a.marks;
		}else {
			return a.name.compareTo(b.name);
		}
	}).limit(k).collect(Collectors.toList());
	for(student s:topK) {
		System.out.print(s.name+" ");
	}
	sc.close();
}
}
