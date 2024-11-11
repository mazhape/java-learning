import java.util.Arrays;
import java.util.List;

import javax.xml.crypto.Data;

public class LambdaExpress {
    int value;

    LambdaExpress(int value) {
        this.value = value;
    }

    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        LambdaExpress[] dataArr = new LambdaExpress[] { new LambdaExpress(1), new LambdaExpress(2),
                new LambdaExpress(3), new LambdaExpress(4) };

        List<Data> dataList = Arrays.asList(dataArr); // 1

        for (Data element : dataList) {

            dataList.removeIf((Data d) -> {
                return d.value % 2 == 0;
            }); // 2

            System.out.println("Removed " + d + ", "); // 3
        }
    }
}
