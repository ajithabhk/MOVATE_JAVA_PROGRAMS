public class Movie{
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



public static Movie[] getPG(Movie obj[]) {

int count = 0;
for (Movie movie : obj) {
if ("PG".equals(movie.rating)) {  
count++;
}
}


Movie[] obj_new = new Movie[count];
int index = 0;


for (Movie movie : obj) {
if ("PG".equals(movie.rating)) {
obj_new[index] = new Movie(movie.title, movie.studio, movie.rating);
index++;
}
}
return obj_new;
}




public static void main(String args[]){
Movie[] obj=new Movie[3];
Movie obj1=new Movie("Casino Royal","Eon Productions","PG-13");
obj[0]=new Movie("CC Boys","Crane Productions","PG");
obj[1]=new Movie("CC Boys 2","Crane Productions","PG");
obj[2]=new Movie("Manjummel Boys 2","Crane Productions","Nil");
Movie[] new_obj=getPG(obj);
for(Movie movie:new_obj){
System.out.println(movie.rating);
}
}
}