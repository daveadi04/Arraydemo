/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraysdemo;

/**
 *
 * @author adity
 */
// comment added at 1.20pm
public class studentList {
    public static void main(String[] args){
        Student s1 = new Student("s1","Aditya");
        Student[] studentList = new Student[3];
        // friday 
        
        studentList[0]=s1;
        studentList[1]=new Student( "s2","abc");
        studentList[2]=new Student( "s3","def");
        for(int i=0;i<studentList.length;i++) {
        System.out.println(studentList[i].getaName());
    }
       }
            }
    
}

    
}
