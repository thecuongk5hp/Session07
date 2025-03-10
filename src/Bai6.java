public class Bai6 {
    public static void main(String[] args) {
        String baseString = "Hello";
        String stringToAppend = " World";
        long startTimeString = System.currentTimeMillis();
        String concatenatedString = baseString;
        for (int i = 0; i < 1000000; i++) {
            concatenatedString += stringToAppend;
        }
        long endTimeString = System.currentTimeMillis();
        long durationString = endTimeString - startTimeString;
        System.out.println("Thời gian thực hiện với String: " + durationString + " ms");
        long startTimeBuilder = System.currentTimeMillis();
        StringBuilder stringBuilderResult = new StringBuilder(baseString);
        for (int i = 0; i < 1000000; i++) {
            stringBuilderResult.append(stringToAppend);
        }
        long endTimeBuilder = System.currentTimeMillis();
        long durationStringBuilder = endTimeBuilder - startTimeBuilder;
        System.out.println("Thời gian thực hiện với StringBuilder: " + durationStringBuilder + " ms");
        long startTimeBuffer = System.currentTimeMillis();
        StringBuffer stringBufferResult = new StringBuffer(baseString);
        for (int i = 0; i < 1000000; i++) {
            stringBufferResult.append(stringToAppend);
        }
        long endTimeBuffer = System.currentTimeMillis();
        long durationStringBuffer = endTimeBuffer - startTimeBuffer;
        System.out.println("Thời gian thực hiện với StringBuffer: " + durationStringBuffer + " ms");
        System.out.println("\nNhận xét về hiệu suất:");
        System.out.println("- String: Không được khuyến nghị cho việc nối chuỗi trong vòng lặp nhiều lần, vì mỗi lần nối tạo ra một đối tượng chuỗi mới và tốn thời gian.");
        System.out.println("- StringBuilder: Tốt hơn cho việc nối chuỗi trong các tình huống không đồng bộ, rất hiệu quả và không tạo ra nhiều đối tượng.");
        System.out.println("- StringBuffer: Tương tự như StringBuilder nhưng an toàn trong môi trường đa luồng (thread-safe), tuy nhiên chậm hơn một chút do tính năng đồng bộ.");
    }
}