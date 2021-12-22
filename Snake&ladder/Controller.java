package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.util.Random;

public class Controller {

    Random random = new Random();

    token t1;
    token t2;
    Player p1;
    Player p2;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button dice;

    @FXML
    private ImageView diceimage;

    public void initialize(){
        t1 = new token(but1);
        t2 = new token(but2);
        int[][] pos_arr = {{0,9},{1,9},{2,9},{3,9},{4,9},{5,9},{6,9},{7,9},{8,9},{9,9},
                {0,8},{1,8},{2,8},{3,8},{4,8},{5,8},{6,8},{7,8},{8,8},{9,8},
                {0,7},{1,7},{2,7},{3,7},{4,7},{5,7},{6,7},{7,7},{8,7},{9,7},
                {0,6},{1,6},{2,6},{3,6},{4,6},{5,6},{6,6},{7,6},{8,6},{9,6},
                {0,5},{1,5},{2,5},{3,5},{4,5},{5,5},{6,5},{7,5},{8,5},{9,5},
                {0,4},{1,4},{2,4},{3,4},{4,4},{5,4},{6,4},{7,4},{8,4},{9,4},
                {0,3},{1,3},{2,3},{3,3},{4,3},{5,3},{6,3},{7,3},{8,3},{9,3},
                {0,2},{1,2},{2,2},{3,2},{4,2},{5,2},{6,2},{7,2},{8,2},{9,2},
                {0,1},{1,1},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},
                {0,0},{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},
        };
        p1 = new Player(t1,pos_arr);
        p2 = new Player(t2, pos_arr);

    }

    @FXML
    void roll(ActionEvent event) {
        Thread thread = new Thread(){
            public void run(){
                File file_2 = null;
                File file6 = new File("src/sample/dice6.jpg");
                File file1 = new File("src/sample/dice1.jpg");
                File file2 = new File("src/sample/dice2.jpg");
                File file3 = new File("src/sample/dice3.jpg");
                File file4 = new File("src/sample/dice4.jpg");
                File file5 = new File("src/sample/dice5.jpg");
                System.out.println("Thread Running");

                try {
                    for (int i = 0; i < 5; i++) {
                        file_2 = new File("src/sample/dice" + (random.nextInt(6)+1)+".jpg");
                        diceimage.setImage(new Image(file_2.toURI().toString()));
                        Thread.sleep(50);
                    }

                    System.out.println(file_2);
                    System.out.println(file6);
                    System.out.println(p1.turn);
                    if(p1.turn == 1){
                        if(file_2.equals(file1)){
                            System.out.println("its one");
                            p1.mov = 6;
                            p1.play();

                        }
                        else {
                            if (file_2.equals(file2)) {
                                    p1.mov = 2;
                            } else if (file_2.equals(file3)) {
                                    p1.mov = 3;
                            } else if (file_2.equals(file4)) {
                                    p1.mov = 4;
                            } else if (file_2.equals(file5)) {
                                    p1.mov = 5;
                            } else if (file_2.equals(file6)) {
                                    p1.mov = 6;
                            }
                            p1.play();
                            p1.turn =2;
                            p2.turn = 2;
                        }
                    }
                    else if(p1.turn == 2){
                        if(file_2.equals(file1)){
                            System.out.println("its one");
                            p2.mov = 6;
                            p1.play();

                        }
                        else {
                            if (file_2.equals(file2)) {
                                p2.mov = 2;
                            } else if (file_2.equals(file3)) {
                                p2.mov = 3;
                            } else if (file_2.equals(file4)) {
                                p2.mov = 4;
                            } else if (file_2.equals(file5)) {
                                p2.mov = 5;
                            } else if (file_2.equals(file6)) {
                                p2.mov = 6;
                            }
                            p2.play();
                            p1.turn =1;
                            p2.turn = 1;
                        }
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
    }



}
class token{
    public Button bt;
    public int posx;
    public int posy;
    public boolean inside = true;
    token(Button b){
        bt = b;

    }

}

class Player{
    token t;
    public int mov;
    public int turn =1;
    public int[][] pos_arr;
    Player(token t, int[][] pr){
        this.t = t;
        pos_arr = pr;
    }
    public void play(){
        if(t.inside){
            GridPane.setConstraints(t.bt, pos_arr[0][0],pos_arr[0][1]);
            t.inside= false;
        }
    }

}

