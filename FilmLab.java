public class Filmst
{
public static void main(String [] args)
{

Film[] watch = new Film[4];

watch[0] = new Film("Shrek", 133, "PG");
watch[1] = new Film("Road to Perdition", 117, "G");
watch[2] = new Film("The Truth about Cats and Dogs", 93, "PG");
watch[3] = new Film("Enigma", 114, "G");


for(int i = 0; i < watch.length; i++)
{
watch[i].setLength(10);
}

// Practice advanced loop

for(Film mov: watch)
{
mov.display();
System.out.println("\t\t");
}

// 100 Point
// Film shortestFilm = new Film("Cats", 5, "G");
// watch[2] = shortestFilm;
// System.out.print("Shortest Film is: \n");
// shortestFilm.display();

int tempvar = watch[0].length;
int tempindex = 0;

for(int i = 0; i < watch.length; i++)
{
if(watch[i].length < tempvar)
{
tempvar = watch[i].length;
tempindex = i;
}
}

System.out.println("Shortest Movie: \n" + watch[tempindex]);

Film temp = watch[0];
watch[0] = watch[watch.length-1];
watch[watch.length-1] = temp;

System.out.println("\n####################### After Swap ################################\n");

for(Film mov: watch)
{
mov.display();
System.out.println("\t\t");
}

}
}


class Film
{
String title;
int length;
String rating;

public Film (String sname, int min, String r)
{
title = sname;
length = min;
rating = r;
}
public void display()
{
System.out.println("Title of Movie: " + title + "\nLength: " + length + "\nRating: " + rating);
}
public int getLength()
{
return length;
}
public void setLength(int len)
{
length = ((int)((double)length * (len/100.0))) + length;
}
public int returnLength()
{
return length;
}
public String toString()
{
return "Title of Movie: " + title + "\nLength: " + length + "\nRating: " + rating;
}

}
