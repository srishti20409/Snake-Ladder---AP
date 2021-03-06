package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

public class Controller {

    Random random = new Random();

    public token t1;
    public token t2;
    public Player p1;
    public Player p2;

    @FXML
    private GridPane grid1;

    @FXML
    private GridPane grid10;

    @FXML
    private GridPane grid100;

    @FXML
    private GridPane grid11;

    @FXML
    private GridPane grid12;

    @FXML
    private GridPane grid13;

    @FXML
    private GridPane grid36;

    @FXML
    private GridPane grid14;

    @FXML
    private GridPane grid15;

    @FXML
    private GridPane grid16;

    @FXML
    private GridPane grid17;

    @FXML
    private GridPane grid18;

    @FXML
    private GridPane grid19;

    @FXML
    private GridPane grid2;

    @FXML
    private GridPane grid20;

    @FXML
    private GridPane grid21;

    @FXML
    private GridPane grid22;

    @FXML
    private GridPane grid23;

    @FXML
    private GridPane grid24;

    @FXML
    private GridPane grid25;

    @FXML
    private GridPane grid26;

    @FXML
    private GridPane grid27;

    @FXML
    private GridPane grid28;

    @FXML
    private GridPane grid29;

    @FXML
    private GridPane grid3;

    @FXML
    private GridPane grid30;

    @FXML
    private GridPane grid31;

    @FXML
    private GridPane grid32;

    @FXML
    private GridPane grid33;

    @FXML
    private GridPane grid34;

    @FXML
    private GridPane grid35;

    @FXML
    private GridPane grid37;

    @FXML
    private GridPane grid38;

    @FXML
    private GridPane grid39;

    @FXML
    private GridPane grid4;

    @FXML
    private GridPane grid40;

    @FXML
    private GridPane grid41;

    @FXML
    private GridPane grid42;

    @FXML
    private GridPane grid43;

    @FXML
    private GridPane grid44;

    @FXML
    private GridPane grid45;

    @FXML
    private GridPane grid46;

    @FXML
    private GridPane grid47;

    @FXML
    private GridPane grid48;

    @FXML
    private GridPane grid49;

    @FXML
    private GridPane grid5;

    @FXML
    private GridPane grid50;

    @FXML
    private GridPane grid51;

    @FXML
    private GridPane grid52;

    @FXML
    private GridPane grid53;

    @FXML
    private GridPane grid54;

    @FXML
    private GridPane grid55;

    @FXML
    private GridPane grid56;

    @FXML
    private GridPane grid57;

    @FXML
    private GridPane grid58;

    @FXML
    private GridPane grid59;

    @FXML
    private GridPane grid6;

    @FXML
    private GridPane grid60;

    @FXML
    private GridPane grid61;

    @FXML
    private GridPane grid62;

    @FXML
    private GridPane grid63;

    @FXML
    private GridPane grid64;

    @FXML
    private GridPane grid65;

    @FXML
    private GridPane grid66;

    @FXML
    private GridPane grid67;

    @FXML
    private GridPane grid68;

    @FXML
    private GridPane grid69;

    @FXML
    private GridPane grid7;

    @FXML
    private GridPane grid70;

    @FXML
    private GridPane grid71;

    @FXML
    private GridPane grid72;

    @FXML
    private GridPane grid73;

    @FXML
    private GridPane grid74;

    @FXML
    private GridPane grid75;

    @FXML
    private GridPane grid76;

    @FXML
    private GridPane grid77;

    @FXML
    private GridPane grid78;

    @FXML
    private GridPane grid79;

    @FXML
    private GridPane grid8;

    @FXML
    private GridPane grid80;

    @FXML
    private GridPane grid81;

    @FXML
    private GridPane grid82;

    @FXML
    private GridPane grid83;

    @FXML
    private GridPane grid84;

    @FXML
    private GridPane grid85;

    @FXML
    private GridPane grid86;

    @FXML
    private GridPane grid87;

    @FXML
    private GridPane grid88;

    @FXML
    private GridPane grid89;

    @FXML
    private GridPane grid9;

    @FXML
    private GridPane grid90;

    @FXML
    private GridPane grid91;

    @FXML
    private GridPane grid92;

    @FXML
    private GridPane grid93;

    @FXML
    private GridPane grid94;

    @FXML
    private GridPane grid95;

    @FXML
    private GridPane grid96;

    @FXML
    private GridPane grid97;

    @FXML
    private GridPane grid98;

    @FXML
    private GridPane grid99;
    @FXML
    private TextField Textf;

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

    @FXML
    private Text t6;

    @FXML
    private Text t7;

    @FXML
    private Text t3;

    @FXML
    private TextField t4;

    @FXML
    private TextField t5;

    @FXML
    private TextField team;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    private Rectangle rec;

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
        GridPane[] g = {grid1,grid2,grid3,grid4,grid5,grid6,grid7,grid8,grid9,grid10,
                grid11,grid12,grid13,grid14,grid15,grid16,grid17, grid18,grid19,grid20,
                grid21,grid22,grid23,grid24,grid25,grid26,grid27, grid28,grid29,grid30,
                grid31,grid32,grid33,grid34,grid35,grid36,grid37, grid38,grid39,grid40,
                grid41,grid42,grid43,grid44,grid45,grid46,grid47, grid48,grid49,grid50,
                grid51,grid52,grid53,grid54,grid55,grid56,grid57, grid58,grid59,grid60,
                grid61,grid62,grid63,grid64,grid65,grid66,grid67, grid68,grid69,grid70,
                grid71,grid72,grid73,grid74,grid75,grid76,grid77, grid78,grid79,grid80,
                grid81,grid82,grid83,grid84,grid85,grid86,grid87, grid88,grid89,grid90,
                grid91,grid92,grid93,grid94,grid95,grid96,grid97, grid98,grid99,grid90,};

        int[][] upgrade = {{3,9}, {7,9},{0,7},{7,7},{8,6},{1,5},{2,4},{8,4},{8,3},{3,1}};
        int[][] reach = {{4,7},{9,6},{0,4},{5,5},{7,5},{0,2},{3,2},{7,3},{7,0},{2,0}};
        int[][] demot = {{9,8},{4,6},{4,4},{2,5},{9,1},{6,0},{5,2},{0,1},{4,0},{1,0}};
        int[][] fall = {{8,9},{6,8},{2,8},{1,7},{9,5},{7,4},{6,4},{2,3},{4,3},{2,2}};

        int[] present = {0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0};
        p1 = new Player(t1,pos_arr, grid,upgrade,reach,demot,fall, present,g);
        p2 = new Player(t2, pos_arr, grid,upgrade,reach,demot,fall,present,g);

    }
    @FXML
    private Button radbut;

    @FXML
    private ImageView bob;

    @FXML
    public void clio(ActionEvent event) {
        grid.add(but2,0,9);
    }


    @FXML
    public void roll(ActionEvent event) {
        Thread thread = new Thread(){
            public void run(){
                bob.setVisible(false);
                File file_2 = null;
                File file6 = new File("src/dice6.png");
                File file1 = new File("src/dice1.png");
                File file2 = new File("src/dice2.png");
                File file3 = new File("src/dice3.png");
                File file4 = new File("src/dice4.png");
                File file5 = new File("src/dice5.png");

                try {
                    if(p1.getTurn() == 1){
                        rbut.setVisible(true);
                        lbut.setVisible(false);
                    }
                    else{
                        lbut.setVisible(true);
                        rbut.setVisible(false);
                    }
                    for (int i = 0; i < 5; i++) {
                        file_2 = new File("src/rolling-dice.gif");
                        diceimage.setImage(new Image(file_2.toURI().toString()));
                        Thread.sleep(100);
                        file_2 = new File("src/dice" + (random.nextInt(6)+1)+".png");
                        diceimage.setImage(new Image(file_2.toURI().toString()));
                        Thread.sleep(50);
                    }


                    if(p1.getTurn() == 1){
                        if(file_2.equals(file1)){
                            p1.setMov(1);

                            if(!p1.getT().inside){
                                p2.setTurn(2);
                                p1.setTurn(2);
                            }
                            p1.play(p1.getT(),p1,p2);
                            bob.setVisible(true);

                        }
                        else {
                            if (file_2.equals(file2)) {
                                p1.setMov(2);
                            } else if (file_2.equals(file3)) {
                                p1.setMov(3);
                            } else if (file_2.equals(file4)) {
                                p1.setMov(4);
                            } else if (file_2.equals(file5)) {
                                p1.setMov(5);
                            } else if (file_2.equals(file6)) {
                                p1.setMov(6);
                            }
                            p1.play(p1.getT(),p1,p2);
                            bob.setVisible(true);
                            p1.setTurn(2);
                            p2.setTurn(2);
                        }
                        if(p1.win){
                            team.setVisible(true);
                            t3.setVisible(true);
                            t4.setVisible(true);
                            t5.setVisible(true);
                            t6.setVisible(true);
                            t7.setVisible(true);
                            text1.setVisible(true);
                            text2.setVisible(true);
                            text1.setText("PLAYER1");
                            text2.setText("PLAYER2");
                            dice.setDisable(true);
                            rec.setVisible(true);
                        }
                    }
                    else if(p1.getTurn() == 2){
                        if(file_2.equals(file1)){
                            p2.setMov(1);

                            if(!p2.getT().inside){
                                p2.setTurn(1);
                                p1.setTurn(1);
                            }
                            p2.play(p2.getT(),p1,p2);
                            bob.setVisible(true);

                        }
                        else {
                            if (file_2.equals(file2)) {
                                p2.setMov(2);
                            } else if (file_2.equals(file3)) {
                                p2.setMov(3);
                            } else if (file_2.equals(file4)) {
                                p2.setMov(4);
                            } else if (file_2.equals(file5)) {
                                p2.setMov(5);
                            } else if (file_2.equals(file6)) {
                                p2.setMov(6);
                            }
                            p2.play(p2.getT(),p1,p2);
                            bob.setVisible(true);
                            p1.setTurn(1);
                            p2.setTurn(1);
                        }
                        if(p2.win){
                            team.setVisible(true);
                            t3.setVisible(true);
                            t4.setVisible(true);
                            t5.setVisible(true);
                            t6.setVisible(true);
                            t7.setVisible(true);
                            text1.setVisible(true);
                            text2.setVisible(true);
                            text1.setText("PLAYER2");
                            text2.setText("PLAYER1");
                            dice.setDisable(true);
                            rec.setVisible(true);
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
    private Button bt;
    private int posx;
    private int posy;
    public boolean inside = true;
    public boolean inside_complete = false;
    token(Button b){
        bt = b;
    }

    public Button getBt() {
        return bt;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setBt(Button bt) {
        this.bt = bt;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

}

class Player extends Thread{
    private token t;
    private int mov;
    private int turn =1;
    private int[][] pos_arr;
    private GridPane grid;
    private int[][] upgrade;
    private int[][] reach1;
    private int[][] fall;
    private int[][] reach2;
    public boolean win = false;
    private int[] present;
    private GridPane[] smallgrid;
    Player(token t, int[][] pr, GridPane grid, int[][] a, int[][] b, int[][] c, int[][] d, int[] present, GridPane[] sgrid){
        this.t = t;
        pos_arr = pr;
        this.grid = grid;
        upgrade = a;
        reach1 = b;
        fall = c;
        reach2 = d;
        this.present = present;
        smallgrid = sgrid;
    }
    public int linearCheck(int ar[][], int arr[])
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
    public void play(token t, Player p1, Player p2) throws InterruptedException {
        if(t.inside){
            if(mov == 1){
                Platform.runLater(new Runnable(){

                    @Override
                    public void run() {
                        grid.add(t.getBt(), pos_arr[0][0], pos_arr[0][1]);
                    }
                });
                present[0] += 1;
                t.inside= false;
                t.setPosx(pos_arr[0][0]);
                t.setPosy(pos_arr[0][1]);
            }

        }
        else{
            t.inside_complete = true;
            int[] temp = new int[]{t.getPosx(), t.getPosy()};
            int ind = linearCheck(pos_arr, temp) -1;

            if(present[ind] == 2){
                int[] temp_2 =pos_arr[ind+1];
                Platform.runLater(new Runnable(){

                    @Override
                    public void run() {
                        grid.add(t.getBt(),temp_2[0], temp_2[1]);
                        if(p1.turn == 1){
                            Platform.runLater(new Runnable(){

                                @Override
                                public void run() {
                                    grid.add(p2.t.getBt(),pos_arr[ind][0],pos_arr[ind][1]);
                                }
                            });

                        }
                        else{
                            Platform.runLater(new Runnable(){

                                @Override
                                public void run() {
                                    grid.add(p1.t.getBt(),pos_arr[ind][0],pos_arr[ind][1]);
                                }
                            });

                        }

                    }
                });


            }
            present[ind]  -= 1;
            if(ind+mov+1 <= 100){

                for (int i = ind+1; i <ind+mov+1 ; i++) {
                    GridPane.setConstraints(t.getBt(), pos_arr[i][0], pos_arr[i][1]);
                    Thread.sleep(400);
                    t.setPosx(pos_arr[i][0]);
                    t.setPosy(pos_arr[i][1]);
                }
                int[] temp1 = pos_arr[ind+mov];
                int ind1 = linearCheck(upgrade, temp1)-1;
                if(ind1 != -2){
                    GridPane.setConstraints(t.getBt(), reach1[ind1][0], reach1[ind1][1]);
                    t.setPosx(reach1[ind1][0]);
                    t.setPosy(reach1[ind1][1]);
                }
                int ind2 = linearCheck(fall, temp1)-1;
                if(ind2 != -2){
                    GridPane.setConstraints(t.getBt(), reach2[ind2][0], reach2[ind2][1]);
                    t.setPosx(reach2[ind2][0]);
                    t.setPosy(reach2[ind2][1]);
                }
                int[] temp2 = new int[]{t.getPosx(), t.getPosy()};
                int ind_tem = linearCheck(pos_arr, temp2)-1;

                present[ind_tem] += 1;
                if(present[ind_tem] == 2){
                    Platform.runLater(new Runnable(){

                        @Override
                        public void run() {
                            smallgrid[ind_tem].add(p1.t.getBt(),0, 0);
                            smallgrid[ind_tem].add(p2.t.getBt(), 0, 1);
                        }
                    });

                }
                if(ind+mov == 99){
                    win = true;
                }
            }

        }
    }

    public GridPane getGrid() {
        return grid;
    }

    public GridPane[] getSmallgrid() {
        return smallgrid;
    }

    public int getMov() {
        return mov;
    }

    public int getTurn() {
        return turn;
    }

    public int[] getPresent() {
        return present;
    }

    public int[][] getFall() {
        return fall;
    }

    public int[][] getPos_arr() {
        return pos_arr;
    }

    public int[][] getReach1() {
        return reach1;
    }

    public int[][] getReach2() {
        return reach2;
    }

    public int[][] getUpgrade() {
        return upgrade;
    }

    public token getT() {
        return t;
    }

    public void setFall(int[][] fall) {
        this.fall = fall;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }

    public void setPos_arr(int[][] pos_arr) {
        this.pos_arr = pos_arr;
    }

    public void setPresent(int[] present) {
        this.present = present;
    }

    public void setReach1(int[][] reach1) {
        this.reach1 = reach1;
    }

    public void setReach2(int[][] reach2) {
        this.reach2 = reach2;
    }

    public void setSmallgrid(GridPane[] smallgrid) {
        this.smallgrid = smallgrid;
    }

    public void setT(token t) {
        this.t = t;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }



}