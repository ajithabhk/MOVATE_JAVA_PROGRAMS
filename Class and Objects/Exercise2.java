class Movie{
private String title="";
private String studio="";
private String rating="";


Movie(String title,String studio,String rating){
this.title=title;
this.studio=studio;
this.rating=rating;
}


Movie(String title,String studio){
this.title=title;
this.studio=studio;
rating="PG";
}



void getPG(Movie obj[]){
for(int i=0;i<2;i++){
if(obj[i].rating=="PG"){
System.out.printf("%s \n %s\n %s\n\n",obj[i].title,obj[i].studio,obj[i].rating);
}
}
}

}
public class Exercise2{
public static void main(String args[]){
Movie[] obj=new Movie[3];
Movie obj1=new Movie("Casino Royal","Eon Productions","PG-13");
obj[0]=new Movie("CC Boys","Crane Productions","PG");
obj[1]=new Movie("CC Boys 2","Crane Productions","PG");
obj[2]=new Movie("Manjummel Boys 2","Crane Productions","Nil");
obj1.getPG(obj);

}
}