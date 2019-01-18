package ua.univer.weather.station.view;

import ua.univer.weather.station.model.WeatherEntity;

import javax.swing.*;

public class WeatherViewForm extends JFrame implements IWeatherView {

    @Override
    public void display(WeatherEntity weather) {
        setSize(500, 300);
        //	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        setContentPane(panel);
        JTextField text = new JTextField(weather.toString());
        panel.add(text);
        setVisible(true);
    }

}