package Lab3;



import java.util.*;

//Create a class called Cinema with attributes (String Genre, double
//revenue, String year). By using LinkedHashSet, write a program to
//Implement the following
public class A4 {
    public static void main(String[] args) {
        Cinema Cineplex = new Cinema("Scifi", 225000, "2024");
        Cinema Guzzo = new Cinema("Drama", 176500, "2019");
        Cinema DollarCinema = new Cinema("Bollywood", 1150000, "2018");
        Cinema Odeon = new Cinema("Documentaries", 99870, "2022");
        LinkedHashSet<Cinema> movies = new LinkedHashSet<Cinema>();
        movies.add(Cineplex);
        movies.add(Guzzo);
        movies.add(DollarCinema);
        movies.add(Odeon);

//•Sort the cinema objects based on the Genre

        TreeSet<Cinema> genreSort = new TreeSet<>(new GenreComparator());
        //Storing elements of LinkedHashSet into TreeSet by using addAll
        genreSort.addAll(movies);
        System.out.println("Sorting based on genre: ");
        //Displaying using loop
        List<Double> revenueslist = new ArrayList<>();
        int[] revenues = new int[genreSort.size()];

        for(Cinema tree : genreSort) {
            System.out.println(tree.getGenre() + " " + tree.getRevenue() + " " + tree.getYear());
            revenueslist.add(tree.getRevenue());
        }

//•Find the movie that made highest profit
        System.out.println("Highest profit: ");
        TreeSet<Double> profits = new TreeSet<>();
        profits.addAll(revenueslist);
        System.out.println(profits.last());




//•Find the total revenue of the given year

    Double total = 0.0;
    for(int i = 0; i<profits.size(); i++){
        total = total+revenueslist.get(i);
    }
        System.out.println("Total revenues: " + total);
    }
}
class Cinema{
    String genre;
    double revenue;
    String year;

    public Cinema(String genre, double revenue, String year) {
        this.genre = genre;
        this.revenue = revenue;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
class GenreComparator implements Comparator<Cinema>{
    public int compare(Cinema f1, Cinema f2){
       return f1.getGenre().compareTo(f2.getGenre());
    }
    }


