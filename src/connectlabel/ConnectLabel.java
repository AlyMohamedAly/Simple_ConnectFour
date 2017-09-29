package connectlabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConnectLabel {
    public static void main(String[] args) {
        GameFrame gg = new GameFrame();
        gg.setVisible(true);
    }
}
class GameFrame extends JFrame{
    private JLabel[] Gaps = new JLabel[42];
    private ImageIcon[] GapImgsW = new ImageIcon[42];
    private ImageIcon[] GapImgsY = new ImageIcon[42];
    private ImageIcon[] GapImgsR = new ImageIcon[42];
    private JPanel ppl = new JPanel();
    GameFrame(){
        init();
        this.setTitle("ConnectFour");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300,10,640,520);
        this.setResizable(false);
        Container C = this.getContentPane();
        ppl.setLayout(null);
        ppl.setBackground(Color.blue);
        int k = 0;
        for(int i = 0; i < 6; i++){
             for(int j = 0; j < 7; j++){
                 Gaps[k].setBounds((j*70)+17+17*j, (i*72)+8+8*i, 70, 72);
                 ppl.add(Gaps[k]);
                 k++;
             }
        }
        C.add(ppl);
    }

    private void init() {
        for(int i = 0; i < 42; i++){
            Gaps[i] = new JLabel("ssdsdsdsd");
        }
        for(int i = 0; i < 42; i++){
            GapImgsW[i] = new ImageIcon("rsz_wcir2c.png");
            GapImgsY[i] = new ImageIcon("rsz_ycir2c.png");
            GapImgsR[i] = new ImageIcon("rsz_rcir2c.png");
            Gaps[i].setIcon(GapImgsW[i]);
            Gaps[i].addMouseListener(new Hole(i));
        }
    }
    class Hole extends MouseAdapter
    {
        private int index;
        Hole(int ind){
            index = ind;
        }
        public void mouseClicked(MouseEvent e)
        {
            int target = clickRow();
            if(target > -1)
                Gaps[target].setIcon(GapImgsY[target]);
        }
        private int clickRow(){
            if (index % 7 == 0){
                if(isEmpty(Gaps[35],35))
                    return 35;
                if(isEmpty(Gaps[28],28))
                    return 28;
                if(isEmpty(Gaps[21],21))
                    return 21;
                if(isEmpty(Gaps[14],14))
                    return 14;
                if(isEmpty(Gaps[7],7))
                    return 7;
                if(isEmpty(Gaps[0],0))
                    return 0;
            }
            if (index % 7 == 1){
                if(isEmpty(Gaps[36],36))
                    return 36;
                if(isEmpty(Gaps[29],29))
                    return 29;
                if(isEmpty(Gaps[22],22))
                    return 22;
                if(isEmpty(Gaps[15],15))
                    return 15;
                if(isEmpty(Gaps[8],8))
                    return 8;
                if(isEmpty(Gaps[1],1))
                    return 1;
            }
            if (index % 7 == 2){
                if(isEmpty(Gaps[37],37))
                    return 37;
                if(isEmpty(Gaps[30],30))
                    return 30;
                if(isEmpty(Gaps[23],23))
                    return 23;
                if(isEmpty(Gaps[16],16))
                    return 16;
                if(isEmpty(Gaps[9],9))
                    return 9;
                if(isEmpty(Gaps[2],2))
                    return 2;
            }
            if (index % 7 == 3){
                if(isEmpty(Gaps[38],38))
                    return 38;
                if(isEmpty(Gaps[31],31))
                    return 31;
                if(isEmpty(Gaps[24],24))
                    return 24;
                if(isEmpty(Gaps[17],17))
                    return 17;
                if(isEmpty(Gaps[10],10))
                    return 10;
                if(isEmpty(Gaps[3],3))
                    return 3;
            }
            if (index % 7 == 4){
                if(isEmpty(Gaps[39],39))
                    return 39;
                if(isEmpty(Gaps[32],32))
                    return 32;
                if(isEmpty(Gaps[25],25))
                    return 25;
                if(isEmpty(Gaps[18],18))
                    return 18;
                if(isEmpty(Gaps[11],11))
                    return 11;
                if(isEmpty(Gaps[4],4))
                    return 4;
            }
            if (index % 7 == 5){
                if(isEmpty(Gaps[40],40))
                    return 40;
                if(isEmpty(Gaps[33],33))
                    return 33;
                if(isEmpty(Gaps[26],26))
                    return 26;
                if(isEmpty(Gaps[19],19))
                    return 19;
                if(isEmpty(Gaps[12],12))
                    return 12;
                if(isEmpty(Gaps[5],5))
                    return 5;
            }
            if (index % 7 == 6){
                if(isEmpty(Gaps[41],41))
                    return 41;
                if(isEmpty(Gaps[34],34))
                    return 34;
                if(isEmpty(Gaps[27],27))
                    return 27;
                if(isEmpty(Gaps[20],20))
                    return 20;
                if(isEmpty(Gaps[13],13))
                    return 13;
                if(isEmpty(Gaps[6],6))
                    return 6;
            }
            return -1;
        }
        private boolean isEmpty(JLabel gg, int indk){
            return gg.getIcon() == GapImgsW[indk];
        }
    }
}