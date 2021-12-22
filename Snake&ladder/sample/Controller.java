package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.io.File;
import java.util.Arrays;
import java.util.Random;

public class Controller {

    Random random = new Random();

    token t1;
    token t2;
    Player p1;
    Player p2;

    @FXML
    private GridPane grid;
    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button dice;

    @FXML
    private Button lbut;

    @FXML
    private Button rbut;

    @FXML
    private ImageView diceimage;

    public void initialize(){
        t1 = new token(but1);
        t2 = new token(but2);
        int[][] pos_arr = {{0,9},{1,9},{2,9},{3,9},{4,9},{5,9},{6,9},{7,9},{8,9},{9,9},
                {9,8},{8,8},{7,8},{6,8},{5,8},{4,8},{3,8},{2,8},{1,8},{0,8},
                {0,7},{1,7},{2,7},{3,7},{4,7},{5,7},{6,7},{7,7},{8,7},{9,7},
                {9,6},{8,6},{7,6},{6,6},{5,6},{4,6},{3,6},{2,6},{1,6},{0,6},
                {0,5},{1,5},{2,5},{3,5},{4,5},{5,5},{6,5},{7,5},{8,5},{9,5},
                {9,4},{8,4},{7,4},{6,4},{5,4},{4,4},{3,4},{2,4},{1,4},{0,4},
                {0,3},{1,3},{2,3},{3,3},{4,3},{5,3},{6,3},{7,3},{8,3},{9,3},
                {9,2},{8,2},{7,2},{6,2},{5,2},{4,2},{3,2},{2,2},{1,2},{0,2},
                {0,1},{1,1},{2,1},{3,1},{4,1},{5,1},{6,1},{7,1},{8,1},{9,1},
                {9,0},{8,0},{7,0},{6,0},{5,0},{4,0},{3,0},{2,0},{1,0},{0,0},
        };

        int[][] upgrade = {{3,9}, {7,9},{0,7},{7,7},{8,6},{1,5},{2,4},{8,4},{8,3},{3,1}};
        int[][] reach = {{5,7},{9,6},{0,4},{5,5},{7,5},{0,2},{3,2},{7,3},{7,0},{2,0}};
        int[][] demot = {{9,8},{4,6},{4,4},{2,5},{9,1},{6,0},{5,2},{0,1},{4,0},{1,0}};
        int[][] fall = {{8,9},{6,8},{2,8},{1,7},{9,5},{7,4},{6,4},{2,3},{4,3},{2,2}};
        p1 = new Player(t1,pos_arr, grid,upgrade,reach,demot,fall);
        p2 = new Player(t2, pos_arr, grid,upgrade,reach,demot,fall);

    }
    @FXML
    private Button radbut;

    @FXML
    void clio(ActionEvent event) {
        grid.add(but2,0,9);
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
                    if(p1.turn == 1){
                        rbut.setDisable(true);
                        lbut.setDisable(false);
                    }
                    else{
                        lbut.setDisable(true);
                        rbut.setDisable(false);
                    }
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
                            p1.mov = 1;
                            p1.play(p1.t);

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
                            p1.play(p1.t);
                            p1.turn =2;
                            p2.turn = 2;
                        }
                    }
                    else if(p1.turn == 2){
                        if(file_2.equals(file1)){
                            System.out.println("its one");
                            p2.mov = 1;
                            p2.play(p2.t);

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
                            p2.play(p2.t);
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
    public GridPane grid;
    public int[][] upgrade;
    public int[][] reach1;
    public int[][] fall;
    public int[][] reach2;
    Player(token t, int[][] pr, GridPane grid, int[][] a, int[][] b, int[][] c, int[][] d){
        this.t = t;
        pos_arr = pr;
        this.grid = grid;
        upgrade = a;
        reach1 = b;
        fall = c;
        reach2 = d;

    }
    int linearCheck(int ar[][], int arr[])
    {
        for (int i = 0; i < ar.length; i++)
        {

            boolean matched = true;

            for (int j = 0; j < arr.length; j++)
            {
                if (ar[i][j] != arr[j])
                {
                    matched = false;
                    break;
                }
            }
            if (matched)
                return i + 1;
        }
        return -1;
    }
    public void play(token t){
        if(t.inside){
            if(mov == 1){
                System.out.println("hello");
                System.out.println(Arrays.toString(pos_arr[0]));
                Platform.runLater(new Runnable(){

                    @Override
                    public void run() {
                        grid.add(t.bt, pos_arr[0][0], pos_arr[0][1]);
                    }
                });

                t.inside= false;
                t.posx = pos_arr[0][0];
                t.posy = pos_arr[0][1];
            }

        }
        else{
            int[] temp = new int[]{t.posx, t.posy};
            int ind = linearCheck(pos_arr, temp) -1;
            if(ind+mov+1 <= 100){

                for (int i = ind+1; i <ind+mov+1 ; i++) {
                    System.out.println("run");
                    GridPane.setConstraints(t.bt, pos_arr[i][0], pos_arr[i][1]);
                    t.posx = pos_arr[i][0];
                    t.posy = pos_arr[i][1];
                }
                int[] temp1 = pos_arr[ind+mov];
                int ind1 = linearCheck(upgrade, temp1)-1;
                System.out.println(ind1);
                if(ind1 != -2){
                    GridPane.setConstraints(t.bt, reach1[ind1][0], reach1[ind1][1]);
                    t.posx= reach1[ind1][0];
                    t.posy = reach1[ind1][1];
                }
                int ind2 = linearCheck(fall, temp1)-1;
                System.out.println(ind2);
                if(ind2 != -2){
                    GridPane.setConstraints(t.bt, reach2[ind2][0], reach2[ind2][1]);
                    t.posx= reach2[ind2][0];
                    t.posy = reach2[ind2][1];
                }
                if(ind+mov-1 == 99){

                }
            }

        }
    }

}

