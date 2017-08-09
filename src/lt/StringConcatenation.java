package lt;

/**
 * Created by Lin Tao on 6/22/2017.
 */
public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "Lin";
        String lastName = "Tao";
        String fullName = firstName.concat(" ").concat(lastName);
        String newFullName=firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(newFullName);
    }
}
