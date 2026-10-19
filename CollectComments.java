import java.util.ArrayList;
import java.util.Scanner;
class Review{
    private String comment;

    public Review(String comment){
        this.comment = comment;
    }
    public String getComment(){
        return comment;
    }
}
public class CollectComments{
    public static ArrayList<String> collectComments(ArrayList<Review> allReviews){
        ArrayList<String> comments = new ArrayList<>();

        for (int i = 0; i < allReviews.size(); i++){
            String comment = allReviews.get(i).getComment();

            if (comment.contains("!")){
                String formatted = String.format("%d-%s", i, comment);

                if (!comment.endsWith("!") && !comment.endsWith(". ")){
                    formatted += ".";
                }
                comments.add(formatted);
            }
        }
        return comments;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of reviews:");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Review> allReviews = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Enter review " + (i + 1) + " :");
            String comment = sc.nextLine();
            allReviews.add(new Review(comment));
        }
        
        ArrayList<String> comments = collectComments(allReviews);
        System.out.println("Formatted comments:");
        for (String comment : comments){
            System.out.println(comment);
        }
    }
}