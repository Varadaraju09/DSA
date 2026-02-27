import java.io.IOException;
/* 
    -> Java.io.Exception : Fully Qualified ClassName
    -> For Checked exceptions we always use try-catch block
    -> the 'throws' keyword doesn't handle the exception
    -> it only passes on the information to the calling method
    -> the calling method has to handle the exception using r=try - catch
    -> the 'throws' keyword is written in the method siganture (name)
*/
public class E4 {
static void readFile() throws IOException {
        throw new IOException("File not found");
    }
    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            // System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    static void display() throws IOException {
        readFile();
    }
} 
