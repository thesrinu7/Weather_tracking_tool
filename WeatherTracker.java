import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WeatherTracker extends JFrame implements ActionListener {

    JLabel cityLabel, tempLabel, humidityLabel, conditionLabel;
    JTextField cityField;
    JButton searchButton;

    public WeatherTracker() {

        setTitle("Weather Tracking Tool");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cityLabel = new JLabel("Enter City:");
        cityLabel.setBounds(30, 30, 100, 30);
        add(cityLabel);

        cityField = new JTextField();
        cityField.setBounds(120, 30, 180, 30);
        add(cityField);

        searchButton = new JButton("Search");
        searchButton.setBounds(140, 80, 100, 35);
        searchButton.addActionListener(this);
        add(searchButton);

        tempLabel = new JLabel("Temperature:");
        tempLabel.setBounds(30, 140, 300, 25);
        add(tempLabel);

        humidityLabel = new JLabel("Humidity:");
        humidityLabel.setBounds(30, 170, 300, 25);
        add(humidityLabel);

        conditionLabel = new JLabel("Condition:");
        conditionLabel.setBounds(30, 200, 300, 25);
        add(conditionLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String city = cityField.getText().trim().toLowerCase();

        if (city.equals("hyderabad")) {
            tempLabel.setText("Temperature: 33°C");
            humidityLabel.setText("Humidity: 68%");
            conditionLabel.setText("Condition: Sunny");
        }
        else if (city.equals("vijayawada")) {
            tempLabel.setText("Temperature: 35°C");
            humidityLabel.setText("Humidity: 72%");
            conditionLabel.setText("Condition: Cloudy");
        }
        else if (city.equals("chennai")) {
            tempLabel.setText("Temperature: 34°C");
            humidityLabel.setText("Humidity: 80%");
            conditionLabel.setText("Condition: Rainy");
        }
        else if (city.equals("bangalore")) {
            tempLabel.setText("Temperature: 27°C");
            humidityLabel.setText("Humidity: 65%");
            conditionLabel.setText("Condition: Pleasant");
        }
        else {
            tempLabel.setText("Temperature: Not Available");
            humidityLabel.setText("Humidity: Not Available");
            conditionLabel.setText("Condition: City Not Found");
        }
    }

    public static void main(String[] args) {
        new WeatherTracker();
    }
}