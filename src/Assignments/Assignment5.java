package Assignments;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Assignment5 {
     public static void main(String args[])
	  {
	    
	    ArrayList <Student> slist = new ArrayList();
	    slist.add(new Student(101, 25, "Chaitanya", "Agra", 6));
	    slist.add(new Student(102, 25, "C4haitanya", "A4gra", 6));
	    slist.add(new Student(103, 25, "C3haitanya", "Ag4ra", 6));
	    slist.add(new Student(104, 25, "2Chaitanya", "Agr5a", 6));
	    slist.add(new Student(105, 25, "1Chaitanya", "Agra5", 6));
	    
	    try{ 
	      FileOutputStream fos = new FileOutputStream("d://desktop//Student.ser"); 
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      oos.writeObject(slist);
	      oos.close();
	      fos.close();
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
     
     //Deserialization
     
     ArrayList <Student> stulist = new ArrayList();

     try{
       FileInputStream fis = new FileInputStream("d://desktop//Student.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       //o = (Student)ois.readObject();
   
       
       stulist = (ArrayList<Student>) ois.readObject();
       
       ois.close();
       fis.close();
       
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     for (Student student : stulist) {
         System.out.println(student);
     }
  }
}

//------------------------------Student-------------------------//
class Student implements java.io.Serializable{
	  
	  private int stuRollNum;
	  private int stuAge;
	  private String stuName;
	  private transient String stuAddress;
	  private transient int stuHeight;
	 
	  public Student(int roll, int age, String name,
	  String address, int height) {
	    this.stuRollNum = roll;
	    this.stuAge = age;
	    this.stuName = name;
	    this.stuAddress = address;
	    this.stuHeight = height;
	  }
	 
	  public int getStuRollNum() {
	    return stuRollNum;
	  }
	  public void setStuRollNum(int stuRollNum) {
	    this.stuRollNum = stuRollNum;
	  }
	  public int getStuAge() {
	    return stuAge;
	  }
	  public void setStuAge(int stuAge) {
	    this.stuAge = stuAge;
	  }
	  public String getStuName() {
	    return stuName;
	  }
	  public void setStuName(String stuName) {
	    this.stuName = stuName;
	  }
	  public String getStuAddress() {
	    return stuAddress;
	  }
	  public void setStuAddress(String stuAddress) {
	    this.stuAddress = stuAddress;
	  }
	  public int getStuHeight() {
	    return stuHeight;
	  }
	  public void setStuHeight(int stuHeight) {
	    this.stuHeight = stuHeight;
	  }
	}
