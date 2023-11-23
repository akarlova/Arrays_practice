package app;

public class Main3 {
    //Проведено лотерею. Виграли квитки з парними номерами.
    //Номери мають 4-х значний цифровий формат.
    //В офіс лотереї надано 5 лотерейних квитків, серед яких
    //2 мають парний числовий код, інші непарні.
    //Вивести перелік виграшних номерів квитків.
   // Пункти переліку мають бути пронумеровані.
    public static void main(String[] args) {
        int count=0;
        int[] luckyNumbers = new int[] {2944,6751,6688,5789,6847};
        for(int luckyNumber:luckyNumbers){
            if(luckyNumber%2==0){
            count++;
            System.out.println(count + ") " + luckyNumber);
            }
        }
    }
}
