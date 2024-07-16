import java.util.*;

class Book{
String bookName="";
int isbn;
String authorName="";
String publisher="";

Book(){
bookName="Nil";
isbn=0;
authorName="Nil";
publisher="Nil";
}

void setBookname(String name){
bookName=name;
}

void setIsbn(int isbn){
this.isbn=isbn;
}

void setAuthor(String aname){
authorName=aname;
}

void setPublisher(String pubname){
publisher=pubname;
}

void getBookname(){
System.out.printf("\nThe Book Name --- %s",bookName);
}

void getIsbn(){
System.out.printf("\nThe ISBN No. --- %d",isbn);
}

void getAuthor(){
System.out.printf("\nThe Author Name --- %s",authorName);
}

void getPublisher(){
System.out.printf("\nThe Publisher Name --- %s",publisher);
}

void getBookinfo(){
System.out.printf("\n\t--- BOOK INFO --- \nBOOK NAME - %s\nISBN - %s\nAUTHOR - %s\nPUBLISHER - %s\n",bookName,isbn,authorName,publisher);
}

}
public class Exercise18{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
Book[] obj=new Book[30];
for(int i=0;i<3;i++){
obj[i]=new Book();

System.out.println("\nENTER BOOK DETAILS --\n ");
String name=sc.nextLine();
obj[i].setBookname(name);
int isbn=sc.nextInt();
 
sc.nextLine();
obj[i].setIsbn(isbn);

String a_name=sc.nextLine();

obj[i].setAuthor(a_name);
System.out.println(a_name);
String p_name=sc.nextLine();
obj[i].setPublisher(p_name);

obj[i].getBookinfo();
}
}
}