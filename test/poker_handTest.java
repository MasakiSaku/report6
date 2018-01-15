import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class poker_handTest {

    @Test
    void judge() {
        int[] mark = new int [5];
        int[] number = new int[5];

        //ロイヤルストレートフラッシュの手札を再現
        for (int i=0; i<5;i++){
            mark[i] = 1;
        }
        number[0] = 1;
        number[1] = 10;
        number[2] = 11;
        number[3] = 12;
        number[4] = 13;

        poker_hand hand = new poker_hand();

        //判定がロイヤルストレートフラッシュになるかチェックする
        String judge_royal = poker_hand.judge(mark,number);
        assertEquals("Royal Straight Flush",judge_royal);


        //ストレートフラッシュの手札を再現
        for(int i=1; i<5 ; i++){
            number[i] = i+1;
        }

        //判定がストレートフラッシュになるかチェックする
        String judge_sf = poker_hand.judge(mark,number);
        assertEquals("Straight Flush",judge_sf);
    }
}