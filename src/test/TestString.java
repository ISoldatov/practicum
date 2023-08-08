package test;

public class TestString {
    public static void main(String[] args) {
        String uri = "/tasks/task/?id=4";

        String[] uriPath = uri.split("\\?");
        if (uriPath.length==1) {
            String taskType=  uriPath[0].split("/")[2];
        }

        for (String s : uriPath) {
            System.out.println(s);
        }
        String uri2 = "/tasks/task/";
        String[] uriPath2 = uri2.split("\\?");
        for (String s : uriPath2) {
            System.out.println(s);
        }
    }
}
