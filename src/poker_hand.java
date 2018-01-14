public class poker_hand {


    public boolean one_pair(int[] number){
        /*
            ワンペアの時、trueを返す
         */
        boolean judge = false;

        for(int i=0; i<4; i++){
            if(number[i] == number[i+1]){
                judge = true;
                break;
            }
        }
        return judge;
    }

    public boolean two_pair(int[] number){
        /*
            ツーペアの時、trueを返す
         */
        boolean judge = false;

        if(number[0] == number[1] && number[2] == number [3]){
            judge = true;
        }else if (number[0] == number [1] && number[3] == number [4]){
            judge = true;
        }else if (number[1] == number [2] && number[3] == number [4]){
            judge = true;
        }
        return judge;
    }

    public boolean three_card(int[] number){
        /*
            スリーカードの時、trueを返す
         */
        boolean judge = false;

        if(number[0] == number[1] && number[1] == number[2]){
            judge = true;
        }else if (number[1] == number[2] && number[2] == number[3]){
            judge = true;
        }else if (number[2] == number[3] && number[3] == number[4]){
            judge = true;
        }
        return judge;
    }

    public boolean four_card(int[] number){
        /*
            フォーカードの時、trueを返す
         */
        boolean judge = false;

        if (number[0] == number[1] && number[1] == number[2] && number[2] == number[3]){
            judge = true;
        }else if (number[1] == number[2] && number[2] == number[3] && number[3] == number[4]){
            judge = true;
        }
        return judge;
    }

    public boolean straight(int[] number){
        /*
            ストレートの時、trueを返す
         */
        boolean judge = false;
        int fst_num = number[0];

        if(number[1] == fst_num+1 && number[2] == fst_num+2 && number[3] == fst_num+3 && number[4] == fst_num+4){
            judge = true;
        }else if (fst_num == 1 && number[1] == 10 && number[2] == 11 && number[3] ==12 && number[4] == 13){
            //この場合もストレート
            judge = true;
        }
        return judge;
    }

    public boolean flush(int[] mark){
        /*
            フラッシュの時、trueを返す
         */
        boolean judge = false;
        if(mark[0] == mark[1] && mark[1] == mark[2] && mark[2]==mark[3] && mark[3] == mark[4]){
            judge = true;
        }

        return judge;
    }

    public boolean full_house(int[] number){
        /*
            フルハウスの時、trueを返す
         */
        boolean judge = false;

        if (number[0]==number[1] && number[1]==number[2] && number[3]==number[4]){
            judge = true;

        }else if (number[0]==number[1] && number[2]==number[3] && number[3]==number[4] ){
            judge = true;
        }
        return judge;
    }

    public boolean straight_flush(int[] mark,int[] number){
        /*
            ストレートフラッシュの時、trueを返す
         */
        boolean judge = false;

        if (flush(mark) && straight(number)){
            judge = true;
        }
        return judge;
    }

    public boolean royal_straight_flush(int[] mark, int[] number){
        /*
            ロイヤルストレートフラッシュの時、trueを返す
         */
        boolean judge = false;

        if(number[0] == 1 && number[1] == 10 && number [2] == 11 && number [3] == 12 && number[4] == 13 && flush(mark)){
            judge = true;
        }
        return judge;
    }


    public void judge(int[] mark,int[] number){
        /*
            役を判定する
         */
        if(royal_straight_flush(mark,number)){
            System.out.println("Royal Straight Flush");

        }else if(straight_flush(mark,number)){
            System.out.println("Straight Flush");

        }else if(full_house(number)){
            System.out.println("Full House");

        }else if(flush(mark)){
            System.out.println("Flush");

        }else if(straight(number)){
            System.out.println("Straight");

        }else if(four_card(number)){
            System.out.println("Four card");

        }else if(three_card(number)){
            System.out.println("Three card");

        }else if (two_pair(number)){
            System.out.println("Two pair");

        }else if (one_pair(number)) {
            System.out.println("One pair");

        }else {
            System.out.println("ハイカード");
        }
    }
}
