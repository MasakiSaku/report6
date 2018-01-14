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


    public void judge(int[] number){
        /*
            役を判定する
         */

        if(four_card(number) == true){
            System.out.println("Four card!");

        }else if(three_card(number) == true){
            System.out.println("Three card!");

        }else if (two_pair(number) ==true){
            System.out.println("Two pair!");

        }else if (one_pair(number) == true) {
            System.out.println("One pair!");

        }else {
            System.out.println("ハイカードです");

        }
    }
}
