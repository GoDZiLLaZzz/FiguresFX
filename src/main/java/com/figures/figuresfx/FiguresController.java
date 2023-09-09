package com.figures.figuresfx;

import com.figures.exceptions.NullInputException;
import com.figures.figures.*;
import com.figures.figures.points.Point2D;
import com.figures.interfaces.IShape;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FiguresController {

    private FiguresApp application;

    public FiguresController(){}

    public void setApplication(FiguresApp application) {
        this.application = application;
    }


    @FXML
    private Canvas canvas;
    @FXML
    private Spinner<Integer> numericUpDown1;
    @FXML
    private Spinner<String> domainUpDown1;
    @FXML
    private Pane panel1;
    @FXML
    private Pane pn1;
    @FXML
    private Pane pn2;
    @FXML
    private Pane pn3;
    @FXML
    private Pane pn4;
    @FXML
    private Pane pn5;
    @FXML
    private Pane pn6;
    @FXML
    private Pane pn7;
    @FXML
    private Pane pn8;
    @FXML
    private Pane pn9;
    @FXML
    private Pane pn10;
    @FXML
    private Pane pn11;
    @FXML
    private Pane pn12;
    @FXML
    private Pane pn13;
    @FXML
    private Pane pn14;
    @FXML
    private Pane pn15;
    @FXML
    private Pane pn16;
    @FXML
    private Pane pn17;
    @FXML
    private Pane pn18;
    @FXML
    private ComboBox<String> comboBox1;
    @FXML
    private ComboBox<String> comboBox2;
    @FXML
    private ComboBox<String> comboBox3;
    @FXML
    private ComboBox<String> comboBox4;
    @FXML
    private ComboBox<String> comboBox5;
    @FXML
    private ComboBox<String> comboBox6;
    @FXML
    private Label label1;
    @FXML
    private TextField textBox1;
    @FXML
    private TextField textBox3;
    @FXML
    private TextField textBox2;
    @FXML
    private TextField textBox4;
    @FXML
    private TextField textBox5;
    @FXML
    private TextField textBox6;
    @FXML
    private TextField textBox7;
    @FXML
    private TextField textBox8;
    @FXML
    private TextField textBox9;
    @FXML
    private TextField textBox10;
    @FXML
    private TextField textBox11;
    @FXML
    private TextField textBox12;
    @FXML
    private TextField textBox13;
    @FXML
    private TextField textBox14;
    @FXML
    private TextField textBox15;
    @FXML
    private TextField textBox16;
    @FXML
    private TextField textBox17;
    @FXML
    private TextField textBox18;
    @FXML
    private TextField textBox19;
    @FXML
    private TextField textBox20;
    @FXML
    private TextField textBox21;
    @FXML
    private TextField textBox22;
    @FXML
    private TextField textBox23;
    @FXML
    private TextField textBox24;
    @FXML
    private TextField textBox25;
    @FXML
    private TextField textBox26;
    @FXML
    private TextField textBox27;
    @FXML
    private TextField textBox28;
    @FXML
    private TextField textBox29;
    @FXML
    private TextField textBox30;
    @FXML
    private TextField textBox31;
    @FXML
    private TextField textBox32;
    @FXML
    private TextField textBox33;
    @FXML
    private TextField textBox34;
    @FXML
    private TextField textBox35;
    @FXML
    private TextField textBox36;
    @FXML
    private TextField textBox37;
    @FXML
    private TextField textBox38;
    @FXML
    private TextField textBox39;
    @FXML
    private TextField textBox40;
    @FXML
    private Pane pn111;
    @FXML
    private Pane pn222;
    @FXML
    private Pane pn333;
    @FXML
    private Label label61;
    @FXML
    private TextField textBox41;
    @FXML
    private Button button4;


    public void initialize() {
        // Создание SpinnerValueFactory и настройка минимального и максимального значения
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 1);

        // Установка SpinnerValueFactory для Spinner
        numericUpDown1.setValueFactory(valueFactory);
        comboBox1.getItems().addAll("Отрезок",
                "Ломанная",
                "Окружность",
                "Многоугольник",
                "Треугольник",
                "Четырёхугольник",
                "Прямоугольник",
                "Трапеция");
        comboBox2.getItems().addAll("Сдвиг",
                "Поворот",
                "Симметрия"
                );
        String[] items = {"x", "y"};
        SpinnerValueFactory<String> valueFactory_dup = new SpinnerValueFactory.ListSpinnerValueFactory<>(FXCollections.observableArrayList(items));
        domainUpDown1.setValueFactory(valueFactory_dup);
        SpinnerValueFactory<Integer> valueFactory_nup = new SpinnerValueFactory.IntegerSpinnerValueFactory(
                1, // Минимальное значение
                18, // Максимальное значение
                1 // Начальное значение
        );

        numericUpDown1.setValueFactory(valueFactory_nup);
        // Устанавливаем слушатель событий на изменение значения Spinner
        numericUpDown1.valueProperty().addListener(new ChangeListener<Integer>() {
            @Override
            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                // В этом методе обрабатываем изменение значения Spinner
                int value = numericUpDown1.getValue();
                List<Pane> panes = Arrays.asList(pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8, pn9, pn10, pn11, pn12, pn13, pn14, pn15, pn16, pn17, pn18);

                for (int i = 0; i < 18; i++) {
                    panes.get(i).setVisible(i < value);
                }

                application.setPointsCount(value);
            }
        });
    }

    @FXML
    public void comboBox1_SelectedIndexChanged(ActionEvent actionEvent) {
        numericUpDown1.setVisible(true);
        pn1.setVisible(true);

        String selectedValue = comboBox1.getValue();

        label1.setVisible(false);
        textBox1.setVisible(false);
        numericUpDown1.setDisable(false);

        switch (selectedValue) {
            case "Отрезок":
                numericUpDown1.getValueFactory().setValue(2);
                numericUpDown1.setDisable(true);
                break;
            case "Ломанная":
                break;
            case "Треугольник":
                numericUpDown1.getValueFactory().setValue(3);
                numericUpDown1.setDisable(true);
                break;
            case "Окружность":
                label1.setVisible(true);
                textBox1.setVisible(true);
                numericUpDown1.getValueFactory().setValue(1);
                numericUpDown1.setDisable(true);
                break;
            case "Многоугольник":
                label1.setVisible(false);
                textBox1.setVisible(false);
                break;
            case "Трапеция", "Четырёхугольник", "Прямоугольник":
                numericUpDown1.getValueFactory().setValue(4);
                label1.setVisible(false);
                textBox1.setVisible(false);
                numericUpDown1.setDisable(true);
                break;
        }
    }

    @FXML
    private void button4_Click(ActionEvent event) {
        try {
            if (comboBox1.getSelectionModel().getSelectedIndex() == -1) {
                throw new NullInputException();
            }
            update();
            application.getListPoints().clear();
            switch (application.getPointsCount()) {
                case 1:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    break;
                case 2:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    break;
                case 3:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    break;
                case 4:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    break;
                case 5:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    break;
                case 6:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    break;
                case 7:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    break;
                case 8:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    break;
                case 9:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    break;
                case 10:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox22.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox23.getText()));
                    break;
                case 11:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    break;
                case 12:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    break;
                case 13:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox6.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox7.getText()));
                    break;
                case 14:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox6.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox7.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox28.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox29.getText()));
                    break;
                case 15:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox6.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox7.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox28.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox29.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox30.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox31.getText()));
                    break;
                case 16:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox6.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox7.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox28.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox29.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox30.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox31.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox32.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox33.getText()));
                    break;
                case 17:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox6.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox7.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox28.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox29.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox30.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox31.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox32.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox33.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox34.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox35.getText()));
                case 18:
                    application.getListPoints().add(Double.parseDouble(textBox3.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox2.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox8.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox9.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox10.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox11.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox12.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox13.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox14.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox15.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox16.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox17.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox4.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox5.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox18.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox19.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox20.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox21.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox24.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox25.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox26.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox27.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox6.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox7.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox28.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox29.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox30.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox31.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox32.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox33.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox34.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox35.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox36.getText()));
                    application.getListPoints().add(Double.parseDouble(textBox37.getText()));
                    break;
            }

            String figure = comboBox1.getValue();
            switch (figure) {
                case "Окружность":
                    application.getListFigures().add(new Circle(new Point2D(new double[]{Double.parseDouble(application.getListPoints().get(0).toString()), Double.parseDouble(application.getListPoints().get(1).toString())}), Double.parseDouble(textBox1.getText())));
                    comboBox3.getItems().add("Окружность: " + "Circle" + application.getListFigures().get(application.getFiguresCount()).toString());
                    comboBox4.getItems().add("Окружность: " + "Circle" + application.getListFigures().get(application.getFiguresCount()).toString());
                    comboBox5.getItems().add("Окружность: " + "Circle" + application.getListFigures().get(application.getFiguresCount()).toString());
                    comboBox6.getItems().add("Окружность: " + "Circle" + application.getListFigures().get(application.getFiguresCount()).toString());
                    draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    break;
                case "Отрезок":
                    application.getListFigures().add(new Segment(new Point2D(new double[]{Double.parseDouble(application.getListPoints().get(0).toString()), Double.parseDouble(application.getListPoints().get(1).toString())}),
                            new Point2D(new double[]{Double.parseDouble(application.getListPoints().get(2).toString()),
                                    Double.parseDouble(application.getListPoints().get(3).toString())})));
                    comboBox3.getItems().add("Отрезок: " + "Segment" + application.getListFigures().get(application.getFiguresCount()).toString());
                    comboBox4.getItems().add("Отрезок: " + "Segment" + application.getListFigures().get(application.getFiguresCount()).toString());
                    comboBox5.getItems().add("Отрезок: " + "Segment" + application.getListFigures().get(application.getFiguresCount()).toString());
                    comboBox6.getItems().add("Отрезок: " + "Segment" + application.getListFigures().get(application.getFiguresCount()).toString());
                    draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    break;
                case "Ломанная": // Если фигура - полилиния
                case "Многоугольник": // Если фигура - правильный n-угольник
                case "Четырёхугольник": // Если фигура - квадрат
                case "Треугольник": // Если фигура - равнобедренный треугольник
                case "Трапеция": // Если фигура - трапеция
                case "Прямоугольник": // Если фигура - прямоугольник
                    int k = Integer.parseInt(numericUpDown1.getValue().toString());
                    Point2D[] coords = new Point2D[k];
                    for (int i = 0, j = 0; i < k; i++, j += 2) {
                        coords[i] = new Point2D(new double[]{application.getListPoints().get(j), application.getListPoints().get(j + 1)});
                    }
                    // Добавление фигуры в список в зависимости от типа
                    if (figure == "Ломанная") {
                        application.getListFigures().add(new Polyline(coords));
                        comboBox3.getItems().add("Ломанная: " + "Polyline" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox4.getItems().add("Ломанная: " + "Polyline" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox5.getItems().add("Ломанная: " + "Polyline" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox6.getItems().add("Ломанная: " + "Polyline" + application.getListFigures().get(application.getFiguresCount()).toString());
                        draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    }
                    if (figure == "Многоугольник") {
                        application.getListFigures().add(new NGon(coords));
                        comboBox3.getItems().add("Многоугольник: " + "NGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox4.getItems().add("Многоугольник: " + "NGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox5.getItems().add("Многоугольник: " + "NGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox6.getItems().add("Многоугольник: " + "NGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    }
                    if (figure == "Четырёхугольник") {
                        application.getListFigures().add(new QGon(coords));
                        comboBox3.getItems().add("Четырёхугольник: " + "QGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox4.getItems().add("Четырёхугольник: " + "QGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox5.getItems().add("Четырёхугольник: " + "QGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox6.getItems().add("Четырёхугольник: " + "QGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    }
                    if (figure == "Треугольник") {
                        application.getListFigures().add(new TGon(coords));
                        comboBox3.getItems().add("Треугольник: " + "TGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox4.getItems().add("Треугольник: " + "TGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox5.getItems().add("Треугольник: " + "TGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox6.getItems().add("Треугольник: " + "TGon" + application.getListFigures().get(application.getFiguresCount()).toString());
                        draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    }
                    if (figure == "Трапеция") {
                        application.getListFigures().add(new Trapeze(coords));
                        comboBox3.getItems().add("Трапеция: " + "Trapeze" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox4.getItems().add("Трапеция: " + "Trapeze" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox5.getItems().add("Трапеция: " + "Trapeze" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox6.getItems().add("Трапеция: " + "Trapeze" + application.getListFigures().get(application.getFiguresCount()).toString());
                        draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    }
                    if (figure == "Прямоугольник") {
                        application.getListFigures().add(new Rectangle(coords));
                        comboBox3.getItems().add("Прямоугольник: " + "Rectangle" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox4.getItems().add("Прямоугольник: " + "Rectangle" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox5.getItems().add("Прямоугольник: " + "Rectangle" + application.getListFigures().get(application.getFiguresCount()).toString());
                        comboBox6.getItems().add("Прямоугольник: " + "Rectangle" + application.getListFigures().get(application.getFiguresCount()).toString());
                        draw(application.getListFigures().get(application.getFiguresCount()), Color.BLACK);
                    }
                    break;
            }
            application.incFiguresCount();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Успех");
            alert.setHeaderText(null);
            alert.setContentText("Добавление завершено");
            alert.showAndWait();
        } catch (NullInputException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText(ex.toString());
            alert.showAndWait();
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Выбраны не все значения!");
            alert.showAndWait();

        } catch (IllegalArgumentException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
    }






    @FXML
    private void comboBox2_SelectedIndexChanged(ActionEvent actionEvent) {
        int selectedIndex = comboBox2.getSelectionModel().getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                pn111.setDisable(false);
                pn222.setDisable(true);
                pn333.setDisable(true);
                break;
            case 1:
                pn111.setDisable(true);
                pn222.setDisable(false);
                pn333.setDisable(true);
                break;
            case 2:
                pn111.setDisable(true);
                pn222.setDisable(true);
                pn333.setDisable(false);
                break;
        }
    }

    @FXML
    private void button5_Click(ActionEvent actionEvent) throws NullInputException {
        if(application.getFiguresCount() == 0){
            comboBox4.getSelectionModel().clearSelection();
        }
        else if(comboBox4.getSelectionModel().getSelectedIndex() < 0){
            comboBox4.getSelectionModel().select(0);
        }
        try {
            if (comboBox3.getSelectionModel().getSelectedIndex() == -1 || comboBox2.getSelectionModel().getSelectedIndex() == -1 || (comboBox2.getSelectionModel().getSelectedIndex() == -1 && application.getFiguresCount() == 0)) {
                throw new NullInputException();
            } else {
                if (comboBox2.getSelectionModel().getSelectedIndex() == 0 && (textBox38.getText().isEmpty() || textBox39.getText().isEmpty())) {
                    throw new NullInputException();
                }
                if (comboBox2.getSelectionModel().getSelectedIndex() == 1 && textBox40.getText().isEmpty()) {
                    throw new NullInputException();
                }
                if (comboBox2.getSelectionModel().getSelectedIndex() == 2 && domainUpDown1.getValue() == null) {
                    throw new NullInputException();
                }
            }
            String move = comboBox2.getSelectionModel().getSelectedItem();
            String type;
            String originalString;
            String newString;
            switch (move) {
                case "Поворот":
                    if (comboBox3.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox3.getSelectionModel().select(0);
                    }
                    if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox4.getSelectionModel().select(0);
                    }
                    if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox5.getSelectionModel().select(0);
                    }
                    if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox6.getSelectionModel().select(0);
                    }
                    application.getListFigures().add(application.getListFigures().get(comboBox3.getSelectionModel().getSelectedIndex()).rot(Double.parseDouble(textBox40.getText())));
                    application.getListFigures().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox4.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox5.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox6.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox3.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    type = application.getListFigures().get(application.getListFigures().size() - 1).getClass().getSimpleName();
                    originalString = application.getListFigures().get(application.getListFigures().size() - 1).toString();
                    newString = originalString.replace("FiguresFX.", "");
                    type = type.replace("FiguresFX.", "");
                    if ("Circle".equals(type)) {
                        comboBox3.getItems().add("Окружность: " + type + newString);
                        comboBox4.getItems().add("Окружность: " + type + newString);
                        comboBox5.getItems().add("Окружность: " + type + newString);
                        comboBox6.getItems().add("Окружность: " + type + newString);
                    } else if ("NGon".equals(type)) {
                        comboBox3.getItems().add("Многоугольник: " + type + newString);
                        comboBox4.getItems().add("Многоугольник: " + type + newString);
                        comboBox5.getItems().add("Многоугольник: " + type + newString);
                        comboBox6.getItems().add("Многоугольник: " + type + newString);
                    } else if ("Trapeze".equals(type)) {
                        comboBox3.getItems().add("Трапеция: " + type + newString);
                        comboBox4.getItems().add("Трапеция: " + type + newString);
                        comboBox5.getItems().add("Трапеция: " + type + newString);
                        comboBox6.getItems().add("Трапеция: " + type + newString);
                    } else if ("Rectangle".equals(type)) {
                        comboBox3.getItems().add("Прямоугольник: " + type + newString);
                        comboBox4.getItems().add("Прямоугольник: " + type + newString);
                        comboBox5.getItems().add("Прямоугольник: " + type + newString);
                        comboBox6.getItems().add("Прямоугольник: " + type + newString);
                    } else if ("TGon".equals(type)) {
                        comboBox3.getItems().add("Треугольник: " + type + newString);
                        comboBox4.getItems().add("Треугольник: " + type + newString);
                        comboBox5.getItems().add("Треугольник: " + type + newString);
                        comboBox6.getItems().add("Треугольник: " + type + newString);
                    } else if ("Polyline".equals(type)) {
                        comboBox3.getItems().add("Ломанная: " + type + newString);
                        comboBox4.getItems().add("Ломанная: " + type + newString);
                        comboBox5.getItems().add("Ломанная: " + type + newString);
                        comboBox6.getItems().add("Ломанная: " + type + newString);
                    } else if ("QGon".equals(type)) {
                        comboBox3.getItems().add("Четырёхугольник: " + type + newString);
                        comboBox4.getItems().add("Четырёхугольник: " + type + newString);
                        comboBox5.getItems().add("Четырёхугольник: " + type + newString);
                        comboBox6.getItems().add("Четырёхугольник: " + type + newString);
                    } else if ("Segment".equals(type)) {
                        comboBox3.getItems().add("Отрезок: " + type + newString);
                        comboBox4.getItems().add("Отрезок: " + type + newString);
                        comboBox5.getItems().add("Отрезок: " + type + newString);
                        comboBox6.getItems().add("Отрезок: " + type + newString);
                    }
                    break;
                case "Симметрия":
                    String value = domainUpDown1.getValue();
                    if (Objects.equals(value, "x")) {
                        if (comboBox3.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox3.getSelectionModel().select(0);
                        }
                        if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox4.getSelectionModel().select(0);
                        }
                        if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox5.getSelectionModel().select(0);
                        }
                        if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox6.getSelectionModel().select(0);
                        }
                        application.getListFigures().add(application.getListFigures().get(comboBox3.getSelectionModel().getSelectedIndex()).symAxis(0));
                        application.getListFigures().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox4.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox5.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox6.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox3.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        type = application.getListFigures().get(application.getListFigures().size() - 1).getClass().getSimpleName();
                        originalString = application.getListFigures().get(application.getListFigures().size() - 1).toString();
                        newString = originalString.replace("FiguresFX.", "");
                        type = type.replace("FiguresFX.", "");
                        if ("Circle".equals(type)) {
                            comboBox3.getItems().add("Окружность: " + type + newString);
                            comboBox4.getItems().add("Окружность: " + type + newString);
                            comboBox5.getItems().add("Окружность: " + type + newString);
                            comboBox6.getItems().add("Окружность: " + type + newString);
                        } else if ("NGon".equals(type)) {
                            comboBox3.getItems().add("Многоугольник: " + type + newString);
                            comboBox4.getItems().add("Многоугольник: " + type + newString);
                            comboBox5.getItems().add("Многоугольник: " + type + newString);
                            comboBox6.getItems().add("Многоугольник: " + type + newString);
                        } else if ("Trapeze".equals(type)) {
                            comboBox3.getItems().add("Трапеция: " + type + newString);
                            comboBox4.getItems().add("Трапеция: " + type + newString);
                            comboBox5.getItems().add("Трапеция: " + type + newString);
                            comboBox6.getItems().add("Трапеция: " + type + newString);
                        } else if ("Rectangle".equals(type)) {
                            comboBox3.getItems().add("Прямоугольник: " + type + newString);
                            comboBox4.getItems().add("Прямоугольник: " + type + newString);
                            comboBox5.getItems().add("Прямоугольник: " + type + newString);
                            comboBox6.getItems().add("Прямоугольник: " + type + newString);
                        } else if ("TGon".equals(type)) {
                            comboBox3.getItems().add("Треугольник: " + type + newString);
                            comboBox4.getItems().add("Треугольник: " + type + newString);
                            comboBox5.getItems().add("Треугольник: " + type + newString);
                            comboBox6.getItems().add("Треугольник: " + type + newString);
                        } else if ("Polyline".equals(type)) {
                            comboBox3.getItems().add("Ломанная: " + type + newString);
                            comboBox4.getItems().add("Ломанная: " + type + newString);
                            comboBox5.getItems().add("Ломанная: " + type + newString);
                            comboBox6.getItems().add("Ломанная: " + type + newString);
                        } else if ("QGon".equals(type)) {
                            comboBox3.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox4.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox5.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox6.getItems().add("Четырёхугольник: " + type + newString);
                        } else if ("Segment".equals(type)) {
                            comboBox3.getItems().add("Отрезок: " + type + newString);
                            comboBox4.getItems().add("Отрезок: " + type + newString);
                            comboBox5.getItems().add("Отрезок: " + type + newString);
                            comboBox6.getItems().add("Отрезок: " + type + newString);
                        }
                    } else if (Objects.equals(value, "y")) {
                        if (comboBox3.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox3.getSelectionModel().select(0);
                        }
                        if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox4.getSelectionModel().select(0);
                        }
                        if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox5.getSelectionModel().select(0);
                        }
                        if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox6.getSelectionModel().select(0);
                        }
                        application.getListFigures().add(application.getListFigures().get(comboBox3.getSelectionModel().getSelectedIndex()).symAxis(1));
                        application.getListFigures().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox4.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox5.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox6.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox3.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        type = application.getListFigures().get(application.getListFigures().size() - 1).getClass().getSimpleName();
                        originalString = application.getListFigures().get(application.getListFigures().size() - 1).toString();
                        newString = originalString.replace("FiguresFX.", "");
                        type = type.replace("FiguresFX.", "");
                        if ("Circle".equals(type)) {
                            comboBox3.getItems().add("Окружность: " + type + newString);
                            comboBox4.getItems().add("Окружность: " + type + newString);
                            comboBox5.getItems().add("Окружность: " + type + newString);
                            comboBox6.getItems().add("Окружность: " + type + newString);
                        } else if ("NGon".equals(type)) {
                            comboBox3.getItems().add("Многоугольник: " + type + newString);
                            comboBox4.getItems().add("Многоугольник: " + type + newString);
                            comboBox5.getItems().add("Многоугольник: " + type + newString);
                            comboBox6.getItems().add("Многоугольник: " + type + newString);
                        } else if ("Trapeze".equals(type)) {
                            comboBox3.getItems().add("Трапеция: " + type + newString);
                            comboBox4.getItems().add("Трапеция: " + type + newString);
                            comboBox5.getItems().add("Трапеция: " + type + newString);
                            comboBox6.getItems().add("Трапеция: " + type + newString);
                        } else if ("Rectangle".equals(type)) {
                            comboBox3.getItems().add("Прямоугольник: " + type + newString);
                            comboBox4.getItems().add("Прямоугольник: " + type + newString);
                            comboBox5.getItems().add("Прямоугольник: " + type + newString);
                            comboBox6.getItems().add("Прямоугольник: " + type + newString);
                        } else if ("TGon".equals(type)) {
                            comboBox3.getItems().add("Треугольник: " + type + newString);
                            comboBox4.getItems().add("Треугольник: " + type + newString);
                            comboBox5.getItems().add("Треугольник: " + type + newString);
                            comboBox6.getItems().add("Треугольник: " + type + newString);
                        } else if ("Polyline".equals(type)) {
                            comboBox3.getItems().add("Ломанная: " + type + newString);
                            comboBox4.getItems().add("Ломанная: " + type + newString);
                            comboBox5.getItems().add("Ломанная: " + type + newString);
                            comboBox6.getItems().add("Ломанная: " + type + newString);
                        } else if ("QGon".equals(type)) {
                            comboBox3.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox4.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox5.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox6.getItems().add("Четырёхугольник: " + type + newString);
                        } else if ("Segment".equals(type)) {
                            comboBox3.getItems().add("Отрезок: " + type + newString);
                            comboBox4.getItems().add("Отрезок: " + type + newString);
                            comboBox5.getItems().add("Отрезок: " + type + newString);
                            comboBox6.getItems().add("Отрезок: " + type + newString);
                        }
                    } else if (Objects.equals(value, "z")) {
                        if (comboBox3.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox3.getSelectionModel().select(0);
                        }
                        if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox4.getSelectionModel().select(0);
                        }
                        if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox5.getSelectionModel().select(0);
                        }
                        if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                            comboBox6.getSelectionModel().select(0);
                        }
                        application.getListFigures().add(application.getListFigures().get(comboBox3.getSelectionModel().getSelectedIndex()).symAxis(2));
                        application.getListFigures().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox4.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox5.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox6.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        comboBox3.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                        type = application.getListFigures().get(application.getListFigures().size() - 1).getClass().getSimpleName();
                        originalString = application.getListFigures().get(application.getListFigures().size() - 1).toString();
                        newString = originalString.replace("FiguresFX.", "");
                        type = type.replace("FiguresFX.", "");
                        if ("Circle".equals(type)) {
                            comboBox3.getItems().add("Окружность: " + type + newString);
                            comboBox4.getItems().add("Окружность: " + type + newString);
                            comboBox5.getItems().add("Окружность: " + type + newString);
                            comboBox6.getItems().add("Окружность: " + type + newString);
                        } else if ("NGon".equals(type)) {
                            comboBox3.getItems().add("Многоугольник: " + type + newString);
                            comboBox4.getItems().add("Многоугольник: " + type + newString);
                            comboBox5.getItems().add("Многоугольник: " + type + newString);
                            comboBox6.getItems().add("Многоугольник: " + type + newString);
                        } else if ("Trapeze".equals(type)) {
                            comboBox3.getItems().add("Трапеция: " + type + newString);
                            comboBox4.getItems().add("Трапеция: " + type + newString);
                            comboBox5.getItems().add("Трапеция: " + type + newString);
                            comboBox6.getItems().add("Трапеция: " + type + newString);
                        } else if ("Rectangle".equals(type)) {
                            comboBox3.getItems().add("Прямоугольник: " + type + newString);
                            comboBox4.getItems().add("Прямоугольник: " + type + newString);
                            comboBox5.getItems().add("Прямоугольник: " + type + newString);
                            comboBox6.getItems().add("Прямоугольник: " + type + newString);
                        } else if ("TGon".equals(type)) {
                            comboBox3.getItems().add("Треугольник: " + type + newString);
                            comboBox4.getItems().add("Треугольник: " + type + newString);
                            comboBox5.getItems().add("Треугольник: " + type + newString);
                            comboBox6.getItems().add("Треугольник: " + type + newString);
                        } else if ("Polyline".equals(type)) {
                            comboBox3.getItems().add("Ломанная: " + type + newString);
                            comboBox4.getItems().add("Ломанная: " + type + newString);
                            comboBox5.getItems().add("Ломанная: " + type + newString);
                            comboBox6.getItems().add("Ломанная: " + type + newString);
                        } else if ("QGon".equals(type)) {
                            comboBox3.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox4.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox5.getItems().add("Четырёхугольник: " + type + newString);
                            comboBox6.getItems().add("Четырёхугольник: " + type + newString);
                        } else if ("Segment".equals(type)) {
                            comboBox3.getItems().add("Отрезок: " + type + newString);
                            comboBox4.getItems().add("Отрезок: " + type + newString);
                            comboBox5.getItems().add("Отрезок: " + type + newString);
                            comboBox6.getItems().add("Отрезок: " + type + newString);
                        }
                    }
                    break;
                case "Сдвиг":
                    if (comboBox3.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox3.getSelectionModel().select(0);
                    }
                    if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox4.getSelectionModel().select(0);
                    }
                    if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox5.getSelectionModel().select(0);
                    }
                    if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                        comboBox6.getSelectionModel().select(0);
                    }
                    application.getListFigures().add(application.getListFigures().get(comboBox3.getSelectionModel().getSelectedIndex()).shift(new Point2D(new double[]{Double.parseDouble(textBox38.getText()), Double.parseDouble(textBox39.getText())})));
                    application.getListFigures().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox4.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox5.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox6.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    comboBox3.getItems().remove(comboBox3.getSelectionModel().getSelectedIndex());
                    type = application.getListFigures().get(application.getListFigures().size() - 1).getClass().getSimpleName();
                    originalString = application.getListFigures().get(application.getListFigures().size() - 1).toString();
                    newString = originalString.replace("FiguresFX.", "");
                    type = type.replace("FiguresFX.", "");
                    if ("Circle".equals(type)) {
                        comboBox3.getItems().add("Окружность: " + type + newString);
                        comboBox4.getItems().add("Окружность: " + type + newString);
                        comboBox5.getItems().add("Окружность: " + type + newString);
                        comboBox6.getItems().add("Окружность: " + type + newString);
                    } else if ("NGon".equals(type)) {
                        comboBox3.getItems().add("Многоугольник: " + type + newString);
                        comboBox4.getItems().add("Многоугольник: " + type + newString);
                        comboBox5.getItems().add("Многоугольник: " + type + newString);
                        comboBox6.getItems().add("Многоугольник: " + type + newString);
                    } else if ("Trapeze".equals(type)) {
                        comboBox3.getItems().add("Трапеция: " + type + newString);
                        comboBox4.getItems().add("Трапеция: " + type + newString);
                        comboBox5.getItems().add("Трапеция: " + type + newString);
                        comboBox6.getItems().add("Трапеция: " + type + newString);
                    } else if ("Rectangle".equals(type)) {
                        comboBox3.getItems().add("Прямоугольник: " + type + newString);
                        comboBox4.getItems().add("Прямоугольник: " + type + newString);
                        comboBox5.getItems().add("Прямоугольник: " + type + newString);
                        comboBox6.getItems().add("Прямоугольник: " + type + newString);
                    } else if ("TGon".equals(type)) {
                        comboBox3.getItems().add("Треугольник: " + type + newString);
                        comboBox4.getItems().add("Треугольник: " + type + newString);
                        comboBox5.getItems().add("Треугольник: " + type + newString);
                        comboBox6.getItems().add("Треугольник: " + type + newString);
                    } else if ("Polyline".equals(type)) {
                        comboBox3.getItems().add("Ломанная: " + type + newString);
                        comboBox4.getItems().add("Ломанная: " + type + newString);
                        comboBox5.getItems().add("Ломанная: " + type + newString);
                        comboBox6.getItems().add("Ломанная: " + type + newString);
                    } else if ("QGon".equals(type)) {
                        comboBox3.getItems().add("Четырёхугольник: " + type + newString);
                        comboBox4.getItems().add("Четырёхугольник: " + type + newString);
                        comboBox5.getItems().add("Четырёхугольник: " + type + newString);
                        comboBox6.getItems().add("Четырёхугольник: " + type + newString);
                    } else if ("Segment".equals(type)) {
                        comboBox3.getItems().add("Отрезок: " + type + newString);
                        comboBox4.getItems().add("Отрезок: " + type + newString);
                        comboBox5.getItems().add("Отрезок: " + type + newString);
                        comboBox6.getItems().add("Отрезок: " + type + newString);
                    }
                    break;
            }
            if (canvas != null) {
                // Очищаем содержимое холста (canvas) с белым цветом
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.setFill(Color.WHITE);
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                // Вызываем метод requestFocus(), чтобы перерисовать холст
                canvas.requestFocus();
            }
            assert canvas != null;
            application.drawAxes(canvas.getWidth(), canvas.getHeight());
            for(int i = 0; i < application.getListFigures().size(); i++)
            {
                draw(application.getListFigures().get(i), Color.BLACK);
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Успех");
            alert.setHeaderText(null);
            alert.setContentText("Фигура успешно перемещена");

            alert.showAndWait();
        }
        catch (NullInputException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText("NullInputException");
            alert.setContentText(ex.toString());
            alert.showAndWait();
        } catch (IllegalArgumentException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText("IllegalArgumentException ex");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
    }
    }

    @FXML
    private void button6_Click(ActionEvent actionEvent){
        try {
            if (comboBox3.getSelectionModel().getSelectedIndex() == -1 && application.getFiguresCount() == 0 || comboBox3.getSelectionModel().getSelectedIndex() == 0 && application.getFiguresCount() == 0) {
                throw new NullInputException();
            }
            if (comboBox3.getSelectionModel().getSelectedIndex() < 0) {
                comboBox3.getSelectionModel().select(0);
            }
            if(application.getFiguresCount() == 0){
                comboBox4.getSelectionModel().select(-1);
            }
            else if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                comboBox4.getSelectionModel().select(0);
            }
            if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                comboBox5.getSelectionModel().select(0);
            }
            if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                comboBox6.getSelectionModel().select(0);
            }
            if(comboBox4.getSelectionModel().getSelectedIndex() != -1){
                application.getListFigures().remove(comboBox4.getSelectionModel().getSelectedIndex());
                comboBox3.getItems().remove(comboBox4.getSelectionModel().getSelectedIndex());
                comboBox5.getItems().remove(comboBox4.getSelectionModel().getSelectedIndex());
                comboBox6.getItems().remove(comboBox4.getSelectionModel().getSelectedIndex());
                comboBox4.getItems().remove(comboBox4.getSelectionModel().getSelectedIndex());
                if (canvas != null) {
                    // Очищаем содержимое холста (canvas) с белым цветом
                    GraphicsContext gc = canvas.getGraphicsContext2D();
                    gc.setFill(Color.WHITE);
                    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                    // Вызываем метод requestFocus(), чтобы перерисовать холст
                    canvas.requestFocus();
                }
                assert canvas != null;
                application.drawAxes(canvas.getWidth(), canvas.getHeight());
                for(int i = 0; i < application.getListFigures().size(); i++){
                    draw(application.getListFigures().get(i), Color.BLACK);
                }
            }
            application.decFiguresCount();
            label61.setText("");
            textBox41.setText("");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Успех");
            alert.setHeaderText(null);
            alert.setContentText("Удаление завершено");

            alert.showAndWait();
        }
        catch (NullInputException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText("NullInputException");
            alert.setContentText(ex.toString());
            alert.showAndWait();
        } catch (IllegalArgumentException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText("IllegalArgumentException ex");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    private void button7_Click(ActionEvent actionEvent){
        try {
            if (comboBox5.getSelectionModel().getSelectedIndex() == -1 || comboBox6.getSelectionModel().getSelectedIndex() == -1) {
                throw new NullInputException();
            }
            if (comboBox5.getSelectionModel().getSelectedIndex() == comboBox6.getSelectionModel().getSelectedIndex()) {
                throw new EqualsException();
            }
            if(comboBox3.getSelectionModel().getSelectedIndex() < 0){
                comboBox3.getSelectionModel().select(-1);
            }
            if (comboBox4.getSelectionModel().getSelectedIndex() < 0) {
                comboBox4.getSelectionModel().select(0);
            }
            if (comboBox5.getSelectionModel().getSelectedIndex() < 0) {
                comboBox5.getSelectionModel().select(0);
            }
            if (comboBox6.getSelectionModel().getSelectedIndex() < 0) {
                comboBox6.getSelectionModel().select(0);
            }
            if(application.getListFigures().get(comboBox5.getSelectionModel().getSelectedIndex()).cross(application.getListFigures().get(comboBox6.getSelectionModel().getSelectedIndex()))){
                label61.setVisible(true);
                textBox41.setVisible(true);
                label61.setText("Пересечение:");
                textBox41.setText("Пересекаются.");
            }
            else{
                label61.setVisible(true);
                textBox41.setVisible(true);
                label61.setText("Пересечение:");
                textBox41.setText("Не пересекаются.");
            }
            if (canvas != null) {
                // Очищаем содержимое холста (canvas) с белым цветом
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.setFill(Color.WHITE);
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

                // Вызываем метод requestFocus(), чтобы перерисовать холст
                canvas.requestFocus();
            }
            assert canvas != null;
            application.drawAxes(canvas.getWidth(), canvas.getHeight());
            for(int i = 0; i < application.getListFigures().size(); i++){
                draw(application.getListFigures().get(i), Color.RED);
            }
            draw(application.getListFigures().get(comboBox5.getSelectionModel().getSelectedIndex()), Color.RED);
            draw(application.getListFigures().get(comboBox6.getSelectionModel().getSelectedIndex()), Color.RED);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Успех");
            alert.setHeaderText(null);
            alert.setContentText("Сравнение было выполнено успешно");

            alert.showAndWait();
        }
        catch (EqualsException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Вы пытаетесь сравнить одну и ту же фигуру");
            alert.showAndWait();
        } catch (NullInputException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("NullInputException");
            alert.setHeaderText(null);
            alert.setContentText(ex.toString());
            alert.showAndWait();
        } catch (IllegalArgumentException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("IllegalArgumentException ex");
            alert.setHeaderText(null);
            alert.setContentText(ex.toString());
            alert.showAndWait();
        }
    }

    @FXML
    private void button1_Click(ActionEvent actionEvent){
        if (canvas != null) {
            // Очищаем содержимое холста (canvas) с белым цветом
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.WHITE);
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

            // Вызываем метод requestFocus(), чтобы перерисовать холст
            canvas.requestFocus();
        }
        assert canvas != null;
        application.drawAxes(canvas.getWidth(), canvas.getHeight());
        application.getListFigures().clear();
        application.setFiguresCount(0);
        comboBox3.getItems().clear();
        comboBox4.getItems().clear();
        comboBox5.getItems().clear();
        comboBox6.getItems().clear();
        label61.setText("");
        textBox41.setText("");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Успех");
        alert.setHeaderText(null);
        alert.setContentText("Все фигуры удалены");

        alert.showAndWait();
    }

    @FXML
    private void button2_Click(ActionEvent actionEvent){
        double sum = 0;
        for(int i = 0; i < application.getListFigures().size(); i++){
            sum += application.getListFigures().get(i).length();
        }
        label61.setText("Периметр: ");
        textBox41.setText(String.valueOf(sum));
    }

    @FXML
    private void button3_Click(ActionEvent actionEvent){
        double sum = 0;
        for(int i = 0; i < application.getListFigures().size(); i++){
            sum += application.getListFigures().get(i).square();
        }
        label61.setText("Площадь: ");
        textBox41.setText(String.valueOf(sum));
    }

    public void draw(IShape i, Color color) {
        double[] mas_x = new double[0];
        double[] mas_y = new double[0];
        GraphicsContext gc = canvas.getGraphicsContext2D();

        if (i instanceof Circle) {
            mas_x = new double[101];
            mas_y = new double[101];
            Circle f = (Circle) i;

            for (int j = 0; j <= 100; j++) {
                double x = f.getP().getX(0) + f.getR() * Math.cos(j * 2 * Math.PI / 100);
                double y = f.getP().getX(1) + f.getR() * Math.sin(j * 2 * Math.PI / 100);
                mas_x[j] = x;
                mas_y[j] = y;
            }

        } else if (i instanceof Segment) {
            mas_x = new double[2];
            mas_y = new double[2];
            Segment f = (Segment) i;
            mas_x[0] = f.getStart().getX(0);
            mas_y[0] = f.getStart().getX(1);
            mas_x[1] = f.getFinish().getX(0);
            mas_y[1] = f.getFinish().getX(1);

        } else if (i instanceof Polyline) {
            int q = 0;
            Polyline f = (Polyline) i;
            Point2D[] pointss = f.getP();
            mas_x = new double[pointss.length];
            mas_y = new double[pointss.length];
            for (int j = 0; j < pointss.length; j++) {
                Point2D v = pointss[j];
                mas_x[q] = v.getX(0);
                mas_y[q] = v.getX(1);
                q++;
            }

        } else if (i instanceof NGon) {
            int q = 0;
            NGon f = (NGon) i;
            mas_x = new double[f.getP().length + 1];
            mas_y = new double[f.getP().length + 1];
            for (Point2D v : f.getP()) {
                mas_x[q] = v.getX(0);
                mas_y[q] = v.getX(1);
                q++;
            }
            mas_x[f.getP().length] = f.getP()[0].getX(0);
            mas_y[f.getP().length] = f.getP()[0].getX(1);
        }

        // Коэффициент масштабирования
        double scaleFactor = 8.0;

        // Получаем размеры Canvas
        double canvasWidth = canvas.getWidth();
        double canvasHeight = canvas.getHeight();

        gc.setStroke(color);

        Scale(i, mas_x, mas_y, gc, scaleFactor, canvasWidth, canvasHeight);
    }



    private void Scale(IShape i, double[] mas_x, double[] mas_y, GraphicsContext gc, double scaleFactor, double canvasWidth, double canvasHeight) {
        for (int q = 0; q < mas_x.length - 1; q++) {
            double x1 = mas_x[q] * scaleFactor + canvasWidth / 2;
            double y1 = -mas_y[q] * scaleFactor + canvasHeight / 2;
            double x2 = mas_x[q + 1] * scaleFactor + canvasWidth / 2;
            double y2 = -mas_y[q + 1] * scaleFactor + canvasHeight / 2;
            gc.strokeLine(x1, y1, x2, y2);
        }

        if (i instanceof Polyline) {
            // Дополнительные действия для Polyline, если нужно
        } else {
            double x1 = mas_x[mas_x.length - 1] * scaleFactor + canvasWidth / 2;
            double y1 = -mas_y[mas_y.length - 1] * scaleFactor + canvasHeight / 2;
            double x2 = mas_x[0] * scaleFactor + canvasWidth / 2;
            double y2 = -mas_y[0] * scaleFactor + canvasHeight / 2;
            gc.strokeLine(x1, y1, x2, y2);
        }
    }

    public void update() {
        application.setPointsCount(numericUpDown1.getValue());
    }


}