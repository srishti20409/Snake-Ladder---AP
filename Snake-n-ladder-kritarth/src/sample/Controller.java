<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.image.Image?>
<?import javafx.scene.image.ImageView?>
<?import javafx.scene.layout.ColumnConstraints?>
<?import javafx.scene.layout.GridPane?>
<?import javafx.scene.layout.Pane?>
<?import javafx.scene.layout.RowConstraints?>
<?import javafx.scene.shape.Rectangle?>
<?import javafx.scene.shape.SVGPath?>
<?import javafx.scene.text.Font?>
<?import javafx.scene.text.Text?>

<Pane maxHeight="-Infinity" maxWidth="-Infinity" minHeight="-Infinity" minWidth="-Infinity" prefHeight="654.0" prefWidth="922.0" xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1" fx:controller="sample.Controller">
   <children>
      <ImageView fx:id="diceimage" fitHeight="69.0" fitWidth="69.0" layoutX="253.0" layoutY="495.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../dice6.jpg" />
         </image>
      </ImageView>
      <Button fx:id="dice" layoutX="256.0" layoutY="495.0" mnemonicParsing="false" onAction="#roll" opacity="0.0" prefHeight="69.0" prefWidth="63.0" text="Button" />
      <ImageView fitHeight="614.0" fitWidth="330.0" layoutX="571.0" layoutY="20.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../image.jpg" />
         </image>
      </ImageView>
      <GridPane fx:id="grid" gridLinesVisible="true" layoutX="167.0" layoutY="98.0" prefHeight="387.0" prefWidth="241.0">
         <columnConstraints>
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="-Infinity" minWidth="10.0" prefWidth="23.600051879882812" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="23.600051879882812" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
            <ColumnConstraints hgrow="SOMETIMES" maxWidth="23.600051879882812" minWidth="10.0" prefWidth="100.0" />
         </columnConstraints>
         <rowConstraints>
            <RowConstraints maxHeight="38.399993896484375" minHeight="0.0" prefHeight="38.399993896484375" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="9.600006103515625" prefHeight="9.600006103515625" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
            <RowConstraints maxHeight="38.399993896484375" minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
         </rowConstraints>
         <children>
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#d6959d" height="38.0" smooth="false" stroke="#e7a0ab" width="23.0" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="7" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.rowIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="5" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.rowIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="3" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="2" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.rowIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="6" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="4" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="2" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="1" GridPane.rowIndex="1" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="9" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="7" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="5" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="3" GridPane.rowIndex="9" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="8" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="6" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" GridPane.columnIndex="4" GridPane.rowIndex="8" />
            <Rectangle arcHeight="5.0" arcWidth="5.0" fill="#f5e2e4" height="38.0" smooth="false" stroke="#f7e2e5" width="23.0" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="2" GridPane.halignment="CENTER" GridPane.rowIndex="9" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="4" GridPane.halignment="CENTER" GridPane.rowIndex="9" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="6" GridPane.halignment="CENTER" GridPane.rowIndex="9" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="8" GridPane.halignment="CENTER" GridPane.rowIndex="9" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="8" GridPane.halignment="CENTER" GridPane.rowIndex="7" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="6" GridPane.halignment="CENTER" GridPane.rowIndex="7" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="4" GridPane.halignment="CENTER" GridPane.rowIndex="7" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="2" GridPane.halignment="CENTER" GridPane.rowIndex="7" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="2" GridPane.halignment="CENTER" GridPane.rowIndex="5" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="4" GridPane.halignment="CENTER" GridPane.rowIndex="5" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="6" GridPane.halignment="CENTER" GridPane.rowIndex="5" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="8" GridPane.halignment="CENTER" GridPane.rowIndex="5" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="2" GridPane.halignment="CENTER" GridPane.rowIndex="3" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="4" GridPane.halignment="CENTER" GridPane.rowIndex="3" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="6" GridPane.halignment="CENTER" GridPane.rowIndex="3" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="8" GridPane.halignment="CENTER" GridPane.rowIndex="3" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="2" GridPane.halignment="CENTER" GridPane.rowIndex="1" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="4" GridPane.halignment="CENTER" GridPane.rowIndex="1" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="6" GridPane.halignment="CENTER" GridPane.rowIndex="1" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="8" GridPane.halignment="CENTER" GridPane.rowIndex="1" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="7" GridPane.halignment="CENTER" GridPane.rowIndex="8" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="5" GridPane.halignment="CENTER" GridPane.rowIndex="8" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="3" GridPane.halignment="CENTER" GridPane.rowIndex="8" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="1" GridPane.halignment="CENTER" GridPane.rowIndex="8" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="7" GridPane.halignment="CENTER" GridPane.rowIndex="6" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="5" GridPane.halignment="CENTER" GridPane.rowIndex="6" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="3" GridPane.halignment="CENTER" GridPane.rowIndex="6" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="1" GridPane.halignment="CENTER" GridPane.rowIndex="6" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="7" GridPane.halignment="CENTER" GridPane.rowIndex="4" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="5" GridPane.halignment="CENTER" GridPane.rowIndex="4" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="3" GridPane.halignment="CENTER" GridPane.rowIndex="4" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="1" GridPane.halignment="CENTER" GridPane.rowIndex="4" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="7" GridPane.halignment="CENTER" GridPane.rowIndex="2" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="5" GridPane.halignment="CENTER" GridPane.rowIndex="2" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="3" GridPane.halignment="CENTER" GridPane.rowIndex="2" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="1" GridPane.halignment="CENTER" GridPane.rowIndex="2" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="7" GridPane.halignment="CENTER" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="5" GridPane.halignment="CENTER" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="3" GridPane.halignment="CENTER" GridPane.valignment="CENTER" />
            <SVGPath content="M796.78,812.25H813l20,30.44-20,30.72H796.78l19.3-30.58Z" fill="#e3b1b4" rotate="180.0" scaleX="0.5" scaleY="0.5" GridPane.columnIndex="1" GridPane.halignment="CENTER" GridPane.valignment="CENTER" />
            <GridPane fx:id="grid1" GridPane.columnIndex="0" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <GridPane.margin>
                        <Insets />
                     </GridPane.margin>
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                  </Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid2" GridPane.columnIndex="1" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints />
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="2 " textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                  </Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid3" GridPane.columnIndex="2" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="3" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid4" GridPane.columnIndex="3" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="4" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid5" GridPane.columnIndex="4" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="5" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid6" GridPane.columnIndex="5" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="6" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid7" GridPane.columnIndex="6" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="7" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid8" GridPane.columnIndex="7" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="8" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid9" GridPane.columnIndex="8" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="9" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid10" GridPane.columnIndex="9" GridPane.rowIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="10" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid11" GridPane.columnIndex="9" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="11" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid12" GridPane.columnIndex="8" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="12" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid13" GridPane.columnIndex="7" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="13" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid14" GridPane.columnIndex="6" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="14" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid15" GridPane.columnIndex="5" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="15" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid16" GridPane.columnIndex="4" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="16" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid17" GridPane.columnIndex="3" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="17" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid18" GridPane.columnIndex="2" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="18" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid19" GridPane.columnIndex="1" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="19" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid20" GridPane.columnIndex="0" GridPane.rowIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="20" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid21" GridPane.columnIndex="0" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints />
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="21" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid22" GridPane.columnIndex="1" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="22" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid23" GridPane.columnIndex="2" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="23" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid24" GridPane.columnIndex="3" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="24" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid25" GridPane.columnIndex="4" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="25" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid26" GridPane.columnIndex="5" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="26" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid27" GridPane.columnIndex="6" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="27" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid28" GridPane.columnIndex="7" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="28" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid29" GridPane.columnIndex="8" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="29" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid30" GridPane.columnIndex="9" GridPane.rowIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="30" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid31" GridPane.columnIndex="9" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="31" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid32" GridPane.columnIndex="8" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="32" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid33" GridPane.columnIndex="7" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="33" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid34" GridPane.columnIndex="6" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="34" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid35" GridPane.columnIndex="5" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="35" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid36" GridPane.columnIndex="4" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="36" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid37" GridPane.columnIndex="3" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="37" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid38" GridPane.columnIndex="2" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="38" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid39" GridPane.columnIndex="1" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="39" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid40" GridPane.columnIndex="0" GridPane.rowIndex="6">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="40" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid41" GridPane.columnIndex="0" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="41" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid42" GridPane.columnIndex="1" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="42" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid43" GridPane.columnIndex="2" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="43" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid44" GridPane.columnIndex="3" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="44" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid45" GridPane.columnIndex="4" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="45" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid46" GridPane.columnIndex="5" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="46" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid47" GridPane.columnIndex="6" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="47" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid48" GridPane.columnIndex="7" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="48" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid49" GridPane.columnIndex="8" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="49" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid50" GridPane.columnIndex="9" GridPane.rowIndex="5">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="50" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid51" GridPane.columnIndex="9" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="51" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid52" GridPane.columnIndex="8" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="52" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid53" GridPane.columnIndex="7" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="53" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid54" GridPane.columnIndex="6" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="54" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid55" GridPane.columnIndex="5" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="55" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid56" GridPane.columnIndex="4" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="56" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid57" GridPane.columnIndex="3" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="57" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid58" GridPane.columnIndex="2" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="58" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid59" GridPane.columnIndex="1" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="59" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid60" GridPane.columnIndex="0" GridPane.rowIndex="4">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="60" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid61" GridPane.columnIndex="0" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="61" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid62" GridPane.columnIndex="1" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="62" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid63" GridPane.columnIndex="2" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="63" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid64" GridPane.columnIndex="3" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="64" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid65" GridPane.columnIndex="4" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="65" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid66" GridPane.columnIndex="5" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="66" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid67" GridPane.columnIndex="6" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="67" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid68" GridPane.columnIndex="7" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="68" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid69" GridPane.columnIndex="8" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="69" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid70" GridPane.columnIndex="9" GridPane.rowIndex="3">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="70" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid71" GridPane.columnIndex="9" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="71" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid72" GridPane.columnIndex="8" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="72" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid73" GridPane.columnIndex="7" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="73" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid74" GridPane.columnIndex="6" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="74" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid75" GridPane.columnIndex="5" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="75" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid76" GridPane.columnIndex="4" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="76" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid77" GridPane.columnIndex="3" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="77" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid78" GridPane.columnIndex="2" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="78" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid79" GridPane.columnIndex="1" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="79" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid80" GridPane.columnIndex="0" GridPane.rowIndex="2">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="80" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid81" GridPane.columnIndex="0" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="81" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid82" GridPane.columnIndex="1" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="82" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid83" GridPane.columnIndex="2" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="83" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid84" GridPane.columnIndex="3" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="84" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid85" GridPane.columnIndex="4" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="85" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid86" GridPane.columnIndex="5" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="86" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid87" GridPane.columnIndex="6" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="87" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid88" GridPane.columnIndex="7" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="88" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid89" GridPane.columnIndex="8" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="89" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid90" GridPane.columnIndex="9" GridPane.rowIndex="1">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="90" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid91" GridPane.columnIndex="9">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="91" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid92" GridPane.columnIndex="8">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="92" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid93" GridPane.columnIndex="7">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="93" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid94" GridPane.columnIndex="6" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="94" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid95" GridPane.columnIndex="5" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="96" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid96" GridPane.columnIndex="4" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="96" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid97" GridPane.columnIndex="3" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="97" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid98" GridPane.columnIndex="2" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="98" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                  <GridPane.margin>
                     <Insets left="-2.0" />
                  </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid99" GridPane.columnIndex="1" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="99" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin></Text>
               </children>
            </GridPane>
            <GridPane fx:id="grid100" GridPane.columnIndex="0" GridPane.rowIndex="0">
               <columnConstraints>
                  <ColumnConstraints hgrow="SOMETIMES" minWidth="10.0" prefWidth="100.0" />
               </columnConstraints>
               <rowConstraints>
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
                  <RowConstraints minHeight="10.0" prefHeight="30.0" vgrow="SOMETIMES" />
               </rowConstraints>
               <children>
                  <Text strokeType="OUTSIDE" strokeWidth="0.0" text="100" textAlignment="RIGHT" wrappingWidth="23.123291015624943">
                     <font>
                        <Font name="Impact" size="12.0" />
                     </font>
                     <GridPane.margin>
                        <Insets left="-2.0" />
                     </GridPane.margin>
                  </Text>
               </children>
            </GridPane>
         </children>
      </GridPane>
      <SVGPath content="M436.58,438.35l7.37-4.26,4.08,7.08,10.46-6-3.91-6.78,6.58-3.8,47.32,82-6.58,3.8-4.33-7.51-10.46,6,4.16,7.21-7.37,4.26Zm46.62,63.72,10.45-6-3-5.25-10.45,6Zm-6.95-12,10.46-6-3.63-6.28-10.46,6ZM468.71,477l10.45-6-2.74-4.74-10.46,6Zm-6.66-11.53,10.46-6-3.16-5.46-10.46,6ZM455,453.2l10.46-6-3-5.25L452,448Z" layoutX="-114.0" layoutY="-139.0" opacity="0.23" scaleX="0.4" scaleY="0.4" stroke="BLACK" strokeWidth="0.0" />
      <SVGPath content="M436.58,438.35l7.37-4.26,4.08,7.08,10.46-6-3.91-6.78,6.58-3.8,47.32,82-6.58,3.8-4.33-7.51-10.46,6,4.16,7.21-7.37,4.26Zm46.62,63.72,10.45-6-3-5.25-10.45,6Zm-6.95-12,10.46-6-3.63-6.28-10.46,6ZM468.71,477l10.45-6-2.74-4.74-10.46,6Zm-6.66-11.53,10.46-6-3.16-5.46-10.46,6ZM455,453.2l10.46-6-3-5.25L452,448Z" fill="#9ef8ff" layoutX="-112.0" layoutY="-140.0" scaleX="0.4" scaleY="0.4" stroke="BLACK" />
      <SVGPath content="M436.58,438.35l7.37-4.26,4.08,7.08,10.46-6-3.91-6.78,6.58-3.8,47.32,82-6.58,3.8-4.33-7.51-10.46,6,4.16,7.21-7.37,4.26Zm46.62,63.72,10.45-6-3-5.25-10.45,6Zm-6.95-12,10.46-6-3.63-6.28-10.46,6ZM468.71,477l10.45-6-2.74-4.74-10.46,6Zm-6.66-11.53,10.46-6-3.16-5.46-10.46,6ZM455,453.2l10.46-6-3-5.25L452,448Z" layoutX="-114.0" layoutY="-219.0" opacity="0.23" scaleX="0.4" scaleY="0.4" stroke="BLACK" strokeWidth="0.0" />
      <SVGPath content="M436.58,438.35l7.37-4.26,4.08,7.08,10.46-6-3.91-6.78,6.58-3.8,47.32,82-6.58,3.8-4.33-7.51-10.46,6,4.16,7.21-7.37,4.26Zm46.62,63.72,10.45-6-3-5.25-10.45,6Zm-6.95-12,10.46-6-3.63-6.28-10.46,6ZM468.71,477l10.45-6-2.74-4.74-10.46,6Zm-6.66-11.53,10.46-6-3.16-5.46-10.46,6ZM455,453.2l10.46-6-3-5.25L452,448Z" fill="#9ef8ff" layoutX="-112.0" layoutY="-220.0" scaleX="0.4" scaleY="0.4" stroke="BLACK" />
      <SVGPath content="M436.58,438.35l7.37-4.26,4.08,7.08,10.46-6-3.91-6.78,6.58-3.8,47.32,82-6.58,3.8-4.33-7.51-10.46,6,4.16,7.21-7.37,4.26Zm46.62,63.72,10.45-6-3-5.25-10.45,6Zm-6.95-12,10.46-6-3.63-6.28-10.46,6ZM468.71,477l10.45-6-2.74-4.74-10.46,6Zm-6.66-11.53,10.46-6-3.16-5.46-10.46,6ZM455,453.2l10.46-6-3-5.25L452,448Z" layoutX="-234.0" layoutY="-337.0" opacity="0.23" scaleX="0.4" scaleY="0.4" stroke="BLACK" strokeWidth="0.0" />
      <SVGPath content="M436.58,438.35l7.37-4.26,4.08,7.08,10.46-6-3.91-6.78,6.58-3.8,47.32,82-6.58,3.8-4.33-7.51-10.46,6,4.16,7.21-7.37,4.26Zm46.62,63.72,10.45-6-3-5.25-10.45,6Zm-6.95-12,10.46-6-3.63-6.28-10.46,6ZM468.71,477l10.45-6-2.74-4.74-10.46,6Zm-6.66-11.53,10.46-6-3.16-5.46-10.46,6ZM455,453.2l10.46-6-3-5.25L452,448Z" fill="#9ef8ff" layoutX="-232.0" layoutY="-338.0" scaleX="0.4" scaleY="0.4" stroke="BLACK" />
      <SVGPath content="M528.54,767.67l2.71-8.23-11.47-3.78-2.6,7.91-8.09-2.67L560.6,604.52l8.09,2.66-2.56,7.76,11.47,3.78,2.45-7.43,7.22,2.37L535.76,770ZM533.7,752l1.9-5.76-11.47-3.77-1.9,5.75Zm4.35-13.19,2.27-6.9-11.47-3.78-2.27,6.9Zm4.72-14.33,1.71-5.21L533,715.49l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.79-5.45-11.47-3.78-1.79,5.45Zm4.34-13.19,1.8-5.45L546,676l-1.8,5.45ZM560,672.32l2.27-6.89-11.47-3.78-2.27,6.89ZM564.67,658l1.71-5.21L554.91,649l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.89-5.75-11.46-3.78-1.9,5.76Z" layoutX="-306.0" layoutY="-443.0" opacity="0.32" scaleX="0.45" scaleY="0.45" />
      <SVGPath content="M528.54,767.67l2.71-8.23-11.47-3.78-2.6,7.91-8.09-2.67L560.6,604.52l8.09,2.66-2.56,7.76,11.47,3.78,2.45-7.43,7.22,2.37L535.76,770ZM533.7,752l1.9-5.76-11.47-3.77-1.9,5.75Zm4.35-13.19,2.27-6.9-11.47-3.78-2.27,6.9Zm4.72-14.33,1.71-5.21L533,715.49l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.79-5.45-11.47-3.78-1.79,5.45Zm4.34-13.19,1.8-5.45L546,676l-1.8,5.45ZM560,672.32l2.27-6.89-11.47-3.78-2.27,6.89ZM564.67,658l1.71-5.21L554.91,649l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.89-5.75-11.46-3.78-1.9,5.76Z" fill="#9ef8ff" layoutX="-308.0" layoutY="-445.0" scaleX="0.45" scaleY="0.45" stroke="BLACK" />
      <SVGPath content="M686,426h6.52v-7H706.6v7h5.6V180h-5.6v7.83H692.53v-8.17H686v70h0v85h0v84h0Zm6.52-83.16V334H706.6v8.84Zm14.07,5.83v8.06H692.53v-8.06Zm-14.07-90.83v-7.73H706.6v7.73ZM706.6,264v7.73H692.53V264Zm-14.07-70.33H706.6v8.06H692.53Zm0,13.89H706.6v8.31H692.53Zm0,14.14H706.6v7.49H692.53ZM706.6,235v9.26H692.53V235Zm-14.07,42.54H706.6v8.31H692.53Zm0,14.14H706.6v7.49H692.53ZM706.6,305v9.26H692.53V305Zm-14.07,15.09H706.6v8.06H692.53Zm0,42.45H706.6v8.31H692.53Zm0,14.14H706.6v7.49H692.53ZM706.6,390v9.26H692.53V390Zm-14.07,15.09H706.6v8.06H692.53Z" layoutX="-521.0" layoutY="34.0" opacity="0.22" scaleX="0.45" scaleY="0.45" />
      <SVGPath content="M686,426h6.52v-7H706.6v7h5.6V180h-5.6v7.83H692.53v-8.17H686v70h0v85h0v84h0Zm6.52-83.16V334H706.6v8.84Zm14.07,5.83v8.06H692.53v-8.06Zm-14.07-90.83v-7.73H706.6v7.73ZM706.6,264v7.73H692.53V264Zm-14.07-70.33H706.6v8.06H692.53Zm0,13.89H706.6v8.31H692.53Zm0,14.14H706.6v7.49H692.53ZM706.6,235v9.26H692.53V235Zm-14.07,42.54H706.6v8.31H692.53Zm0,14.14H706.6v7.49H692.53ZM706.6,305v9.26H692.53V305Zm-14.07,15.09H706.6v8.06H692.53Zm0,42.45H706.6v8.31H692.53Zm0,14.14H706.6v7.49H692.53ZM706.6,390v9.26H692.53V390Zm-14.07,15.09H706.6v8.06H692.53Z" fill="#9ef8ff" layoutX="-519.0" layoutY="33.0" scaleX="0.45" scaleY="0.45" stroke="BLACK" />
      <SVGPath content="M825.2,376.27l4.93-1.38-1.6-5.75,10.66-3,0,.13,1.57,5.63,4.24-1.19L788.58,168.41l-4.24,1.18,1.8,6.44-10.66,3-1.88-6.71-4.93,1.37,16.07,57.58h0l19.5,69.91h0l19.28,69.1h0ZM811.05,306.5l-2-7.28,10.66-3,.23.83,1.8,6.44Zm12,1.82L824.9,315l-10.66,3-1.85-6.63Zm-31.51-71.74-1.77-6.36,10.66-3,1.77,6.37Zm12.08,2.09,1.77,6.36-10.66,3L793,241.65Zm-26.8-54.87,10.66-3,1.85,6.63-10.66,3ZM780,195.23l10.66-3,1.91,6.84-10.66,3Zm3.25,11.63,10.66-3,1.72,6.16L785,213Zm13.71,8,2.13,7.62-10.66,3-2.13-7.61Zm-.89,38,10.66-3,1.91,6.83-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.62-10.66,3-2.12-7.62Zm-7.2,15.39,10.66-3,1.85,6.63-10.66,3Zm9.75,34.92,10.66-3,1.9,6.84-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.61-10.66,3-2.12-7.61Zm-7.2,15.38,10.66-3,1.85,6.63-10.66,3Z" layoutX="-450.0" layoutY="-91.0" opacity="0.27" scaleX="0.55" scaleY="0.55" />
      <SVGPath content="M825.2,376.27l4.93-1.38-1.6-5.75,10.66-3,0,.13,1.57,5.63,4.24-1.19L788.58,168.41l-4.24,1.18,1.8,6.44-10.66,3-1.88-6.71-4.93,1.37,16.07,57.58h0l19.5,69.91h0l19.28,69.1h0ZM811.05,306.5l-2-7.28,10.66-3,.23.83,1.8,6.44Zm12,1.82L824.9,315l-10.66,3-1.85-6.63Zm-31.51-71.74-1.77-6.36,10.66-3,1.77,6.37Zm12.08,2.09,1.77,6.36-10.66,3L793,241.65Zm-26.8-54.87,10.66-3,1.85,6.63-10.66,3ZM780,195.23l10.66-3,1.91,6.84-10.66,3Zm3.25,11.63,10.66-3,1.72,6.16L785,213Zm13.71,8,2.13,7.62-10.66,3-2.13-7.61Zm-.89,38,10.66-3,1.91,6.83-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.62-10.66,3-2.12-7.62Zm-7.2,15.39,10.66-3,1.85,6.63-10.66,3Zm9.75,34.92,10.66-3,1.9,6.84-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.61-10.66,3-2.12-7.61Zm-7.2,15.38,10.66-3,1.85,6.63-10.66,3Z" fill="#9ef8ff" layoutX="-448.0" layoutY="-93.0" scaleX="0.55" scaleY="0.55" stroke="BLACK" />
      <SVGPath content="M825.2,376.27l4.93-1.38-1.6-5.75,10.66-3,0,.13,1.57,5.63,4.24-1.19L788.58,168.41l-4.24,1.18,1.8,6.44-10.66,3-1.88-6.71-4.93,1.37,16.07,57.58h0l19.5,69.91h0l19.28,69.1h0ZM811.05,306.5l-2-7.28,10.66-3,.23.83,1.8,6.44Zm12,1.82L824.9,315l-10.66,3-1.85-6.63Zm-31.51-71.74-1.77-6.36,10.66-3,1.77,6.37Zm12.08,2.09,1.77,6.36-10.66,3L793,241.65Zm-26.8-54.87,10.66-3,1.85,6.63-10.66,3ZM780,195.23l10.66-3,1.91,6.84-10.66,3Zm3.25,11.63,10.66-3,1.72,6.16L785,213Zm13.71,8,2.13,7.62-10.66,3-2.13-7.61Zm-.89,38,10.66-3,1.91,6.83-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.62-10.66,3-2.12-7.62Zm-7.2,15.39,10.66-3,1.85,6.63-10.66,3Zm9.75,34.92,10.66-3,1.9,6.84-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.61-10.66,3-2.12-7.61Zm-7.2,15.38,10.66-3,1.85,6.63-10.66,3Z" layoutX="-620.0" layoutY="-11.0" opacity="0.28" scaleX="0.52" scaleY="0.52" />
      <SVGPath content="M825.2,376.27l4.93-1.38-1.6-5.75,10.66-3,0,.13,1.57,5.63,4.24-1.19L788.58,168.41l-4.24,1.18,1.8,6.44-10.66,3-1.88-6.71-4.93,1.37,16.07,57.58h0l19.5,69.91h0l19.28,69.1h0ZM811.05,306.5l-2-7.28,10.66-3,.23.83,1.8,6.44Zm12,1.82L824.9,315l-10.66,3-1.85-6.63Zm-31.51-71.74-1.77-6.36,10.66-3,1.77,6.37Zm12.08,2.09,1.77,6.36-10.66,3L793,241.65Zm-26.8-54.87,10.66-3,1.85,6.63-10.66,3ZM780,195.23l10.66-3,1.91,6.84-10.66,3Zm3.25,11.63,10.66-3,1.72,6.16L785,213Zm13.71,8,2.13,7.62-10.66,3-2.13-7.61Zm-.89,38,10.66-3,1.91,6.83-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.62-10.66,3-2.12-7.62Zm-7.2,15.39,10.66-3,1.85,6.63-10.66,3Zm9.75,34.92,10.66-3,1.9,6.84-10.66,3Zm3.24,11.63,10.66-3,1.72,6.16-10.66,3Zm13.72,8,2.12,7.61-10.66,3-2.12-7.61Zm-7.2,15.38,10.66-3,1.85,6.63-10.66,3Z" fill="#9ef8ff" layoutX="-617.0" layoutY="-13.0" scaleX="0.52" scaleY="0.52" stroke="BLACK" />
      <SVGPath content="M1061.31,478l-2.51-3.56,6-4.24,2.51,3.55,0,0v0l2.89-2-62.24-88L996,392.23l62.24,88,3.11-2.2,0,0Zm-61.84-88.21,6-4.24,3,4.2-6,4.24Zm5,7.65,6-4.24,1.93,2.73-6,4.24Zm4.18,5.92,6-4.24,1.93,2.72-6,4.24Zm4.23,6,6-4.24,1.93,2.73-6,4.24Zm4.19,5.93,6-4.24,1.92,2.72-6,4.24Zm4.2,5.93,6-4.24,1.93,2.72-6,4.24Zm4.16,5.88,6-4.24,1.93,2.73-6,4.24Zm4.16,5.88,6-4.24,1.93,2.73-6,4.24Zm4.22,6,6-4.24,1.93,2.73-6,4.24Zm4.24,6,6-4.24,1.93,2.72-6,4.24Zm4.12,5.82,6-4.24,1.93,2.73-6,4.24Zm4.19,5.93,6-4.24,1.93,2.73-6,4.24Zm4.17,5.88,6-4.24,1.93,2.73-6,4.24Zm6.15,8.7-1.93-2.73,6-4.24,1.93,2.73Z" layoutX="-715.0" layoutY="-79.0" opacity="0.31" scaleX="0.85" scaleY="0.85" />
      <SVGPath content="M1061.31,478l-2.51-3.56,6-4.24,2.51,3.55,0,0v0l2.89-2-62.24-88L996,392.23l62.24,88,3.11-2.2,0,0Zm-61.84-88.21,6-4.24,3,4.2-6,4.24Zm5,7.65,6-4.24,1.93,2.73-6,4.24Zm4.18,5.92,6-4.24,1.93,2.72-6,4.24Zm4.23,6,6-4.24,1.93,2.73-6,4.24Zm4.19,5.93,6-4.24,1.92,2.72-6,4.24Zm4.2,5.93,6-4.24,1.93,2.72-6,4.24Zm4.16,5.88,6-4.24,1.93,2.73-6,4.24Zm4.16,5.88,6-4.24,1.93,2.73-6,4.24Zm4.22,6,6-4.24,1.93,2.73-6,4.24Zm4.24,6,6-4.24,1.93,2.72-6,4.24Zm4.12,5.82,6-4.24,1.93,2.73-6,4.24Zm4.19,5.93,6-4.24,1.93,2.73-6,4.24Zm4.17,5.88,6-4.24,1.93,2.73-6,4.24Zm6.15,8.7-1.93-2.73,6-4.24,1.93,2.73Z" fill="#9ef8ff" layoutX="-713.0" layoutY="-81.0" scaleX="0.85" scaleY="0.85" stroke="BLACK" strokeWidth="0.5" />
      <SVGPath content="M1100.69,642.48l2.67-6-10.25-4.56-2.68,6-6.08-2.7L1178.86,423l6.08,2.71-3.12,7,10.25,4.57,3-6.72,5.35,2.39-94.37,212Zm5.3-11.92,2.68-6L1098.41,620l-2.67,6Zm5.31-11.92,3.13-7L1104.18,607l-3.13,7Zm5.76-12.95,2.46-5.51-10.26-4.56-2.45,5.51Zm5.09-11.42,2.77-6.22-10.25-4.56-2.77,6.22Zm5.4-12.13,2.67-6L1120,571.57l-2.67,6Zm5.31-11.92,3-6.68L1125.58,559l-3,6.67Zm5.6-12.59,2.68-6-10.26-4.56-2.67,6Zm5.31-11.92,3.13-7-10.25-4.57-3.13,7Zm5.76-13,2.46-5.5-10.26-4.57-2.45,5.51Zm5.09-11.42,2.77-6.22-10.25-4.56-2.77,6.22Zm5.4-12.13,2.55-5.73-10.25-4.56-2.55,5.72Zm5.31-11.92,2.55-5.72L1157.62,487l-2.54,5.72Zm5.18-11.64,3.13-7-10.25-4.56-3.13,7Zm5.76-12.95,2.46-5.5-10.26-4.57-2.45,5.51Zm5.09-11.42,2.77-6.22-10.25-4.56-2.77,6.22Zm5.4-12.13,2.67-6-10.25-4.57-2.67,6Z" layoutX="-768.0" layoutY="-123.0" opacity="0.29" scaleX="0.5" scaleY="0.5" />
      <SVGPath content="M1100.69,642.48l2.67-6-10.25-4.56-2.68,6-6.08-2.7L1178.86,423l6.08,2.71-3.12,7,10.25,4.57,3-6.72,5.35,2.39-94.37,212Zm5.3-11.92,2.68-6L1098.41,620l-2.67,6Zm5.31-11.92,3.13-7L1104.18,607l-3.13,7Zm5.76-12.95,2.46-5.51-10.26-4.56-2.45,5.51Zm5.09-11.42,2.77-6.22-10.25-4.56-2.77,6.22Zm5.4-12.13,2.67-6L1120,571.57l-2.67,6Zm5.31-11.92,3-6.68L1125.58,559l-3,6.67Zm5.6-12.59,2.68-6-10.26-4.56-2.67,6Zm5.31-11.92,3.13-7-10.25-4.57-3.13,7Zm5.76-13,2.46-5.5-10.26-4.57-2.45,5.51Zm5.09-11.42,2.77-6.22-10.25-4.56-2.77,6.22Zm5.4-12.13,2.55-5.73-10.25-4.56-2.55,5.72Zm5.31-11.92,2.55-5.72L1157.62,487l-2.54,5.72Zm5.18-11.64,3.13-7-10.25-4.56-3.13,7Zm5.76-12.95,2.46-5.5-10.26-4.57-2.45,5.51Zm5.09-11.42,2.77-6.22-10.25-4.56-2.77,6.22Zm5.4-12.13,2.67-6-10.25-4.57-2.67,6Z" fill="#9ef8ff" layoutX="-771.0" layoutY="-126.0" scaleX="0.5" scaleY="0.5" stroke="BLACK" />
      <ImageView fitHeight="56.0" fitWidth="29.0" layoutX="369.0" layoutY="430.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../snake1.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="122.0" fitWidth="18.0" layoutX="267.0" layoutY="118.0" pickOnBounds="true">
         <image>
            <Image url="@../snake3.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="93.0" fitWidth="29.0" layoutX="299.0" layoutY="199.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../snake2.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="93.0" fitWidth="29.0" layoutX="204.0" layoutY="118.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../snake2.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="82.0" fitWidth="43.0" layoutX="197.0" layoutY="312.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../snake2-flipped.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="76.0" fitWidth="52.0" layoutX="275.0" layoutY="350.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../SNAKESAsset 17.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="76.0" fitWidth="57.0" layoutX="172.0" layoutY="155.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../SNAKESAsset 17.png" />
         </image>
      </ImageView>
      <SVGPath content="M528.54,767.67l2.71-8.23-11.47-3.78-2.6,7.91-8.09-2.67L560.6,604.52l8.09,2.66-2.56,7.76,11.47,3.78,2.45-7.43,7.22,2.37L535.76,770ZM533.7,752l1.9-5.76-11.47-3.77-1.9,5.75Zm4.35-13.19,2.27-6.9-11.47-3.78-2.27,6.9Zm4.72-14.33,1.71-5.21L533,715.49l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.79-5.45-11.47-3.78-1.79,5.45Zm4.34-13.19,1.8-5.45L546,676l-1.8,5.45ZM560,672.32l2.27-6.89-11.47-3.78-2.27,6.89ZM564.67,658l1.71-5.21L554.91,649l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.89-5.75-11.46-3.78-1.9,5.76ZM528.54,767.67l2.71-8.23-11.47-3.78-2.6,7.91-8.09-2.67L560.6,604.52l8.09,2.66-2.56,7.76,11.47,3.78,2.45-7.43,7.22,2.37L535.76,770ZM533.7,752l1.9-5.76-11.47-3.77-1.9,5.75Zm4.35-13.19,2.27-6.9-11.47-3.78-2.27,6.9Zm4.72-14.33,1.71-5.21L533,715.49l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.79-5.45-11.47-3.78-1.79,5.45Zm4.34-13.19,1.8-5.45L546,676l-1.8,5.45ZM560,672.32l2.27-6.89-11.47-3.78-2.27,6.89ZM564.67,658l1.71-5.21L554.91,649l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.89-5.75-11.46-3.78-1.9,5.76Z" layoutX="-281.0" layoutY="-254.0" opacity="0.32" scaleX="0.45" scaleY="0.45" />
      <SVGPath content="M528.54,767.67l2.71-8.23-11.47-3.78-2.6,7.91-8.09-2.67L560.6,604.52l8.09,2.66-2.56,7.76,11.47,3.78,2.45-7.43,7.22,2.37L535.76,770ZM533.7,752l1.9-5.76-11.47-3.77-1.9,5.75Zm4.35-13.19,2.27-6.9-11.47-3.78-2.27,6.9Zm4.72-14.33,1.71-5.21L533,715.49l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.79-5.45-11.47-3.78-1.79,5.45Zm4.34-13.19,1.8-5.45L546,676l-1.8,5.45ZM560,672.32l2.27-6.89-11.47-3.78-2.27,6.89ZM564.67,658l1.71-5.21L554.91,649l-1.71,5.21Zm4.16-12.65,2-6-11.47-3.78-2,6Zm4.43-13.43,1.89-5.75-11.46-3.78-1.9,5.76Z" fill="#9ef8ff" layoutX="-283.0" layoutY="-256.0" scaleX="0.45" scaleY="0.45" stroke="BLACK" />
      <ImageView fitHeight="158.0" fitWidth="30.0" layoutX="325.0" layoutY="116.0" pickOnBounds="true">
         <image>
            <Image url="@../SNAKESAsset 16.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="150.0" fitWidth="200.0" layoutX="389.0" layoutY="158.0" pickOnBounds="true" preserveRatio="true">
         <image>
            <Image url="@../SNAKESAsset 15.png" />
         </image>
      </ImageView>
      <ImageView fitHeight="158.0" fitWidth="52.0" layoutX="220.0" layoutY="272.0" pickOnBounds="true">
         <image>
            <Image url="@../SNAKESAsset 18.png" />
         </image>
      </ImageView>
      <Button fx:id="but1" layoutX="159.0" layoutY="495.0" minHeight="18.0" mnemonicParsing="false" prefHeight="39.0" prefWidth="31.0" style="-fx-background-color: transparent;" textFill="#4faae7">
         <graphic>
            <ImageView fitHeight="30.0" fitWidth="20.0" pickOnBounds="true" preserveRatio="true">
               <image>
                  <Image url="@../blue.png" />
               </image>
            </ImageView>
         </graphic></Button>
      <Button fx:id="but2" layoutX="186.0" layoutY="495.0" minHeight="18.0" mnemonicParsing="false" prefHeight="39.0" prefWidth="24.0" style="-fx-background-color: transparent;" textFill="#4de47a">
         <graphic>
            <ImageView fitHeight="30.0" fitWidth="20.0" pickOnBounds="true" preserveRatio="true">
               <image>
                  <Image url="@../GREEN.png" />
               </image>
            </ImageView>
         </graphic></Button>
      <TextField alignment="TOP_CENTER" layoutX="210.0" layoutY="46.0" prefHeight="39.0" prefWidth="24.0" text="100">
         <font>
            <Font name="Arial Bold" size="8.0" />
         </font>
      </TextField>
      <Button fx:id="rbut" layoutX="363.0" layoutY="545.0" mnemonicParsing="false" prefHeight="39.0" prefWidth="24.0" style="-fx-background-color: #4de47a;" textFill="#4de47a">
         <graphic>
            <ImageView fitHeight="30.0" fitWidth="20.0" pickOnBounds="true" preserveRatio="true">
               <image>
                  <Image url="@../GREEN.png" />
               </image>
            </ImageView>
         </graphic></Button>
      <Button fx:id="lbut" layoutX="199.0" layoutY="545.0" mnemonicParsing="false" prefHeight="39.0" prefWidth="24.0" style="-fx-background-color: #4faae7;" textFill="#4faae7">
         <graphic>
            <ImageView fitHeight="30.0" fitWidth="20.0" pickOnBounds="true" preserveRatio="true">
               <image>
                  <Image url="@../blue.png" />
               </image>
            </ImageView>
         </graphic></Button>
      <TextField fx:id="Textf" layoutX="248.0" layoutY="34.0" />
      <Text strokeType="OUTSIDE" strokeWidth="0.0" text="Text" />
      <Text layoutX="334.0" layoutY="457.0" strokeType="OUTSIDE" strokeWidth="0.0" text="8" textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="74.0" layoutY="212.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="84.0" layoutY="222.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
      <Text layoutX="357.0" layoutY="266.0" strokeType="OUTSIDE" strokeWidth="0.0" text="1 " textAlignment="RIGHT" wrappingWidth="23.123291015624943" />
   </children>
</Pane>
