package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import  javafx.collections.ObservableList;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import java.io.*;
import javafx.scene.image.Image;
import javafx.geometry.Side;

public class Main extends Application {

    @Override
    public void start(javafx.stage.Stage primaryStage) throws Exception{

        javafx.scene.layout.GridPane gridPane = new javafx.scene.layout.GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        FileInputStream input = new FileInputStream("stopcovid-logo.jpg");
        Image image = new Image(input);
        BackgroundImage backgroundimage = new BackgroundImage(image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new javafx.scene.layout.BackgroundSize(500,500,false,
                        false,false,false));
        Background background = new Background(backgroundimage);

      //  FileInputStream input2 = new FileInputStream("png-clipart-airplane-logo-airplane-blue-text.jpg");
     //   Image image2 = new Image(input2);
       // BackgroundImage backgroundimage2 = new BackgroundImage(image2,
         //     BackgroundRepeat.NO_REPEAT,
            //  BackgroundRepeat.NO_REPEAT,
            //    new javafx.scene.layout.BackgroundPosition(Side.RIGHT,100,false, Side.BOTTOM,
               //         100,false)
              //  new javafx.scene.layout.BackgroundSize(100,100,false,
              //  false,false,false));

       // Background background2 = new Background(backgroundimage2);


        Label labelName = new Label("Please enter your first and last name");
        GridPane.setRowIndex(labelName,0);
        GridPane.setColumnIndex(labelName,1);
        labelName.setAlignment(javafx.geometry.Pos.TOP_LEFT);
        labelName.setTextFill(javafx.scene.paint.Paint.valueOf("purple"));
        labelName.wrapTextProperty();
        labelName.setFont(Font.font("Arial Rounded MT Bold" ,13));
        TextField textArea = new javafx.scene.control.TextField ();
        GridPane.setRowIndex(textArea,1);
        GridPane.setColumnIndex(textArea,1);

        Label labelVatNumber = new javafx.scene.control.Label("Please enter your Vat Number");
        GridPane.setRowIndex(labelVatNumber,2);
        GridPane.setColumnIndex(labelVatNumber,1);
        labelVatNumber.setAlignment(Pos.TOP_LEFT);
        labelVatNumber.setTextFill(Paint.valueOf("purple"));
        labelVatNumber.wrapTextProperty();
        labelVatNumber.setFont(javafx.scene.text.Font.font("Arial Rounded MT Bold" ,13));
        PasswordField ps = new PasswordField ();
        GridPane.setRowIndex(ps,3);
        GridPane.setColumnIndex(ps,1);

        Label labelTest = new Label("Please select the type of the COVID-19 test from the following choices");
        GridPane.setRowIndex(labelTest,4);
        GridPane.setColumnIndex(labelTest,1);
        labelTest.setAlignment(Pos.TOP_LEFT);
        labelTest.setTextFill(Paint.valueOf("purple"));
        labelTest.wrapTextProperty();
        labelTest.setFont(Font.font("Arial Rounded MT Bold" ,13));
        ToggleGroup group = new ToggleGroup();
        RadioButton test1 = new RadioButton("Diagnostic test");
        GridPane.setRowIndex(test1,5);
        GridPane.setColumnIndex(test1,1);
        test1.setToggleGroup(group);
        RadioButton test2 = new RadioButton("Rapid test");
        GridPane.setRowIndex(test2,6);
        GridPane.setColumnIndex(test2,1);
        test2.setToggleGroup(group);

        Label labelDay = new Label("Please select the date when you took the result of the test");
        GridPane.setRowIndex(labelDay,7);
        GridPane.setColumnIndex(labelDay,1);
        labelDay.setAlignment(Pos.TOP_LEFT);
        labelDay.setTextFill(Paint.valueOf("purple"));
        labelDay.wrapTextProperty();
        labelDay.setFont(Font.font("Arial Rounded MT Bold" ,13));
        DatePicker date = new javafx.scene.control.DatePicker();
        GridPane.setRowIndex(date,8);
        GridPane.setColumnIndex(date,1);
        date.setEditable(false);

        Label labelTypeOfUser = new Label("Please select whether you are a Passenger or an Employee");
        GridPane.setRowIndex(labelTypeOfUser,9);
        GridPane.setColumnIndex(labelTypeOfUser,1);
        labelTypeOfUser.setAlignment(Pos.TOP_LEFT);
        labelTypeOfUser.setTextFill(Paint.valueOf("purple"));
        labelTypeOfUser.wrapTextProperty();
        labelTypeOfUser.setFont(Font.font("Arial Rounded MT Bold" ,13));
        ComboBox<String> combo = new ComboBox<String>();
        combo.setPromptText("Select");
        GridPane.setRowIndex(combo,10);
        GridPane.setColumnIndex(combo,1);
        ObservableList<String> list = combo.getItems();
        list.add("Passenger");
        list.add("Employee");

        Label labelTypeOfEmployee = new Label("If you are an Employee please select the type of Employee you are");
        GridPane.setRowIndex(labelTypeOfEmployee,11);
        GridPane.setColumnIndex(labelTypeOfEmployee,1);
        labelTypeOfEmployee.setAlignment(Pos.TOP_LEFT);
        labelTypeOfEmployee.setTextFill(Paint.valueOf("purple"));
        labelTypeOfEmployee.wrapTextProperty();
        labelTypeOfEmployee.setFont(Font.font("Arial Rounded MT Bold" ,13));
        ComboBox<String> combo2 = new ComboBox<String>();
        combo2.setPromptText("Employee Type");
        GridPane.setRowIndex(combo2,12);
        GridPane.setColumnIndex(combo2,1);
        ObservableList<String> list2 = combo2.getItems();
        list2.add("Flight Crew");
        list2.add("Store Stuff");
        list2.add("Gate Stuff");

        gridPane.getChildren().addAll(labelName, textArea, labelVatNumber, ps, labelTest, test1, test2,
                labelDay, date,labelTypeOfUser, combo,labelTypeOfEmployee, combo2);
        gridPane.setBackground(background);
       // gridPane.setBackground(background2);
        primaryStage.setTitle("Airport application for COVID-19");
        primaryStage.setScene(new javafx.scene.Scene(gridPane, 1000, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
