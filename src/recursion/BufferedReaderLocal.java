package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderLocal {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Object scanFunction(String type) throws IOException {
        switch (type) {
            case "int":
                return Integer.parseInt(br.readLine());
            case "String":
                return br.readLine();  
            default:
                break;
        }
        return 0;
    }
}
