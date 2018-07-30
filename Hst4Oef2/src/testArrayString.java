import java.util.ArrayList;

public class testArrayString {

    public static void main(String[] args){

        String text = "adsfadfsfads";
        String text1 = new String("een");


        text.replace("a", "K");
        System.out.println("usage of lengt " + text.length());

        System.out.println("userage of charat " + text.charAt(1));
        System.out.println("userage of indexoF " + text.indexOf(1));//no matching position
        System.out.println("userage of substring " + text.substring(1, 2));



        StringBuilder tekst2 = new StringBuilder(text+text1);

        ArrayList<String>myList = new ArrayList();

        myList.add("een");
        myList.add(text);
        myList.add(text1);

        for(String element: myList){
            System.out.println(element);
        }

        myList.set(0," veul");
        for(String element: myList){
            System.out.println(element);
        }


    }
}
