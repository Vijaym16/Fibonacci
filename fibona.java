import java.nio.file.SecureDirectoryStream;

public class fibona {
    public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println(n);

        for (int i =1; i <=n; ++i){
            System.out.println(firstTerm);

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
