package il;

public class L3 {
    public static void main(String[] args) {

       OneWayList<Integer> integerOneWayList = new OneWayList<>();

        integerOneWayList.add(44);
        integerOneWayList.add(25);
        integerOneWayList.add(26);
        integerOneWayList.add(81);
        integerOneWayList.add(22, 3);

        System.out.println(integerOneWayList.size());
        System.out.println(integerOneWayList.get(integerOneWayList.size() - 1));
        System.out.println();
    }
   
}


