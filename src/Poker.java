import java.util.Random;

public class Poker {

    public static void main (String[] args){
        //メインメソッド
        int[] mark = new int [5];
        int[] number = new int[5];
        System.out.println("ポーカーを開始します。");
        System.out.println("あなたの手札は・・・");
        pick_up(mark, number);
    }

    public static void pick_up (int[] mark, int[] number){
        /*
            カードを重複しないように５枚ランダムに引く。
         */
        Random rand = new Random();
        for (int i =0; i<5; i++){
            int ram_num = rand.nextInt(13)+1;
            int ram_mk  = rand.nextInt(4)+1;
            int count = 0;

            if (i == 0){
                //最初は判定なし
                mark[i] = ram_mk;
                number[i] = ram_num;

            }else {
                //2回目以降は被ったら引き直す
                mark[i] = ram_mk;
                number[i] = ram_num;
                while(count < i ){
                    if (mark[count] == mark[i] && number[count] == number[i]){
                        ram_num = rand.nextInt(13)+1;
                        ram_mk  = rand.nextInt(4)+1;
                        mark[i] = ram_mk;
                        number[i] = ram_num;
                        count = 0;
                    }else{
                        count++;
                    }
                }
            }
        }
        print (mark, number);
    }

    public static void print(int[] mark, int[] number){
         /*
            引いたカードを表示する。
            スペード：S
            クローバー：C
            ダイヤ：D
            ハート：H
         */
        for (int i = 0; i <5; i++){
            String mk;
            if (mark[i] == 1){
                mk = "S";
            }else if(mark[i] == 2){
                mk = "C";
            }else if(mark[i] == 3){
                mk = "D";
            }else {
                mk = "H";
            }
            System.out.println( mk  + ' ' + number[i]);
        }
    }
}
